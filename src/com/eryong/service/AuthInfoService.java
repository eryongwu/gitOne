/**@文件名: AuthInfoService.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月16日下午3:52:27
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月16日下午3:52:27</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.service;

import java.util.List;



import com.eryong.domain.AuthInfo;

import net.sf.json.JSONArray;

/**@文件名: AuthInfoService.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月16日下午3:52:27
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月16日下午3:52:27</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 *
 */
public interface AuthInfoService {
	
	
	/**
	 * @方法名: getAuthTreeByAuthIdAndParentId
	 * @方法说明: 根据权限id集合和parentId获得权限树
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月16日下午5:16:20
	 * @param map
	 * @return
	 * @return: JSONArray
	 */
	public JSONArray getAuthTreeByAuthIdAndParentId(Integer patentId, List<Integer> authids);

	/**@方法名: getAllAuthInfo
	 * @方法说明: 角色授权
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月20日下午6:00:18
	 * @param parseInt
	 * @return
	 * @return: JSONArray
	 */
	public JSONArray getAllAuthInfo(Integer roleId,int parentId);

	/**@方法名: addAuthInfo
	 * @方法说明:增加权限 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月24日下午6:11:48
	 * @param authInfo
	 * @return
	 * @return: int
	 */
	public int addAuthInfo(AuthInfo authInfo);

	/**@方法名: updateAuthInfo
	 * @方法说明:修改角色信息 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月24日下午9:04:50
	 * @param authInfo
	 * @return
	 * @return: int
	 */
	public int updateAuthInfo(AuthInfo authInfo);

	/**@方法名: deleteAuthInfo
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月24日下午9:57:30
	 * @param parseInt
	 * @return
	 * @return: int
	 */
	public int deleteAuthInfo(int parseInt);
	
	
}

