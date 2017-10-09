<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<%@page import="java.util.*,com.Dao.*,com.controller.*" %>
<body>


<table align="center"style="margin-top:10%;"border="1">
<tr>
<th>Bus Number</th>
<th>Bus Type</th>
<th>Departure Time</th>
<th>Ticket Price</th>
<th>Available Seats</th>
<th>Number of Tickets</th>

</tr>
<c:forEach var="buses" items="${busdetails}">

<tr>
<form name="buses" method="GET" align="center" style="margin-top:12%;" action="addbooking">
<td>${buses.busno}</td>
<td>${buses.bustype}</td>
<td>${buses.depart_time}</td>
<td>${buses.price}</td>
<td>${buses.seatsav}</td>
<td>
<input type="hidden" value="${buses.busno}" name="busno" id="busno">
<input type="hidden" value="${buses.bustype}" name="bustype" id="bustype">
<input type="hidden" value="${buses.depart_time}" name="depart_time" id="depart_time">
<input type="hidden" value="${buses.price}" name="price" id="price">
<input type="hidden" value="${buses.seatsav}" name="seatsav" id="seatsav">
<input type="number" name="tno" id="tno"><input type="submit" value="book ticket!!">
</td>
</form>
</tr>
</c:forEach>
</table><br><br>

</body>
</html>