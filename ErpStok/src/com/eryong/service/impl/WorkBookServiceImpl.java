/**@文件名: WorkBookService.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月23日下午3:14:25
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月23日下午3:14:25</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.service.impl;


import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eryong.dao.WorkBookDao;
import com.eryong.dao.WorkBookDetailDao;
import com.eryong.domain.PageBean;
import com.eryong.domain.WorkBook;
import com.eryong.domain.WorkBookDetail;
import com.eryong.service.WorkBookService;
import com.eryong.util.DateUtil;

/**@文件名: WorkBookService.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月23日下午3:14:25
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月23日下午3:14:25</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 * 
 */
@Service
public class WorkBookServiceImpl implements WorkBookService {

	@Autowired
	private WorkBookDao workBookDao;

	@Autowired
	WorkBookDetailDao workBookDetailDao;

	/**
	 * @方法名: findAllworkBook
	 * @方法说明:查询所有数据字典信息
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月23日下午3:17:28
	 * @return
	 * @return: JSONArray
	 */
	public JSONArray findAllworkBook(PageBean pageBean) {

		JSONArray array = new JSONArray();
		List<WorkBook> workBookList = workBookDao.findAllworkBook(pageBean);
		for (WorkBook worBook : workBookList) {
			JSONObject json = new JSONObject();
			json.put("wBId", worBook.getwBId());
			json.put("wBName", worBook.getwBName());
			json.put("wBDelFlag", worBook.getwBDelFlag());
			json.put("wBRemark", worBook.getwBRemark());
			json.put("currentTime", worBook.getCurrentTime());
			json.put("optId", worBook.getOptId());
			List<WorkBookDetail> workBookDetailList = worBook
					.getWorkBookDetail();
			JSONArray array2 = new JSONArray();
			for (WorkBookDetail workBookDetail : workBookDetailList) {
				JSONObject json2 = new JSONObject();
				json2.put("wBDId", workBookDetail.getwBDId());
				json2.put("wBId", workBookDetail.getwBId());
				json2.put("wBDName", workBookDetail.getwBDName());
				json2.put("wBDRemark", workBookDetail.getwBDRemark());
				json2.put("wBDDelFlag", workBookDetail.getwBDDelFlag());
				json2.put("wBDState", workBookDetail.getwBDState());
				json2.put("currentTime", workBookDetail.getCurrentTime());
				json2.put("optId", workBookDetail.getOptId());
				array2.add(json2);
			}
			json.put("workBookDetail", array2);
			array.add(json);
		}

		return array;
	}

	/* 
	 *
	 */
	@Override
	public JSONObject addWorkBook(WorkBook workBook) {
		String date = DateUtil.formatDate(new Date(), "yy-MM-dd hh:mm:ss");
		workBook.setCurrentTime(date);
		int insertCount = workBookDao.addWorkBook(workBook);
		int optId = workBook.getOptId();
		int wBId = workBookDao.getMaxWBId();
		List<WorkBookDetail> workBookDetailList = workBook.getWorkBookDetail();
		int i = 0;
		for (WorkBookDetail workBookDetail : workBookDetailList) {
			workBookDetail.setOptId(optId);
			workBookDetail.setCurrentTime(date);
			workBookDetail.setwBId(wBId);
			workBookDetailDao.addWorkBookDetail(workBookDetail);
			i++;
		}
		JSONObject json = new JSONObject();
		json.put("add", insertCount);
		json.put("upd", i);
		return json;
	}

	/*
	 * 修改主表
	 */
	@Override
	public JSONObject updateWorkBook(WorkBook workBook, Integer optId) {
		int wBId = workBook.getwBId();
		WorkBook WorkBookSelect = workBookDao.updateSelectWorkBook(wBId);// 通过主表id查询
		int i = 0;//添加条数
		int n = 0;//删除条数
		int j = 0;//修改条数
		i = workBookDao.updateWorkBookById(workBook);// 直接修改主表		
		List<WorkBookDetail> oldWorkBookDetailList = WorkBookSelect
				.getWorkBookDetail();
		List<WorkBookDetail> newWorkBookDetailList = workBook
				.getWorkBookDetail();
		
		for(WorkBookDetail newWorkBookDetail : newWorkBookDetailList){
			if (newWorkBookDetail.getwBDId() == null) {// 新增
				newWorkBookDetail.setwBId(wBId);
				newWorkBookDetail.setCurrentTime(DateUtil.formatDate(new Date(), "yy-MM-dd hh:mm:ss"));
				workBookDetailDao.addWorkBookDetail(newWorkBookDetail);
				i++;
			} 
		}
		
		
		if (workBook.getWorkBookDetail() != null) {
			for (WorkBookDetail oldWorkBookDetail : oldWorkBookDetailList) {// 遍历旧id
				boolean isDelete = true;				
				for (WorkBookDetail newWorkBookDetail : newWorkBookDetailList) {// 遍历新id
					 if(newWorkBookDetail.getwBDId() != null){
						if (oldWorkBookDetail.getwBDId().equals(newWorkBookDetail.getwBDId())) {//新旧id相等修改
							isDelete = false;
							if(oldWorkBookDetail.getwBDName().equals(newWorkBookDetail.getwBDName())
							&& oldWorkBookDetail.getwBDRemark().equals(newWorkBookDetail.getwBDRemark())){
								continue;
							}else{
								workBookDetailDao.upDateworkBookDetail(newWorkBookDetail);
								j++;
								continue;
							} 							
						}
					}
				}
				if (isDelete) {// 删除
					workBookDetailDao.deleteDateworkBookDetailByWBDId(oldWorkBookDetail.getwBDId());
					n++;
				}
			}
		} else {// WorkBookDetail为空时直接删除所有子表
			n = workBookDetailDao.deleteAllWorkBookDetailByWBId(wBId);
		}
		JSONObject json = new JSONObject();		
		json.put("add", i);
		json.put("del", n);
		json.put("upd", j);		
		return json;
	}

	/* 
	 *
	 */
	@Override
	public JSONObject deleteWorkBook(int wBid) {
		JSONObject json = new JSONObject();
		int wbd = workBookDetailDao.deleteWorkBookDetailByWbId(wBid);
		int wb = workBookDao.deleteWorkBookById(wBid);
		json.put("success", wbd+wb);
		return json;
	}

}
