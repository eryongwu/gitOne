/**@文件名: AuthInfoServiceImpl.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月16日下午5:16:01
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月16日下午5:16:01</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eryong.dao.AuthInfoDao;
import com.eryong.domain.AuthInfo;
import com.eryong.service.AuthInfoService;
import com.eryong.service.RoleInfoService;
import com.eryong.util.DateUtil;
import com.eryong.util.StringUtil;

/**@文件名: AuthInfoServiceImpl.java
 * @类功能说明:权限菜单管理 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月16日下午5:16:01
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月16日下午5:16:01</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 *
 */
@Service
public class AuthInfoServiceImpl implements AuthInfoService {

	@Autowired
	private AuthInfoDao authInfoDao;
	
	@Autowired
	private RoleInfoService roleInfoService;
	
	/**
	 * 递归查询树形结构权限信息
	 */
	public JSONArray getAuthTreeByAuthIdAndParentId(Integer patentId, List<Integer> authids) {
		
		JSONArray arry =this.getTreeInfo(patentId,authids);
		
		for(int i=0;i<arry.size();i++){
			
			JSONObject json = arry.getJSONObject(i);
			
			if("closed".equals(json.get("state"))){//如果当前权限有子权限将其权限id作为parentId继续查询其子权限				
				Integer patentId1 = (Integer) json.get("id");								
				json.put("children", getAuthTreeByAuthIdAndParentId(patentId1,authids));
			}else{
				continue;
			}
		}	
		return arry;
	}
	/**
	 * @方法名: getTreeInfo
	 * @方法说明: 将AuthInfo信息封装成为easyui能够识别的数据类型
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月16日下午7:00:08
	 * @param patentId
	 * @param authids
	 * @return
	 * @return: JSONArray
	 */
	private JSONArray getTreeInfo(Integer parentId, List<Integer> authids){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("parentId", parentId);
		map.put("authIds", authids);
		List<AuthInfo> authInfoList = authInfoDao.getAuthInfoAuthIdAndRoleAuthIdList(map);
		JSONArray array = new JSONArray();
		for(AuthInfo authInfo:authInfoList){			
			JSONObject json = new JSONObject();
			json.put("id", authInfo.getAuthId());
			json.put("text", authInfo.getAuthName());
			json.put("iconCls", authInfo.getIconCls());
			if(hasChildernUser(authInfo.getAuthId(),authids)){//判断当前用户拥有的权限是否有子节点
				json.put("state", "closed");
			}else{
				json.put("state", "open");
			}			
			
			if(authInfo.getAuthPath() != null){
				JSONObject json1 = new JSONObject();
				json1.put("url", authInfo.getAuthPath());//自定义属性值
				json.put("attributes", json1);//attributes自定义属性为json格式
			}
			
			array.add(json);
		}
		
		return array;
		
	}
	
	/**
	 * @方法名: hadSelected
	 * @方法说明:判断当前角色是否被选中 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月21日下午5:39:51
	 * @param roleId
	 * @param authId
	 * @return
	 * @return: boolean
	 */
	private boolean hadSelected(int roleId,int authId) {
		int flag=0;
		String authIds = roleInfoService.getRoleAuthIdsbyRoleId(roleId);
		if(authIds == null){//如果当前角色没有角色直接返回false
			
			return false;
		}else{
			
			List<Integer> ids =StringUtil.stringToArry(authIds);
			for(int id:ids){			
				if(id == authId){
					flag=1;				
				}
			}				
			if(flag==1){
				return true;
			}else{
				return false;
			}
			
		}
		
	}

	/**
	 * @方法名: getAuthTree
	 * @方法说明:角色授权权限树并回显 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月21日下午5:42:52
	 * @param roleId
	 * @return
	 * @return: JSONArray
	 */
	private JSONArray getAuthTree(Integer roleId,Integer parentId){		
		
		List<AuthInfo> authList = authInfoDao.getAuthInfoByParentId(parentId);
		JSONArray array = new JSONArray();
		for(AuthInfo authInfo:authList){			
			JSONObject json = new JSONObject();
			json.put("id", authInfo.getAuthId());
			json.put("text", authInfo.getAuthName());
			json.put("iconCls", authInfo.getIconCls());
			if(this.hasChildernAuth(authInfo.getAuthId())){//判断当前权限是否有子权限
				json.put("state", "closed");
			}else{
				json.put("state", "open");
			}			
			if(roleId != null){//菜单管理和角色id无关不用回显
				
				if(hadSelected(roleId,authInfo.getAuthId())){//角色管理数据回显，默认选中
					json.put("checked", true);
				}else{
					json.put("checked", false);
				}					
			}														
			json.put("url", authInfo.getAuthPath());
			json.put("authDescription", authInfo.getAuthDescription());
			json.put("currentTime", authInfo.getCurrentTime());
			json.put("optName", authInfo.getOptName());
			array.add(json);
			
		}
		
		return array;
	}
	
	/**
	 * @方法名: hasChildern
	 * @方法说明: 判断当前用户是否有子权限
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月20日下午6:36:42
	 * @param parentId
	 * @return
	 * @return: boolean
	 */
	private boolean hasChildernUser(int parentId,List<Integer> authIdList){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("parentId", parentId);
		map.put("authIdList", authIdList);
		int num = authInfoDao.hasChildernUser(map);		
		if(num == 0){			
			return false;
		}else{
			return true;
		}
		
	}
	
	/**
	 * @方法名: hasChildern
	 * @方法说明: 判断当前权限是否有子权限
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月21日下午5:48:54
	 * @param parentId
	 * @return
	 * @return: boolean
	 */
	private boolean hasChildernAuth(int parentId){
				
		int num = authInfoDao.hasChildernAuth(parentId);		
		if(num == 0){			
			return false;
		}else{
			return true;
		}
		
	}
	
	/**
	 * 递归实现权限树并回显
	 */
	@Override
	public JSONArray getAllAuthInfo(Integer roleId,int parentId) {
	
		JSONArray arry = getAuthTree(roleId,parentId);
			for(int i =0; i<arry.size();i++){

				JSONObject json = (JSONObject) arry.get(i);
				if(json.get("state").equals("closed")){
					int pId =json.getInt("id");
					json.put("children", getAllAuthInfo(roleId,pId));					
				}else{
					continue;
					
				}
				
			}
		return arry;
	}
	
	/* 
	 * 增加权限
	 */
	@Override
	public int addAuthInfo(AuthInfo authInfo) {
		authInfo.setCurrentTime(DateUtil.formatDate(new Date(),  "yy-MM-dd hh:mm:ss"));
		int count = authInfoDao.addAuthInfo(authInfo);
		return count;
	}
	
	/*
	 * 修改权限
	 */
	@Override
	public int updateAuthInfo(AuthInfo authInfo) {
		
		return authInfoDao.updateAuthInfo(authInfo);
	}
	/* 
	 * 删除权限及子权限
	 */
	@Override
	public int deleteAuthInfo(int authId) {
		int pAuth = authInfoDao.deleteAuthInfoById(authId);
		int cAuth = authInfoDao.deleteAuthInfoByPid(authId);
		return pAuth+cAuth;
	}
}

