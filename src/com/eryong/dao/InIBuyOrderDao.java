/**@文件名: InIBuyOrderDao.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月26日下午1:54:25
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月26日下午1:54:25</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.dao;

import java.util.List;
import java.util.Map;

import com.eryong.domain.InIBuyOrder;

/**@文件名: InIBuyOrderDao.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月26日下午1:54:25
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月26日下午1:54:25</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 *
 */
public interface InIBuyOrderDao {

	/**@方法名: getAllInIBuyOrder
	 * @方法说明: 查询所有订单信息
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月26日下午1:54:47
	 * @param map
	 * @return
	 * @return: List<InIBuyOrder>
	 */
	List<InIBuyOrder> getAllInIBuyOrder(Map<String, Object> map);

	/**@方法名: getOrderCount
	 * @方法说明: 查询订单条数
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月26日下午1:55:01
	 * @param map
	 * @return
	 * @return: int
	 */
	int getOrderCount(Map<String, Object> map);

	/**@方法名: getAllOrder
	 * @方法说明: 获取订单主表
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月28日上午10:37:02
	 * @param map
	 * @return
	 * @return: List<InIBuyOrder>
	 */
	List<InIBuyOrder> getAllOrder(Map<String, Object> map);

	/**@方法名: addAllOrder
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年7月1日上午2:42:29
	 * @param inIBuyOrder
	 * @return
	 * @return: int
	 */
	int addAllOrder(InIBuyOrder inIBuyOrder);

	/**@方法名: getMaxOrderId
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年7月1日上午3:01:39
	 * @return
	 * @return: int
	 */
	int getMaxOrderId();

	/**@方法名: deleteOrder
	 * @方法说明: 删除主表
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年7月1日下午9:42:50
	 * @param inboId
	 * @return
	 * @return: int
	 */
	int deleteOrder(Integer inboId);

}

