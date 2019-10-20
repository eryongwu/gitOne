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

import com.eryong.domain.InGoodsProducer;
import com.eryong.domain.PageBean;
import com.eryong.domain.UserInfo;
import com.eryong.service.IngoodsproducerService;
import com.eryong.util.StringUtil;
import com.eryong.util.ResponseUtil;

/**
 * @�ļ���: IngoodsproducerController.java
 * @�๦��˵��:Ʒ�ƹ���
 * @����: QISHAOFAN
 * @Email: 1743152247@qq.com
 * @����: 2019��6��24������7:01:19
 * @�޸�˵��:<br> <pre>
 * 	 <li>����: QISHAOFAN</li> 
 * 	 <li>����: 2019��6��24������7:01:19</li> 
 *  <li>����: </li>
 * </pre>
 */
@Controller
@RequestMapping("/ingoodsproducer")
public class InGoodSproducerController {
	@Autowired
	private IngoodsproducerService ingoodsproducerService;

	@RequestMapping("/findAllBrads")
	public void findAllBrads(
			@RequestParam(value = "page", required = false) String page,
			@RequestParam(value = "rows", required = false) String rows,
			@RequestParam(value = "s_ingpName", required = false) String s_ingpName,
			HttpServletResponse response) throws Exception {
		PageBean pageBean = new PageBean(Integer.parseInt(page),
				Integer.parseInt(rows));
		InGoodsProducer ingoodsproducer = new InGoodsProducer();
		Map<String, Object> map = new HashMap<String, Object>();
		if (StringUtil.isNotEmpty(s_ingpName)) {
			ingoodsproducer.setIngpName(s_ingpName);
		}
		map.put("pageBean", pageBean);
		map.put("ingoodsproducer", ingoodsproducer);
		JSONArray jsonArray = ingoodsproducerService.findAllBrads(map);
		int total = ingoodsproducerService.findAllBradsCount(map);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("total", total);
		jsonObject.put("rows", jsonArray);
		ResponseUtil.write(response, jsonObject);
	}

	/**
	 * @������: addBrands
	 * @����˵��:���Ʒ�ƹ���
	 * @����: QISHAOFAN
	 * @���䣺1743152247@qq.com
	 * @����: 2019��6��26������8:52:34
	 * @param ingoodsproducer
	 * @param response
	 * @param request
	 * @throws Exception
	 * @return: void
	 */

	@RequestMapping("/addBrands")
	public void addBrands(InGoodsProducer ingoodsproducer,
			HttpServletResponse response, HttpServletRequest request)
			throws Exception {
		HttpSession session = request.getSession();
		UserInfo sessionIngoodsproducer = (UserInfo) session
				.getAttribute("UserInfo");
		int addResult = ingoodsproducerService.addBrands(ingoodsproducer,
				sessionIngoodsproducer);
		JSONObject jsonObject = new JSONObject();
		if (addResult > 0) {
			jsonObject.put("msg", true);
		} else {
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	}

	/**
	 * @������: updateBands
	 * @����˵��: ����Ʒ��
	 * @����: QISHAOFAN
	 * @���䣺1743152247@qq.com
	 * @����: 2019��6��25������7:09:09
	 * @param inGoodsProducer
	 * @param response
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/updateBands")
	public void updateBands(InGoodsProducer inGoodsProducer,
			HttpServletResponse response) throws Exception {
		int addResult = ingoodsproducerService.updateBands(inGoodsProducer);
		JSONObject jsonObject = new JSONObject();
		if (addResult > 0) {
			jsonObject.put("msg", true);
		} else {
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	}

	/**
	 * @������: deleteBrands
	 * @����˵��: ɾ��Ʒ��
	 * @����: QISHAOFAN
	 * @���䣺1743152247@qq.com
	 * @����: 2019��6��26������8:53:42
	 * @param response
	 * @param str
	 * @throws Exception
	 * @return: void
	 */

	@RequestMapping("/deleteBrands")
	public void deleteBrands(HttpServletResponse response,
			@RequestParam(value = "str", required = false) String str)
			throws Exception {

		int result = ingoodsproducerService.deleteBrands(str);
		JSONObject jsonObject = new JSONObject();
		if (result > 0) {
			jsonObject.put("msg", true);
			jsonObject.put("count", result);
		} else {
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	}

}
