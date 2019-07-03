package com.eryong.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;








import com.eryong.dao.InGoodsCategoryDao;
import com.eryong.domain.InGoodsCategory;
import com.eryong.domain.UserInfo;
import com.eryong.service.InGoodsCategoryService;
import com.eryong.util.DateUtil;

/**@�ļ���: InGoodsCategoryServiceImpl.java
 * @�๦��˵��: 
 * @����: RenQian
 * @Email: 2509401056@qq.com
 * @����: 2019��6��25������1:49:23
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: RenQian</li> 
 * 	 <li>����: 2019��6��25������1:49:23</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Service
public class InGoodsCategoryServiceImpl implements InGoodsCategoryService{

	@Autowired
	private InGoodsCategoryDao  inGoodsCategoryDao;
	
	@Override
	public JSONArray findAllGoods(Map<String, Object> map) {
		List<InGoodsCategory> ingoodscategoryList=inGoodsCategoryDao.findAllGoods(map);
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<ingoodscategoryList.size();i++){
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("ingcId", ingoodscategoryList.get(i).getIngcId());
			jsonObject.put("ingcCode",ingoodscategoryList.get(i).getIngcCode());
			jsonObject.put("ingcName",ingoodscategoryList.get(i).getIngcName());
			jsonObject.put("ingcSpell",ingoodscategoryList.get(i).getIngcSpell());
			jsonObject.put("ingcRemark",ingoodscategoryList.get(i).getIngcRemark());
			jsonObject.put("ingcState",ingoodscategoryList.get(i).getIngcState());
			jsonObject.put("ingcDelflag",ingoodscategoryList.get(i).getIngcDelflag());
			jsonObject.put("optId",ingoodscategoryList.get(i).getOptId());
			jsonObject.put("optName",ingoodscategoryList.get(i).getOptName());
			jsonObject.put("currDate",ingoodscategoryList.get(i).getCurrDate());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

	@Override
	public int findAllGoodsCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return inGoodsCategoryDao.findAllGoodsCount(map);
	}

	@Override
	public int addGoodsCategory(InGoodsCategory ingoodscategory,
			UserInfo sessionUserInfo) {
		ingoodscategory.setIngcDelflag(0);
		ingoodscategory.setOptId(sessionUserInfo.getUserId());
		ingoodscategory.setIngcState(0);
		ingoodscategory.setCurrDate(DateUtil.formatDate(new Date(), "yy-MM-dd hh:mm:ss"));
		return inGoodsCategoryDao.addGoodsCategory(ingoodscategory);
	}

	@Override
	public int findGoodsNameExist(String ingcName) {
		// TODO Auto-generated method stub
		return inGoodsCategoryDao.findGoodsNameExist(ingcName);
	}

	@Override
	public int updateGoodsCategory(InGoodsCategory ingoodscategory) {
		return inGoodsCategoryDao.updateRoleInfo(ingoodscategory);
	}

	@Override
	public int deleteGoodsById(String str) {
		String strArray[]=str.split(",");
		int count=0;
		int result=0;
		for(int i=0;i<strArray.length;i++){
			result=inGoodsCategoryDao.deleteGoodsById(Integer.parseInt(strArray[i]));
			if(result>0){
				count++;
			}
		}
		return count;
		
	}



	
	
}

