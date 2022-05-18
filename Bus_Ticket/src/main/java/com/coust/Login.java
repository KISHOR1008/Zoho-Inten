package com.coust;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		LoginDao dao = new LoginDao();
		boolean b = true;
		
			int value  = dao.check(uname, pass);
			if(value==-1)
				b = false;
		if(b)
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			session.setAttribute("Id", value);
			response.sendRedirect("welcome.jsp");
		}
		else
		{
			response.sendRedirect("login.jsp");
		}
	}

}