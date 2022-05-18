package com.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Login")
public class Login extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String uname = request.getParameter("uname");
			String pass = request.getParameter("pass");
			if(uname.equals("kishor")&& pass.equals("learnings"))
			{
				response.sendRedirect("welcome.jsp");
			}
				
	}



}
