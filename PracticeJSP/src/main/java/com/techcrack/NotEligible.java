package com.techcrack;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

public class NotEligible extends HttpServlet{
	public void service(HttpServletRequest re,HttpServletResponse rs) {
		//int age = Integer.parseInt(re.getParameter("age"));
//		int age=0;
//		Cookie cook[]=re.getCookies();
//		for(Cookie cok:cook) {
//			if(cok.getName().equals("age")) {
//				age=Integer.parseInt(cok.getValue());
//			}
//		}
		ServletContext sc=getServletContext();
		ServletConfig scc=getServletConfig();
		HttpSession hs=re.getSession(true);
		int age=(int)(hs.getAttribute("age"));
		try {
			rs.getWriter().println(scc.getInitParameter("Name")+"You Needed To wait For "+(18-age)+" years to Vote!!!"+sc.getInitParameter("Value"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}