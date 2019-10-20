/**@文件名: WorkBookService.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月23日下午3:14:25
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月23日下午3:14:25</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.service;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.eryong.domain.PageBean;
import com.eryong.domain.WorkBook;

/**@文件名: WorkBookService.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月23日下午3:14:25
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月23日下午3:14:25</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 *
 */
public interface WorkBookService {

	/**@方法名: findAllworkBook
	 * @方法说明:查询所有数据字典信息
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月23日下午3:17:28
	 * @return
	 * @return: JSONArray
	 */
	JSONArray findAllworkBook(PageBean pageBean);

	/**@方法名: addWorkBook
	 * @方法说明: 添加数据字典
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月23日下午6:18:44
	 * @param workBook
	 * @return
	 * @return: int
	 */
	JSONObject addWorkBook(WorkBook workBook);

	/**@方法名: updateWorkBook
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月23日下午9:00:40
	 * @param workBook
	 * @param optId
	 * @return
	 * @return: JSONObject
	 */
	JSONObject updateWorkBook(WorkBook workBook, Integer optId);

	/**@方法名: deleteWorkBook
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月24日下午11:43:54
	 * @param parseInt
	 * @return
	 * @return: JSONObject
	 */
	JSONObject deleteWorkBook(int parseInt);

	
}

