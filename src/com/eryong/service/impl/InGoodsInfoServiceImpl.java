package com.eryong.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eryong.dao.InGoodsInfoDao;
import com.eryong.domain.InGoodsInfo;
import com.eryong.domain.RoleInfo;
import com.eryong.domain.UserInfo;
import com.eryong.service.InGoodsInfoService;
import com.eryong.util.DateUtil;
import com.eryong.util.Md5;


/**@文件名: InGoodsInfoServiceImpl.java
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
public class InGoodsInfoServiceImpl implements InGoodsInfoService {

	@Autowired
	private InGoodsInfoDao InGoodsInfoDao;

	/**
	 * 商品类型页面展示
	 */
	@Override
	public JSONArray SelectInGoodsInfo(Map map) {
        List<InGoodsInfo> InGoodsInfoList=InGoodsInfoDao.SelectInGoodsInfo(map);
        JSONArray jsonArray=new JSONArray();
        for (int i = 0; i < InGoodsInfoList.size(); i++) {
    		JSONObject jsonObject=new JSONObject();
    		jsonObject.put("ingiId",InGoodsInfoList.get(i).getIngiId());
    		jsonObject.put("ingiCode",InGoodsInfoList.get(i).getIngiCode());
    		jsonObject.put("ingiName",InGoodsInfoList.get(i).getIngiName());
    		jsonObject.put("ingiSpell",InGoodsInfoList.get(i).getIngiSpell());
    		jsonObject.put("ingcName",InGoodsInfoList.get(i).getIngcName());
    		jsonObject.put("ingtName",InGoodsInfoList.get(i).getIngtName());
    		jsonObject.put("ingpName",InGoodsInfoList.get(i).getIngpName());
    		
    		jsonObject.put("ingcid",InGoodsInfoList.get(i).getIngcid());
    		jsonObject.put("ingtid",InGoodsInfoList.get(i).getIngtid());
    		jsonObject.put("ingpid",InGoodsInfoList.get(i).getIngpid());

    		jsonObject.put("ingiFormat",InGoodsInfoList.get(i).getIngiFormat());
    		jsonObject.put("ingiModel",InGoodsInfoList.get(i).getIngiModel());
    		jsonObject.put("ingiShelflife",InGoodsInfoList.get(i).getIngiShelflife());
    		jsonObject.put("ingiExplosive",InGoodsInfoList.get(i).getIngiExplosive());
    		jsonObject.put("ingiToxic",InGoodsInfoList.get(i).getIngiToxic()==0?"非毒麻":"毒麻");
    		jsonObject.put("ingiCorrosion",InGoodsInfoList.get(i).getIngiCorrosion()==0?"非易碎标志":"易碎标志");
    		jsonObject.put("ingiFragile",InGoodsInfoList.get(i).getIngiFragile()==0?"非易碎标志":"易碎标志");
    		jsonObject.put("ingiRemark",InGoodsInfoList.get(i).getIngiRemark());
    		jsonObject.put("ingiStopflag",InGoodsInfoList.get(i).getIngiStopflag()==0?"未停用":"已停用");

    		jsonObject.put("ingiState",InGoodsInfoList.get(i).getIngiState());
    		jsonObject.put("optName",InGoodsInfoList.get(i).getOptName());
    		jsonObject.put("currDate",InGoodsInfoList.get(i).getCurrDate());

    		jsonArray.add(jsonObject);
        	
		}
        return jsonArray;
	}
	
	/**
	 * 商品类型页面分页
	 */

	@Override
	public int SelectInGoodsInfoCount(Map map) {
     int result =  InGoodsInfoDao.SelectInGoodsInfoCount(map);
		
		return result;
	}
	/**
	 * @方法名: addInGoodsInfo
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
	public int addInGoodsInfo(InGoodsInfo inGoodsInfo,UserInfo sessionUserInfo) {
		inGoodsInfo.setIngiStopflag(0);
		inGoodsInfo.setIngiExplosive(0);
		inGoodsInfo.setIngiToxic(0);
		inGoodsInfo.setIngiCorrosion(0);
		inGoodsInfo.setIngiState(0);
		inGoodsInfo.setIngiFragile(0);
		inGoodsInfo.setOptId(sessionUserInfo.getUserId());
		inGoodsInfo.setCurrDate(DateUtil.formatDate(new Date(),"yyyy-MM-dd hh:mm:ss"));
		return InGoodsInfoDao.addInGoodsInfo(inGoodsInfo);
	}

	/**
	 * 添加物品类别查询
	 */
	@Override
	public JSONArray ingcidComboxList() {
		List<InGoodsInfo> InGoodsInfoList=InGoodsInfoDao.ingcidComboxList();
		JSONArray jsonArray = new JSONArray();
		JSONObject json1 = new JSONObject();
			json1.put("ingcName", "==请选择==");
			json1.put("ingcid", "");
			jsonArray.add(json1);
		for (int i = 0; i < InGoodsInfoList.size(); i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("ingcName",InGoodsInfoList.get(i).getIngcName());
			jsonObject.put("ingcid",InGoodsInfoList.get(i).getIngcid());
			json1.put("roleName", "==请选择==");

			jsonArray.add(jsonObject);
			
		}
		return jsonArray;	
	}
	
	
	/**
	 * 添加物品类型查询
	 */
	@Override
	public JSONArray ingtidComboxList() {
		List<InGoodsInfo> InGoodsInfoList=InGoodsInfoDao.ingtidComboxList();
		JSONArray jsonArray = new JSONArray();
		JSONObject json1 = new JSONObject();
		json1.put("ingtName", "==请选择==");
		json1.put("ingtid", "");
		jsonArray.add(json1);
		for (int i = 0; i < InGoodsInfoList.size(); i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("ingtName",InGoodsInfoList.get(i).getIngtName());
			jsonObject.put("ingtid",InGoodsInfoList.get(i).getIngtid());

			jsonArray.add(jsonObject);
			
		}
		return jsonArray;	
	}

	/**
	 * 添加物品生产商查询
	 */
	@Override
	public JSONArray ingpidComboxList() {
		List<InGoodsInfo> InGoodsInfoList=InGoodsInfoDao.ingpidComboxList();
		JSONArray jsonArray = new JSONArray();
		JSONObject json1 = new JSONObject();
		json1.put("ingpName", "==请选择==");
		json1.put("ingpid", "");
		jsonArray.add(json1);
		for (int i = 0; i < InGoodsInfoList.size(); i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("ingpName",InGoodsInfoList.get(i).getIngpName());
			jsonObject.put("ingpid",InGoodsInfoList.get(i).getIngpid());

			jsonArray.add(jsonObject);
			
		}
		return jsonArray;	
	}
	
     /**
      * 商品类型删除
      */

	@Override
	public int deleteInGoodsInfoByingiId(String str) {
		String strArray[]=str.split(",");
		int count=0;
		int result=0;
		for(int i=0;i<strArray.length;i++){
           result=InGoodsInfoDao.deleteInGoodsInfoByingiId(Integer.parseInt(strArray[i]));
		if(result>0){
			count ++;
		}
		}     
		return count;
	}
	 
	/**
	 *  验证物品编码是否重复
	 */
	@Override
	public int selectInGoodsInfoByingiCode(String ingiCode) {
		int result=InGoodsInfoDao.selectInGoodsInfoByingiCode(ingiCode);
		
		return result;
	}

	 /**
	  *  验证物品名称是否重复
	  */
		@Override
		public int selectInGoodsInfoByingiName(String ingiName) {
			int result=InGoodsInfoDao.selectInGoodsInfoByingiName(ingiName);
			
			return result;
		}
	
	/**
	 * 物品管理修改
	 */
	@Override
	public int updateInGoodsInfo(InGoodsInfo inGoodsInfo,UserInfo sessionUserInfo) {
		inGoodsInfo.setCurrDate(DateUtil.formatDate(new Date(),"yyyy-MM-dd hh:mm:ss"));
		inGoodsInfo.setOptId(sessionUserInfo.getUserId());

		int result=InGoodsInfoDao.updateInGoodsInfo(inGoodsInfo);
		return result;
	}

	
	/**
	 * 商品类型查询展示
	 */
	
 
	@Override
	public JSONArray selectInGoodsInfoBy() {
		List<InGoodsInfo> InGoodsInfoList=InGoodsInfoDao.selectInGoodsInfoBy();
		JSONArray jsonArray = new JSONArray();
		for (int i = 0; i < InGoodsInfoList.size(); i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("ingiName",InGoodsInfoList.get(i).getIngiName());
			jsonObject.put("ingiId",InGoodsInfoList.get(i).getIngiId());

			jsonArray.add(jsonObject);
		}
		return jsonArray;	
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
