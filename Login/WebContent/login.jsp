<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login</title>
		<link rel="stylesheet" href="bootstrap.css">
	</head>
	<body>
		<section class="list-con ">
		    <div class="container" >
				 <div class="col-md-4"></div>
				 <div class="col-md-4" style="margin-top: 150px;">
				 	
		    		<h1 style="text-align: center;"><b>Login</b></h1>
				  <form method="post" action="logserv">
					User name:<input type="text" class="form-control" name="un" required="required"><br>
					Password:<input type="password" class="form-control" name="pwd" required="required"><br>
					<input type="submit" class="btn btn-success pull-right" value="login">
					<% String msg=(String)request.getAttribute("msg"); 
						if(msg!=null){
					%>
							<h4 style="color:red"><%=msg %></h4>
					<%
						}
						if(msg!=null)
							msg=null;
					%>
				  </form>
				 </div>
					
				  <div class="col-md-4>"></div>
			</div>
	 	</section>
	</body>
</html>