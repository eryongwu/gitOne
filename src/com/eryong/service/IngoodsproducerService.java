package com.eryong.service;

import java.util.Map;

import com.eryong.domain.InGoodsProducer;
import com.eryong.domain.UserInfo;

import net.sf.json.JSONArray;

/**
 * @�ļ���: IngoodsproducerService.java
 * @�๦��˵��:
 * @����: QISHAOFAN
 * @Email: 1743152247@qq.com
 * @����: 2019��6��25������11:13:07
 * @�޸�˵��:<br> <pre>
 * 	 <li>����: QISHAOFAN</li> 
 * 	 <li>����: 2019��6��25������11:13:07</li> 
 *  <li>����: </li>
 * </pre>
 */
public interface IngoodsproducerService {
	public JSONArray findAllBrads(Map<String, Object> map);

	public int findAllBradsCount(Map<String, Object> map);

	public int addBrands(InGoodsProducer ingoodsproducer,
			UserInfo sessionIngoodsproducer);

	public int updateBands(InGoodsProducer inGoodsProducer);

	public   int  deleteBrands(String  str);
}
