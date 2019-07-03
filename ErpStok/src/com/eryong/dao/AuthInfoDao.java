/**@文件名: AuthInfoDao.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月16日下午3:54:31
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月16日下午3:54:31</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.dao;


import java.util.List;
import java.util.Map;

import com.eryong.domain.AuthInfo;

/**@文件名: AuthInfoDao.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月16日下午3:54:31
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月16日下午3:54:31</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 *
 */
public interface AuthInfoDao {
	
	/**
	 * @方法名: getAuthInfoAuthId
	 * @方法说明: 通过权限id集合和parentId获得权限信息集合
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月16日下午4:43:35
	 * @param map
	 * @return
	 * @return: List<AuthInfo>
	 */
	public List<AuthInfo> getAuthInfoAuthIdAndRoleAuthIdList(Map<String,Object> map);

	/**@方法名: getAuthInfoByParentId
	 * @方法说明: 通过父id获取权限
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月20日下午6:21:17
	 * @param parentId
	 * @return: void
	 */
	public List<AuthInfo> getAuthInfoByParentId(int parentId);

	/**@方法名: hasChildern
	 * @方法说明: 判断当前用户是否有子权限
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月20日下午6:32:56
	 * @param parentId
	 * @return
	 * @return: int
	 */
	public int hasChildernUser(Map<String,Object> map);

	/**@方法名: hasChildern
	 * @方法说明: 判断当前权限是否有子权限
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月21日下午5:49:47
	 * @param parentId
	 * @return
	 * @return: int
	 */
	public int hasChildernAuth(int parentId);

	/**@方法名: addAuthInfo
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月24日下午6:13:26
	 * @param authInfo
	 * @return
	 * @return: int
	 */
	public int addAuthInfo(AuthInfo authInfo);

	/**@方法名: updateAuthInfo
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月24日下午9:25:45
	 * @param authInfo
	 * @return
	 * @return: int
	 */
	public int updateAuthInfo(AuthInfo authInfo);

	/**@方法名: deleteAuthInfoById
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月24日下午10:01:20
	 * @param authId
	 * @return
	 * @return: int
	 */
	public int deleteAuthInfoById(int authId);

	/**@方法名: deleteAuthInfoByPid
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月24日下午10:01:27
	 * @param authId
	 * @return
	 * @return: int
	 */
	public int deleteAuthInfoByPid(int authId);
	
}

