<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
response.setHeader("Cache-Control" ,"no-cache, no-store,must-recalidate");
if(session.getAttribute("username")== null)
{
	response.sendRedirect("login.jsp");
}
%>
	Welcome ${username}
	<br>
	User Id ${Id}
	<form action ="view_ticket">
	<input type = "submit" value = "View Ticket">
	</form>
	<br>
	<br>
	<br>
	<form action ="Cancel_Ticket">
	<input type = "submit" value = "Cancel Ticket">
	</form>
	<br>
	<br>
	<br>
	<form action ="Booking.jsp">
	<input type = "submit" value = "Book Ticket">
	</form>
	<br>
	<br>
	<br>
	<form action ="Logout">
	<input type = "submit" value = "logout">
	</form>
</body>
</html>