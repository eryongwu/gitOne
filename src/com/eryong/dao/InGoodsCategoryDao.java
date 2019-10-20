package com.eryong.dao;

import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;

import com.eryong.domain.InGoodsCategory;

/**@�ļ���: InGoodsCategoryDao.java
 * @�๦��˵��: 
 * @����: RenQian
 * @Email: 2509401056@qq.com
 * @����: 2019��6��25������1:57:57
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: RenQian</li> 
 * 	 <li>����: 2019��6��25������1:57:57</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface InGoodsCategoryDao {

	public List findAllGoods(Map<String, Object> map);
	
	public int findAllGoodsCount(Map<String, Object> map);

	public int addGoodsCategory(InGoodsCategory ingoodscategory);

	public int findGoodsNameExist(String ingcName);

	public int updateRoleInfo(InGoodsCategory ingoodscategory);

	public int deleteGoodsById(Integer ingcId);

	
	
}

