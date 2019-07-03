package com.eryong.service;

import java.util.Map;

import com.eryong.domain.InBuyApply;
import com.eryong.domain.UserInfo;

import net.sf.json.JSONArray;

/**@文件名: InBuyApplService.java
 * @类功能说明: 
 * @作者: 张龙飞
 * @Email: 1063614536@qq.com
 * @日期: 2019年6月26日下午2:20:15
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: 张龙飞</li> 
 * 	 <li>日期: 2019年6月26日下午2:20:15</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface InBuyApplService {
	/**
	 * @方法名: findAllinBuyApply
	 * @方法说明:  查找所有申请
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月27日下午4:42:49
	 * @param map
	 * @return
	 * @return: JSONArray
	 */

	public JSONArray findAllInBuyApply(Map<String, Object> map);
	/**
	 * @方法名: findinBuyApplyCount
	 * @方法说明:  查找所有申请数
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月27日下午4:42:52
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findinBuyApplyCount(Map<String, Object> map);
	/**
	 * @方法名: addInBuyApply
	 * @方法说明: 添加申请
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月27日下午4:43:05
	 * @param inBuyApply
	 * @param sessionUserInfo
	 * @return
	 * @return: int
	 */
	public int addInBuyApply(InBuyApply inBuyApply, UserInfo sessionUserInfo);
	/**
	 * @方法名: updateInBuyApply
	 * @方法说明: 修改申请
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月27日下午4:43:10
	 * @param inBuyApply
	 * @param sessionUserInfo
	 * @return
	 * @return: int
	 */
	public int updateInBuyApply(InBuyApply inBuyApply, UserInfo sessionUserInfo);
	/**
	 * @方法名: deleteInBuyApply
	 * @方法说明: 删除申请
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月27日下午4:43:14
	 * @param inbaId
	 * @return
	 * @return: int
	 */
	public int deleteInBuyApply(Integer inbaId);
	/**
	 * @方法名: SubmitInBuyApply
	 * @方法说明: 申请审核通过
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月28日下午12:10:59
	 * @param inbaId
	 * @return
	 * @return: int
	 */
	public int SubmitInBuyApply(Integer inbaId);
	/**
	 * @方法名: findInBuyApply
	 * @方法说明: 申请提交
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月28日下午2:27:39
	 * @param map
	 * @return
	 * @return: JSONArray
	 */
	public JSONArray findInBuyApply(Map<String, Object> map);
	/**
	 * @方法名: findInBuyApplys
	 * @方法说明: 申请统计
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年7月1日下午3:07:14
	 * @param map
	 * @return
	 * @return: JSONArray
	 */
	public JSONArray findInBuyApplys(Map<String, Object> map);
	/**
	 * @方法名: findInBuyApplyCounts
	 * @方法说明: 查找所有统计数
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月28日下午2:31:21
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findInBuyApplyCounts(Map<String, Object> map);
	/**
	 * @方法名: passInBuyApply
	 * @方法说明: 审核通过
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月28日下午9:31:20
	 * @param inbaId
	 * @return
	 * @return: int
	 */
	public int passInBuyApply(Integer inbaId);
	/**
	 * @方法名: rejectInBuyApply
	 * @方法说明: 驳回申请
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月28日下午10:08:51
	 * @param inBuyApply
	 * @return
	 * @return: int
	 */
	public int rejectInBuyApply(InBuyApply inBuyApply);
	/**
	 * @方法名: findinbaNameIsExist
	 * @方法说明: 申请名唯一验证
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月29日下午4:24:44
	 * @param inbaName
	 * @return
	 * @return: int
	 */
	public int findinbaNameIsExist(String inbaName);
	
	

}
