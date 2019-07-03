/**@文件名: InIBuyOrderController.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月26日下午1:06:56
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月26日下午1:06:56</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eryong.domain.InBuyOrderDetail;
import com.eryong.domain.PageBean;
import com.eryong.service.InIBuyOrderDetailService;
import com.eryong.util.ResponseUtil;

/**@文件名: InIBuyOrderController.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月26日下午1:06:56
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月26日下午1:06:56</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 *
 */
@Controller
@RequestMapping("/inIBuyOrderDetail")
public class InIBuyOrderDetailController {
	
	@Autowired
	private InIBuyOrderDetailService inIBuyOrderDetailService;
	
	/**
	 * @方法名: getAllInIBuyOrder
	 * @方法说明: 获取所有订单主细表信息
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月28日上午10:19:42
	 * @param page
	 * @param rows
	 * @param res
	 * @param inIBuyOrder
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/getAllOrderDetial")
	public void getAllOrderDetial(@RequestParam(value="page",required=false)String page,
								  @RequestParam(value="rows",required=false)String rows,
								  HttpServletResponse res,InBuyOrderDetail inBuyOrderDetail) throws Exception{
		Map<String,Object> map = new HashMap<String,Object>();
		PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
		map.put("pageBean", pageBean);
		map.put("inBuyOrderDetail", inBuyOrderDetail);
		JSONObject json = new JSONObject();
		JSONArray array = inIBuyOrderDetailService.getAllOrderDetial(map);
		int orderCount = inIBuyOrderDetailService.getAllOrderDetialCount(map);
		json.put("total", orderCount);
		json.put("rows", array);
		ResponseUtil.write(res, json);	
	}
	
	

}

