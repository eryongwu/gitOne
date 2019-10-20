package com.eryong.controller;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.eryong.util.ResponseUtil;
import com.eryong.service.InBuyApplyDetailService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: InBuyApplyController.java
 * @类功能说明: 
 * @作者: 张龙飞
 * @Email: 1063614536@qq.com
 * @日期: 2019年6月26日下午2:07:44
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: 张龙飞</li> 
 * 	 <li>日期: 2019年6月26日下午2:07:44</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Controller
@RequestMapping("/inBuyApplyDetail")
public class InBuyApplyDetailController {
	@Autowired
	private InBuyApplyDetailService inBuyApplyDetailService;
	//查找所有审核通过的申请
	@RequestMapping("/findinBuyApplyDetail")
	public void findinBuyApplyDetail(HttpServletResponse response)throws Exception{
		JSONArray jsonArray=inBuyApplyDetailService.findinBuyApplyDetail();
		System.out.println(jsonArray);
		ResponseUtil.write(response, jsonArray);
} 
	
	

}
