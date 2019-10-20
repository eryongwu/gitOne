package com.eryong.dao;

import java.util.List;
import java.util.Map;

import com.eryong.domain.InGoodsType;

/**@文件名: InGoodsTypeDao.java
 * @类功能说明1: 商品类型Dao层
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
public interface InGoodsTypeDao {
    /**
     * @方法名: SelectInGoodsType
     * @方法说明: 商品类型页面展示
     * @作者: CAOZHI
     * @邮箱：610288154@qq.com
     * @日期: 2019年6月24日下午5:51:16
     * @return
     * @return: InGoodsType
     */
	public List<InGoodsType> SelectInGoodsType(Map map);
	
	/**
	 * @方法名: SelectInGoodsTypeCount
	 * @方法说明: 商品类型页面分页
	 * @作者: CAOZHI
	 * @邮箱：610288154@qq.com
	 * @日期: 2019年6月24日下午5:57:18
	 * @param map
	 * @return
	 * @return: int
	 */
	public int SelectInGoodsTypeCount(Map map);

	/**
	 * @方法名: deleteInGoodsTypeByIngtId
	 * @方法说明: 商品类型删除
	 * @作者: CAOZHI
	 * @邮箱：610288154@qq.com
	 * @日期: 2019年6月24日下午11:00:16
	 * @param str
	 * @return
	 * @return: int
	 */
	public int deleteInGoodsTypeByIngtId(Integer IngtId);
	
	/**
	 * @方法名: selectInGoodsTypeByIngtName
	 * @方法说明: 验证商品类型是否重复
	 * @作者: CAOZHI
	 * @邮箱：610288154@qq.com
	 * @日期: 2019年6月25日上午12:57:50
	 * @param userName
	 * @return
	 * @return: int
	 */
	public int selectInGoodsTypeByIngtName(String ingtName);
	
	/**
	 * @方法名: addInGoodsType
	 * @方法说明: 添加商品类型
	 * @作者: CAOZHI
	 * @邮箱：610288154@qq.com
	 * @日期: 2019年6月25日上午12:22:01
	 * @param inGoodsType
	 * @return
	 * @return: int
	 */
	public int addInGoodsType(InGoodsType inGoodsType);
    /**
     * @方法名: updateInGoodsType
     * @方法说明: 修改商品类型
     * @作者: CAOZHI
     * @邮箱：610288154@qq.com
     * @日期: 2019年6月25日上午11:42:06
     * @param IngtId
     * @return
     * @return: int
     */
	public int updateInGoodsType(InGoodsType inGoodsType);
	
	/**
	 * @方法名: InGoodsTypeComboxList
	 * @方法说明: 商品类型查询展示
	 * @作者: CAOZHI
	 * @邮箱：610288154@qq.com
	 * @日期: 2019年6月25日下午5:24:16
	 * @param inGoodsType
	 * @return
	 * @return: int
	 */
	public List<String> InGoodsTypeComboxList();

}