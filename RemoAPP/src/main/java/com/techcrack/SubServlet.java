package com.techcrack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

public class SubServlet extends HttpServlet{
	public void service(HttpServletRequest re,HttpServletResponse rp) throws ServletException {
		try {
			re.setAttribute("kk",100);
			rp.sendRedirect("division?k=9000");
//			rp.getWriter().println("The Subtraction is "+(Integer.parseInt(re.getParameter("number1"))-Integer.parseInt(re.getParameter("number2"))));
//			re.setAttribute("k", 9000);
//			RequestDispatcher rd=re.getRequestDispatcher("division");
//			rd.forward(re,rp);
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	
}