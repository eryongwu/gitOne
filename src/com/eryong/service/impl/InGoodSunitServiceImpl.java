package com.eryong.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eryong.dao.InGoodSunitDao;
import com.eryong.domain.InGoodSunit;
import com.eryong.domain.UserInfo;
import com.eryong.service.InGoodSunitService;
import com.eryong.util.DateUtil;
import com.eryong.util.RandomNumber;

/**@文件名: InGoodSunitServiceImpl.java
 * @类功能说明: 物品单位service实现类
 * @作者: 张龙飞
 * @Email: 1063614536@qq.com
 * @日期: 2019年6月24日下午5:48:17
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: 张龙飞</li> 
 * 	 <li>日期: 2019年6月24日下午5:48:17</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class InGoodSunitServiceImpl implements InGoodSunitService {
@Autowired
private InGoodSunitDao InGoodSunitDao;
//查找所有物品单位
	@Override
	public JSONArray findAllSunit(Map<?, ?> map) {
		List<InGoodSunit> sunitList=InGoodSunitDao.findAllSunit(map);
		JSONArray  jsonArray=new JSONArray();
		for(int i=0;i<sunitList.size();i++){
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("inguId", sunitList.get(i).getInguId());
			jsonObject.put("inguCode", sunitList.get(i).getInguCode());
			jsonObject.put("inguName", sunitList.get(i).getInguName());
			jsonObject.put("inguSpell", sunitList.get(i).getInguSpell());
			jsonObject.put("inguState",sunitList.get(i).getInguState());
			jsonObject.put("inguDdelflag", sunitList.get(i).getInguDdelflag());
			jsonObject.put("inguRremark", sunitList.get(i).getInguRremark());
			jsonObject.put("currDate", sunitList.get(i).getCurrDate());
			jsonObject.put("optId", sunitList.get(i).getOptId());
			jsonObject.put("optName", sunitList.get(i).getOptName());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
//查找物品单位总数
	@Override
	public int findInGoodSunitCount(Map<?, ?> map) {
		 
		return InGoodSunitDao.findInGoodSunitCount(map);
	}
//添加物品单位
	@Override
	public int addSunit(InGoodSunit inGoodSunit, UserInfo sessionUserInfo) {
		inGoodSunit.setCurrDate(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		inGoodSunit.setInguDdelflag(0);
		inGoodSunit.setInguState(0);
		inGoodSunit.setOptId(sessionUserInfo.getUserId());
		inGoodSunit.setInguCode(RandomNumber.randomnumber());
		return InGoodSunitDao.addSunit(inGoodSunit);
	}
//物品单位名唯一验证
	@Override
	public int findInguNameIsExist(String inguName) {
		
		return InGoodSunitDao.findInguNameIsExist(inguName);
	}
//修改物品单位
	@Override
	public int updateSunit(InGoodSunit inGoodSunit) {
		
		return InGoodSunitDao.updateSunit(inGoodSunit);
	}
//删除物品单位
	@Override
	public int deleteInGoodSunitById(String str) {
		String[] strs=str.split(",");
		int count=0;
		int result=0;
		for(int i=0;i<strs.length;i++ ){
			result=InGoodSunitDao.deleteInGoodSunitById(Integer.parseInt(strs[i]));
			if(result>0) {
				count++;
			}
		}
		return count;
	}

}
