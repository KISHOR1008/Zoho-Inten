<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>Customer</b>
<form action ="Login" method = "post">
	Enter username : <input type ="text" name ="uname"><br>
	Enter password : <input type = "password" name ="pass"><br>
	<input type = "submit" value = "login">
	
	</form>
	
	<form action ="signup.jsp" method = "post">
	<br> 
	<br>
	<b>Create an Account:</b> 
	<input type = "submit" value = "signup">
	
	</form>
	
	
	
	<br>
	<br>
	<b>Enter as Admin</b>
	<form action ="admin_login.jsp" method = "post">
	<input type = "submit" value = "Admin">
	
	</form>
	
	

</body>
</html>