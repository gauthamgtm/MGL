<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="bootstrap.css">
<title>Insert title here</title>
</head>
<body>
<% 
	HttpSession sess=request.getSession(false);
	String name=(String)sess.getAttribute("name"); 
%>
<section class="list-con ">
 	<div class="container" >
		<h1>Welcome,<%=name %></h1> <a href="logoutserv" style="margin-top: -50px;" class="btn btn-danger pull-right">Logout</a>
		<a href="sessionserv">Click here to see the name</a>
	</div>
</section>
</body>
</html>