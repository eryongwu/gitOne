package com.eryong.dao;

import java.util.List;

import com.eryong.domain.InBuyApply;
import com.eryong.domain.InBuyApplyDetail;

/**@文件名: InBuyApplyDetailDao.java
 * @类功能说明: 申请细表dao
 * @作者: 张龙飞
 * @Email: 1063614536@qq.com
 * @日期: 2019年6月26日下午2:09:45
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: 张龙飞</li> 
 * 	 <li>日期: 2019年6月26日下午2:09:45</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface InBuyApplyDetailDao {
	/**
	 * @方法名: getInBuyApplyDetailByIbaId
	 * @方法说明: 查找申请下相关的子表
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月27日下午6:40:47
	 * @param inbaId
	 * @return
	 * @return: InBuyApplyDetail
	 */
	public InBuyApplyDetail getInBuyApplyDetailByIbaId(Integer inbaId);
	/**
	 * @方法名: addWorkBookDetail
	 * @方法说明:添加申请
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月27日下午6:40:50
	 * @param inBuyApplyDetail
	 * @return: void
	 */

	public void addWorkBookDetail(InBuyApplyDetail inBuyApplyDetail);
	/**
	 * @方法名: findAllinBuyApplyDetailByWbId
	 * @方法说明: 
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月27日下午6:40:54
	 * @param inbaId
	 * @return
	 * @return: List<InBuyApplyDetail>
	 */

	public List<InBuyApplyDetail> findAllinBuyApplyDetailByInbaId(Integer inbaId);
	/**
	 * @方法名: updateWorkBookDetail
	 * @方法说明: 
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月27日下午6:40:57
	 * @param newObject
	 * @return
	 * @return: int
	 */

	public int updateWorkBookDetail(InBuyApplyDetail newObject);
	/**
	 * @方法名: deleteInBuyApplyDetailByWbId
	 * @方法说明: 
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月27日下午6:41:01
	 * @param inbaId
	 * @return
	 * @return: int
	 */
	public int deleteInBuyApplyDetailByInbaId(Integer inbaId);
	/**
	 * @方法名: deleteInBuyApplyDetail
	 * @方法说明: 
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月27日下午6:41:05
	 * @param inbadId
	 * @return
	 * @return: int
	 */

	public int deleteInBuyApplyDetail(Integer inbadId);
	/**
	 * @方法名: findAllinBuyApplyDetail
	 * @方法说明: 
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月28日下午3:50:42
	 * @param map
	 * @return
	 * @return: List<InBuyApplyDetail>
	 */
	public List<InBuyApplyDetail> findinBuyApplyDetail();
	/**
	 * @方法名: rejectInBuyApplyDetailByInbaId
	 * @方法说明: 
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月28日下午10:13:19
	 * @param inBuyApply
	 * @return
	 * @return: int
	 */
	public int rejectInBuyApplyDetailByInbaId(Integer inbaId);
	/**
	 * @方法名: passInBuyApplyDetail
	 * @方法说明: 
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月28日下午10:20:07
	 * @param inbaId
	 * @return
	 * @return: int
	 */
	public int passInBuyApplyDetail(Integer inbaId); 
}
