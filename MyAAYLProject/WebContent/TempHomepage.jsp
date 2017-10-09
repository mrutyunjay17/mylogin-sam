<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="ListOfStates.js"></script>

</head>


<body>
<h1 align="center" style="margin-top:3%;">Online Bus Ticket Booking</h1><hr />

<form name="test" method="POST" align="center" style="margin-top:12%;" action="booking">
<h2 align="center">Welcome <%=request.getAttribute("uname") %>!!</h2><br>

<table align="center">
<tr>
<th>From:</th><th>To:</th>	
</tr>
                          <!-- From: select list -->
<tr>
<td>
<table align="center">
<tr>
<td>State:</td>
<td>
<select name="state" id="state" onchange="setDistricts();">
  <option value="sel">Select State..</option>
  <option value="Maharashtra">Maharashtra</option>
  <option value="Gujrat">Gujrat</option>
  <option value="Punjab">Punjab</option>
</select>
</td>
</tr>
<tr>
<td >District:</td>
<td>
<select name="district" id="district" onchange="setCities();">
  <option value="">Please select a district</option>
</select>
</td>
</tr>
<tr>	
<td>City:</td>
<td>
<select name="city"  id="city">
  <option value="">Please select a city</option>
</select>
</td>
</tr>
</table>
</td>

                         <!-- To: select list -->
<td>
<table align="center">
<tr>
<td>State:</td>
<td>
<select name="state1" id="state1" onchange="setDistricts1();">
  <option value="sel">Select State..</option>
  <option value="Maharashtra">Maharashtra</option>
  <option value="Gujrat">Gujrat</option>
  <option value="Punjab">Punjab</option>
</select>
</td>
</tr>
<tr>
<td >District:</td>
<td>
<select name="district1" id="district1" onchange="setCities1();">
  <option value="">Please select a State</option>
</select>
</td>
</tr>
<tr>	
<td>City:</td>
<td>
<select name="city1"  id="city1">
  <option value="">Please select a State</option>
</select>
</td>
</tr>
</table>
</td>
<td>

</td>
</tr>
</table>
<br>
<input type="submit" value="Check Available Buses!!">
</form><hr style="margin-top:18%;" />

</body>
</html>