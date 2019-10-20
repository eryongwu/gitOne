package com.eryong.service;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.eryong.domain.InBuyContract;
import com.eryong.domain.PageBean;

/**@文件名: InBcManagerService.java
 * @类功能说明: 
 * @作者: RenQian
 * @Email: 2509401056@qq.com
 * @日期: 2019年6月27日下午2:48:20
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: RenQian</li> 
 * 	 <li>日期: 2019年6月27日下午2:48:20</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface InBcManagerService {

	public JSONArray findAllBcManager(PageBean pageBean);

	public JSONObject addBcManager(InBuyContract inBuyContract);

	public JSONObject deletebcManager(int inbcId);

	/**@方法名: updateBcManager
	 * @方法说明: 修改合同
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月30日下午5:10:22
	 * @param inBuyContract
	 * @return
	 * @return: JSONObject
	 */
	public JSONObject updateBcManager(InBuyContract inBuyContract);

		

}

