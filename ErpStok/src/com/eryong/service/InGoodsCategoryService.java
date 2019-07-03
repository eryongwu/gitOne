package com.eryong.service;

import java.util.Map;

import com.eryong.domain.InGoodsCategory;
import com.eryong.domain.UserInfo;

import net.sf.json.JSONArray;

/**@�ļ���: InGoodsCategoryService.java
 * @�๦��˵��: 
 * @����: RenQian
 * @Email: 2509401056@qq.com
 * @����: 2019��6��25������1:44:36
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: RenQian</li> 
 * 	 <li>����: 2019��6��25������1:44:36</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface InGoodsCategoryService {

	public JSONArray findAllGoods(Map<String, Object> map);

	public int findAllGoodsCount(Map<String, Object> map);

	public int addGoodsCategory(InGoodsCategory ingoodscategory,
			    UserInfo sessionUserInfo);

	public int findGoodsNameExist(String ingcName);

	public int updateGoodsCategory(InGoodsCategory ingoodscategory);

	public int deleteGoodsById(String str);





	
}

