package com.eryong.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eryong.domain.RoleInfo;
import com.eryong.domain.UserInfo;
import com.eryong.domain.PageBean;
import com.eryong.util.ResponseUtil;
import com.eryong.util.StringUtil;
import com.eryong.domain.InGoodsCategory;
import com.eryong.service.InGoodsCategoryService;

/**@�ļ���: InGoodsCategory.java
 * @�๦��˵��: 
 * @����: RenQian
 * @Email: 2509401056@qq.com
 * @����: 2019��6��24������5:39:46
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: RenQian</li> 
 * 	 <li>����: 2019��6��24������5:39:46</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Controller
@RequestMapping("/inGoodsCategory")
public class InGoodsCategoryController {

	@Autowired
	private InGoodsCategoryService inGoodsCategoryService;
	
	@RequestMapping("/findAllGoods")
	public void findAllRole(@RequestParam(value="page",required=false)String page,
			                @RequestParam(value="rows",required=false)String rows,
			                @RequestParam(value="s_ingcName",required=false)String s_ingcName,
			                HttpServletResponse response)throws Exception{
		
		Map<String,Object> map=new HashMap<String,Object>();
		PageBean pageBean = new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		if(StringUtil.isNotEmpty(s_ingcName)){
			map.put("s_ingcName", s_ingcName);
		}
		map.put("pageBean", pageBean);
		JSONArray jsonArray=inGoodsCategoryService.findAllGoods(map);
		int total=inGoodsCategoryService.findAllGoodsCount(map);
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("total", total);
		jsonObject.put("rows", jsonArray);
		ResponseUtil.write(response, jsonObject);
	}
	
	@RequestMapping("/addGoodsCategory")
	public void addGoodsCategory(InGoodsCategory ingoodscategory,HttpServletResponse response,HttpServletRequest request) throws Exception{
		HttpSession session=request.getSession();
		UserInfo sessionUserInfo=(UserInfo) session.getAttribute("UserInfo");
		int addResult=inGoodsCategoryService.addGoodsCategory(ingoodscategory,sessionUserInfo);
		JSONObject jsonObject=new JSONObject();
		if(addResult>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	}
	
	@RequestMapping("/findGoodsNameExist")
	public void findGoodsNameExist(@RequestParam(value="ingcName",required=false)String ingcName,HttpServletResponse response)throws Exception{
		int result=inGoodsCategoryService.findGoodsNameExist(ingcName);
		JSONObject jsonObject=new JSONObject();
		if(result>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	}
	
	
	@RequestMapping("/updateGoodsCategory")
	public void updateGoodsCategory(InGoodsCategory ingoodscategory,HttpServletResponse response,HttpServletRequest request) throws Exception{
		int addResult=inGoodsCategoryService.updateGoodsCategory(ingoodscategory);
		JSONObject jsonObject=new JSONObject();
		if(addResult>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	}

		@RequestMapping("/deleteGoodsById")
		public void deleteGoodsById(@RequestParam(value="str",required=false)String str,HttpServletResponse response)throws Exception{
			int result=inGoodsCategoryService.deleteGoodsById(str);
			JSONObject jsonObject=new JSONObject();
			if(result>0){
				jsonObject.put("msg", true);
				jsonObject.put("count", result);
			}else{
				jsonObject.put("msg", false);
			}
			ResponseUtil.write(response, jsonObject);
		}
	
 
}

