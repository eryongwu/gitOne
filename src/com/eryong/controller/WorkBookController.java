/**@文件名: WorkBookController.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月23日下午3:00:36
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月23日下午3:00:36</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eryong.domain.PageBean;
import com.eryong.domain.UserInfo;
import com.eryong.domain.WorkBook;
import com.eryong.service.WorkBookDetailService;
import com.eryong.service.WorkBookService;
import com.eryong.util.ResponseUtil;

/**@文件名: WorkBookController.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月23日下午3:00:36
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月23日下午3:00:36</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 *
 */
@Controller
@RequestMapping("/workBook")
public class WorkBookController {

	@Autowired
	private WorkBookService workBookService;
	
	@Autowired
	private WorkBookDetailService workBookDetailService;
	
	/**
	 * @方法名: findAllworkBook
	 * @方法说明: 获取数据字典
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月23日下午5:01:53
	 * @param res
	 * @param pageBean
	 * @return: void
	 */
	@RequestMapping("/findAllworkBook")
	public void findAllworkBook(HttpServletResponse res,
								@RequestParam(value="page",required=false)String page,
								@RequestParam(value="rows",required=false)String rows) throws Exception{
		PageBean pageBean = new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		//JSONObject json = new JSONObject();
		JSONArray jsonArry = workBookService.findAllworkBook(pageBean);
		ResponseUtil.write(res, jsonArry);
	}
	
	/**
	 * @方法名: addWorkBook
	 * @方法说明:添加数据
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月23日下午7:21:39
	 * @param res
	 * @param workBook
	 * @param req
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/addWorkBook")	
	public void addWorkBook(HttpServletResponse res,@RequestBody WorkBook workBook,HttpServletRequest req) throws Exception{		
		UserInfo userInfo = (UserInfo) req.getSession().getAttribute("UserInfo");
		Integer userId = userInfo.getUserId();
		workBook.setOptId(userId);
		JSONObject json = workBookService.addWorkBook(workBook);				
		ResponseUtil.write(res, json);
	}
	
	/**
	 * @方法名: updateWorkBook
	 * @方法说明: 
	 * @作者: Wueryong
	 * @邮箱：738841484@qq.com
	 * @日期: 2019年6月23日下午8:59:36
	 * @param res
	 * @param workBook
	 * @param req
	 * @throws Exception
	 * @return: void
	 */
	@RequestMapping("/updateWorkBook")	
	public void updateWorkBook(HttpServletResponse res,@RequestBody WorkBook workBook,HttpServletRequest req) throws Exception{		
		UserInfo userInfo = (UserInfo) req.getSession().getAttribute("UserInfo");
		Integer optId = userInfo.getUserId();		
		JSONObject json = workBookService.updateWorkBook(workBook,optId);				
		ResponseUtil.write(res, json);
	}
	
	@RequestMapping("/deleteWorkBook")	
	public void deleteWorkBook(HttpServletResponse res,@RequestParam(value="wb_id",required=false)String wb_id) throws Exception{		
		
		JSONObject json = workBookService.deleteWorkBook(Integer.parseInt(wb_id));				
		ResponseUtil.write(res, json);
	}
}

