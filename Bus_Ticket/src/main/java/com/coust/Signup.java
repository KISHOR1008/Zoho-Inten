package com.coust;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Signup
 */
@WebServlet("/Signup")
public class Signup extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String uname = request.getParameter("uname");
		String emailid = request.getParameter("emailid");
		String number = request.getParameter("phone");
		String pass = request.getParameter("password");
		System.out.println(emailid +" "+number);
		boolean b = InputValidation.check(emailid,number);
		if(b)
		{
			response.sendRedirect("signup.jsp");
		}
		else
		{
			LoginDao l = new LoginDao();
			if(l.add(uname, emailid, number, pass))
			{
				response.sendRedirect("created.jsp");
			}
		}
	}

}
