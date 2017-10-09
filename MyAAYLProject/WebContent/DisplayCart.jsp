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
<th>Booking Date</th>
<th>Bus Number</th>
<th>Bus Type</th>
<th>Departure Time</th>
<th>No. of tickets</th>
<th>Totla Price</th>

</tr>
<c:forEach var="tickets" items="${myList}">
<tr>
<form name="tickets" method="GET" align="center" style="margin-top:12%;" action="cancelTicket">
<td>${tickets.bookingdate}</td>
<td>${tickets.busno}</td>
<td>${tickets.bustype}</td>
<td>${tickets.dtime}</td>
<td>${tickets.tno}</td>
<td>${tickets.totalPrice}</td>
<td>
<input type="hidden" value="${tickets.bookingdate}" name="bookdate" id="bookdate">
<input type="hidden" value="${tickets.busno}" name="busno" id="busno">
<input type="hidden" value="${tickets.bustype}" name="bustype" id="bustype">
<input type="hidden" value="${tickets.dtime}" name="dtime" id="dtime">
<input type="hidden" value="${tickets.tno}" name="tno" id="tno">
<input type="hidden" value="${tickets.totalPrice}" name="totalprice" id="totalprice">
<input type="submit" value="Cancel ticket!!">
</td>
</form>
</tr>
</c:forEach>
</body>
</html>