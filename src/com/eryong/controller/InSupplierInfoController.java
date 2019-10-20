package com.eryong.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eryong.domain.InSupplierInfo;
import com.eryong.domain.PageBean;
import com.eryong.domain.UserInfo;
import com.eryong.service.InSupplierInfoService;
import com.eryong.util.ResponseUtil;

/**
 * 
 * @author Lenovo
 *
 */
@Controller
@RequestMapping("/inSupplierInfo")
public class InSupplierInfoController {

	@Autowired
	private InSupplierInfoService inSupplierInfoService;

	/**
	 * @方法名: findAllInSuppliers
	 * @方法说明: 获取所有供应商信息
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月30日下午2:48:48
	 * @param page
	 * @param rows
	 * @param response
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/findAllInSuppliers")
	public void findAllInSuppliers(
			@RequestParam(value = "page", required = false) String page,
			@RequestParam(value = "rows", required = false) String rows,
			HttpServletResponse response) throws Exception {
		PageBean pageBean = new PageBean(Integer.parseInt(page),
				Integer.parseInt(rows));
		InSupplierInfo inSupplierInfo = new InSupplierInfo();
		Map<String, Object> map = new HashMap<String, Object>();		
		map.put("pageBean", pageBean);
		map.put("inSupplierInfo", inSupplierInfo);
		JSONArray jsonArray = inSupplierInfoService.findAllInSuppliers(map);
		int total = inSupplierInfoService.findAllInSuppliersCount(map);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("total", total);
		jsonObject.put("rows", jsonArray);
		ResponseUtil.write(response, jsonObject);

	}
	
	/**
	 * @方法名: addInSupplierInfo
	 * @方法说明: 添加供应商
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月30日下午2:50:02
	 * @param inSupplierInfo
	 * @param response
	 * @param request
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/addInSupplierInfo")
	public  void   addInSupplierInfo (InSupplierInfo inSupplierInfo,
			HttpServletResponse response, HttpServletRequest request)
			throws Exception {
		
		HttpSession session = request.getSession();
		UserInfo sessionInSupplierInfo = (UserInfo) session.getAttribute("UserInfo");
		int addResult = inSupplierInfoService.addInSupplierInfo(inSupplierInfo,
				sessionInSupplierInfo);
		JSONObject jsonObject = new JSONObject();
		if (addResult > 0) {
			jsonObject.put("msg", true);
		} else {
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	
	}
	
	/**
	 * @方法名: updateInSupplierInfo
	 * @方法说明: 修改供应商
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月30日下午2:50:20
	 * @param inSupplierInfo
	 * @param response
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/updateInSupplierInfo")	
	
	 public  void   updateInSupplierInfo(InSupplierInfo inSupplierInfo,
				HttpServletResponse response) throws Exception{
		int addResult = inSupplierInfoService.updateInSupplierInfo(inSupplierInfo);
		JSONObject jsonObject = new JSONObject();
		if (addResult > 0) {
			jsonObject.put("msg", true);
		} else {
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
		
		
	}
	
	/**
	 * @方法名: deleteInSupplierInfo
	 * @方法说明: 删除供应商
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月30日下午2:50:46
	 * @param response
	 * @param str
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/deleteInSupplierInfo")
	public  void    deleteInSupplierInfo(HttpServletResponse response,
			@RequestParam(value = "str", required = false) String str)
			throws Exception {
		
		int result = inSupplierInfoService.deleteInSupplierInfo(str);
		JSONObject jsonObject = new JSONObject();
		if (result > 0) {
			jsonObject.put("msg", true);
			jsonObject.put("count", result);
		} else {
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
		
		
}
	
	/**
	 * @方法名: getComboBox
	 * @方法说明: 供应商下拉框
	 * @作者: QISHAOFAN
	 * @邮箱：1743152247@qq.com
	 * @日期: 2019年6月27日下午4:29:45
	 * @param response
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/getComboBox")
	public  void    getComboBox(HttpServletResponse response)
			throws Exception {		
		JSONArray array = inSupplierInfoService.getComboBox();
		ResponseUtil.write(response, array);				
	}

	
	
	

}
