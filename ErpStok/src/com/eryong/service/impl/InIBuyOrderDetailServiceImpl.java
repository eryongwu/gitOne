/**@文件名: InIBuyOrderDetailServiceImpl.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月28日下午12:17:52
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月28日下午12:17:52</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.service.impl;

import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eryong.dao.InBuyOrderDetailDao;
import com.eryong.domain.InBuyOrderDetail;
import com.eryong.service.InIBuyOrderDetailService;

/**@文件名: InIBuyOrderDetailServiceImpl.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月28日下午12:17:52
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月28日下午12:17:52</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 *
 */
@Service
public class InIBuyOrderDetailServiceImpl implements InIBuyOrderDetailService {

	@Autowired
	private InBuyOrderDetailDao inBuyOrderDetailDao;
	/*
	 *获取所有订单详情
	 */
	@Override
	public JSONArray getAllOrderDetial(Map<String, Object> map) {
		List<InBuyOrderDetail> inBuyOrderDetailList = inBuyOrderDetailDao.getAllOrderDetial(map);
		JSONArray array2 = new JSONArray();		
		for(InBuyOrderDetail inBuyOrderDetail:inBuyOrderDetailList){
			JSONObject json2 = new JSONObject();
			json2.put("inbodId", inBuyOrderDetail.getInbodId());
			json2.put("inbaName", inBuyOrderDetail.getInbaName());
			json2.put("inbcName", inBuyOrderDetail.getInbcName());
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
		
		return array2;
	}

	/* 
	 * 获取所有订单详情条数
	 */
	@Override
	public int getAllOrderDetialCount(Map<String, Object> map) {
		
		return inBuyOrderDetailDao.getAllOrderDetialCount(map);
	}

}

