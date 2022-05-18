package com.coust;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao 
{
	//select *from login where uname ='kishor'and pass ='kishor2001';
	String url = "jdbc:mysql://localhost:3306/bus";
	String username = "root";
	String password = "Kishor@2001";
public int check (String uname, String pass)
{
	String sql = "select * from persons where Name=? and password=? ";
	
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,username,password);
	PreparedStatement st = con.prepareStatement(sql);
	System.out.println(uname+" "+pass);
	st.setString(1, uname);
	st.setString(2,pass);
	
	ResultSet rs = st.executeQuery();
	
	if(rs.next())
	{
		System.out.println("im there");
		return rs.getInt("Personid");
		
	}
	
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
	System.out.println("im not there");
	return -1;
}
public boolean add(String uname, String emailid, String number,String pass)
{
	String sql = "insert into persons(Name,email,phone,password) values(?,?,?,?)";
	//insert into persons(Name,email,phone,password) values('inesh','inesh@123','12345','inesh2001');
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,username,password);
	PreparedStatement st = con.prepareStatement(sql);
	System.out.println(uname+" "+pass);
	st.setString(1, uname);
	st.setString(2,emailid);
	st.setString(3, number);
	st.setString(4,pass);
	int count = st.executeUpdate();
	if(count!=0)
	{
		System.out.println("im there");
		return true;
	}
	
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
	System.out.println("im not there");
	return false;
	
	
}
public boolean add(String busname,String busnum,String from ,String to,String seatnum, String from_time,String to_time,String price, String acc_no )
{
	try
	{
	String sql = "insert into Bus_details(Name,Busnumber,Depature_At,Arrival_At,Total_Seats,Depature_Timing,Arrival_Timing,price,Remaining_seats,Account_No) values (?,?,?,?,?,?,?,?,?,?)";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,username,password);
	PreparedStatement st = con.prepareStatement(sql);
	//System.out.println(uname+" "+pass);
	st.setString(1, busname);
	st.setString(2,busnum);
	st.setString(3, from);
	st.setString(4,to);
	st.setString(5,seatnum);
	st.setString(6,from_time);
	st.setString(7,to_time);
	st.setString(8,price);
	st.setString(9,seatnum);
	st.setString(10,acc_no);
	//st.setString(11,acc_no);
	
	int count = st.executeUpdate();
	if(count!=0)
	{
		System.out.println("im there");
		return true;
	}
	
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
	System.out.println("im not there");
	return false;
}
	public static Connection initialize() throws Exception {
		String url = "jdbc:mysql://localhost:3306/bus";
		String username = "root";
		String password = "Kishor@2001";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		return con;
	}
	
	
}


