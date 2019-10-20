package com.eryong.dao;

import java.util.List;
import java.util.Map;

import com.eryong.domain.InBuyApply;

/**@文件名: InBuyApplyDao.java
 * @类功能说明: 申请管理dao
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
public interface InBuyApplyDao {
	/**
	 * @方法名: findAllinBuyApply
	 * @方法说明: 查找所有申请
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月26日下午2:30:25
	 * @param map
	 * @return
	 * @return: List<InBuyApply>
	 */
	public List<InBuyApply> findAllInBuyApply(Map<String, Object> map);
	/**
	 * @方法名: findinBuyApplyCount
	 * @方法说明: 查找申请总数
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月26日下午2:30:29
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findInBuyApplyCount(Map<String, Object> map);
	/**
	 * @方法名: addInBuyApply
	 * @方法说明: 添加申请
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月27日下午6:38:12
	 * @param inBuyApply
	 * @return
	 * @return: int
	 */
	public int addInBuyApply(InBuyApply inBuyApply);
	/**
	 * @方法名: updateInBuyApply
	 * @方法说明: 修改申请
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月27日下午6:38:16
	 * @param inBuyApply
	 * @return
	 * @return: int
	 */
	public int updateInBuyApply(InBuyApply inBuyApply);
	/**
	 * @方法名: deleteInBuyApply
	 * @方法说明: 删除申请
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月27日下午6:38:20
	 * @param inbaId
	 * @return
	 * @return: int
	 */
	public int deleteInBuyApply(Integer inbaId);
	/**
	 * @方法名: findinBuyApplyMaxId
	 * @方法说明: 查找最新的申请
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月27日下午6:38:24
	 * @return
	 * @return: int
	 */
	public int findInBuyApplyMaxId();
	/**
	 * @方法名: SubmitInBuyApply
	 * @方法说明: 提交申请
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月28日下午12:13:39
	 * @param inbaId
	 * @return
	 * @return: int
	 */
	public int SubmitInBuyApply(Integer inbaId);
	/**
	 * @方法名: findInBuyApply
	 * @方法说明: 申请统计
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月28日下午2:28:49
	 * @param map
	 * @return
	 * @return: List<InBuyApply>
	 */
	public List<InBuyApply> findInBuyApply(Map<String, Object> map);
	/**
	 * @方法名: findInBuyApplys
	 * @方法说明: 
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年7月1日下午3:04:16
	 * @param map
	 * @return
	 * @return: List<InBuyApply>
	 */
	public List<InBuyApply> findInBuyApplys(Map<String, Object> map);
	/**
	 * @方法名: findInBuyApplyCounts
	 * @方法说明: 申请统计总数
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月28日下午2:32:24
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findInBuyApplyCounts(Map<String, Object> map);
	/**
	 * @方法名: passInBuyApply
	 * @方法说明: 申请审核通过
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月28日下午9:32:04
	 * @param inbaId
	 * @return
	 * @return: int
	 */
	public int passInBuyApply(Integer inbaId);
	/**
	 * @方法名: rejectInBuyApply
	 * @方法说明: 申请审核驳回
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月28日下午10:13:06
	 * @param inBuyApply
	 * @return
	 * @return: int
	 */
	public int rejectInBuyApply(InBuyApply inBuyApply);
	/**
	 * @方法名: findinbaNameIsExist
	 * @方法说明: 
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月29日下午4:26:15
	 * @param inbaName
	 * @return
	 * @return: int
	 */
	public int findinbaNameIsExist(String inbaName);
	
}
