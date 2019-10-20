package com.eryong.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eryong.dao.InBcManagerDao;
import com.eryong.dao.InBcManagerDaoDetail;
import com.eryong.domain.InBuyContract;
import com.eryong.domain.InBuyContractDetail;
import com.eryong.domain.PageBean;
import com.eryong.service.InBcManagerService;
import com.eryong.util.DateUtil;

/**@文件名: InBcManagerServiceImpl.java
 * @类功能说明: 
 * @作者: RenQian
 * @Email: 2509401056@qq.com
 * @日期: 2019年6月27日下午2:54:46
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: RenQian</li> 
 * 	 <li>日期: 2019年6月27日下午2:54:46</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class InBcManagerServiceImpl implements InBcManagerService{

	@Autowired
	private InBcManagerDao inBcManagerDao;
	
	@Autowired
	private InBcManagerDaoDetail inBcManagerDaoDetailDao;

	@Override
	public JSONArray findAllBcManager(PageBean pageBean) {
		JSONArray array = new JSONArray();
		List<InBuyContract> inBcManagerList = inBcManagerDao.findAllBcManager(pageBean);
		for (InBuyContract inBuyContract : inBcManagerList) {
			JSONObject json = new JSONObject();
			
			json.put("inbcId", inBuyContract.getInbcId());
			json.put("inbcCode", inBuyContract.getInbcCode());
			json.put("inbcName", inBuyContract.getInbcName());
			json.put("insiId", inBuyContract.getInsiId());
			json.put("userId", inBuyContract.getUserId());
			json.put("userName", inBuyContract.getUserName());
			json.put("inbcDate", inBuyContract.getInbcDate());
			json.put("inbcContent", inBuyContract.getInbcContent());
			json.put("inbcTotalPrice", inBuyContract.getInbcTotalPrice());
			json.put("inbcOfferPrice", inBuyContract.getInbcOfferPrice());
			json.put("inbcActualPrice", inBuyContract.getInbcActualPrice());
			json.put("inbcAdvanceMoney", inBuyContract.getInbcAdvanceMoney());
			json.put("inbcCeliveryDate", inBuyContract.getInbcCeliveryDate());
			json.put("inbcDeliveryAddress", inBuyContract.getInbcDeliveryAddress());
			json.put("inbcState", inBuyContract.getInbcState());
			json.put("inbcPayState", inBuyContract.getInbcPayState());
			json.put("inbcBillState", inBuyContract.getInbcBillState());
			json.put("inbcRemark", inBuyContract.getInbcRemark());
			json.put("state", inBuyContract.getState());
			json.put("inbcDelflag", inBuyContract.getInbcDelflag());
			json.put("optId", inBuyContract.getOptId());
			json.put("currDate", inBuyContract.getCurrDate());
			
			List<InBuyContractDetail> inBuyContractDetailList = inBuyContract.getInBuyContractDetail();
					
			JSONArray array2 = new JSONArray();
			for (InBuyContractDetail inBuyContractDetail : inBuyContractDetailList) {
				JSONObject json2 = new JSONObject();
				json2.put("inbcdId", inBuyContractDetail.getInbcId());
				json2.put("inbaId", inBuyContractDetail.getInbaId());
				json2.put("inbadId", inBuyContractDetail.getInbadId());
				json2.put("inbcId", inBuyContractDetail.getInbcId());
				json2.put("insiId", inBuyContractDetail.getInsiId());
				json2.put("ingiId", inBuyContractDetail.getIngiId());
				json2.put("myPrice", inBuyContractDetail.getMyPrice());
				json2.put("myCou", inBuyContractDetail.getMyCou());
				json2.put("myMoney", inBuyContractDetail.getMyMoney());
				json2.put("taxPrice", inBuyContractDetail.getTaxPrice());
				json2.put("taxMoney", inBuyContractDetail.getTaxMoney());
				json2.put("invoicesMoney", inBuyContractDetail.getInvoicesMoney());
				json2.put("payMoney", inBuyContractDetail.getPayMoney());
				json2.put("inbcRemark", inBuyContractDetail.getInbcRemark());
				json2.put("inbcState", inBuyContractDetail.getInbcState());
				json2.put("inbcDelflag", inBuyContractDetail.getInbcDelflag());
				json2.put("ingiName", inBuyContractDetail.getIngiName());
				
				array2.add(json2);
			}
			json.put("ContractDetail", array2);
			array.add(json);
		}

		return array;
	}

	/**
	 * 添加新合同
	 */
	@Override
	public JSONObject addBcManager(InBuyContract inBuyContract) {
		
			String date = DateUtil.formatDate(new Date(), "yy-MM-dd hh:mm:ss");		
			inBuyContract.setCurrDate(date);
			int insiId = inBuyContract.getInsiId();//获取供应商id
			int inbcState = inBuyContract.getInbcState();//获取提交状态
			int insertCount = inBcManagerDao.addBcManager(inBuyContract);
			
			int inbcId = inBcManagerDao.getinbcIdMax();
			List<InBuyContractDetail> inBuyContractDetailList = inBuyContract.getInBuyContractDetail();
			int i = 0;
			for (InBuyContractDetail inBuyContractDetail : inBuyContractDetailList) {
			    
				inBuyContractDetail.setInbcId(inbcId);
				inBuyContractDetail.setInsiId(insiId);//设置供应商id
				inBuyContractDetail.setInbcState(inbcState);//设置提交状态
				inBcManagerDaoDetailDao.addBcManagerDetail(inBuyContractDetail);
				i++;
				
			}
			JSONObject json = new JSONObject();
			json.put("add", insertCount);
			json.put("upd", i);
			return json;
		}

	
	/**
	 * 删除合同
	 */
	@Override
	public JSONObject deletebcManager(int inbcId) {
		JSONObject json = new JSONObject();
		int ib = inBcManagerDao.deleteBcManagerById(inbcId);
		int ibd = inBcManagerDaoDetailDao.deleteBcManagerDetailById(inbcId);
		
		json.put("success", ibd+ib);
		return json;
	}

	/* 
	 * 修改合同
	 */
	@Override
	public JSONObject updateBcManager(InBuyContract inBuyContract) {
		
		int inbcId = inBuyContract.getInbcId();//获取主表id
		
		
		int i = 0;//添加条数
		int n = 0;//删除条数
		int j = 0;//修改条数
				
		List<InBuyContractDetail> oldInBuyContractDetailList = inBcManagerDaoDetailDao.fidnAllDetilByInbcId(inbcId);
		List<InBuyContractDetail> newInBuyContractDetailList = inBuyContract.getInBuyContractDetail();
		
		//合同细表中没有就直接添加
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("inbcId", inbcId);		
		for(InBuyContractDetail inBuyContractDetail:newInBuyContractDetailList){		
			int inbadId = inBuyContractDetail.getInbadId();//获取申请明细id			
			map.put("inbadId", inbadId);
			int count = inBcManagerDaoDetailDao.findInBuyContractDetailByIds(map);
		
			if(count==0){
				inBuyContractDetail.setInbcId(inbcId);
				i = inBcManagerDaoDetailDao.addBcManagerDetail(inBuyContractDetail);
			}
		}
		
		
		//判断是否删除
		
		if (newInBuyContractDetailList != null) {
			for (InBuyContractDetail oldInBuyContractDetail : oldInBuyContractDetailList) {// 遍历旧id
				boolean isDelete = true;				
				for (InBuyContractDetail newInBuyContractDetail : newInBuyContractDetailList) {// 遍历新id					
						if (newInBuyContractDetail.getInbadId().equals(oldInBuyContractDetail.getInbadId()) && 
							newInBuyContractDetail.getInbadId().equals(oldInBuyContractDetail.getInbadId())	) {//新旧id相等修改
							isDelete = false;
							
							continue;							 							
						}
				}
				
				if (isDelete) {// 根据字表id删除字表
				
					int inbadId = oldInBuyContractDetail.getInbadId();
					map.put("inbadId", inbadId);
					inBcManagerDaoDetailDao.deleteBcManagerDetailByInbcdIds(map);
					n++;
				}
				
			}
		} else {// 细表为空时直接删除所有细表
			n = inBcManagerDaoDetailDao.deleteBcManagerDetailById(inbcId);
		}
		JSONObject json = new JSONObject();		
		json.put("add", i);
		json.put("del", n);
		json.put("upd", j);		
		return json;
	}

	

}

	


