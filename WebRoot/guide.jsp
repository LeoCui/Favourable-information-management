<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
   <title>Bootstrap面包屑导航</title>
   <link href="css/bootstrap.min.css" rel="stylesheet">
   <script src="js/jquery-1.7.2.min.js"></script>
   <script src="js/bootstrap.min.js"></script>
   <style>
   		a{color:#000000 !important;}
   		a:hover{color:#84c1ff !important;}
   		.div_guide{text-align:right;background-color:#84c1ff !important;}
   </style>
</head>
<body>
<div class="div_guide">
	<ol class="breadcrumb" >
  		<li><a href="#">个人中心</a></li>
  		<li><a href="#">退出</a></li>
  		<li><a href="#">关于我们</a></li>
	</ol>
</div>

</body>
</html>