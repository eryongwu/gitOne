/**@文件名: RoleInfoServiceImpl.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月16日下午4:58:42
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月16日下午4:58:42</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eryong.dao.RoleInfoDao;
import com.eryong.domain.RoleInfo;
import com.eryong.service.RoleInfoService;
import com.eryong.util.DateUtil;
import com.eryong.util.StringUtil;


/**@文件名: RoleInfoServiceImpl.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月16日下午4:58:42
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月16日下午4:58:42</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 *
 */
@Service
public class RoleInfoServiceImpl implements RoleInfoService {
	
	@Autowired
	private RoleInfoDao roleInfoDao;
	
	/**
	 * 通过角色id获得角色权限ids
	 */
	public String getRoleAuthIdsbyRoleId(Integer roleId) {
		
		return roleInfoDao.getRoleAuthIdsbyRoleId(roleId);
	}

	
	@Override
	public JSONArray roleComboxList() {
		
		List<RoleInfo> roleInfoList = roleInfoDao. roleComboxList();
		JSONArray roleInfoArray = new JSONArray();
		JSONObject json1 = new JSONObject();
		json1.put("roleName", "==请选择==");
		json1.put("roleId", "");
		roleInfoArray.add(json1);
		for(int i=0;i<roleInfoList.size();i++){
			JSONObject json = new JSONObject();			
			json.put("roleId", roleInfoList.get(i).getRoleId());
			json.put("roleName", roleInfoList.get(i).getRoleName());
			roleInfoArray.add(json);
		}
		
		return roleInfoArray;
	}


	/**
	 * 查询全部角色信息
	 */
	@Override
	public JSONArray getAllRoleInfo(Map<String, Object> map) {
		List<RoleInfo> roleInfoList = roleInfoDao.getAllRoleInfo(map);
		JSONArray roleInfoArray = new JSONArray();						
		for(int i=0;i<roleInfoList.size();i++){
			JSONObject json = new JSONObject();			
			json.put("roleId", roleInfoList.get(i).getRoleId());
			json.put("roleName", roleInfoList.get(i).getRoleName());
			json.put("authIds", roleInfoList.get(i).getAuthIds());
			json.put("roleDescription", roleInfoList.get(i).getRoleDescription());
			json.put("state", roleInfoList.get(i).getState());
			json.put("currentTime", roleInfoList.get(i).getCurrentTime());
			json.put("optId", roleInfoList.get(i).getOptId());
			json.put("optName", roleInfoList.get(i).getOptName());
			roleInfoArray.add(json);
		}
		
		return roleInfoArray;
	
		
	}


	/*
	 * 通过角色名查询角色
	 */
	@Override
	public int selectRoleByRoleName(String roleNameVild) {
		
		return roleInfoDao.selectRoleByRoleName(roleNameVild);
	}


	/* 
	 *添加角色
	 */
	@Override
	public int addRoleInfo(RoleInfo roleInfo) {
		roleInfo.setCurrentTime(DateUtil.formatDate(new Date(), "yy-MM-dd hh:mm:ss"));								
		return roleInfoDao.addUserInfo(roleInfo);
		
	}


	/* (non-Javadoc)
	 * @see com.eryong.service.RoleInfoService#updateRoleInfo(java.lang.String)
	 */
	@Override
	public int updateRoleInfo(RoleInfo roleInfo) {
		
		return roleInfoDao.updateRoleInfo(roleInfo);
	}


	/*
	 * 删除角色
	 */
	@Override
	public int deleteRoleInfo(String str) {
		List<Integer> ids = StringUtil.stringToArry(str);
		int count = 0;
		System.out.println(ids);
		for(int id:ids){
			roleInfoDao.deleteRoleInfo(id);
			count++;
		}
		
		return count;
	}


	/* 
	 *角色权限分配
	 */
	@Override
	public int updateRoleAuth(RoleInfo roleInfo) {
		
		return roleInfoDao.updateRoleAuth(roleInfo);
	}


	/* 
	 * 查询条数
	 */
	@Override
	public int getRoleInfoCount(String s_roleName) {
		int total = roleInfoDao.getRoleInfoCount(s_roleName);
		System.out.println(total);
		return total;
	}


	
	
	


}

