package com.eryong.service.impl;

import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eryong.dao.InBcManagerDaoDetail;
import com.eryong.dao.WorkBookDetailDao;
import com.eryong.domain.InBuyContractDetail;
import com.eryong.domain.WorkBookDetail;
import com.eryong.service.InBcManagerDetailService;

/**@文件名: InBcManagerDetailServiceImpl.java
 * @类功能说明: 
 * @作者: RenQian
 * @Email: 2509401056@qq.com
 * @日期: 2019年6月27日下午4:38:34
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: RenQian</li> 
 * 	 <li>日期: 2019年6月27日下午4:38:34</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class InBcManagerDetailServiceImpl implements InBcManagerDetailService{

	@Autowired
	private InBcManagerDaoDetail inBcManagerDaoDetail;
	@Override
	public InBuyContractDetail getBcManagerDetailById(Integer inbaId) {
		InBuyContractDetail inBuyContractDetailList =  inBcManagerDaoDetail.getBcManagerDetailById(inbaId);
		return inBuyContractDetailList;
	}
	/* 
	 * 获取已签合同细表
	 */
	@Override
	public JSONArray findAllBced() {
		List<InBuyContractDetail> InBuyContractDetailList = inBcManagerDaoDetail.findAllBced();
		JSONArray array = new JSONArray();
		for(InBuyContractDetail inBuyContractDetail:InBuyContractDetailList){
			JSONObject json2 = new JSONObject();
			json2.put("inbcdId", inBuyContractDetail.getInbcdId());
			System.out.println(inBuyContractDetail.getInbcdId());
			json2.put("inbcId", inBuyContractDetail.getInbcId());
			json2.put("inbcName", inBuyContractDetail.getInbcName());
			json2.put("inbaId", inBuyContractDetail.getInbaId());
			json2.put("inbaName", inBuyContractDetail.getInbaName());
			json2.put("inbadId", inBuyContractDetail.getInbadId());			
			json2.put("insiId", inBuyContractDetail.getInsiId());
			json2.put("insiName", inBuyContractDetail.getInsiName());
			System.out.println("供应商名"+inBuyContractDetail.getInsiName());
			json2.put("ingiId", inBuyContractDetail.getIngiId());
			
			json2.put("myPrice", inBuyContractDetail.getMyPrice());
			json2.put("myCou", inBuyContractDetail.getMyCou());
			json2.put("myMoney", inBuyContractDetail.getMyMoney());
			System.out.println("钱"+inBuyContractDetail.getMyMoney());
			//json2.put("taxPrice", inBuyContractDetail.getTaxPrice());
			//json2.put("taxMoney", inBuyContractDetail.getTaxMoney());
			json2.put("invoicesMoney", inBuyContractDetail.getInvoicesMoney());
			json2.put("payMoney", inBuyContractDetail.getPayMoney());								
			json2.put("ingiName", inBuyContractDetail.getIngiName());
			array.add(json2);
		}
		System.out.println(array);
		return array;
	}
	

}

