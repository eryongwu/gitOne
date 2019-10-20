/**@鏂囦欢鍚�: RoleInfoController.java
 * @绫诲姛鑳借鏄�: 
 * @浣滆��: Wueryong
 * @Email: 738841484@qq.com
 * @鏃ユ湡: 2019骞�6鏈�17鏃ヤ笅鍗�5:35:36
 * @淇敼璇存槑:<br> 
 * <pre>
 * 	 <li>浣滆��: Wueryong</li> 
 * 	 <li>鏃ユ湡: 2019骞�6鏈�17鏃ヤ笅鍗�5:35:36</li> 
 *	 <li>鍐呭: </li>
 * </pre>
 */
package com.eryong.controller;

import java.util.HashMap;
import java.util.Map;


import net.sf.json.JSONObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eryong.domain.PageBean;
import com.eryong.domain.RoleInfo;
import com.eryong.domain.UserInfo;
import com.eryong.service.RoleInfoService;
import com.eryong.util.ResponseUtil;

/**@鏂囦欢鍚�: RoleInfoController.java
 * @绫诲姛鑳借鏄�: 
 * @浣滆��: Wueryong
 * @Email: 738841484@qq.com
 * @鏃ユ湡: 2019骞�6鏈�17鏃ヤ笅鍗�5:35:36
 * @淇敼璇存槑:<br> 
 * <pre>
 * 	 <li>浣滆��: Wueryong</li> 
 * 	 <li>鏃ユ湡: 2019骞�6鏈�17鏃ヤ笅鍗�5:35:36</li> 
 *	 <li>鍐呭: </li>
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
	 * @鏂规硶鍚�: getAllRoleInfo
	 * @鏂规硶璇存槑: 鐢ㄦ埛绠＄悊鍒楄〃涓嬫媺妗嗚鑹插睍绀�
	 * @浣滆��: Wueryong
	 * @閭锛�738841484@qq.com
	 * @鏃ユ湡: 2019骞�6鏈�18鏃ヤ笅鍗�10:56:35
	 * @param res
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/roleComboxList")
	public void roleComboxList(HttpServletResponse res) throws Exception {

		JSONArray arrayRoleInfo = roleInfoService.roleComboxList();// 鏌ヨ鎵�鏈夎鑹蹭俊鎭�
		ResponseUtil.write(res, arrayRoleInfo);
	}

	/**
	 * @鏂规硶鍚�: findAllRole
	 * @鏂规硶璇存槑: 鐢ㄦ埛娣诲姞瑙掕壊璇︽儏鍒楄〃灞曠ず
	 * @浣滆��: Wueryong
	 * @閭锛�738841484@qq.com
	 * @鏃ユ湡: 2019骞�6鏈�18鏃ヤ笅鍗�10:57:23
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
		
		JSONArray arrayRoleInfo = roleInfoService.getAllRoleInfo(map);// 鏌ヨ鎵�鏈夎鑹蹭俊鎭�
		json.put("total", total);
		json.put("rows", arrayRoleInfo);		
		ResponseUtil.write(res, json);
	}
	
	/**
	 * @鏂规硶鍚�: addRoleInfo
	 * @鏂规硶璇存槑: 娣诲姞瑙掕壊
	 * @浣滆��: Wueryong
	 * @閭锛�738841484@qq.com
	 * @鏃ユ湡: 2019骞�6鏈�24鏃ヤ笅鍗�3:34:59
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
	 * @鏂规硶鍚�: updateRoleInfo
	 * @鏂规硶璇存槑: 淇敼瑙掕壊
	 * @浣滆��: Wueryong
	 * @閭锛�738841484@qq.com
	 * @鏃ユ湡: 2019骞�6鏈�20鏃ヤ笅鍗�3:20:15
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
	 * @鏂规硶鍚�: deleteRoleInfo
	 * @鏂规硶璇存槑: 鍒犻櫎瑙掕壊
	 * @浣滆��: Wueryong
	 * @閭锛�738841484@qq.com
	 * @鏃ユ湡: 2019骞�6鏈�20鏃ヤ笅鍗�3:32:00
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
