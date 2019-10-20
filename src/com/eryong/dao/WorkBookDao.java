/**@文件名: WorkBookDao.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月23日下午3:27:06
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月23日下午3:27:06</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.dao;

import java.util.List;

import com.eryong.domain.PageBean;
import com.eryong.domain.WorkBook;

/**@文件名: WorkBookDao.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月23日下午3:27:06
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月23日下午3:27:06</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 *
 */
public interface WorkBookDao {

	/**@方法名: findAllworkBook
	 * @方法说明:查询数据字典信息
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月23日下午3:28:35
	 * @return
	 * @return: List<WorkBook>
	 */
	List<WorkBook> findAllworkBook(PageBean pageBean);

	/**@方法名: addWorkBook
	 * @方法说明:添加数据
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月23日下午6:29:57
	 * @param workBook
	 * @return
	 * @return: int
	 */
	int addWorkBook(WorkBook workBook);

	/**@方法名: getMaxWBId
	 * @方法说明: 获取最大wBId
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月23日下午6:55:08
	 * @return
	 * @return: int
	 */
	int getMaxWBId();
	

	/**@方法名: updateSelectWorkBook
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月23日下午9:07:50
	 * @param wBId
	 * @return
	 * @return: WorkBook
	 */
	public WorkBook updateSelectWorkBook(int wBId);

	/**@方法名: updateWorkBookById
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月23日下午9:14:37
	 * @param wBId
	 * @return
	 * @return: int
	 */
	public int updateWorkBookById(WorkBook workBook);

	/**@方法名: deleteWorkBookById
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月24日下午11:46:41
	 * @param wBid
	 * @return
	 * @return: int
	 */
	int deleteWorkBookById(int wBid);


}

