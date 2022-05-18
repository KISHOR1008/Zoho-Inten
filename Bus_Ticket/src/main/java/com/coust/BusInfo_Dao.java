package com.coust;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BusInfo_Dao
 */
@WebServlet("/BusInfo_Dao")
public class BusInfo_Dao extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String busname = request.getParameter("busname");
		String busnum = request.getParameter("busnum");
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		String seatnum = request.getParameter("seatnum");
		String from_time = request.getParameter("from_time");
		String to_time = request.getParameter("to_time");
		String price = request.getParameter("price");
		String acc_no = request.getParameter("acc_no");
		LoginDao dao = new LoginDao();
		boolean b = false;
		
			b = dao.add(busname,busnum,from,to,seatnum,from_time,to_time,price,acc_no);
		if(b)
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", busname);
			response.sendRedirect("welcome.jsp");
		}
		else
		{
			response.sendRedirect("login.jsp");
		}
	}

}
