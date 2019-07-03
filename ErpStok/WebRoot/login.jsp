<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="${pageContext.request.contextPath}/style/alogin.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.6.6/jquery.min.js"></script>
<title>用户登录</title>
<script type="text/javascript">

	$(function(){
		var value=getQueryString("error");
		var value1=getQueryString("imageCode");
		var value2=getQueryString("userName");
		var value3=getQueryString("password");
		if(value==1){
			$("#error").html("*验证码错误！");
			$("#imageCode").val(value1);
			$("#userName").val(value2);
			$("#password").val(value3);
	  	}
		if(value==2){
			$("#error").html("*用户名或者密码错误！");
			$("#imageCode").val(value1);
			$("#userName").val(value2);
			$("#password").val(value3);
	  	}
	});
	
	function pa(){
		var pa = $(password).val();
		console.log(pa);
	}
	
	function getQueryString(name) {
	    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	    var url=decodeURI(decodeURI(window.location.search))
	    var r = url.substr(1).match(reg);
	    if (r != null) return unescape(r[2]); return null;
	}
	
	function loadimage(){
		document.getElementById("randImage").src="${pageContext.request.contextPath}/images/image.jsp?"+Math.random();
	}
	function login(){
		if($("#userName").val()==null||$("#userName").val()==""){
			$("#error").html("*用户名不能为空！");
		}else if($("#password").val()==null||$("#password").val()==""){
			$("#error").html("*密码不能为空！");
		}else if($("#imageCode").val()==null||$("#imageCode").val()==""){
			$("#error").html("*验证码不能为空！");
		}else{
			$("#form1").submit();
		}
	}
</script>
</head>
<body>
<form id="form1" name="form1" action="user/login.do" method="post">
	<div class="MAIN">
		<ul>
			<li class="top"></li>
			<li class="top2"></li>
			<li class="topA"></li>
			<li class="topB">
				<span> 
					<a href="#" target="_blank"><img src="${pageContext.request.contextPath}/images/login/logo.jpg" alt="" style="" /></a>
				</span>
			</li>
			<li class="topC"></li>
			<li class="topD">
			<ul class="login">
				<br>
				<br>
				<li>
					<span class="left">用户名：</span> 
					<span style=""> 
						<input id="userName" name="userName" type="text" class="txt" value="${userName }" /> 
					</span>
				</li>
				<li>
					<span class="left">密&nbsp;&nbsp;&nbsp;码：</span> 
					<span style=""> 
						<input id="password" name="password" type="password" class="txt" value="${password }" />
						
					</span>
				</li>
				<li>
					<span class="left">验证码：</span> 
					<span style=""> 
						<input type="text" value="${imageCode }" name="imageCode"  class="txtCode" id="imageCode" size="10" onkeydown= "if(event.keyCode==13)form1.submit()" onclick="pa()"/>&nbsp;
						<img onclick="javascript:loadimage();"  title="换一张试试" name="randImage" id="randImage" src="${pageContext.request.contextPath}/images/image.jsp" width="60" height="20" border="1" align="absmiddle"> 
					</span>
				</li>
			</ul>
			</li>
			<li class="topE"></li>
			<li class="middle_A"></li>
			<li class="middle_B"></li>
			<li class="middle_C">
				<span class="btn"> 
					<img alt="" src="${pageContext.request.contextPath}/images/login/btnlogin.gif" onclick="javascript:login();"/> 
				</span>&nbsp;&nbsp;
				<span >
					<font id="error" style="font-size: 15px" color="red">${error }</font>
				</span></li>
			<li class="middle_D"></li>
			<li class="bottom_A"></li>
			<li class="bottom_B">Java知识分享网 http://www.yalinet.cn</li>
		</ul>
	</div>
</form>
</body>
</html>