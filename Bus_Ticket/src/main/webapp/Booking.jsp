<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page import="java.sql.*" %>
<%@page import="java.util.*" %>
    
<%@page import="com.coust.LoginDao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0);
%>
<h1>Hi ${username}</h1>
<h1>Your User Id ${Id}</h1>
<h1>WELCOME TO SEAT BOOKING SYSTEM</h1>
<h2>SEAT DETAILS</h2>
<h3>TOTAL TICKETS=25</h3>
<h3>PRICE PER SEAT=100</h3>
<%

 //if(session.getAttribute("payment")==null){
	// response.sendRedirect("welcome.jsp");
 //}// else {
	// session.setAttribute("booking",null);
	// if(session.getAttribute("username")==null||session.getAttribute("password")==null)
	////	response.sendRedirect("login.jsp"); 	 
// }

//request.getSession();
try{
	Connection con=LoginDao.initialize();
	String query="select * from seatinfo";
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
	int count =0;
	while(rs.next())
	{
		if(rs.getInt(2)==-1)
		{
			count++;
		}
	}
	//System.out.println(count);
	
	out.print("<html><h3>AVAILABLE SEATS="+count+"</h3></html>");
	out.println("<html><h3>BOOKED SEATS="+(25-count)+"</h3></html>");
	st.close();
	con.close();
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	

	%>
	<%
	try{
		Connection con=LoginDao.initialize();
		String query="select * from seatinfo";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		LinkedHashMap<Integer,String>h=new LinkedHashMap<Integer,String>();
		ArrayList<String>gender=new ArrayList();
		while(rs.next()){
			if(rs.getInt(2)==-1){
				h.put(rs.getInt(1),"unbooked");
				System.out.println(rs.getInt(2));
			}
			else{
				h.put(rs.getInt(1),"booked");
				System.out.println(rs.getInt(2));
			}
			gender.add(rs.getString(3));
		}
		
		Set s = h.entrySet();
        Iterator it = s.iterator();
        int i=0;
        String result="<html>";
        result+="<div class='flex column'>";
        result+="<div class='row'>";
  		while(it.hasNext()){
  			++i;
  			if(i%5==0){
  				
  				result+=it.next()+"("+gender.get(i-1)+")";
  				result+="<div class='row'>";
  			}//&nbsp&nbsp&nbsp&nbsp
  			else{
  				result+=it.next()+"("+gender.get(i-1)+")&nbsp&nbsp&nbsp&nbsp";
  			}
  		}
  		result+="</html>";
  		out.println(result);
		st.close();
		con.close();
	}
	catch(Exception e){
		out.println(e.getMessage());
	}
	%>
<div class = "flex justify">
	<div class = "login_inner flex">
		<div class = "align_center ">
			<h2>BOOK YOUR SEAT</h2>
			<form action="allocateSeat" method="post"><br>	
				
				<input style="height:30px" type="number" name="ticketstart" min="1" placeholder="Enter the starting range" required><br><br>
				<label>End Range of Seat Number</label><br>
				<input style="height:30px" type="number" name="ticketend" min="1" placeholder="Enter the ending range" required><br><br>
				<label>Male Count</label><br>
				<input style="height:30px" type="number" id="malecount" name="malecount" min="0" placeholder="Enter male count" required><br><br>
				<label>Female Count</label><br>
				<input style="height:30px" type="number" id="femalecount" name="femalecount" min="0" placeholder="Enter female count" required><br><br>
				<input id="btn" type="submit" value="book"> 
			</form>
		</div>
	</div>
</div>
</body>
</html>