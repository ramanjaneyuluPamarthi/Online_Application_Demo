<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="pack1.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><center><h1>
<%
AdminBean abean=(AdminBean)session.getAttribute("abean");
out.println("Welcome Mr. "+abean.getFname()+"!!!"+"<br><br>");
%>
<a href="AddProduct.html">Add Product</a><br><br>
<a href="view1">View Product</a><br><br>
<a href="logout">Logout</a>
</body>
</html>