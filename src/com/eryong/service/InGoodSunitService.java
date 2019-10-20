package com.eryong.service;

import java.util.Map;

import net.sf.json.JSONArray;

import com.eryong.domain.InGoodSunit;
import com.eryong.domain.UserInfo;

/**@文件名: InGoodSunitService.java
 * @类功能说明: 物品单位service
 * @作者: 张龙飞
 * @Email: 1063614536@qq.com
 * @日期: 2019年6月24日下午5:47:55
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: 张龙飞</li> 
 * 	 <li>日期: 2019年6月24日下午5:47:55</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface InGoodSunitService {
	/**
	 * @方法名: findAllSunit
	 * @方法说明: 查找所有物品单位
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月24日下午6:12:48
	 * @param map
	 * @return
	 * @return: JSONArray
	 */
	public JSONArray findAllSunit(Map<?, ?> map);
	/**
	 * @方法名: findInGoodSunitCount
	 * @方法说明: 查找物品单位总数
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月24日下午6:12:53
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
	 * @日期: 2019年6月24日下午6:47:08
	 * @param inGoodSunit
	 * @param sessionUserInfo
	 * @return
	 * @return: int
	 */
	public int addSunit(InGoodSunit inGoodSunit, UserInfo sessionUserInfo);
	/**
	 * @方法名: findInguNameIsExist
	 * @方法说明: 物品单位名唯一验证
	 * @作者: 张龙飞
	 * @邮箱：1063614536@qq.com
	 * @日期: 2019年6月24日下午6:47:12
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
	 * @日期: 2019年6月24日下午6:47:15
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
	 * @日期: 2019年6月24日下午6:47:20
	 * @param str
	 * @return
	 * @return: int
	 */
	public int deleteInGoodSunitById(String str);

}
