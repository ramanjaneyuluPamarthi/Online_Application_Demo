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
String msg= (String)request.getAttribute("msg");
out.println(msg+"<br><br>");

%>
<a href="view1">View Products</a><br><br>
<a href="logout">Logout</a>
</body>
</html>