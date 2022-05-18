package com.coust;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class checking {

	public static void main(String[] args) {
		try {
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
		System.out.println(count);
		
		}
		catch(Exception e)
		{
		System.out.println(e);
		}

	}

}
