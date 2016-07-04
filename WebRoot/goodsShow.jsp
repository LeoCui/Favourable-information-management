<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'goodsShow1.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h1>商品详情</h1>
	<hr>
	<table width="95%"  cellpadding="0" cellspacing="0" border="0">
	   <%
	     for(int j=0;j<4;j++){
		%>
		<tr>
		   <%  
		   for(int i=0;i<5;i++){
		   %>
			<td width="20%" valign="top">
             <table>
               <tr>
                 <td ><img src="image/001.jpg"
                   height="160"/></td>
               </tr>
               <tr>
               	 <td>名称：</td>
               </tr>
               <tr>
                 <td>价格:</td>
               </tr>
               <tr>
                 <td>超市：</td>
               </tr> 
               <tr>
               	<td>产地：</td>
               </tr>
             </table>
            </td>
            <%
              }
            %>
		</tr>
	  <% } %>
	</table>
  </body>
</html>
