<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'test.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" language="javascript">
		function test(obj){
    if( obj.value!="CAS/NAME/CATALOG" ){
     document.getElementById("productParam").value="";
        document.getElementById("productParam").className="input_s2";
    }else{
        document.getElementById("productParam").value="";
        document.getElementById("productParam").className ="input_s2";
    }
}

function onBluet(obj){
 if(obj.value == ""){
  document.getElementById("productParam").value="CAS/NAME/CATALOG";
  document.getElementById("productParam").className ="input_s1";
 }else{
  document.getElementById("productParam").className ="input_s1";
 }
}

		
	</script>
	<style>   
  .input_s1 {font-size:20;color:#949494; background-color:;border-top-width:1px; border-right-width: 1px; border-bottom-width: 1px; border-left-width: 1px} 
  .input_s2 {font-size:20;color:black; background-color:;border-top-width:1px; border-right-width: 1px; border-bottom-width: 1px; border-left-width: 1px} 
   </style>

	
  </head>
  
  <body>
  
  	<input class="input_s1" id="productParam" name="productParam" onkeyup="enterLogin(event);" type="text" value="CAS/NAME/CATALOG" onclick="test(this)" onblur="onBluet(this)"/>
    </body>
</html>
