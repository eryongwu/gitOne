package com.eryong.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.eryong.dao.InSupplierInfoDao;
import com.eryong.domain.InSupplierInfo;
import com.eryong.domain.UserInfo;
import com.eryong.service.InSupplierInfoService;
import com.eryong.util.DateUtil;

/**
 * @�ļ���: InSupplierInfoSeviceImpl.java
 * @�๦��˵��:
 * @����: QISHAOFAN
 * @Email: 1743152247@qq.com
 * @����: 2019��6��26������11:47:28
 * @�޸�˵��:<br> <pre>
 * 	 <li>����: QISHAOFAN</li> 
 * 	 <li>����: 2019��6��26������11:47:28</li> 
 *  <li>����: </li>
 * </pre>
 */
@Service
public class InSupplierInfoSeviceImpl implements InSupplierInfoService {
	@Autowired
	private InSupplierInfoDao inSupplierInfoDao;

	
	@Override
	public JSONArray findAllInSuppliers(Map<String, Object> map) {
		
		@SuppressWarnings("unchecked")
		List<InSupplierInfo> giveGoodsList = inSupplierInfoDao.findAllInSuppliers(map);

		JSONArray array = new JSONArray();

		for (int i = 0; i < giveGoodsList.size(); i++) {
			JSONObject json = new JSONObject();
			json.put("insiId", giveGoodsList.get(i).getInsiId());
			json.put("insiCode", giveGoodsList.get(i).getInsiCode());
			json.put("insiName", giveGoodsList.get(i).getInsiName());
			json.put("insiAddress", giveGoodsList.get(i).getInsiAddress());
			json.put("insiPhone", giveGoodsList.get(i).getInsiPhone());
			json.put("insiLicense", giveGoodsList.get(i).getInsiLicense());
			json.put("insiPermitLicense", giveGoodsList.get(i).getInsiPermitLicense());
			json.put("insiLegalMan", giveGoodsList.get(i).getInsiLegalMan());
			json.put("insiTaxNum", giveGoodsList.get(i).getInsiTaxNum());
			json.put("insiBank", giveGoodsList.get(i).getInsiBank());
			json.put("insiBankacCount", giveGoodsList.get(i).getInsiBankacCount());
			json.put("insiRemark", giveGoodsList.get(i).getInsiRemark());
			json.put("currDate", giveGoodsList.get(i).getCurrDate());
            
			array.add(json);
		}

		return array;

	}

	@Override
	public int findAllInSuppliersCount(Map<String, Object> map) {
		return inSupplierInfoDao.findAllInSuppliersCount(map);
	}

	@Override
	public int addInSupplierInfo(InSupplierInfo inSupplierInfo,UserInfo sessionInSupplierInfo ) {
		
		inSupplierInfo.setCurrDate(DateUtil.formatDate(new Date(),
				"yyyy-MM-dd hh:mm:ss"));
		inSupplierInfo.setInsiState(0);
		inSupplierInfo.setInsiDelflag(0);
		inSupplierInfo.setOptId(sessionInSupplierInfo.getUserId());
		return inSupplierInfoDao.addInSupplierInfo(inSupplierInfo);
	}

	@Override
	public int updateInSupplierInfo(InSupplierInfo inSupplierInfo) {

		int updataCount = inSupplierInfoDao.updateInSupplierInfo(inSupplierInfo);

		return updataCount;

	}


	@Override
	public int deleteInSupplierInfo(String str) {
		String strArray[]=str.split(",");
		int count=0;
		int result=0;
		for(int i=0;i<strArray.length;i++){
			  result=inSupplierInfoDao.deleteInSupplierInfo(Integer.parseInt(strArray[i]));
			if(result>0){
				count++;
			}
		}
		return count;
	}

	@Override
	public JSONArray getComboBox() {
		List<InSupplierInfo> giveGoodsList = inSupplierInfoDao.getComboBox();

		JSONArray array = new JSONArray();

		for (int i = 0; i < giveGoodsList.size(); i++) {
			JSONObject json = new JSONObject();
			json.put("insiId", giveGoodsList.get(i).getInsiId());			
			json.put("insiName", giveGoodsList.get(i).getInsiName());			            
			array.add(json);
		}
		return array;		
	}
	
	


	
	
}
