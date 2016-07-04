<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'search.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="css/bootstrap.min.css" rel="stylesheet">
   <script src="js/jquery.min.js"></script>
   <script src="js/bootstrap.min.js"></script>
   <style type="text/css">
	.nav > li .dropdown-menu {
	margin: 0;
}
   .nav > li:hover .dropdown-menu {
	display: block;
}	
	</style>
  </head>
  
  <body>
    <center>
    <form  action="search"  method="get">
    	<table>
    		<tr>
    			 <td>
    			      <select name="category">
    			      	  <option >超市</option>
    			      	  <option >商品</option>
    			      </select>
    			 </td>
    			 <td>
    			 	<input type="text" value="输入超市/商品" onfocus="if(value=='输入超市/商品') {value=''}"
    			 	 onblur="if(value=='') {value='输入超市/商品'}" name="name" size="30" style="color:#e5e1e1;"/>
    			 </td>
    			 <td>
    			 	<button type="submit" class="btn btn-default" aria-label="Left Align">
                     <span class="glyphicon glyphicon-search" aria-hidden="true"></span>	 	
    			 </td>
    		</tr>
    	</table>
    </form>
    </center>
  </body>
</html>
