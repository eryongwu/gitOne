package com.eryong.dao;

import java.util.List;
import java.util.Map;

import com.eryong.domain.InGoodsProducer;

/**
 * @�ļ���: IngoodsproducerDao.java
 * @�๦��˵��:Ʒ�ƹ���dao 
 * @����: QISHAOFAN
 * @Email: 1743152247@qq.com
 * @����: 2019��6��25������11:15:52
 * @�޸�˵��:<br> <pre>
 * 	 <li>����: QISHAOFAN</li> 
 * 	 <li>����: 2019��6��25������11:15:52</li> 
 *  <li>����: </li>
 * </pre>
 */
public interface IngoodsproducerDao {

	/**
	 * @������: findAllBrads
	 * @����˵��: Ʒ�Ʋ���
	 * @����: QISHAOFAN
	 * @���䣺1743152247@qq.com
	 * @����: 2019��6��25������7:03:50
	 * @param map
	 * @return
	 * @return: List<InGoodsProducer>
	 */
	public List<InGoodsProducer> findAllBrads(Map<String, Object> map);

	/**
	 * @������: findAllBradsCount
	 * @����˵��: ��ҳ��ѯƷ������
	 * @����: QISHAOFAN
	 * @���䣺1743152247@qq.com
	 * @����: 2019��6��26������8:57:22
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findAllBradsCount(Map<String, Object> map);

	/**
	 * @������: addBrands
	 * @����˵��: ���Ʒ��
	 * @����: QISHAOFAN
	 * @���䣺1743152247@qq.com
	 * @����: 2019��6��26������8:58:58
	 * @param ingoodsproducer
	 * @return
	 * @return: int
	 */
	public int addBrands(InGoodsProducer ingoodsproducer);
/**
 * @������: updateBands
 * @����˵��: ����Ʒ��
 * @����: QISHAOFAN
 * @���䣺1743152247@qq.com
 * @����: 2019��6��26������8:59:24
 * @param inGoodsProducer
 * @return
 * @return: int
 */
	public int updateBands(InGoodsProducer inGoodsProducer);
    
	/**
	 * @������: deleteBrands
	 * @����˵��: ɾ��Ʒ��
	 * @����: QISHAOFAN
	 * @���䣺1743152247@qq.com
	 * @����: 2019��6��26������8:59:52
	 * @param ingpId
	 * @return
	 * @return: int
	 */
	public  int  deleteBrands(Integer ingpId);
}
