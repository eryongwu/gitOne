/**
 * 
 */
package com.eryong.service;

import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.eryong.domain.UserInfo;

/**
 * @author Lenovo
 *
 */

public interface UserInfoService {
	/**
	 * @方法名: selectUser
	 * @方法说明: 用户登录验证
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月17日下午3:26:48
	 * @param userInfo
	 * @return
	 * @return: UserInfo
	 */
	//1.用户登录验证
	public UserInfo selectUser(UserInfo userInfo);

	
	
	/**@方法名: findAllUsers
	 * @方法说明: 查询所有未删除用户
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月17日下午3:25:10
	 * @param map
	 * @return
	 * @return: JSONArray
	 */
	public JSONArray findAllUsers(Map<String, Object> map);
	
	
	public JSONObject getCount(Map<String, Object> map);



	/**@方法名: selectUserByUserName
	 * @方法说明:通过用户名查询用户
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月19日下午2:27:35
	 * @param userName
	 * @return
	 * @return: int
	 */
	public int selectUserByUserName(String userName);



	/**@方法名: addUserInfo
	 * @方法说明:添加用户
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月19日下午3:00:05
	 * @param userInfo
	 * @return
	 * @return: int
	 */
	public int addUserInfo(UserInfo userInfo);



	/**@方法名: updataUserInfo
	 * @方法说明: 修改用户信息
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月19日下午8:09:11
	 * @param userInfo
	 * @return
	 * @return: int
	 */
	public int updateUserInfo(UserInfo userInfo);



	/**@方法名: deleteUserInfo
	 * @方法说明:删除用户
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月19日下午10:10:25
	 * @param str
	 * @return
	 * @return: int
	 */
	public int deleteUserInfo(String str);
}

