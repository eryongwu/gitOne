/**@文件名: RoleInfoController.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月17日下午5:35:36
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月17日下午5:35:36</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.controller;

import java.util.HashMap;
import java.util.Map;

import javax.json.JsonObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eryong.domain.PageBean;
import com.eryong.domain.RoleInfo;
import com.eryong.domain.UserInfo;
import com.eryong.service.RoleInfoService;
import com.eryong.util.ResponseUtil;

/**@文件名: RoleInfoController.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月17日下午5:35:36
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月17日下午5:35:36</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 * 
 */
@Controller
@RequestMapping("/roleInfo")
public class RoleInfoController {

	@Autowired
	private RoleInfoService roleInfoService;

	/**
	 * @方法名: getAllRoleInfo
	 * @方法说明: 用户管理列表下拉框角色展示
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月18日下午10:56:35
	 * @param res
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/roleComboxList")
	public void roleComboxList(HttpServletResponse res) throws Exception {

		JSONArray arrayRoleInfo = roleInfoService.roleComboxList();// 查询所有角色信息
		ResponseUtil.write(res, arrayRoleInfo);
	}

	/**
	 * @方法名: findAllRole
	 * @方法说明: 用户添加角色详情列表展示
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月18日下午10:57:23
	 * @param res
	 * @param s_roleName
	 * @param pageBean
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/findAllRole")
	public void findAllRole(
			HttpServletResponse res,
			@RequestParam(value = "s_roleName", required = false) String s_roleName,
			@RequestParam(value = "page", required = false) String page,
			@RequestParam(value = "rows", required = false) String rows)
			throws Exception {

		Map<String, Object> map = new HashMap<String, Object>();
		PageBean pageBean = new PageBean(Integer.parseInt(page),
				Integer.parseInt(rows));
		map.put("s_roleName", s_roleName);
		map.put("pageBean", pageBean);
		
		JSONObject json = new JSONObject();
		int total = roleInfoService.getRoleInfoCount(s_roleName);
		
		JSONArray arrayRoleInfo = roleInfoService.getAllRoleInfo(map);// 查询所有角色信息
		json.put("total", total);
		json.put("rows", arrayRoleInfo);		
		ResponseUtil.write(res, json);
	}
	
	/**
	 * @方法名: addRoleInfo
	 * @方法说明: 添加角色
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月24日下午3:34:59
	 * @param res
	 * @param roleNameVild
	 * @param roleInfo
	 * @param resp
	 * @param req
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/addRoleInfo")
	public void addRoleInfo(
			HttpServletResponse res,
			@RequestParam(value = "roleNameVild", required = false) String roleNameVild,
			RoleInfo roleInfo, HttpServletResponse resp, HttpServletRequest req)
			throws Exception {

		JSONObject json = new JSONObject();
		if (roleNameVild != null) {
			int roleInfoCount = roleInfoService
					.selectRoleByRoleName(roleNameVild);
			json.put("msg", roleInfoCount);
			ResponseUtil.write(res, json);
		} else {
			UserInfo currentUser = (UserInfo) req.getSession().getAttribute(
					"UserInfo");
			roleInfo.setOptId(currentUser.getUserId());

			int inserNum = roleInfoService.addRoleInfo(roleInfo);
			json.put("msg", inserNum);
			ResponseUtil.write(resp, json);
		}
	}

	/**
	 * @方法名: updateRoleInfo
	 * @方法说明: 修改角色
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月20日下午3:20:15
	 * @param roleInfo
	 * @param resp
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/updateRoleInfo")
	public void updateRoleInfo(RoleInfo roleInfo, HttpServletResponse resp)
			throws Exception {

		JSONObject json = new JSONObject();
		int inserNum = roleInfoService.updateRoleInfo(roleInfo);
		json.put("msg", inserNum);
		ResponseUtil.write(resp, json);
	}
	/**
	 * @方法名: deleteRoleInfo
	 * @方法说明: 删除角色
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月20日下午3:32:00
	 * @param str
	 * @param resp
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/deleteRoleInfo")
	public void deleteRoleInfo(@RequestParam(value="str",required=false)String str, HttpServletResponse resp)
			throws Exception {

		JSONObject json = new JSONObject();
		int deleteNum = roleInfoService.deleteRoleInfo(str);
		json.put("msg", deleteNum);
		ResponseUtil.write(resp, json);
	}
	
	@RequestMapping("/updateRoleAuth")
	public void updateRoleAuth(RoleInfo roleInfo,HttpServletResponse resp)
			throws Exception {
		System.out.println(roleInfo);
		JSONObject json = new JSONObject();
		int updateNum = roleInfoService.updateRoleAuth(roleInfo);
		if(updateNum>0){
			json.put("msg", true);
		}else{
			json.put("msg", false);
		}
		
		ResponseUtil.write(resp, json);
	}

}
