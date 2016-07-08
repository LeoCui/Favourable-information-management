<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.favourable.servlet.searchServelet"
		import="com.favourable.domain.Item"
%>
<%

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>热销商品</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script language="javascipt" >
		function itemImageSrc(){
              String src="image/item/"+items.get(i).getItemPicture()+".jpg";
              itemImage.Src=src;
		}
	</script>

  </head>
  
  <body>
    <h3>热销商品</h3>
	<hr>
	<table width="95%"  cellpadding="0" cellspacing="0" border="0">
	   <%
	     ArrayList<Item> items=(ArrayList<Item>)request.getAttribute("items");
	     //ArrayList<Item> items=(ArrayList<Item>)session.getAttribute("items");
	     if(items!=null){
	     int size=items.size();
	     for(int i=0;i<size;){
		%>
		<tr>
		   <%  
		   for(int j=0;j<5&&i<size;j++,i++){
		   %>
			<td width="20%" valign="top">
             <table>
               <tr>
                 <td ><a href="showDetailItem?itemID=<%=String.valueOf(items.get(i).getItemID())%>&marketID=<%=String.valueOf(items.get(i).getMarketID())%>" target="frame1"><img src="image/item/<%=items.get(i).getItemPicture()%>.jpg" id="itemImage" height="160"/></a>
                  </td>
               </tr>
               <tr>
                 <td>名称: <%=items.get(i).getItemName()%></td>
               </tr>
               <tr>
                 <td>价格: <%=items.get(i).getCurrentPrice()%>/<%=items.get(i).getOriginalPrice()%></td>
               </tr>
            </table>
            </td>
            <%
              }
            %>
		</tr>
		<%
			}
			}
		 %>
		</table>
  </body>
</html>
