/**@文件名: SSgg.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月14日下午5:32:52
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月14日下午5:32:52</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.controller;
/**@文件名: UserController.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月14日下午5:32:52
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月14日下午5:32:52</li> 
 *	 <li>内容: </li>
 * </pre>
 */
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eryong.domain.PageBean;
import com.eryong.domain.UserInfo;
import com.eryong.service.RoleInfoService;
import com.eryong.service.UserInfoService;
import com.eryong.util.ResponseUtil;
import com.eryong.util.StringUtil;



@Controller
@RequestMapping("/user")
public class UserInfoController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	@Autowired
	private RoleInfoService roleInfoService;
	/**
	 * @方法名: login
	 * @方法说明:用户登录验证
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月15日上午11:06:56
	 * @param imageCode
	 * @param req
	 * @param user
	 * @return
	 * @return: String
	 */
	@RequestMapping("/login")
	public String login(@RequestParam(value="imageCode",required=false)String imageCode,HttpServletRequest req,UserInfo user){
		
		String sRand = (String)req.getSession().getAttribute("sRand");//获取session中的验证码
		if(sRand != null){
			if(sRand.equals(imageCode)){//当验证码正确，核对账号密码
				
				UserInfo userInfo = userInfoService.selectUser(user);
								
				if(userInfo != null){
					UserInfo currentUserInfo = (UserInfo)req.getSession().getAttribute("UserInfo");//获取session中的UserInfo对象
					if( currentUserInfo != null){//判断session中是否有用户信息
						req.getSession().removeAttribute("UserInfo");
						
					}
					req.getSession().setAttribute("UserInfo", userInfo);//将用户信息存入sission
					
					return "main";
				}else{//账号或密码错误
					return "redirect:/login.jsp?error=2&userName="+user.getUserName()+"&password="+user.getPassword()+"&imageCode="+sRand+"";
				}
			}else{//验证码错误
				
				return "redirect:/login.jsp?error=1&userName="+user.getUserName()+"&password="+user.getPassword()+"&imageCode="+sRand+"";
			}
			}else{//当用户清空浏览器缓存session中无数据返回登陆页面
				return "redirect:/login.jsp";
			}
	}
	
	/**
	 * @方法名: logout
	 * @方法说明: 推出登录
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月25日上午12:26:52
	 * @param req
	 * @return
	 * @return: String
	 */
	@RequestMapping("/logout")
	public String logout(HttpServletRequest req){
		req.getSession().removeAttribute("UserInfo");			
		return "redirect:/login.jsp";
	}
	/**
	 * @方法名: findAllUsers
	 * @方法说明: 查询所有用户信息用户列表展示
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月19日下午8:04:31
	 * @param page
	 * @param rows
	 * @param s_userName
	 * @param s_roleId
	 * @param res
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/findAllUsers")
	public void findAllUsers(@RequestParam(value="page",required=false)String page,
							 @RequestParam(value="rows",required=false)String rows,
							 @RequestParam(value="s_userName",required=false)String s_userName,
							 @RequestParam(value="s_roleId",required=false)String s_roleId,
							 HttpServletResponse res) throws Exception{
		
		UserInfo userInfo = new UserInfo();
		if(StringUtil.isNotEmpty(s_userName)){
			userInfo.setUserName(s_userName);
		}
		if(StringUtil.isNotEmpty(s_roleId)){
			userInfo.setRoleId(Integer.parseInt(s_roleId));
		}		
		PageBean pageBean = new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("pageBean", pageBean);
		map.put("userInfo", userInfo);
		JSONArray arrayUserInfo = userInfoService.findAllUsers(map);//用户所有信息
		JSONObject jsonUserInfoCount = userInfoService.getCount(map);//查询总条数
		jsonUserInfoCount.put("rows", arrayUserInfo);
		ResponseUtil.write(res, jsonUserInfoCount);//输出到页面		
		
	}
	
	/**
	 * @方法名: addUserInfo
	 * @方法说明: 添加用户
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月19日下午3:54:23
	 * @param userNameVild
	 * @param res
	 * @param userInfo
	 * @param req
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/addUserInfo")
	public void addUserInfo(@RequestParam(value="userNameVild",required=false)String userNameVild,HttpServletResponse res,
							UserInfo userInfo,HttpServletRequest req) throws Exception{
		JSONObject json = new JSONObject();
		if(userNameVild != null){
		int userInfoCount = userInfoService.selectUserByUserName(userNameVild);
		
		json.put("msg", userInfoCount);
		
		ResponseUtil.write(res, json);
		}else{
			UserInfo currentUser = (UserInfo)req.getSession().getAttribute("UserInfo");
			userInfo.setOptId(currentUser.getUserId());
			
			int inserNum = userInfoService.addUserInfo(userInfo);			
			json.put("msg", inserNum);
			ResponseUtil.write(res, json);
		}				
		
	}
	
	
	/**
	 * @方法名: updataUserInfo
	 * @方法说明: 修改用户信息
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月19日下午8:06:59
	 * @param res
	 * @param userInfo
	 * @param req
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/updateUserInfo")
	public void updateUserInfo(HttpServletResponse res,UserInfo userInfo,HttpServletRequest req) throws Exception{
			JSONObject json = new JSONObject();
			int updataNum = userInfoService.updateUserInfo(userInfo);			
			json.put("msg", updataNum);
			ResponseUtil.write(res, json);
		}
	
	
	
	/**
	 * @方法名: deleteUserInfo
	 * @方法说明: 删除用户
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月19日下午10:07:50
	 * @param res
	 * @param userInfo
	 * @param req
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/deleteUserInfo")
	public void deleteUserInfo(HttpServletResponse res,@RequestParam(value="str",required=false)String str) throws Exception{
			JSONObject json = new JSONObject();
			int deleteNum = userInfoService.deleteUserInfo(str);			
			json.put("msg", deleteNum);
			ResponseUtil.write(res, json);
		}
	
	
	/**
	 * 
	 */
	@RequestMapping("/passward")
	@ResponseBody
	public JSONObject passward(HttpServletResponse res,@RequestParam(value="JSONObject",required=false)String str) throws Exception{
			JSONObject json = new JSONObject();
			int deleteNum = userInfoService.deleteUserInfo(str);			
			json.put("msg", deleteNum);
			return json;
		}
}



