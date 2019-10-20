/**
 * @filename TErpUserImpl.java
 * @author eryongwu
 * @date 2019年6月14日 下午3:15:14
 * @version 1.0
 * Copyright (C) 2019 西安**发展有限责任公司
 */
/**
 * 
 */
package com.eryong.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eryong.dao.UserInfoDao;
import com.eryong.domain.UserInfo;
import com.eryong.service.UserInfoService;
import com.eryong.util.DateUtil;
import com.eryong.util.Md5;
import com.eryong.util.StringUtil;

/**
 * @author Lenovo
 *
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
		
		@Autowired
		private UserInfoDao userInfoDao;
	//1.用户登录验证
		public UserInfo selectUser(UserInfo userInfo){
			
			UserInfo userInfoService = userInfoDao.selectUser(userInfo);
		
			return userInfoService;
		}
		
	//2.查询所有未删除用户
		@Override
		public JSONArray findAllUsers(Map<String, Object> map) {
			
			List<UserInfo> userInfoList = userInfoDao.findAllUsers(map);
			
			JSONArray array = new JSONArray();
			
			for(int i = 0;i<userInfoList.size();i++){
				JSONObject json = new JSONObject();
				json.put("userId", userInfoList.get(i).getUserId());
				json.put("userName", userInfoList.get(i).getUserName());
				json.put("password", userInfoList.get(i).getPassword());
				json.put("state", userInfoList.get(i).getState());
				json.put("roleId", userInfoList.get(i).getRoleId());
				json.put("userDescription", userInfoList.get(i).getUserDescription());
				json.put("roleName", userInfoList.get(i).getRoleName());
				json.put("currentTime", userInfoList.get(i).getCurrentTime());
				json.put("optId", userInfoList.get(i).getOptId());
				array.add(json);
			}
			
			return array;
		}

		
		
		//3.查寻用户条数
		@Override
		public JSONObject getCount(Map<String, Object> map) {
			
			Integer total = userInfoDao.getCount(map);
			JSONObject json = new JSONObject();
			json.put("total", total);
			return json;
		}

		/*
		 * 通过用户名查询用户
		 */
		@Override
		public int selectUserByUserName(String userName) {
			
			return userInfoDao.selectUserByUserName(userName);
		}

		/*添加用户
		 */
		@Override
		public int addUserInfo(UserInfo userInfo) {
			userInfo.setCurrentTime(DateUtil.formatDate(new Date(), "yy-MM-dd hh:mm:ss"));
			userInfo.setPassword(Md5.MD5(userInfo.getPassword()));						
			return userInfoDao.addUserInfo(userInfo);
		}

		/* 
		 * 修改用户信息
		 */
		@Override
		public int updateUserInfo(UserInfo userInfo) {
			UserInfo updataUser = userInfoDao.getUserInfoByUserId(userInfo.getUserId());
			
			if(!updataUser.getPassword().equals(userInfo.getPassword())){
				userInfo.setPassword(Md5.MD5(userInfo.getPassword()));
			}
			int updataCount = userInfoDao.updateUserInfo(userInfo);
			
			
			
			return updataCount;
		}

		/* 
		 * 删除用户
		 */
		@Override
		public int deleteUserInfo(String str) {
			List<Integer> ids = StringUtil.stringToArry(str);
			int count = 0;
			System.out.println(ids);
			for(int id:ids){
				userInfoDao.deleteUserInfo(id);
				count++;
			}
			
			return count;
		}
		
		
	
		
  
}

