package com.eryong.service;

import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;

import com.eryong.domain.InGoodsType;
import com.eryong.domain.UserInfo;

/**@文件名: InGoodsTypeService.java
 * @类功能说明: 商品类型Service层
 * @作者: CAOZHI
 * @Email: 610288154@qq.com
 * @日期: 2019年6月24日下午6:00:17
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: CAOZHI</li>
 * 	 <li>日期: 2019年6月24日下午6:00:17</li> 
 *	 <li>内容: </li>
 * </pre>
 */
    public interface InGoodsTypeService {
    	
        /**
         * @方法名: SelectInGoodsType
         * @方法说明: 商品类型页面展示
         * @作者: CAOZHI
         * @邮箱：610288154@qq.com
         * @日期: 2019年6月24日下午6:04:30
         * @param inGoodsType
         * @return
         * @return: InGoodsType
         */
    	public JSONArray SelectInGoodsType(Map map);
    	/**
    	 * @方法名: SelectInGoodsTypeCount
    	 * @方法说明: 商品类型页面分页
    	 * @作者: CAOZHI
    	 * @邮箱：610288154@qq.com
    	 * @日期: 2019年6月24日下午6:04:40
    	 * @param inGoodsType
    	 * @return
    	 * @return: int
    	 */
    	public int SelectInGoodsTypeCount(Map map);
    	
    	/**
    	 * @方法名: deleteInGoodsTypeByIngtId
    	 * @方法说明: 商品类型删除
    	 * @作者: CAOZHI
    	 * @邮箱：610288154@qq.com
    	 * @日期: 2019年6月24日下午11:03:55
    	 * @param IngtId
    	 * @return
    	 * @return: int
    	 */
    	public int deleteInGoodsTypeByIngtId(String str);
    	
    	/**
    	 * @方法名: selectUserByUserName
    	 * @方法说明: 验证商品类型是否重复
    	 * @作者: CAOZHI
    	 * @邮箱：610288154@qq.com
    	 * @日期: 2019年6月25日上午12:57:02
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
          * @日期: 2019年6月25日上午12:23:56
          * @param userInfo
          * @param sessionUserInfo
          * @return
          * @return: int
          */
    	public int addInGoodsType(InGoodsType inGoodsType,UserInfo sessionUserInfo);

    	/**
    	 * @方法名: updateInGoodsType
    	 * @方法说明: 商品类型修改
    	 * @作者: CAOZHI
    	 * @邮箱：610288154@qq.com
    	 * @日期: 2019年6月25日上午11:55:10
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
    	 * @日期: 2019年6月25日下午5:30:28
    	 * @return
    	 * @return: List<InGoodsType>
    	 */
    	public JSONArray InGoodsTypeComboxList();

}
