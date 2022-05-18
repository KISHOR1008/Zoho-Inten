package com.coust;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;
import java.sql.*;

@WebFilter("/login")
public class LoginFilter implements Filter {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		HttpSession session=req.getSession();
		PrintWriter out=response.getWriter();
		String name=req.getParameter("username");
		String pword=req.getParameter("password");
		session.setAttribute("username",name);
		session.setAttribute("password",pword);
		try {
			Connection con=LoginDao.initialize();
			Statement st=con.createStatement();
			String query="select * from createAccount";
			ResultSet rs=st.executeQuery(query);
			session.setAttribute("booking","booking");
			session.setAttribute("menu","menu");
			if(session.getAttribute("username")==null||session.getAttribute("password")==null) {
				res.sendRedirect("login.jsp");
			}
			while(rs.next()) {
				if(rs.getString(2).equals(name) && rs.getString(3).equals(pword))
					chain.doFilter(request,response);
			}
			res.sendRedirect("LoginAlert.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
