package com.techcrack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

public class Amazon extends HttpServlet {
	public void service(HttpServletRequest rq,HttpServletResponse rs) throws IOException {
		if(Integer.parseInt(rq.getParameter("amount"))>0) {
			try {
				rs.sendRedirect("pay-pal?amount="+rq.getParameter("amount"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			rs.getWriter().println("Amount is Not Valid Your Are Not Able Purchase The Product!!\nEnter the valid Amount !!!");
			RequestDispatcher rd=rq.getRequestDispatcher("pay-pal?amout=1000");
			try {
				rd.forward(rq, rs);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
		}
	}
}
