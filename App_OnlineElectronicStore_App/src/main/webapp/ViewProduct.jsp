<%@page import="pack1.AdminBean" %>
<%@page import="java.util.ArrayList" %>
<%@page import="pack1.ProductBean" %>
<%@page import="java.util.Iterator" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><center>
<h1>

<%

AdminBean abean = (AdminBean)session.getAttribute("abean");
ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("ProductList");
out.println("Mr. "+abean.getFname()+" here are your Product Details!!!<br><br>");
if(al.size()==0){
	out.println("There are No Products Available!!!<br><br>");
}
else
{
	Iterator<ProductBean> i= al.iterator();
	while(i.hasNext()){
		ProductBean pb= i.next();
		out.println(pb.getPcode()+" "+pb.getPname()+" "+pb.getPcompany()+" "+pb.getPprice()+" "+pb.getPqty()+"<a href='edit?pcode="+pb.getPcode()+"'    >Edit</a>"+" "
		+"<a href='delete?pcode=" + pb.getPcode() + "' onclick='return confirm(\"Are you sure you want to delete?\");'>Delete</a>" + "<br><br>");
//"<a href='delete?pcode="  +pb.getPcode()+"' onclick= alert('Are you really want to delete') >Delete</a>"+"<br><br>";
		
		
	}
}



%>
<a href="logout">Logout</a>

</h1>
</center>
</body>
</html>