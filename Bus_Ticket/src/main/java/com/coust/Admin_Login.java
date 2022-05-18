package com.coust;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Admin_Login")
public class Admin_Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		String checkname = "99999";
		String checkpass = "99999";
		boolean b = false;
		if(checkname.equals(uname) && checkpass.equals(pass))
		{
			b = true;
		}
		if(b)
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("admin.jsp");
		}
		else
		{
			response.sendRedirect("login.jsp");
		}
	}

}
