package com.techcrack;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter( "/tester" )
public class IDFilter extends HttpFilter implements Filter {
	
       //Id checking Acting as a Security  Gaurd
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest hsr=(HttpServletRequest)request; //Type casting 
		int ID=Integer.parseInt(hsr.getParameter("id"));
		
		if(ID>=0)
			chain.doFilter(request, response);
		else {
			hsr.setAttribute("error","The Given Number is Not Valid!!!");
			RequestDispatcher rs=hsr.getRequestDispatcher("unusal.jsp");
			rs.forward(hsr,(HttpServletResponse)response);
		}
		
	}



}
