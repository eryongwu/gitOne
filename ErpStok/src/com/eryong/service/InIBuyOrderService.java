/**@文件名: InIBuyOrderService.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月26日下午1:23:57
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月26日下午1:23:57</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.service;

import java.util.Map;

import com.eryong.domain.InIBuyOrder;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: InIBuyOrderService.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月26日下午1:23:57
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月26日下午1:23:57</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 *
 */
public interface InIBuyOrderService {

	/**@方法名: getAllInIBuyOrder
	 * @方法说明: 查询所有订单及详情
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月26日下午1:24:04
	 * @param map
	 * @return
	 * @return: JSONArray
	 */
	JSONArray getAllInIBuyOrder(Map<String, Object> map);

	/**@方法名: getOrderCount
	 * @方法说明: 查询订单总数
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月26日下午1:24:10
	 * @param map
	 * @return
	 * @return: int
	 */
	int getOrderCount(Map<String, Object> map);

	/**@方法名: getAllOrder
	 * @方法说明: 获取订单主表信息
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月28日上午10:34:08
	 * @param map
	 * @return
	 * @return: JSONArray
	 */
	JSONArray getAllOrder(Map<String, Object> map);

	/**@方法名: addAllOrder
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年7月1日上午2:29:12
	 * @param inIBuyOrder
	 * @return
	 * @return: JSONObject
	 */
	JSONObject addAllOrder(InIBuyOrder inIBuyOrder);

	/**@方法名: updateInIBuyOrder
	 * @方法说明: 子表增删
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年7月1日下午5:32:25
	 * @param inIBuyOrder
	 * @return
	 * @return: JSONObject
	 */
	JSONObject updateInIBuyOrder(InIBuyOrder inIBuyOrder);

	/**@方法名: deleteOrder
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年7月1日下午9:29:16
	 * @param inboId
	 * @return
	 * @return: JSONObject
	 */
	JSONObject deleteOrder(Integer inboId);

}

