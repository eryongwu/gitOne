/**
 * @filename RErpUserMapper.java
 * @author eryongwu
 * @date 2019年6月14日 下午3:21:57
 * @version 1.0
 * Copyright (C) 2019 西安**发展有限责任公司
 */
/**
 * 
 */
package com.eryong.dao;

import java.util.List;
import java.util.Map;

import com.eryong.domain.UserInfo;

/**
 * @author Lenovo
 *
 */
public interface UserInfoDao {
	
	
	/**
	 * @方法名: selectUser
	 * @方法说明: 用户登录验证
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月17日下午3:41:09
	 * @param user
	 * @return
	 * @return: UserInfo
	 */
	//1.用户登录验证
		public UserInfo selectUser(UserInfo user);

		/**@方法名: findAllUsers
		 * @方法说明: 
		 * @作者: Wueryong
		 * @邮箱：738841484@qq.com
		 * @日期: 2019年6月17日下午3:40:25
		 * @param map
		 * @return
		 * @return: List<UserInfo>
		 */
		public List<UserInfo> findAllUsers(Map<String, Object> map);

		/**@方法名: getCount
		 * @方法说明: 
		 * @作者: Wueryong
		 * @邮箱：738841484@qq.com
		 * @日期: 2019年6月17日下午3:41:44
		 * @param map
		 * @return
		 * @return: Integer
		 */
		public Integer getCount(Map<String, Object> map);

		/**@方法名: selectUserByUserName
		 * @方法说明: 
		 * @作者: Wueryong
		 * @邮箱：738841484@qq.com
		 * @日期: 2019年6月19日下午2:29:39
		 * @param userName
		 * @return
		 * @return: int
		 */
		public int selectUserByUserName(String userName);

		/**@方法名: addUserInfo
		 * @方法说明: 添加用户
		 * @作者: Wueryong
		 * @邮箱：738841484@qq.com
		 * @日期: 2019年6月19日下午3:08:22
		 * @param userInfo
		 * @return
		 * @return: int
		 */
		public int addUserInfo(UserInfo userInfo);

		/**@方法名: getUserInfoByUserId
		 * @方法说明: 通过用户id获取用户信息
		 * @作者: Wueryong
		 * @邮箱：738841484@qq.com
		 * @日期: 2019年6月19日下午8:14:15
		 * @param userId
		 * @return
		 * @return: UserInfo
		 */
		public UserInfo getUserInfoByUserId(Integer userId);

		/**@方法名: updataUserInfo
		 * @方法说明: 修改用户信息
		 * @作者: Wueryong
		 * @邮箱：738841484@qq.com
		 * @日期: 2019年6月19日下午8:42:02
		 * @param userInfo
		 * @return
		 * @return: int
		 */
		public int updateUserInfo(UserInfo userInfo);

		/**@方法名: deleteUserInfo
		 * @方法说明: 删除用户
		 * @作者: Wueryong
		 * @邮箱：738841484@qq.com
		 * @日期: 2019年6月19日下午10:15:46
		 * @param id
		 * @return: void
		 */
		public void deleteUserInfo(int id);

		
		

}

