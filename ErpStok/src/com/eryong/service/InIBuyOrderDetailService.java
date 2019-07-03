/**@文件名: InIBuyOrderDetailService.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月28日下午12:13:13
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月28日下午12:13:13</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.service;

import java.util.Map;

import net.sf.json.JSONArray;

/**@文件名: InIBuyOrderDetailService.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月28日下午12:13:13
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月28日下午12:13:13</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 *
 */
public interface InIBuyOrderDetailService {

	/**@方法名: getAllOrderDetial
	 * @方法说明: 获取所有订单详情信息
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月28日下午12:14:27
	 * @param map
	 * @return
	 * @return: JSONArray
	 */
	JSONArray getAllOrderDetial(Map<String, Object> map);

	/**@方法名: getAllOrderDetialCount
	 * @方法说明: 获取订单详情条数
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月28日下午12:15:05
	 * @param map
	 * @return
	 * @return: int
	 */
	int getAllOrderDetialCount(Map<String, Object> map);

}

