package com.eryong.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eryong.domain.InBuyContract;
import com.eryong.domain.PageBean;
import com.eryong.domain.UserInfo;

import com.eryong.service.InBcManagerDetailService;
import com.eryong.service.InBcManagerService;
import com.eryong.util.ResponseUtil;
/**@文件名: InBcManagerController.java
 * @类功能说明: 
 * @作者: RenQian
 * @Email: 2509401056@qq.com
 * @日期: 2019年6月26日下午5:32:34
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: RenQian</li> 
 * 	 <li>日期: 2019年6月26日下午5:32:34</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Controller
@RequestMapping("/inBcManager")
public class InBcManagerController {

	@Autowired
	private InBcManagerService inBcManagerService;
	
	@Autowired
	private InBcManagerDetailService inBcManagerDetailService;
	
	/**
	 * @方法名: findAllworkBook
	 * @方法说明: 查询所有合同主系表信息
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月29日下午1:59:27
	 * @param res
	 * @param page
	 * @param rows
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/findAllBcManager")
	public void findAllworkBook(HttpServletResponse res,
								@RequestParam(value="page",required=false)String page,
								@RequestParam(value="rows",required=false)String rows) throws Exception{
		PageBean pageBean = new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		
		JSONArray jsonArry = inBcManagerService.findAllBcManager(pageBean);
		
		ResponseUtil.write(res, jsonArry);
	}
	
	
	/**
	 * @方法名: addBcManager
	 * @方法说明: 添加合同
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月30日下午3:45:07
	 * @param res
	 * @param inBuyContract
	 * @param req
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/addBcManager")	
	public void addBcManager(HttpServletResponse res,@RequestBody InBuyContract inBuyContract,HttpServletRequest req) throws Exception{		
		UserInfo userInfo = (UserInfo) req.getSession().getAttribute("UserInfo");
		Integer userId = userInfo.getUserId();
		String userName = userInfo.getUserName();
		inBuyContract.setUserName(userName);
		inBuyContract.setUserId(userId);
		inBuyContract.setOptId(userId);
		JSONObject json = inBcManagerService.addBcManager(inBuyContract);				
		ResponseUtil.write(res, json);
	}
	
	
	@RequestMapping("/updateBcManager")	
	public void updateBcManager(HttpServletResponse res,@RequestBody InBuyContract inBuyContract,HttpServletRequest req) throws Exception{		
		
		JSONObject json = inBcManagerService.updateBcManager(inBuyContract);				
		ResponseUtil.write(res, json);
	}
	
	
	/**
	 * @方法名: deletebcManager
	 * @方法说明: 删除合同主表
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月29日下午2:00:26
	 * @param res
	 * @param inbcId
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/deletebcManager")	
	public void deletebcManager(HttpServletResponse res,@RequestParam(value="inbcId",required=false)int inbcId) throws Exception{		
		
		JSONObject json = inBcManagerService.deletebcManager(inbcId);				
		ResponseUtil.write(res, json);
	}
	
	/**
	 * @方法名: findAllBced
	 * @方法说明: 查询所有签过合同的合同细表
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年7月1日上午12:27:50
	 * @param res
	 * @param inbcId
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/findAllBced")	
	public void findAllBced(HttpServletResponse res) throws Exception{		
		
		JSONArray array = inBcManagerDetailService.findAllBced();
		
		ResponseUtil.write(res, array);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

