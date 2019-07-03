/**@文件名: InIBuyOrderServiceImpl.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月26日下午1:25:53
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月26日下午1:25:53</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eryong.dao.InBcManagerDaoDetail;
import com.eryong.dao.InBuyOrderDetailDao;
import com.eryong.dao.InIBuyOrderDao;
import com.eryong.domain.InBuyOrderDetail;
import com.eryong.domain.InIBuyOrder;
import com.eryong.service.InIBuyOrderService;
import com.eryong.util.DateUtil;

/**@文件名: InIBuyOrderServiceImpl.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月26日下午1:25:53
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月26日下午1:25:53</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 * 
 */
@Service
public class InIBuyOrderServiceImpl implements InIBuyOrderService {

	@Autowired
	private InIBuyOrderDao inIBuyOrderDao;

	@Autowired
	private InBuyOrderDetailDao inIbuyOrderDetailDao;
	
	@Autowired
	private InBcManagerDaoDetail inBcManagerDaoDetail;

	/*
	 * 查询所有订单
	 */
	@Override
	public JSONArray getAllInIBuyOrder(Map<String, Object> map) {
		List<InIBuyOrder> inIBuyOrderList = inIBuyOrderDao
				.getAllInIBuyOrder(map);
		JSONArray array = new JSONArray();
		for (InIBuyOrder inIBuyOrder : inIBuyOrderList) {
			JSONObject json = new JSONObject();
			json.put("inboId", inIBuyOrder.getInboId());
			json.put("inboCode", inIBuyOrder.getInboCode());
			json.put("inboName", inIBuyOrder.getInboName());
			json.put("insiName", inIBuyOrder.getInsiName());
			json.put("userName", inIBuyOrder.getUserName());
			json.put("inboDate", inIBuyOrder.getInboDate());
			json.put("inboTotalPrice", inIBuyOrder.getInboTotalPrice());
			json.put("inboOfferprice", inIBuyOrder.getInboOfferprice());
			json.put("inboActualPrice", inIBuyOrder.getInboActualPrice());
			json.put("inboDeliveryDate", inIBuyOrder.getInboDeliveryDate());
			json.put("inboDeliveryAddress",
					inIBuyOrder.getInboDeliveryAddress());
			json.put("inboState", inIBuyOrder.getInboState());
			json.put("inboPayState", inIBuyOrder.getInboPayState());
			json.put("inboBillState", inIBuyOrder.getInboBillState());
			json.put("inboRemark", inIBuyOrder.getInboRemark());
			json.put("state", inIBuyOrder.getState());
			json.put("optName", inIBuyOrder.getOptName());
			json.put("currDate", inIBuyOrder.getCurrDate());
			List<InBuyOrderDetail> inBuyOrderDetailList = inIBuyOrder
					.getInBuyOrderDetail();
			JSONArray array2 = new JSONArray();

			for (InBuyOrderDetail inBuyOrderDetail : inBuyOrderDetailList) {
				JSONObject json2 = new JSONObject();
				json2.put("inbodId", inBuyOrderDetail.getInbodId());
				json2.put("inbaId", inBuyOrderDetail.getInbaId());// 采购申请id
				json2.put("inbaName", inBuyOrderDetail.getInbaName());
				json2.put("inbcId", inBuyOrderDetail.getInbcId());// 合同id
				json2.put("inbcName", inBuyOrderDetail.getInbcName());
				json2.put("inbcdId", inBuyOrderDetail.getInbcdId());//合同细表id
				json2.put("inboName", inBuyOrderDetail.getInboName());
				json2.put("insiName", inBuyOrderDetail.getInsiName());
				json2.put("insiId", inBuyOrderDetail.getInsiId());
				json2.put("ingiName", inBuyOrderDetail.getIngiName());
				json2.put("myPrice", inBuyOrderDetail.getMyPrice());
				json2.put("myCou", inBuyOrderDetail.getMyCou());
				json2.put("myMoney", inBuyOrderDetail.getMyMoney());
				json2.put("taxPrice", inBuyOrderDetail.getTaxPrice());
				json2.put("taxMoney", inBuyOrderDetail.getTaxMoney());
				json2.put("invoicesMoney", inBuyOrderDetail.getInvoicesMoney());
				json2.put("payMoney", inBuyOrderDetail.getPayMoney());
				json2.put("inbodRemark", inBuyOrderDetail.getInbodRemark());
				json2.put("inbodState", inBuyOrderDetail.getInbodState());
				array2.add(json2);
			}
			json.put("inBuyOrderDetail", array2);
			array.add(json);
		}
		return array;
	}

