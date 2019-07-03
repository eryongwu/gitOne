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

import com.eryong.domain.InGoodsType;
import com.eryong.domain.PageBean;
import com.eryong.domain.UserInfo;
import com.eryong.service.InGoodsTypeService;
import com.eryong.util.ResponseUtil;
import com.eryong.util.StringUtil;


/**@文件名: InGoodsTypeController.java
 * @类功能说明: 商品类型controller层
 * @作者: CAOZHI
 * @Email: 610288154@qq.com
 * @日期: 2019年6月24日下午6:25:42
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: CAOZHI</li>
 * 	 <li>日期: 2019年6月24日下午6:25:42</li> 
 *	 <li>内容: </li>
 * </pre>
 */

@Controller
@RequestMapping("/InGoodsType")
public class InGoodssTypeController {
	
    @Autowired
    private InGoodsTypeService inGoodsTypeService;
    
    /**
     * @方法名: findAllUsers
     * @方法说明: 商品类型页面展示及分页
     * @作者: CAOZHI
     * @邮箱：610288154@qq.com
     * @日期: 2019年6月24日下午7:18:40
     * @param page
     * @param rows
     * @param s_ingtCode
     * @param s_ingtDelflag
     * @param s_ingtName
     * @param res
     * @throws Exception
     * @return: void
     */
    @RequestMapping("/SelectInGoodsType")
	public void findAllUsers(@RequestParam(value="page",required=false)String page,
							 @RequestParam(value="rows",required=false)String rows,
							 @RequestParam(value="s_ingtCode",required=false)String s_ingtCode,
							 @RequestParam(value="s_ingtDelflag",required=false)String s_ingtDelflag,
							 @RequestParam(value="s_ingtName",required=false)String s_ingtName,
							 HttpServletResponse res) throws Exception{
		
    	PageBean pageBean =new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
    	InGoodsType inGoodsType = new InGoodsType();
	    Map<String,Object> map = new HashMap<String,Object>();
	    if(StringUtil.isNotEmpty(s_ingtCode)){
			inGoodsType.setIngtCode(s_ingtCode);
		}
		
		if(StringUtil.isNotEmpty(s_ingtName)){
			inGoodsType.setIngtName(s_ingtName);
		}
	    map.put("pageBean", pageBean);
	    map.put("inGoodsType", inGoodsType);
    	JSONArray jsonArray=inGoodsTypeService.SelectInGoodsType(map);
	    int total = inGoodsTypeService.SelectInGoodsTypeCount(map);
	    JSONObject jsonObject=new JSONObject();
	    jsonObject.put("total", total);
	    jsonObject.put("rows", jsonArray);
        ResponseUtil.write(res,jsonObject);
    }
    
    /**
     * @方法名: addUserInfo
     * @方法说明: 添加商品类型
     * @作者: CAOZHI
     * @邮箱：610288154@qq.com
     * @日期: 2019年6月25日上午12:33:44
     * @param userInfo
     * @param response
     * @param request
     * @throws Exception
     * @return: void
     */
    @RequestMapping("/addInGoodsType")
	public void addInGoodsType(InGoodsType inGoodsType,HttpServletResponse response,HttpServletRequest request) throws Exception{
    	HttpSession session=request.getSession();
    	UserInfo sessionUserInfo=(UserInfo) session.getAttribute("UserInfo");
    	int addResult=inGoodsTypeService.addInGoodsType(inGoodsType,sessionUserInfo);
    JSONObject jsonObject=new JSONObject();
     if(addResult>0){
    	 jsonObject.put("msg", true);
	}else{
   	     jsonObject.put("msg", false);
     }
     ResponseUtil.write(response,jsonObject);
  }
    
  //添加添加商品类型名称唯一验证
    @RequestMapping("/selectInGoodsTypeByIngtName")
	public void selectInGoodsTypeByIngtName(HttpServletResponse response,String ingtName) throws Exception{
         int result=inGoodsTypeService.selectInGoodsTypeByIngtName(ingtName);
         JSONObject jsonObject=new JSONObject();
         if(result>0){
        	 jsonObject.put("msg", true);
    	}
         ResponseUtil.write(response,jsonObject);
      }
    
    	/**
    	 * @方法名: deleteUserInfoById
    	 * @方法说明: 商品类型多条删除
    	 * @作者: CAOZHI
    	 * @邮箱：610288154@qq.com
    	 * @日期: 2019年6月24日下午11:10:53
    	 * @param str
    	 * @param response
    	 * @throws Exception
    	 * @return: void
    	 */
    @RequestMapping("/deleteInGoodsTypeByIngtId")
   	public void deleteInGoodsTypeByIngtId( @RequestParam(value="str",required=false)String str,
   			                         HttpServletResponse response) throws Exception{
       	int result=inGoodsTypeService.deleteInGoodsTypeByIngtId(str);
       JSONObject jsonObject=new JSONObject();
        if(result>0){
       	       jsonObject.put("msg", result);
       	       
   	    }else{
   	    		
      	      jsonObject.put("msg", false);
        }
               ResponseUtil.write(response,jsonObject);
     }
   
    /**
	 * 商品类型修改
	 */
    @RequestMapping("/updateInGoodsType")
	public void updateInGoodsType(InGoodsType inGoodsType,HttpServletResponse response)  throws Exception{
		int result=inGoodsTypeService.updateInGoodsType(inGoodsType);
		JSONObject jsonObject=new JSONObject();
        if(result>0){
       	       jsonObject.put("msg", result);
       	       
   	    }else{
      	      jsonObject.put("msg", false);
        }
               ResponseUtil.write(response,jsonObject);
     }
   
   }
