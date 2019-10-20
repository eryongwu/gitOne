package com.eryong.dao;

import java.util.List;
import java.util.Map;

import com.eryong.domain.InGoodsProducer;

/**
 * @文件名: IngoodsproducerDao.java
 * @类功能说明:品牌管理dao 
 * @作者: QISHAOFAN
 * @Email: 1743152247@qq.com
 * @日期: 2019年6月25日上午11:15:52
 * @修改说明:<br> <pre>
 * 	 <li>作者: QISHAOFAN</li> 
 * 	 <li>日期: 2019年6月25日上午11:15:52</li> 
 *  <li>内容: </li>
 * </pre>
 */
public interface IngoodsproducerDao {

	/**
	 * @方法名: findAllBrads
	 * @方法说明: 品牌查找
	 * @作者: QISHAOFAN
	 * @邮箱：1743152247@qq.com
	 * @日期: 2019年6月25日下午7:03:50
	 * @param map
	 * @return
	 * @return: List<InGoodsProducer>
	 */
	public List<InGoodsProducer> findAllBrads(Map<String, Object> map);

	/**
	 * @方法名: findAllBradsCount
	 * @方法说明: 分页查询品牌行数
	 * @作者: QISHAOFAN
	 * @邮箱：1743152247@qq.com
	 * @日期: 2019年6月26日上午8:57:22
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllBradsCount(Map<String, Object> map);

	/**
	 * @方法名: addBrands
	 * @方法说明: 添加品牌
	 * @作者: QISHAOFAN
	 * @邮箱：1743152247@qq.com
	 * @日期: 2019年6月26日上午8:58:58
	 * @param ingoodsproducer
	 * @return
	 * @return: int
	 */
	public int addBrands(InGoodsProducer ingoodsproducer);
/**
 * @方法名: updateBands
 * @方法说明: 更新品牌
 * @作者: QISHAOFAN
 * @邮箱：1743152247@qq.com
 * @日期: 2019年6月26日上午8:59:24
 * @param inGoodsProducer
 * @return
 * @return: int
 */
	public int updateBands(InGoodsProducer inGoodsProducer);
    
	/**
	 * @方法名: deleteBrands
	 * @方法说明: 删除品牌
	 * @作者: QISHAOFAN
	 * @邮箱：1743152247@qq.com
	 * @日期: 2019年6月26日上午8:59:52
	 * @param ingpId
	 * @return
	 * @return: int
	 */
	public  int  deleteBrands(Integer ingpId);
}
