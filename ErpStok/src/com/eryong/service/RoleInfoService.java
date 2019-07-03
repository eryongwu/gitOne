/**@文件名: RoleInfoService.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月16日下午4:57:07
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月16日下午4:57:07</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.service;

import java.util.Map;

import com.eryong.domain.PageBean;
import com.eryong.domain.RoleInfo;

import net.sf.json.JSONArray;

/**@文件名: RoleInfoService.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月16日下午4:57:07
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月16日下午4:57:07</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 *
 */
public interface RoleInfoService {

	/**
	 * @方法名: getRoleAuthIdsbyRoleId
	 * @方法说明: 通过角色id获得角色权限ids
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月16日下午5:01:02
	 * @param roleId
	 * @return
	 * @return: String
	 */
	public String getRoleAuthIdsbyRoleId(Integer roleId);

	/**@方法名: getAllRoleInfo
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月17日下午4:38:50
	 * @return: void
	 */
	public JSONArray roleComboxList();

	/**@方法名: getAllRoleInfo
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月18日下午11:01:29
	 * @param map
	 * @return
	 * @return: JSONArray
	 */
	public JSONArray getAllRoleInfo(Map<String, Object> map);

	/**@方法名: selectRoleByRoleName
	 * @方法说明: 通过角色名查询角色
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月20日下午2:12:05
	 * @param roleNameVild
	 * @return
	 * @return: int
	 */
	public int selectRoleByRoleName(String roleNameVild);

	/**@方法名: addRoleInfo
	 * @方法说明: 添加角色
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月20日下午2:17:28
	 * @param roleInfo
	 * @return
	 * @return: int
	 */
	public int addRoleInfo(RoleInfo roleInfo);

	/**@方法名: updateRoleInfo
	 * @方法说明: 修改角色描述
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月20日下午3:05:23
	 * @param RoleInfo roleInfo
	 * @return
	 * @return: int
	 */
	public int updateRoleInfo(RoleInfo roleInfo);

	/**@方法名: deleteRoleInfo
	 * @方法说明: 删除角色
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月20日下午3:24:55
	 * @param str
	 * @return
	 * @return: int
	 */
	public int deleteRoleInfo(String str);

	/**@方法名: updateRoleAuth
	 * @方法说明: 角色权限分配
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月22日下午10:27:41
	 * @param auths
	 * @return
	 * @return: int
	 */
	public int updateRoleAuth(RoleInfo roleInfo);

	/**@方法名: getRoleInfoCount
	 * @方法说明: 查询条数
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月24日下午3:37:42
	 * @param s_roleName
	 * @return
	 * @return: int
	 */
	public int getRoleInfoCount(String s_roleName);



	
}

