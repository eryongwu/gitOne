package com.eryong.dao;

import java.util.List;

import com.eryong.domain.InBuyContract;
import com.eryong.domain.PageBean;

/**@文件名: InBcManagerDao.java
 * @类功能说明: 
 * @作者: RenQian
 * @Email: 2509401056@qq.com
 * @日期: 2019年6月27日下午3:43:29
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: RenQian</li> 
 * 	 <li>日期: 2019年6月27日下午3:43:29</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface InBcManagerDao {

	public List<InBuyContract> findAllBcManager(PageBean pageBean);
	
	/**
	 * @方法名: getinbcIdMax
	 * @方法说明: 获取合同主表最大id
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月30日下午3:38:01
	 * @return
	 * @return: int
	 */
	public int getinbcIdMax();

	public int addBcManager(InBuyContract inBuyContract);

	public InBuyContract updateSelectInBuyContract(int inbcId);
	
	
	/**
	 * @方法名: deleteBcManagerById
	 * @方法说明: 删除主表
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年7月1日上午12:18:29
	 * @param inbcId
	 * @return
	 * @return: int
	 */
	public int deleteBcManagerById(int inbcId);

	

}

