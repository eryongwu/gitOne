/**@文件名: AuthInfoController.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月16日下午3:42:09
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月16日下午3:42:09</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eryong.domain.AuthInfo;
import com.eryong.domain.UserInfo;
import com.eryong.service.AuthInfoService;
import com.eryong.service.RoleInfoService;
import com.eryong.util.ResponseUtil;
import com.eryong.util.StringUtil;

/**@文件名: AuthInfoController.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月16日下午3:42:09
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月16日下午3:42:09</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 *
 */
@Controller
@RequestMapping("/authInfo")
public class AuthInfoController {
	
	@Autowired
	private AuthInfoService authInfoService;
	
	@Autowired
	private RoleInfoService roleInfoService;
	/**
	 * @方法名: getAuthInfoByUserInfo
	 * @方法说明:相应权限树数据 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月16日下午8:03:07
	 * @param req
	 * @return: void
	 * @throws Exception 
	 */
	@RequestMapping("/getAuthInfoByUserInfo")
	public void getAuthInfoByUserInfo(HttpServletRequest req,HttpServletResponse res) throws Exception{
		
		UserInfo userInfo = (UserInfo) req.getSession().getAttribute("UserInfo");
	
		Integer userRoleId = userInfo.getRoleId();
		
		String authId = roleInfoService.getRoleAuthIdsbyRoleId(userRoleId);//通过用户角色查询全新集合
		
		List<Integer> authIds = StringUtil.stringToArry(authId);//将字符串转为List<Integer>
		
		JSONArray jsonTree = authInfoService.getAuthTreeByAuthIdAndParentId(-1, authIds);
		
		ResponseUtil.write(res, jsonTree);//用流相应
				
	}
	
	
	/**
	 * @方法名: getAllAuthInfo
	 * @方法说明: 角色授权并回显
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月20日下午5:55:54
	 * @param req
	 * @param res
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/getAllAuthInfo")	
	public void getAllAuthInfo(@RequestParam(value="roleId",required=false)String roleId,HttpServletResponse res) throws Exception{
			
			JSONArray jsonTree;					
			if(roleId==null){
				jsonTree = authInfoService.getAllAuthInfo(null,-1);
			}else{
				jsonTree = authInfoService.getAllAuthInfo(Integer.parseInt(roleId),-1);
			}				
			ResponseUtil.write(res, jsonTree);//用流相应
					
		}
	
	/**
	 * @方法名: addAuthInfo
	 * @方法说明: 添加角色
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月24日下午6:08:47
	 * @param authInfo
	 * @param res
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/addAuthInfo")	
	public void addAuthInfo(AuthInfo authInfo,HttpServletResponse res,HttpServletRequest req) throws Exception{			
			JSONObject json = new JSONObject();
			UserInfo user = (UserInfo) req.getSession().getAttribute("UserInfo");
			authInfo.setOptId(user.getUserId());
			int	insertCoun = authInfoService.addAuthInfo(authInfo);
			json.put("msg", insertCoun);			
			ResponseUtil.write(res, json);					
		}
	
	/**
	 * @方法名: updateAuthInfo
	 * @方法说明:修改角色 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月24日下午9:05:27
	 * @param authInfo
	 * @param res
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/updateAuthInfo")	
	public void updateAuthInfo(AuthInfo authInfo,HttpServletResponse res) throws Exception{			
			JSONObject json = new JSONObject();						
			int	updateCoun = authInfoService.updateAuthInfo(authInfo);
			json.put("msg", updateCoun);			
			ResponseUtil.write(res, json);
					
		}
	
	
	@RequestMapping("/deleteAuthInfo")	
	public void deleteAuthInfo(@RequestParam(value="authId",required=false)String authId,HttpServletResponse res) throws Exception{			
			JSONObject json = new JSONObject();						
			int	delCoun = authInfoService.deleteAuthInfo(Integer.parseInt(authId));
			json.put("msg", delCoun);			
			ResponseUtil.write(res, json);
					
		}
}

