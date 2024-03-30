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


@WebFilter( "/tester")
public class NAMEFilter extends HttpFilter implements Filter {
       
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest hsr=(HttpServletRequest)request;
		String name=hsr.getParameter("name");
		if(name.length()>8)
			chain.doFilter(request, response);
		else {
			hsr.setAttribute("error","Name Length Is Tooo Short");
			RequestDispatcher rd=hsr.getRequestDispatcher("unusal.jsp");
			rd.forward(hsr,(HttpServletResponse)response);
		}
	}

}
