package com.eryong.controller;

import java.util.HashMap;
import java.util.List;
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

import com.eryong.domain.InGoodsInfo;
import com.eryong.domain.PageBean;
import com.eryong.domain.UserInfo;
import com.eryong.service.InGoodsInfoService;
import com.eryong.util.ResponseUtil;
import com.eryong.util.StringUtil;


/**@文件名: InGoodsInfoController.java
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
@RequestMapping("/InGoodsInfo")
public class InGoodsInfoController {
	
    @Autowired
    private InGoodsInfoService InGoodsInfoService;
    
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
    @RequestMapping("/SelectInGoodsInfo")
	public void findAllUsers(@RequestParam(value="page",required=false)String page,
							 @RequestParam(value="rows",required=false)String rows,
							 @RequestParam(value="s_ingiCode",required=false)String s_ingiCode,
							 @RequestParam(value="s_ingiName",required=false)String s_ingiName,
							 @RequestParam(value="s_ingtid",required=false)String s_ingtid,
							 @RequestParam(value="ingiToxic",required=false)String ingiToxic,
							 HttpServletResponse res) throws Exception{
		
    	PageBean pageBean =new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
    	InGoodsInfo InGoodsInfo = new InGoodsInfo();
	    Map<String,Object> map = new HashMap<String,Object>();
	    if(StringUtil.isNotEmpty(s_ingiCode)){
			InGoodsInfo.setIngiCode(s_ingiCode);
		}
		
		if(StringUtil.isNotEmpty(s_ingiName)){
			InGoodsInfo.setIngiName(s_ingiName);
		}

		if(StringUtil.isNotEmpty(s_ingtid)){
			InGoodsInfo.setIngtid(Integer.parseInt(s_ingtid));
		}
		if(StringUtil.isNotEmpty(ingiToxic)){
			InGoodsInfo.setIngiToxic(Integer.parseInt(ingiToxic));
		}
	    map.put("pageBean", pageBean);
	    map.put("InGoodsInfo", InGoodsInfo);
    	JSONArray jsonArray=InGoodsInfoService.SelectInGoodsInfo(map);
	    int total = InGoodsInfoService.SelectInGoodsInfoCount(map);
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
    @RequestMapping("/addInGoodsInfo")
	public void addInGoodsInfo(InGoodsInfo inGoodsInfo,HttpServletResponse response,HttpServletRequest request) throws Exception{
    	HttpSession session=request.getSession();
    	UserInfo sessionUserInfo=(UserInfo) session.getAttribute("UserInfo");
    	int addResult=InGoodsInfoService.addInGoodsInfo(inGoodsInfo,sessionUserInfo);
    	
    JSONObject jsonObject=new JSONObject();
     if(addResult>0){
    	 jsonObject.put("msg", true);
	}else{
   	     jsonObject.put("msg", false);
     }
     ResponseUtil.write(response,jsonObject);
  }
    
    //添加物品类别查询
    @RequestMapping("/ingcidComboxList")
	public void ingcidComboxList(HttpServletResponse response) throws Exception{
    	JSONArray arrayIngcName=InGoodsInfoService.ingcidComboxList();
     
     ResponseUtil.write(response,arrayIngcName);
  }
    
  //添加物品类型查询
    @RequestMapping("/ingtidComboxList")
	public void ingtidComboxList(HttpServletResponse response) throws Exception{
    	JSONArray arrayIngtName=InGoodsInfoService.ingtidComboxList();
  
     ResponseUtil.write(response,arrayIngtName);
  }
    
  //添加物品生产商查询
    @RequestMapping("/ingpidComboxList")
	public void ingpidComboxList(HttpServletResponse response) throws Exception{
    	JSONArray arrayIngpName=InGoodsInfoService.ingpidComboxList();
     
     ResponseUtil.write(response,arrayIngpName);
  }
  //验证物品编码是否重复
    @RequestMapping("/selectInGoodsInfoByingiCode")
	public void selectInGoodsInfoByingiCode(HttpServletResponse response,String ingiCode) throws Exception{
         int result=InGoodsInfoService.selectInGoodsInfoByingiCode(ingiCode);
         JSONObject jsonObject=new JSONObject();
         if(result>0){
        	 jsonObject.put("msg", true);
    	}
         ResponseUtil.write(response,jsonObject);
      }
    
  //验证物品名称是否重复
    @RequestMapping("/selectInGoodsInfoByingiName")
	public void selectInGoodsInfoByingiName(HttpServletResponse response,String ingiName) throws Exception{
         int result=InGoodsInfoService.selectInGoodsInfoByingiName(ingiName);
         JSONObject jsonObject=new JSONObject();
         if(result>0){
        	 jsonObject.put("msg", true);
    	}
         ResponseUtil.write(response,jsonObject);
      }
    
    
      
      //验证物品名称
        @RequestMapping("/selectInGoodsInfoBy")
    	public void selectInGoodsInfoBy(HttpServletResponse response) throws Exception{
        	JSONArray InGoodsInfoResult=InGoodsInfoService.selectInGoodsInfoBy();
             
        	
             ResponseUtil.write(response,InGoodsInfoResult);
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
    @RequestMapping("/deleteInGoodsInfoByingiId")
   	public void deleteInGoodsInfoByingiId( @RequestParam(value="str",required=false)String str,
   			                         HttpServletResponse response) throws Exception{
       	int result=InGoodsInfoService.deleteInGoodsInfoByingiId(str);
       JSONObject jsonObject=new JSONObject();
        if(result>0){
       	       jsonObject.put("msg", result);
       	       
   	    }else{
   	    		
      	      jsonObject.put("msg", false);
        }
               ResponseUtil.write(response,jsonObject);
     }
   
    /**
	 * 物品管理修改
	 */
    @RequestMapping("/updateInGoodsInfo")
	public void updateInGoodsInfo(InGoodsInfo inGoodsInfo,HttpServletResponse response,HttpServletRequest request)  throws Exception{
    	HttpSession session=request.getSession();
    	
    	UserInfo sessionUserInfo=(UserInfo) session.getAttribute("UserInfo");
		int result=InGoodsInfoService.updateInGoodsInfo(inGoodsInfo,sessionUserInfo);
		JSONObject jsonObject=new JSONObject();
        if(result>0){
       	       jsonObject.put("msg", result);
       	       
   	    }else{
      	      jsonObject.put("msg", false);
        }
               ResponseUtil.write(response,jsonObject);
     }
   
   }