	/*
	 * 查询订单总条数
	 */
	@Override
	public int getOrderCount(Map<String, Object> map) {

		return inIBuyOrderDao.getOrderCount(map);
	}

	/*
	 * 获取订单主表信息
	 */
	@Override
	public JSONArray getAllOrder(Map<String, Object> map) {

		List<InIBuyOrder> inIBuyOrderList = inIBuyOrderDao.getAllOrder(map);
		JSONArray array = new JSONArray();
		for (InIBuyOrder inIBuyOrder : inIBuyOrderList) {
			JSONObject json = new JSONObject();
			json.put("inboId", inIBuyOrder.getInboId());
			json.put("inboCode", inIBuyOrder.getInboCode());
			json.put("inboName", inIBuyOrder.getInboName());
			json.put("insiName", inIBuyOrder.getInsiName());
			json.put("userName", inIBuyOrder.getUserName());
			json.put("inboDate", inIBuyOrder.getInboDate());
			json.put("inboTotalPrice", inIBuyOrder.getInboTotalPrice());
			json.put("inboOfferprice", inIBuyOrder.getInboOfferprice());
			json.put("inboActualPrice", inIBuyOrder.getInboActualPrice());
			json.put("inboDeliveryDate", inIBuyOrder.getInboDeliveryDate());
			json.put("inboDeliveryAddress",
					inIBuyOrder.getInboDeliveryAddress());
			json.put("inboState", inIBuyOrder.getInboState());
			json.put("inboPayState", inIBuyOrder.getInboPayState());
			json.put("inboBillState", inIBuyOrder.getInboBillState());
			json.put("inboRemark", inIBuyOrder.getInboRemark());
			json.put("oredDetailId", "<a href='javascript:oredDetailId("
					+ inIBuyOrder.getInboId() + ")'>订单详情</a>");
			json.put("state", inIBuyOrder.getState());
			json.put("optName", inIBuyOrder.getOptName());
			json.put("currDate", inIBuyOrder.getCurrDate());
			array.add(json);
		}
		return array;
	}

	/*
	 * 添加订单
	 */
	@Override
	public JSONObject addAllOrder(InIBuyOrder inIBuyOrder) {
		int inboState = inIBuyOrder.getInboState();//获取主表状态
		List<InBuyOrderDetail> inBuyOrderDetailList = inIBuyOrder
				.getInBuyOrderDetail();
		double inboTotalPrice = 0;
		if(inBuyOrderDetailList != null){
			for(InBuyOrderDetail inBuyOrderDetail:inBuyOrderDetailList){
				inboTotalPrice+=inBuyOrderDetail.getMyMoney();
			}
		}
		
		inIBuyOrder.setInboTotalPrice(inboTotalPrice);//设置主表总钱数
		inIBuyOrder.setInsiId(Integer.parseInt(inIBuyOrder.getInsiName()));//设置供应商id
		inIBuyOrder.setInboDate(DateUtil.formatDate(new Date(),
				"yy-MM-dd hh:mm:ss"));//下单时间
		inIBuyOrder.setCurrDate(DateUtil.formatDate(new Date(),
				"yy-MM-dd hh:mm:ss"));		
		int i = 0;
		i = inIBuyOrderDao.addAllOrder(inIBuyOrder);
		int orderId = inIBuyOrderDao.getMaxOrderId();
	

		if (inBuyOrderDetailList != null) {//子表添加
			for (InBuyOrderDetail inBuyOrderDetail : inBuyOrderDetailList) {
				inBuyOrderDetail.setInboId(orderId);
				inBuyOrderDetail.setInbodState(inboState);//设置状态
				i = inIbuyOrderDetailDao.addInBuyOrderDetail(inBuyOrderDetail);
				if(inboState == 6){					
					inBcManagerDaoDetail.updateInbcState(inBuyOrderDetail);//添加到订单后将合同状态设置为6
				}
				
			}
		}
		JSONObject json = new JSONObject();
		json.put("add", i);
		return json;
	}

