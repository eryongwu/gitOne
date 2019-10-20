/**@文件名: RoleInfoMapper.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月16日下午4:16:54
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月16日下午4:16:54</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.dao;

import java.util.List;
import java.util.Map;

import com.eryong.domain.RoleInfo;

/**@文件名: RoleInfoMapper.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月16日下午4:16:54
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月16日下午4:16:54</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 *
 */
public interface RoleInfoDao {
	/**
	 * @方法名: getRoleAuthIdsbyRoleID
	 * @方法说明: 通过角色Id获得角色权限Ids(String)
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月16日下午4:52:45
	 * @param roleId
	 * @return
	 * @return: String
	 */
	public String getRoleAuthIdsbyRoleId(Integer roleId);

	/**@方法名: getAllRoleInfo
	 * @方法说明:查询角色信息下拉框展示
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月17日下午5:01:54
	 * @return
	 * @return: List<RoleInfo>
	 */
	public List<RoleInfo> roleComboxList();

	/**@方法名: getAllRoleInfo
	 * @方法说明:查询所有角色信息
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月18日下午11:07:27
	 * @param map
	 * @return
	 * @return: List<RoleInfo>
	 */
	public List<RoleInfo> getAllRoleInfo(Map<String, Object> map);

	/**@方法名: selectRoleByRoleName
	 * @方法说明: 通过用户名查询用户
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月20日下午2:13:27
	 * @param roleNameVild
	 * @return
	 * @return: int
	 */
	public int selectRoleByRoleName(String roleNameVild);

	/**@方法名: addUserInfo
	 * @方法说明:添加角色 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月20日下午2:21:42
	 * @param roleInfo
	 * @return
	 * @return: int
	 */
	public int addUserInfo(RoleInfo roleInfo);

	/**@方法名: updateRoleInfo
	 * @方法说明: 修改角色描述
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月20日下午3:06:41
	 * @param roleDescription
	 * @return
	 * @return: int
	 */
	public int updateRoleInfo(RoleInfo roleInfo);

	/**@方法名: deleteRoleInfo
	 * @方法说明: 删除角色
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月20日下午3:26:49
	 * @param id
	 * @return: void
	 */
	public void deleteRoleInfo(int id);

	/**@方法名: updateRoleAuth
	 * @方法说明: 角色权限分配
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月22日下午10:29:11
	 * @param auths
	 * @return
	 * @return: int
	 */
	public int updateRoleAuth(String auths);

	/**@方法名: updateRoleAuth
	 * @方法说明: 角色授权
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月22日下午10:37:01
	 * @param roleInfo
	 * @return
	 * @return: int
	 */
	public int updateRoleAuth(RoleInfo roleInfo);

	/**@方法名: getRoleInfoCount
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月24日下午3:39:38
	 * @param s_roleName
	 * @return
	 * @return: int
	 */
	public int getRoleInfoCount(String s_roleName);
	
	
	
}

