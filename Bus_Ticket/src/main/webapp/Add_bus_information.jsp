<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="BusInfo_Dao" method = "post">
	Enter Name Of the Bus : <input type ="text" name ="busname"><br>
	Enter Bus Number &emsp;&emsp;: <input type = "text" name ="busnum"><br>
	From &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; : <input type = "text" name ="from"><br>
	To &emsp;&emsp;&emsp;&emsp;&emsp;&emsp; &emsp;&emsp;: <input type = "text" name ="to"><br>
	Total number of seats&emsp; : <input type = "text" name ="seatnum"><br>
	Depature Timing&emsp;&emsp;&emsp;: <input type = "text" name ="from_time"><br>
	Arrival Timing&emsp;&emsp;&emsp;&emsp;: <input type = "text" name ="to_time"><br>
	Price&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;:<input type = "text" name ="price"><br>
	Account number&emsp;&emsp;&emsp;&emsp;:<input type = "text" name ="acc_no"><br>
	<input type = "submit" value = "Add">
	</form>
</body>
</html>