package com.eryong.service;

import java.util.Map;

import com.eryong.domain.InGoodsProducer;
import com.eryong.domain.UserInfo;

import net.sf.json.JSONArray;

/**
 * @文件名: IngoodsproducerService.java
 * @类功能说明:
 * @作者: QISHAOFAN
 * @Email: 1743152247@qq.com
 * @日期: 2019年6月25日上午11:13:07
 * @修改说明:<br> <pre>
 * 	 <li>作者: QISHAOFAN</li> 
 * 	 <li>日期: 2019年6月25日上午11:13:07</li> 
 *  <li>内容: </li>
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
