<%@page import="pack1.AdminBean" %>
<%@page import="java.util.ArrayList" %>
<%@page import="pack1.ProductBean" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><center><h1>
<%
AdminBean abean= (AdminBean)session.getAttribute("abean");
ArrayList<ProductBean> al=(ArrayList<ProductBean>) session.getAttribute("ProductList");
ProductBean pb =(ProductBean) request.getAttribute("pbean");
out.println("Mr. "+abean.getFname()+" please edit "+"<br><br>");
%>
<form action="update" method="post">
Product Price<input type="text" name=pprice value="<%=pb.getPprice() %>"><br><br>
Product Quantity<input type="text" name=pqty value="<%=pb.getPqty() %>"><br><br>
<input type="hidden" name=pcode value="<%=pb.getPcode()%>">
<% out.print(pb.getPcode());  %>
<input type="submit" value="Update Product Details">

</form>
</body>
</html>