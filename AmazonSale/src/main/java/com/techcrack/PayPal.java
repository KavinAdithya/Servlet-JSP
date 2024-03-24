package com.techcrack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

public class PayPal extends HttpServlet {
	public void service(HttpServletRequest re,HttpServletResponse rs) throws IOException {
		PrintWriter pw=rs.getWriter();
		pw.println("Amount Has Been transfered And hencc Order has Been Confirmed !!!");
		pw.println(re.getParameter("amout")+" Amount has debited from Your Account!!!"+re.getParameter("amount"));
	}
}
