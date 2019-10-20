package com.eryong.dao;

import java.util.List;
import java.util.Map;

import com.eryong.domain.InGoodSunit;



/**@文件名: InGoodSunitDao.java
 * @类功能说明: 物品单位dao
 * @作者: 张龙飞
 * @Email: 1063614536@qq.com
 * @日期: 2019年6月24日下午5:49:26
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: 张龙飞</li> 
 * 	 <li>日期: 2019年6月24日下午5:49:26</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface InGoodSunitDao {
	/**
	 * @方法名: findAllSunit
	 * @方法说明: 查找所有物品单位
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月24日下午6:11:13
	 * @param map
	 * @return
	 * @return: List<InGoodSunit>
	 */
	public List<InGoodSunit> findAllSunit(Map<?, ?> map);
	/**
	 * @方法名: findInGoodSunitCount
	 * @方法说明: 查找物品单位总数
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月24日下午6:11:17
	 * @param map
	 * @return
	 * @return: int
	 */
	public int findInGoodSunitCount(Map<?, ?> map);
	/**
	 * @方法名: addSunit
	 * @方法说明: 添加物品单位
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月24日下午7:04:31
	 * @param inGoodSunit
	 * @return
	 * @return: int
	 */
	public int addSunit(InGoodSunit inGoodSunit);
	/**
	 * @方法名: findInguNameIsExist
	 * @方法说明: 物品单位名唯一验证
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月24日下午7:10:39
	 * @param inguName
	 * @return
	 * @return: int
	 */
	public int findInguNameIsExist(String inguName);
	/**
	 * @方法名: updateSunit
	 * @方法说明: 修改物品单位
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月24日下午7:10:43
	 * @param inGoodSunit
	 * @return
	 * @return: int
	 */
	public int updateSunit(InGoodSunit inGoodSunit);
	/**
	 * @方法名: deleteInGoodSunitById
	 * @方法说明: 删除物品单位
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月24日下午7:10:46
	 * @param userId
	 * @return
	 * @return: int
	 */
	public int deleteInGoodSunitById(Integer inguId);

}
