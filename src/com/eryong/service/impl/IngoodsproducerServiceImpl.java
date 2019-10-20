package com.eryong.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eryong.dao.IngoodsproducerDao;
import com.eryong.domain.InGoodsProducer;
import com.eryong.domain.UserInfo;
import com.eryong.service.IngoodsproducerService;
import com.eryong.util.DateUtil;

/**
 * @文件名: IngoodsproducerServiceImpl.java
 * @类功能说明:品牌管理IngoodsproducerServiceImpl层
 * @作者: QISHAOFAN
 * @Email: 1743152247@qq.com
 * @日期: 2019年6月25日上午11:13:33
 * @修改说明:<br> <pre>
 * 	 <li>作者: QISHAOFAN</li> 
 * 	 <li>日期: 2019年6月25日上午11:13:33</li> 
 *  <li>内容: </li>
 * </pre>
 */
@Service
public class IngoodsproducerServiceImpl implements IngoodsproducerService {

	@Autowired
	private IngoodsproducerDao ingoodsproducerDao;		

	@Override
	public JSONArray findAllBrads(Map<String, Object> map) {
		List<InGoodsProducer> brandList = ingoodsproducerDao.findAllBrads(map);

		JSONArray array = new JSONArray();

		for (int i = 0; i < brandList.size(); i++) {
			JSONObject json = new JSONObject();
			json.put("ingpId", brandList.get(i).getIngpId());
			json.put("ingpCode", brandList.get(i).getIngpCode());
			json.put("ingpName", brandList.get(i).getIngpName());
			json.put("ingpSpell", brandList.get(i).getIngpSpell());
			json.put("ingpLinkMan", brandList.get(i).getIngpLinkMan());
			json.put("ingpPhone", brandList.get(i).getIngpPhone());
			json.put("ingpAddress", brandList.get(i).getIngpAddress());
			json.put("currDate", brandList.get(i).getCurrDate());
			json.put("optName", brandList.get(i).getOptName());
			array.add(json);
		}

		return array;

	}

	@Override
	public int findAllBradsCount(Map<String, Object> map) {

		return ingoodsproducerDao.findAllBradsCount(map);
	}

	@Override
	public int addBrands(InGoodsProducer ingoodsproducer,
			UserInfo sessionIngoodsproducer) {
		ingoodsproducer.setCurrDate(DateUtil.formatDate(new Date(),
				"yyyy-MM-dd hh:mm:ss"));
		ingoodsproducer.setIngpState(0);
		ingoodsproducer.setIngpDelflag(0);
		ingoodsproducer.setOptid(sessionIngoodsproducer.getUserId());
		return ingoodsproducerDao.addBrands(ingoodsproducer);
	}

	@Override
	public int updateBands(InGoodsProducer ingoodsproducer) {

		int updataCount = ingoodsproducerDao.updateBands(ingoodsproducer);

		return updataCount;

	}

	@Override
	public int deleteBrands(String str) {
		String strArray[]=str.split(",");
		int count=0;
		int result=0;
		for(int i=0;i<strArray.length;i++){
			result=ingoodsproducerDao.deleteBrands(Integer.parseInt(strArray[i]));
			if(result>0){
				count++;
			}
		}
		return count;
	}

}
