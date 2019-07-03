<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<!--引入easyui全部样式-->
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.6.6/themes/default/easyui.css"  />
		<!--引入图标-->
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.6.6/themes/icon.css" />
		<!--导入jquery核心库-->
		<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.6.6/jquery.min.js"></script>
		<!--导入easyui核心库-->
		<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.6.6/jquery.easyui.min.js"></script>
		<!--导入汉库-->
		<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.6.6/locale/easyui-lang-zh_CN.js" ></script>
  		<script type="text/javascript">
  		//将远程数据渲染到导航菜单栏
  		$(function(){
			$("#tree").tree({								
				url:"${pageContext.request.contextPath}/authInfo/getAuthInfoByUserInfo.do",
				lines:true,
				onLoadSuccess:function(){
					$("#tree").tree("expandAll");
				},
				
				onClick:function(node){
					if($("#tabs").tabs("exists",node.text)){
						$("#tabs").tabs("select",node.text);
					}else{								
						if(node.attributes.url == null || node.attributes.url == "" ){
							return false;
						}
						
						if(node.id==16){
							$.messager.confirm("退出","确定要安全退出吗？",function(r){
								if(r){
									location.href="${pageContext.request.contextPath}/user/logout.do";
								}else{
									return false;
								}
							})							
						}else if(node.id==15){
							$("#user").dialog("open");
						}else{
						var content="<iframe frameborder='0' scrolling='auto' style='width:100%;height:100%;' src='${pageContext.request.contextPath}/html/"+node.attributes.url+"'></iframe>";
						$("#tabs").tabs("add",{
							title:node.text,
							closable:true,
							content:content,
							iconCls:node.iconCls
						}); 
						}
				   }
			   }
			});
  		});
  		
  		function saveBcManager(){
  			
  			var p1 = $("#passward1").val();
  			var p2 = $("#passward2").val();
  			var passward = $("#passward").val();
  			
  			if(p1==p2){
  				var userName = $("#userName").val();
  				$.ajax({
  					url:"${pageContext.request.contextPath}/user/passward.do",
  					type:"post",
  					dataType:"json",
  					data:{password:passward,
  						  userName:userName,
  						  passward1:p1
  					},
  					success:function(){
  						$.messager.alert("提示","修改成功请重新登录","info");
  						location.href="${pageContext.request.contextPath}/user/logout.do";
  					}
	
  				});
  				
  			}else{
  				$.messager.alert("提示","两次密码不一致请重新修改","info");
  			}
  		}
  		
  		
  		
  		
  		function closeBcManagerAddDialog(){
  			$("#user").dialog("close");
  			
  		}
  		</script>
  
  </head> 
  <body class="easyui-layout">
  
  			  <!-- 顶部页面 -->
		      <div region="north" style="height: 68px;"> 
		          <div style="padding: 0px;margin: 0px;background-color: #E0ECFF;">
						<table>
						     <tr>
						          <td><img alt=“北邮在线" src="${pageContext.request.contextPath}/images/mainlogo.png"></td>
						          <td valign="bottom">欢迎：${UserInfo.userName }&nbsp;&nbsp;『${UserInfo.roleName }』</td>
						    </tr>
						</table>
		          </div>
		     </div> 
		     
		     <!-- 导航菜单栏 -->
		     <div region="west" style="width: 160px;padding: 5px;" title="导航菜单" split="true">
		     	<ul id="tree" class="easyui-tree"></ul>		     	
		     </div>
		     
		     
		     <!-- 页面主页 -->
		     <div region="center">
		     		<div class="easyui-tabs" fit="true" border="false" id="tabs">
						<div title="首页" data-options="iconCls:'icon-home'">
							<div align="center" style="padding-top: 100px;">
							<font color="red" size="10">欢迎使用</font>
							</div>															
						</div>						
					</div>				  				  	 									  
		     </div>
		     
		     
		     
		     <!-- 页面尾部 -->
		     <div region="south" style="height: 25px;padding: 5px;" align="center">
			版权所有 TiQi<a href="http://www.xianyazhuo.com" target="_blank">http://www.xianyazhuo.com</a>
		     </div>
		     
		 <div id="user" class="easyui-dialog" title="请输入内容" style="width:400px;height:200px;" 
			data-options="iconCls:'icon-save',resizable:false,buttons:'#bb',modal:true," 
			collapsible="true" minimizable="true" maximizable="true" resizable="true" closable="true" closed="true" buttons="#dlg2-buttons" >
			<form id="confirm">
				账号：<input type="text" name="userName" id="userName" class="easyui-validatebox" data-options="required:true" /><br />
				旧密码：<input type="password" name="passward" id="passward" class="easyui-validatebox" data-options="required:true" /><br />
				密码：<input type="password" name="passward1" id="passward1" class="easyui-validatebox" data-options="required:true" /><br />
				确认密码：<input type="password" name="passward2" id="passward2" class="easyui-validatebox" data-options="required:true" />
			</form>
		</div>
		<div id="dlg2-buttons">
	      <a  onclick="saveBcManager()" class="easyui-linkbutton" iconCls="icon-ok">保存</a>
	      <a  onclick="closeBcManagerAddDialog()" class="easyui-linkbutton" iconCls="icon-cancel">关闭</a>
	     </div>
</body>	
</html>
