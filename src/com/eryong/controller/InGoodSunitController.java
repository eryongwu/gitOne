
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

import com.eryong.domain.InGoodSunit;
import com.eryong.domain.PageBean;
import com.eryong.domain.UserInfo;
import com.eryong.service.InGoodSunitService;
import com.eryong.util.ResponseUtil;
import com.eryong.util.StringUtil;

@Controller
@RequestMapping("/inGoodSunit")
public class InGoodSunitController{
@Autowired 
InGoodSunitService inGoodSunitService;
//查找所有物品单位
@RequestMapping("/findAllSunit")
	public void findAllSunit(@RequestParam(value="page",required=false)String page,
							@RequestParam(value="rows",required=false)String rows,
							@RequestParam(value="s_inguName",required=false)String s_inguName,
							HttpServletResponse response)throws Exception{
					InGoodSunit inGoodSunit=new InGoodSunit();
					if(StringUtil.isNotEmpty(s_inguName)){inGoodSunit.setInguName(s_inguName);}
					JSONObject jsonobject=new JSONObject(); 
					PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
					Map<String,Object> map=new HashMap<String,Object>();
					map.put("inGoodSunit", inGoodSunit);
					map.put("pageBean", pageBean);
					JSONArray jsonArray=inGoodSunitService.findAllSunit(map);
					int total=inGoodSunitService.findInGoodSunitCount(map);
					jsonobject.put("rows", jsonArray);
					jsonobject.put("total", total);
					ResponseUtil.write(response, jsonobject);

	}
//添加物品单位
	@RequestMapping("/addSunit")
	public void addSunit(InGoodSunit inGoodSunit,HttpServletResponse response,HttpServletRequest request)throws Exception {
		HttpSession session=request.getSession();
		UserInfo sessionUserInfo=(UserInfo) session.getAttribute("UserInfo");
		int addResult=inGoodSunitService.addSunit(inGoodSunit, sessionUserInfo);
		JSONObject jsonbject=new JSONObject();
		if(addResult>0) {
			jsonbject.put("msg", true);
		}
		ResponseUtil.write(response, jsonbject);
		
	}
	//物品单位名唯一验证
	@RequestMapping("/findInguNameIsExist")
	public void findInguNameIsExist(@RequestParam(value="inguName",required=false)String inguName,HttpServletResponse response)throws Exception {
		int Result=inGoodSunitService.findInguNameIsExist(inguName);
		JSONObject jsonbject=new JSONObject();
		if(Result>0) {
			jsonbject.put("msg", true);
		}else {
			jsonbject.put("msg", false);
		}
		ResponseUtil.write(response, jsonbject);
	}
	//修改物品单位
	@RequestMapping("/updateSunit")
	public void updateSunit(InGoodSunit inGoodSunit,HttpServletResponse response)throws Exception {
		JSONObject jsonobject=new JSONObject();
		int updateResult=inGoodSunitService.updateSunit(inGoodSunit);
		if(updateResult>0){
			jsonobject.put("msg", true);
		}else{
			jsonobject.put("msg", false);
			
		}
		ResponseUtil.write(response, jsonobject);
	}
	//删除物品单位
	 @RequestMapping("/deleteInGoodSunitById")
		public void deleteInGoodSunitById(String str,HttpServletRequest request,HttpServletResponse response) 	throws Exception{
			int result=inGoodSunitService.deleteInGoodSunitById(str);
			JSONObject jsonobject=new JSONObject();
			if(result>0){
				jsonobject.put("msg", true);
				jsonobject.put("count", result);
			}else{
				jsonobject.put("msg", false);}
			ResponseUtil.write(response, jsonobject);
	 }

}
	