package com.eryong.service;

import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;

import com.eryong.domain.InGoodsInfo;
import com.eryong.domain.UserInfo;

/**@文件名: InGoodsInfoService.java
 * @类功能说明: 物品管理Service层
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
    public interface InGoodsInfoService {
    	
        /**
         * @方法名: SelectInGoodsInfo
         * @方法说明: 物品管理列表展示
         * @作者: CAOZHI
         * @邮箱：610288154@qq.com
         * @日期: 2019年6月24日下午6:04:30
         * @param InGoodsInfo
         * @return
         * @return: InGoodsInfo
         */
    	public JSONArray SelectInGoodsInfo(Map map);
    	/**
    	 * @方法名: SelectInGoodsInfoCount
    	 * @方法说明: 物品管理页面分页
    	 * @作者: CAOZHI
    	 * @邮箱：610288154@qq.com
    	 * @日期: 2019年6月24日下午6:04:40
    	 * @param InGoodsInfo
    	 * @return
    	 * @return: int
    	 */
    	public int SelectInGoodsInfoCount(Map map);
    	
    	/**
    	 * @方法名: ingcidComboxList
    	 * @方法说明: 添加物品类别查询
    	 * @作者: CAOZHI
    	 * @邮箱：610288154@qq.com
    	 * @日期: 2019年6月26日下午3:30:49
    	 * @return
    	 * @return: JSONArray
    	 */
    	public JSONArray ingcidComboxList();

    	/**
    	 * @方法名: ingtidComboxList
    	 * @方法说明:  添加物品类型查询
    	 * @作者: CAOZHI
    	 * @邮箱：610288154@qq.com
    	 * @日期: 2019年6月26日下午3:30:54
    	 * @return
    	 * @return: JSONArray
    	 */
    	public JSONArray ingtidComboxList();

    	/**
    	 * @方法名: ingpidComboxList
    	 * @方法说明: 添加物品生产商查询
    	 * @作者: CAOZHI
    	 * @邮箱：610288154@qq.com
    	 * @日期: 2019年6月26日下午3:30:59
    	 * @return
    	 * @return: JSONArray
    	 */
        public JSONArray ingpidComboxList();

    	/**
    	 * @方法名: deleteInGoodsInfoByIngtId
    	 * @方法说明: 物品管理删除
    	 * @作者: CAOZHI
    	 * @邮箱：610288154@qq.com
    	 * @日期: 2019年6月24日下午11:03:55
    	 * @param IngtId
    	 * @return
    	 * @return: int
    	 */
    	public int deleteInGoodsInfoByingiId(String str);
    	
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
          * @方法说明: 添加物品管理
          * @作者: CAOZHI
          * @邮箱：610288154@qq.com
          * @日期: 2019年6月25日上午12:23:56
          * @param userInfo
          * @param sessionUserInfo
          * @return
          * @return: int
          */
    	public int addInGoodsInfo(InGoodsInfo inGoodsInfo,UserInfo sessionUserInfo);

    	/**
    	 * @方法名: updateInGoodsInfo
    	 * @方法说明: 物品管理修改
    	 * @作者: CAOZHI
    	 * @邮箱：610288154@qq.com
    	 * @日期: 2019年6月25日上午11:55:10
    	 * @param IngtId
    	 * @return
    	 * @return: int
    	 */
    	public int updateInGoodsInfo(InGoodsInfo inGoodsInfo,UserInfo sessionUserInfo);
    	
    	/**
    	 * @方法名: InGoodsInfoComboxList
    	 * @方法说明: 物品名称查询
    	 * @作者: CAOZHI
    	 * @邮箱：610288154@qq.com
    	 * @日期: 2019年6月25日下午5:30:28
    	 * @return
    	 * @return: JSONArray
    	 */
    		public JSONArray selectInGoodsInfoBy();


}
