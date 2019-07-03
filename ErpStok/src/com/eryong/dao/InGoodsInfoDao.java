package com.eryong.dao;

import java.util.List;
import java.util.Map;

import com.eryong.domain.InGoodsInfo;


/**@文件名: InGoodsInfoDao.java
 * @类功能说明1: 物品管理Dao层
 * @作者: CAOZHI
 * @Email: 610288154@qq.com
 * @日期: 2019年6月24日下午5:45:33
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: CAOZHI</li>
 * 	 <li>日期: 2019年6月24日下午5:45:33</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface InGoodsInfoDao {
    /**
     * @方法名: SelectInGoodsInfo
     * @方法说明: 商物品管理页面展示
     * @作者: CAOZHI
     * @邮箱：610288154@qq.com
     * @日期: 2019年6月24日下午5:51:16
     * @return
     * @return: InGoodsInfo
     */
	public List<InGoodsInfo> SelectInGoodsInfo(Map map);
	
	/**
	 * @方法名: SelectInGoodsInfoCount
	 * @方法说明: 物品管理页面分页
	 * @作者: CAOZHI
	 * @邮箱：610288154@qq.com
	 * @日期: 2019年6月24日下午5:57:18
	 * @param map
	 * @return
	 * @return: int
	 */
	public int SelectInGoodsInfoCount(Map map);

	/**
	 * @方法名: deleteInGoodsInfoByIngtId
	 * @方法说明: 商品类型删除
	 * @作者: CAOZHI
	 * @邮箱：610288154@qq.com
	 * @日期: 2019年6月24日下午11:00:16
	 * @param str
	 * @return
	 * @return: int
	 */

	public int deleteInGoodsInfoByingiId(Integer ingiId);
	
	
	/**
	 * @方法名: ingcidComboxList
	 * @方法说明: 添加物品类别查询
	 * @作者: CAOZHI
	 * @邮箱：610288154@qq.com
	 * @日期: 2019年6月26日下午3:26:53
	 * @return
	 * @return: List<String>
	 */
	public List<InGoodsInfo> ingcidComboxList();
	
    /**
     * @方法名: ingtidComboxList
     * @方法说明: 添加物品类型查询
     * @作者: CAOZHI
     * @邮箱：610288154@qq.com
     * @日期: 2019年6月26日下午3:27:08
     * @return
     * @return: List<String>
     */
	public List<InGoodsInfo> ingtidComboxList();

	/**
	 * @方法名: ingpidComboxList
	 * @方法说明: 添加物品生产商查询
	 * @作者: CAOZHI
	 * @邮箱：610288154@qq.com
	 * @日期: 2019年6月26日下午3:27:28
	 * @return
	 * @return: List<String>
	 */
	public List<InGoodsInfo> ingpidComboxList();
	
	/**
	 * @方法名: selectInGoodsInfoByingiCode
	 * @方法说明: 验证物品编码是否重复
	 * @作者: CAOZHI
	 * @邮箱：610288154@qq.com
	 * @日期: 2019年6月27日上午8:38:28
	 * @param ingiCode
	 * @return
	 * @return: int
	 */
	public int selectInGoodsInfoByingiCode(String ingiCode);
	
	/**
	 * @方法名: selectInGoodsInfoByIngtName
	 * @方法说明: 验证物品名称是否重复
	 * @作者: CAOZHI
	 * @邮箱：610288154@qq.com
	 * @日期: 2019年6月27日上午8:36:38
	 * @param ingtName
	 * @return
	 * @return: int
	 */
	public int selectInGoodsInfoByingiName(String ingiName);

	/**
	 * @方法名: addInGoodsInfo
	 * @方法说明: 添加商品类型
	 * @作者: CAOZHI
	 * @邮箱：610288154@qq.com
	 * @日期: 2019年6月25日上午12:22:01
	 * @param InGoodsInfo
	 * @return
	 * @return: int
	 */
	public int addInGoodsInfo(InGoodsInfo inGoodsInfo);
    /**
     * @方法名: updateInGoodsInfo
     * @方法说明: 物品管理修改
     * @作者: CAOZHI
     * @邮箱：610288154@qq.com
     * @日期: 2019年6月25日上午11:42:06
     * @param IngtId
     * @return
     * @return: int
     */
	public int updateInGoodsInfo(InGoodsInfo inGoodsInfo);
	
	/**
	 * @方法名: InGoodsInfoComboxList
	 * @方法说明:  物品名称查询
	 * @作者: CAOZHI
	 * @邮箱：610288154@qq.com
	 * @日期: 2019年6月25日下午5:24:16
	 * @param InGoodsInfo
	 * @return
	 * @return: 
	 */
	public List<InGoodsInfo> selectInGoodsInfoBy();

	

}