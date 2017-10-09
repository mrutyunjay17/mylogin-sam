<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script type="text/javascript" src="MyJavaScript/TrailStates.js"></script>
</head>
<body>
<h1 align="center" style="margin-top:3%;">Online Bus Ticket Booking</h1><hr />
<a href="viewTickets">View my bookings</a><br>
<a align="left" href="loggingOut">Log Out</a><br>
<form name="test" method="POST" align="center" style="margin-top:12%;" action="booking">
<h2 align="center">Welcome <%=session.getAttribute("fullname") %>!!</h2><br>
<input type="text" class="fromcity" id="fromcity" name="fromcity">
<input type="text" class="tocity" id="tocity" name="tocity">
<input type="date" id="busdate" name="busdate">
<input type="submit" value="Check Available Buses!!"><br><br><br>
<%
			if(request.getAttribute("message1")!=null)
				out.println(request.getAttribute("message1"));
	    %>
</form>
<hr style="margin-top:18%;" />
</body>
</html>