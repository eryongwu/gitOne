/**@文件名: WorkBookDetailDao.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月23日下午3:47:10
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月23日下午3:47:10</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.dao;

import java.util.List;

import com.eryong.domain.WorkBook;
import com.eryong.domain.WorkBookDetail;

/**@文件名: WorkBookDetailDao.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月23日下午3:47:10
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月23日下午3:47:10</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 *
 */
public interface WorkBookDetailDao {

	/**
	 * @方法名: getWorkBookDetailByWBId
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月23日下午4:27:48
	 * @param wBId
	 * @return
	 * @return: WorkBookDetail
	 */
	public WorkBookDetail getWorkBookDetailByWBId(Integer wBId);

	/**@方法名: addWorkBookDetail
	 * @方法说明: 添加详情
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月23日下午6:30:24
	 * @param workBookDetail
	 * @return: void
	 */
	public int addWorkBookDetail(WorkBookDetail workBookDetail);

	/**@方法名: deleteAllWorkBookDetailByWBId
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月23日下午9:32:22
	 * @param wBId
	 * @return
	 * @return: int
	 */
	public int deleteAllWorkBookDetailByWBId(int wBId);

	/**@方法名: upDateworkBookDetail
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月23日下午11:14:23
	 * @param newWorkBookDetail
	 * @return
	 * @return: int
	 */
	public int upDateworkBookDetail(WorkBookDetail newWorkBookDetail);

	/**@方法名: deleteDateworkBookDetailByWBDId
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月23日下午11:34:09
	 * @param getwBDId
	 * @return
	 * @return: int
	 */
	public int deleteDateworkBookDetailByWBDId(Integer getwBDId);

	/**@方法名: deleteWorkBookDetailByWbId
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月24日下午11:49:03
	 * @param wBid
	 * @return
	 * @return: int
	 */
	public int deleteWorkBookDetailByWbId(int wBid);

	
	

	
}

