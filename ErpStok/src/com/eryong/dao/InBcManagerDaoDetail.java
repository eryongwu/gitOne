package com.eryong.dao;

import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;

import com.eryong.domain.InBuyContractDetail;
import com.eryong.domain.InBuyOrderDetail;

/**@文件名: InBcManagerDaoDetail.java
 * @类功能说明: 
 * @作者: RenQian
 * @Email: 2509401056@qq.com
 * @日期: 2019年6月27日下午3:43:48
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: RenQian</li> 
 * 	 <li>日期: 2019年6月27日下午3:43:48</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface InBcManagerDaoDetail {
	
	/**
	 * @方法名: getBcManagerDetailById
	 * @方法说明: 一对多查询合同细表
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月30日下午4:25:27
	 * @param inbcId
	 * @return
	 * @return: InBuyContractDetail
	 */
	public InBuyContractDetail getBcManagerDetailById(Integer inbcId);
	
	/**
	 * @方法名: addBcManagerDetail
	 * @方法说明: 添加合同细表
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月30日下午4:25:08
	 * @param inBuyContractDetail
	 * @return
	 * @return: int
	 */
	public int addBcManagerDetail(InBuyContractDetail inBuyContractDetail);
	
	
	/**
	 * @方法名: deleteBcManagerDetailById
	 * @方法说明: 根据主表id删除合同细表
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月30日下午4:26:20
	 * @param inbcId
	 * @return
	 * @return: int
	 */
	public int deleteBcManagerDetailById(int inbcId);

	/**@方法名: deleteBcManagerDetailByInbcdId
	 * @方法说明: 根据主表id和订单详情id删除合同详情
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月30日下午5:40:07
	 * @param inbcdId
	 * @return: void
	 */
	public int deleteBcManagerDetailByInbcdIds(Map<String, Integer> map);

	/**@方法名: findInBuyContractDetailByIds
	 * @方法说明: 通过合同id和申请详情id查询是否存在
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月30日下午7:07:56
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findInBuyContractDetailByIds(Map<String, Integer> map);
	

	/**
	 * @方法名: fidnAllDetilByInbcId
	 * @方法说明: 通过主表id查所有字表
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月30日下午11:30:56
	 * @param inbcId
	 * @return
	 * @return: List<InBuyContractDetail>
	 */
	public List<InBuyContractDetail> fidnAllDetilByInbcId(Integer inbcId);

	/**@方法名: findAllBced
	 * @方法说明: 查找所有签过合同的
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年7月1日上午12:33:23
	 * @return
	 * @return: JSONArray
	 */
	public List<InBuyContractDetail> findAllBced();

	/**@方法名: updateInbcState
	 * @方法说明: 合同下单后将合同细表状态改为6
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年7月2日上午9:50:22
	 * @param inBuyOrderDetail
	 * @return: void
	 */
	public void updateInbcState(InBuyOrderDetail inBuyOrderDetail);
}