	/**
	 * 子表增删
	 */
	@Override
	public JSONObject updateInIBuyOrder(InIBuyOrder inIBuyOrder) {
		int inboId = inIBuyOrder.getInboId();
		
		List<InBuyOrderDetail> newIbuyOrderDetailList = inIBuyOrder
				.getInBuyOrderDetail();
		List<InBuyOrderDetail> oldIbuyOrderDetailList = inIbuyOrderDetailDao
				.getAllOrderDetailByInboId(inboId);
		int add = 0;
		int del = 0;
		
		if (newIbuyOrderDetailList != null && oldIbuyOrderDetailList.size() != 0) {
			// 判断是否添加
			for (InBuyOrderDetail newinBuyOrderDetail : newIbuyOrderDetailList) {
				int inbcId = newinBuyOrderDetail.getInbcId();
				int inbcdId = newinBuyOrderDetail.getInbcdId();
				boolean ifAdd = true;
				for (InBuyOrderDetail oldinBuyOrderDetail : oldIbuyOrderDetailList) {
					if (oldinBuyOrderDetail.getInbcId().equals(inbcId)
							&& oldinBuyOrderDetail.getInbcdId().equals(inbcdId)) {
						ifAdd = false;
					}
					
				}
				
				if (ifAdd) {
					int inboState = inIBuyOrder.getInboState();//获取主表状态
					newinBuyOrderDetail.setInbodState(inboState);//设置状态
					newinBuyOrderDetail.setInboId(inboId);//设置主表id
					inIbuyOrderDetailDao.addInBuyOrderDetail(newinBuyOrderDetail);
					if(inboState == 6){
						inBcManagerDaoDetail.updateInbcState(newinBuyOrderDetail);//添加到订单后将合同状态设置为6
					}
					add++;
				}
			}
			// 判断是否删除
			for (InBuyOrderDetail oldinBuyOrderDetail : oldIbuyOrderDetailList) {
				boolean isDel = true;				
				for (InBuyOrderDetail newinBuyOrderDetail : newIbuyOrderDetailList) {
					
					if (oldinBuyOrderDetail.getInbcId().equals(
							newinBuyOrderDetail.getInbcId())
							&& oldinBuyOrderDetail.getInbcdId().equals(
									newinBuyOrderDetail.getInbcdId())) {
						
						isDel = false;
						continue;
					}
				}
				if (isDel) {
					
					inIbuyOrderDetailDao.deleteOrderDetailByInbodId(oldinBuyOrderDetail.getInbodId());
					
					del++;
				}
			}
		}else if(newIbuyOrderDetailList != null && oldIbuyOrderDetailList.size() == 0){//直接全部添加
			for(InBuyOrderDetail newinBuyOrderDetail : newIbuyOrderDetailList){
				int inboState = inIBuyOrder.getInboState();//获取主表状态
				newinBuyOrderDetail.setInbodState(inboState);//设置状态
				newinBuyOrderDetail.setInboId(inboId);//设置主表id
				inIbuyOrderDetailDao.addInBuyOrderDetail(newinBuyOrderDetail);
				if(inboState == 6){
					inBcManagerDaoDetail.updateInbcState(newinBuyOrderDetail);//添加到订单后将合同状态设置为6
				}
				add++;
			}
			
		}else if(newIbuyOrderDetailList == null && oldIbuyOrderDetailList.size() != 0){//直接全部删除			
			inIbuyOrderDetailDao.deleteOrderDetailByInboId(inboId);
			del++;
		}
		
		JSONObject json = new JSONObject();
		json.put("add", add);
		json.put("del", del);		
		return json;
	}

	/* 
	 * 删除主表及子表信息 
	 */
	@Override
	public JSONObject deleteOrder(Integer inboId) {
		
		int i = inIBuyOrderDao.deleteOrder(inboId);
		int j = inIbuyOrderDetailDao.deleteOrderDetailByInboId(inboId);
		
		
		JSONObject json = new JSONObject();
		
		json.put("success", i+j);		
		return json;
	}

}









