package com.eryong.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eryong.domain.UserInfo;
import com.eryong.domain.InBuyApply;
import com.eryong.domain.PageBean;
import com.eryong.util.ResponseUtil;
import com.eryong.util.StringUtil;
import com.eryong.service.InBuyApplService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: InBuyApplyController.java
 * @类功能说明: 申请管理
 * @作者: 张龙飞
 * @Email: 1063614536@qq.com
 * @日期: 2019年6月26日下午2:07:44
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: 张龙飞</li> 
 * 	 <li>日期: 2019年6月26日下午2:07:44</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Controller
@RequestMapping("/inBuyApply")
public class InBuyApplyController {
	@Autowired
	private InBuyApplService inBuyApplService;
	//查找申请所有信息
	@RequestMapping("/findAllinBuyApply")
	public void findAllinBuyApply(@RequestParam(value="page",required=false)String page,
			@RequestParam(value="rows",required=false)String rows,
			@RequestParam(value="searchValue",required=false)String searchValue,
			HttpServletResponse response)throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		map.put("pageBean", pageBean);
		if(StringUtil.isNotEmpty(searchValue)){
		map.put("searchValue", searchValue);
		}
		JSONArray jsonArray=inBuyApplService.findAllInBuyApply(map);
		int total=inBuyApplService.findinBuyApplyCount(map);
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("rows", jsonArray);
		jsonObject.put("total", total);
		ResponseUtil.write(response, jsonObject);
}
	//添加申请
	@RequestMapping("/addInBuyApply")
	public void addInBuyApply(@RequestBody InBuyApply inBuyApply,HttpServletRequest request,HttpServletResponse response)throws Exception{
		HttpSession session=request.getSession();
		UserInfo sessionUserInfo=(UserInfo) session.getAttribute("UserInfo");
		int result=inBuyApplService.addInBuyApply(inBuyApply,sessionUserInfo);
		JSONObject jsonObject=new JSONObject();
		if(result>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	}
	//修改申请
	@RequestMapping("/updateInBuyApply")
	public void updateInBuyApply(@RequestBody InBuyApply inBuyApply,HttpServletRequest request,HttpServletResponse response)throws Exception{
		HttpSession session=request.getSession();
		UserInfo sessionUserInfo=(UserInfo) session.getAttribute("currentUserInfo");
		int result=inBuyApplService.updateInBuyApply(inBuyApply,sessionUserInfo);
		JSONObject jsonObject=new JSONObject();
		if(result>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	}
	//删除申请
	@RequestMapping("/deleteInBuyApply")
	public void deleteInBuyApply(@RequestParam(value="inbaId",required=false)String inbaId,
								HttpServletResponse response)throws Exception{
		int result=inBuyApplService.deleteInBuyApply(Integer.parseInt(inbaId));
		JSONObject jsonObject=new JSONObject();
		if(result>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	}
	//提交申请
	@RequestMapping("/SubmitInBuyApply")
	public void SubmitInBuyApply(@RequestParam(value="inbaId",required=false)String inbaId,
								HttpServletResponse response)throws Exception{
		int result=inBuyApplService.SubmitInBuyApply(Integer.parseInt(inbaId));
		JSONObject jsonObject=new JSONObject();
		if(result>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	}
	//申请统计
	@RequestMapping("/findInBuyApply")
	public void findInBuyApply(@RequestParam(value="page",required=false)String page,
			@RequestParam(value="rows",required=false)String rows,
			@RequestParam(value="s_inbaName",required=false)String s_inbaName,
			@RequestParam(value="s_busiName",required=false)String s_busiName,
			@RequestParam(value="s_inbaState",required=false)String s_inbaState,
			@RequestParam(value="s_inbtId",required=false)String s_inbtId,
			HttpServletResponse response)throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		map.put("pageBean", pageBean);
		if(StringUtil.isNotEmpty(s_inbaName)){
		map.put("s_inbaName", s_inbaName);
		}
		if(StringUtil.isNotEmpty(s_busiName)){
			map.put("s_busiName", s_busiName);
			}
		if(StringUtil.isNotEmpty(s_inbaState)){
			map.put("s_inbaState", s_inbaState);
			}
		if(StringUtil.isNotEmpty(s_inbtId)){
			map.put("s_inbtId", s_inbtId);
			}
		JSONArray jsonArray=inBuyApplService.findInBuyApply(map);
		int total=inBuyApplService.findInBuyApplyCounts(map);
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("rows", jsonArray);
		jsonObject.put("total", total);
		ResponseUtil.write(response, jsonObject);
}
	//申请审核通过
	@RequestMapping("/passInBuyApply")
	public void passInBuyApply(@RequestParam(value="inbaId",required=false)String inbaId,
			HttpServletResponse response)throws Exception {
		int result=inBuyApplService.passInBuyApply(Integer.parseInt(inbaId));
		JSONObject jsonObject=new JSONObject();
		if(result>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	}
	//申请审核驳回
	@RequestMapping("/rejectInBuyApply")
	public void rejectInBuyApply(InBuyApply inBuyApply,HttpServletResponse response)throws Exception{
		int result=inBuyApplService.rejectInBuyApply(inBuyApply);
		JSONObject jsonObject=new JSONObject();
		if(result>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	}
}
