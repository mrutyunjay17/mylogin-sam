<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
<link rel="stylesheet" href="MyCSS/loginpage.css">
<!--  <script type="text/javascript" src="MyJavaScript/FormValidation.js"></script>-->
<script type="text/javascript">
function myFunction() {
    var x, text;  
    x = document.getElementById("uname").value;
    
    if ((x.indexOf('@')>-1) && (x.indexOf('.com')>-1)) {    	
        text = "Valid Email!!";    	
    } else {
        text = "Invalid Email!!";
    }
    document.getElementById("name").innerHTML = text;  
}

function myfun(){
	 
	var a,text1;
	a=document.getElementById("passw").value;
	var arr=[...a];
	if(a.length<6)
	text1="Password should contain atleast 6 characters";
	else text1="Password Ok!!";
	document.getElementById("passwrd").innerHTML = text1;	    
}

function checkNull(){
	var a,b,text;
	a=document.getElementById("passw").value;
	b=document.getElementById("passw1").value;
	
	if(a==b){
		text="Password matched!!";
	}
	else{ text="Password didn't match!!";}
	document.getElementById("passwrd1").innerHTML = text;
}

</script>
</head>
<body>
	<div class="register">
	<form name="myform" align="center" method="post"  border="2" action="register" style="margin-top:15%;">
		<h1 align="center">Register Details</h1><br>
		<table align="center">
		<tr><td><input type="text" name="uname" placeholder="Enter Email as username*" id="uname" onchange="myFunction()"></td>	
		<td><strong id="name"></strong></td></tr>
		
		<tr><td><input type="password" name="passwd" placeholder="Enter password*" onchange="myfun()" id="passw"><br></td>
		<td><strong id="passwrd"></strong></td></tr>
		
		<tr><td><input type="password" name="passwd1" placeholder="Retype Password*" onchange="checkNull()" id="passw1"><br></td>
		<td><strong id="passwrd1"></strong></td></tr>
		
		<tr><td><input type="text" name="fullname" placeholder="Enter full name*"><br></td>
		<td><strong id="fname"></strong></td></tr>
		
		<tr><td><input type="text" name="mobno" placeholder="Enter mobile number...."><br></td>
		<td><strong id="mobno"></strong></td></tr>
		</table>
		
		<div class="wrapper">
		<input type="submit" value="Submit Details!">
		<a href="Loginpage.jsp">Back to Login!</a>
	</div>
</form>
</div>
</body>
</html>