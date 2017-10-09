<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page!!</title>
<link rel="stylesheet" href="MyCSS/loginpage.css">

</head>
<body>
	<div class="login">
	<form method="post" align="center" border="2" action="lcontrol" style="margin-top:10%;">
	
		<h1 align="center" 	style="margin-top:10%;">Online Bus Ticket Booking</h1><br>
		<h2 align="center">Login Page</h2><br>
		<input type="text" name="login" placeholder="Enter your username...."><br>
		<br>
		<input type="password" name="password" placeholder="Enter password"><br><br>
		<input type="submit" name="login" value="Login"><br>
		<%
			if(request.getAttribute("message")!=null)
				out.println(request.getAttribute("message"));
	    %><br><br>
		New user??<a href="registerform">Register here!</a>	
	
	</form>
	</div>
</body>
</html>