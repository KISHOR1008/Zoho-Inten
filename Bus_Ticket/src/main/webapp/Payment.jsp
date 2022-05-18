<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="Style.css">
<title>Insert title here</title>
</head>
<body>
<%


%>
	<form action="payment_success.jsp" method="post">
     	<div class = "flex justify padding_top">
			<div class = "login_inner flex">
				<div class = "align_center ">
					<h3 style="padding-left:30px">PAYMENT</h3>
					<label>Accepted Cards</label>
					<img style="padding-left:20px" src="american-express.png" width="50" height="50">
					<img src="discover.png" width="50" height="50">
					<img src="money.png" width="50" height="50">
					<img src="visa.png" width="50" height="50"><br>
				    <label>Name on Card</label><br>
					<input style="height:30px" type="text" name="name" placeholder="Name in card"><br><br>
					<label>Card Number</label><br>
					<input style="height:30px" type="text" name="card_number" placeholder="1111-2222-3333-4444"><br><br>
					<label>Month</label><br>
					<input style="height:30px" type="text" name="month" placeholder="february"><br><br>
					<label>Exp Year</label><br>
					<input style="height:30px" type="number" value="year" placeholder="2002"><br><br>
					<label>CVV</label><br>
					<input style="height:30px" type="number" value="cvv" placeholder="301"><br><br>
					<input type="submit" value="payment" >
				</div>
			</div>
		</div>
	</form>
</body>
</html>