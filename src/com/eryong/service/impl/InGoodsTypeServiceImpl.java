package com.eryong.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eryong.dao.InGoodsTypeDao;
import com.eryong.domain.InGoodsType;
import com.eryong.domain.UserInfo;
import com.eryong.service.InGoodsTypeService;
import com.eryong.util.DateUtil;
import com.eryong.util.Md5;


/**@文件名: InGoodsTypeServiceImpl.java
 * @类功能说明: 商品类型Service层
 * @作者: CAOZHI
 * @Email: 610288154@qq.com
 * @日期: 2019年6月24日下午6:01:00
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: CAOZHI</li>
 * 	 <li>日期: 2019年6月24日下午6:01:00</li> 
 *	 <li>内容: </li>
 * </pre>
 */

@Service
public class InGoodsTypeServiceImpl implements InGoodsTypeService {

	@Autowired
	private InGoodsTypeDao inGoodsTypeDao;

	/**
	 * 商品类型页面展示
	 */
	@Override
	public JSONArray SelectInGoodsType(Map map) {
        List<InGoodsType> inGoodsTypeList=inGoodsTypeDao.SelectInGoodsType(map);
        JSONArray jsonArray=new JSONArray();
        for (int i = 0; i < inGoodsTypeList.size(); i++) {
    		JSONObject jsonObject=new JSONObject();
    		jsonObject.put("ingtId",inGoodsTypeList.get(i).getIngtId());
    		jsonObject.put("ingtCode",inGoodsTypeList.get(i).getIngtCode());
    		jsonObject.put("ingtName",inGoodsTypeList.get(i).getIngtName());
    		jsonObject.put("ingtSpell",inGoodsTypeList.get(i).getIngtSpell());
    		jsonObject.put("ingtRemark",inGoodsTypeList.get(i).getIngtRemark());
    		jsonObject.put("ingtState",inGoodsTypeList.get(i).getIngtState());
    		jsonObject.put("optId",inGoodsTypeList.get(i).getOptId());
    		jsonObject.put("optName",inGoodsTypeList.get(i).getOptName());

    		jsonObject.put("currDate",inGoodsTypeList.get(i).getCurrDate());

    		jsonArray.add(jsonObject);
        	
		}
        return jsonArray;
	}
	
	/**
	 * 商品类型页面分页
	 */

	@Override
	public int SelectInGoodsTypeCount(Map map) {
     int result =  inGoodsTypeDao.SelectInGoodsTypeCount(map);
		
		return result;
	}
	/**
	 * @方法名: addInGoodsType
	 * @方法说明: 添加商品类型
	 * @作者: CAOZHI
	 * @邮箱：610288154@qq.com
	 * @日期: 2019年6月25日上午12:27:08
	 * @param userInfo
	 * @param sessionUserInfo
	 * @return
	 * @return: int
	 */
	@Override
	public int addInGoodsType(InGoodsType inGoodsType,UserInfo sessionUserInfo) {
		inGoodsType.setIngtState(0);
		inGoodsType.setOptId(sessionUserInfo.getUserId());
		inGoodsType.setCurrDate(DateUtil.formatDate(new Date(),"yyyy-MM-dd hh:mm:ss"));
		return inGoodsTypeDao.addInGoodsType(inGoodsType);
	}
	
     /**
      * 商品类型删除
      */

	@Override
	public int deleteInGoodsTypeByIngtId(String str) {
		String strArray[]=str.split(",");
		int count=0;
		int result=0;
		for(int i=0;i<strArray.length;i++){
           result=inGoodsTypeDao.deleteInGoodsTypeByIngtId(Integer.parseInt(strArray[i]));
		if(result>0){
			count ++;
		}
		}     
		return count;
	}
	 
	/*
	 * 通过用户名查询用户
	 */
	@Override
	public int selectInGoodsTypeByIngtName(String ingtName) {
		int result=inGoodsTypeDao.selectInGoodsTypeByIngtName(ingtName);
		
		return result;
	}

	/**
	 * 商品类型修改
	 */
	@Override
	public int updateInGoodsType(InGoodsType inGoodsType) {
		int result=inGoodsTypeDao.updateInGoodsType(inGoodsType);
		return result;
	}

	/**
	 * 商品类型查询展示
	 */
	@Override
	public JSONArray InGoodsTypeComboxList() {
		List<String> inGoodsTypeList=inGoodsTypeDao.InGoodsTypeComboxList();
		JSONArray jsonArray = new JSONArray();
		for (int i = 0; i < inGoodsTypeList.size(); i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("ingtName",inGoodsTypeList.get(i));
			
			jsonArray.add(jsonObject);
			
		}
		return jsonArray;	
	}

 
	
	

}
