package com.eryong.service;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.eryong.domain.InBuyContractDetail;
import com.eryong.domain.WorkBookDetail;

/**@文件名: InBcManagerDetailService.java
 * @类功能说明: 
 * @作者: RenQian
 * @Email: 2509401056@qq.com
 * @日期: 2019年6月27日下午2:51:43
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: RenQian</li> 
 * 	 <li>日期: 2019年6月27日下午2:51:43</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface InBcManagerDetailService {

	public InBuyContractDetail getBcManagerDetailById(Integer inbcdId);

	/**@方法名: findAllBced
	 * @方法说明: 签过合同的 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年7月1日上午12:30:24
	 * @return
	 * @return: JSONObject
	 */
	public JSONArray findAllBced();
}

