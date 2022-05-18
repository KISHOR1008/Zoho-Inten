package com.coust;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/allocateSeat")
public class Allocate_seats extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
		Connection con = LoginDao.initialize();
		int start = Integer.parseInt(request.getParameter("ticketstart"));
		int end = Integer.parseInt(request.getParameter("ticketend"));
		
		String query =( "select seatState from seatinfo where seatnumber>="+start+" and seatnumber<="+end);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		HttpSession session = request.getSession();
		int id = (int) session.getAttribute("Id");
		System.out.println(start+" "+end);
		//int count =0;
		while(rs.next())
		{
			if(rs.getInt(1)==-1)
			{
				System.out.println("donot redirect");
			}
			else 
			{
				System.out.println("im redirect");
				response.sendRedirect("Booking.jsp");
			}
		}
		int male = Integer.parseInt(request.getParameter("malecount"));
		int female = Integer.parseInt(request.getParameter("femalecount"));
		System.out.println(start+" "+end+" "+male+" "+female);
		System.out.println("Id is = "+id);
		for(int i = 0;i< male;i++)
		{
			query = "UPDATE bus.seatinfo SET seatState = 1 , gender = 'male', Personid = ? WHERE seatnumber =?;";	
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ps.setInt(2, start);
			ps.executeUpdate();
			start++;
		}
		for( int i = 0; i<female ; i++)
		{
			query = "UPDATE bus.seatinfo SET seatState = 1 , gender = 'female', Personid = ? WHERE seatnumber =?;";	
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ps.setInt(2, start);
			ps.executeUpdate();
			start++;
		}
		response.sendRedirect("Payment.jsp");
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
