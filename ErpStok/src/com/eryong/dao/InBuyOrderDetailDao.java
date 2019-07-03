/**@文件名: InBuyOrderDetailDao.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月26日下午2:20:59
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月26日下午2:20:59</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.dao;

import java.util.List;
import java.util.Map;

import com.eryong.domain.InBuyOrderDetail;

/**@文件名: InBuyOrderDetailDao.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月26日下午2:20:59
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月26日下午2:20:59</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 *
 */
public interface InBuyOrderDetailDao {

	public InBuyOrderDetail getAllInBuyOrderDetail(Integer inboId);
	
	/**
	 * @方法名: getAllOrderDetial
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月28日下午12:34:51
	 * @param map
	 * @return
	 * @return: List<InBuyOrderDetail>
	 */
	public List<InBuyOrderDetail> getAllOrderDetial(Map<String,Object> map);

	/**@方法名: getAllOrderDetialCount
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月28日下午12:32:46
	 * @return
	 * @return: int
	 */
	public int getAllOrderDetialCount(Map<String,Object> map);

	/**@方法名: addInBuyOrderDetail
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年7月1日上午3:04:44
	 * @return
	 * @return: int
	 */
	public int addInBuyOrderDetail(InBuyOrderDetail inBuyOrderDetail);

	/**@方法名: getAllOrderDetailByInboId
	 * @方法说明: 根据主表id获取所有子表信息
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年7月1日下午5:39:05
	 * @param inboId
	 * @return
	 * @return: List<InBuyOrderDetail>
	 */
	public List<InBuyOrderDetail> getAllOrderDetailByInboId(int inboId);

	/**@方法名: deleteOrderDetailByInbodId
	 * @方法说明: 通过子表id删除子表
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年7月1日下午6:32:48
	 * @param inbodId
	 * @return
	 * @return: Object
	 */
	public int deleteOrderDetailByInbodId(Integer inbodId);

	/**@方法名: deleteOrderDetailByInboId
	 * @方法说明: 通过主表id删除子表
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年7月1日下午6:57:34
	 * @param inboId
	 * @return: void
	 */
	public int deleteOrderDetailByInboId(int inboId);
}

