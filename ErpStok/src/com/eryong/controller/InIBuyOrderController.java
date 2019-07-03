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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eryong.domain.InIBuyOrder;
import com.eryong.domain.PageBean;
import com.eryong.domain.UserInfo;
import com.eryong.service.InIBuyOrderService;
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
@RequestMapping("/inIBuyOrder")
public class InIBuyOrderController {

	@Autowired
	private InIBuyOrderService inIBuyOrderService;
	
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
	@RequestMapping("/getAllInIBuyOrder")
	public void getAllInIBuyOrder(@RequestParam(value="page",required=false)String page,
								  @RequestParam(value="rows",required=false)String rows,
								  HttpServletResponse res,InIBuyOrder inIBuyOrder) throws Exception{
		Map<String,Object> map = new HashMap<String,Object>();
		PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
		map.put("pageBean", pageBean);
		map.put("inIBuyOrder", inIBuyOrder);
		JSONObject json = new JSONObject();
		JSONArray array = inIBuyOrderService.getAllInIBuyOrder(map);
		int orderCount = inIBuyOrderService.getOrderCount(map);
		json.put("total", orderCount);
		json.put("rows", array);
		ResponseUtil.write(res, json);	
	}
	
	
	@RequestMapping("/getAllOrder")
	public void getAllOrder(@RequestParam(value="page",required=false)String page,
								  @RequestParam(value="rows",required=false)String rows,
								  HttpServletResponse res,InIBuyOrder inIBuyOrder) throws Exception{
		Map<String,Object> map = new HashMap<String,Object>();
		PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
		map.put("pageBean", pageBean);
		map.put("inIBuyOrder", inIBuyOrder);
		JSONObject json = new JSONObject();
		JSONArray array = inIBuyOrderService.getAllOrder(map);
		int orderCount = inIBuyOrderService.getOrderCount(map);
		json.put("total", orderCount);
		json.put("rows", array);
		ResponseUtil.write(res, json);	
	}
	
	/**
	 * @方法名: addAllOrder
	 * @方法说明: 添加订单
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年7月1日上午2:29:23
	 * @param inIBuyOrder
	 * @param res
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/addAllOrder")
	public void addAllOrder(@RequestBody InIBuyOrder inIBuyOrder,HttpServletResponse res,HttpServletRequest req) throws Exception{
		inIBuyOrder.setOptId(((UserInfo)req.getSession().getAttribute("UserInfo")).getUserId());
		JSONObject json = inIBuyOrderService.addAllOrder(inIBuyOrder);		
		ResponseUtil.write(res, json);	
	}
	
	/**
	 * @方法名: addAllOrder
	 * @方法说明: 修改主表
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年7月1日下午5:23:01
	 * @param inIBuyOrder
	 * @param res
	 * @param req
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/updateInIBuyOrder")
	public void updateInIBuyOrder(@RequestBody InIBuyOrder inIBuyOrder,HttpServletResponse res) throws Exception{
		
		JSONObject json = inIBuyOrderService.updateInIBuyOrder(inIBuyOrder);		
		ResponseUtil.write(res, json);	
	}
	
	/**
	 * @方法名: deleteOrder
	 * @方法说明: 删除子表及对应子表
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年7月1日下午9:28:53
	 * @param res
	 * @param inboId
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/deleteOrder")
	public void deleteOrder(HttpServletResponse res,@RequestParam(value="inboId",required=false)Integer inboId) throws Exception{
		
		JSONObject json = inIBuyOrderService.deleteOrder(inboId);		
		ResponseUtil.write(res, json);	
	}
}

