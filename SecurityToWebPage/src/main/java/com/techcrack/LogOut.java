package com.techcrack;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogOut extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) {
		try {
			HttpSession hs=request.getSession();
			hs.removeAttribute("name");
			response.sendRedirect("LogIn.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
