package com.eryong.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eryong.dao.InBuyApplyDetailDao;
import com.eryong.domain.InBuyApplyDetail;
import com.eryong.service.InBuyApplyDetailService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: InBuyApplyDetailServiceImpl.java
 * @类功能说明: 
 * @作者: 张龙飞
 * @Email: 1063614536@qq.com
 * @日期: 2019年6月28日下午3:38:06
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: 张龙飞</li> 
 * 	 <li>日期: 2019年6月28日下午3:38:06</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class InBuyApplyDetailServiceImpl implements InBuyApplyDetailService {
@Autowired
private InBuyApplyDetailDao inBuyApplyDetailDao;
	@Override
	public JSONArray findinBuyApplyDetail() {
		List<InBuyApplyDetail> inaList=inBuyApplyDetailDao.findinBuyApplyDetail();
		JSONArray jsonArray=new JSONArray();
		for(int j=0;j<inaList.size();j++){
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("inbadId", inaList.get(j).getInbadId());
			jsonObject.put("inbaId", inaList.get(j).getInbaId());			
			jsonObject.put("ingiId", inaList.get(j).getIngiId());			
			jsonObject.put("myCou", inaList.get(j).getMyCou());
			jsonObject.put("myPrice", inaList.get(j).getMyPrice());
			jsonObject.put("myMoney", inaList.get(j).getMyMoney());
			jsonObject.put("taxPrice", inaList.get(j).getTaxPrice());
			jsonObject.put("taxMoney", inaList.get(j).getTaxMoney());
			jsonObject.put("invoicesMoney", inaList.get(j).getInvoicesMoney());
			jsonObject.put("payMoney", inaList.get(j).getPayMoney());
			//jsonObject.put("inbaRemark", inaList.get(j).getInbaRemark());
			//jsonObject.put("inbaState", inaList.get(j).getInbaState());
			//jsonObject.put("inbaDelflag", inaList.get(j).getInbaDelflag());
			jsonObject.put("ingiName", inaList.get(j).getIngiName());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}


}
