package com.techcrack;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.util.*
;
public class JSPAndServlet extends HttpServlet{
	public void service(HttpServletRequest re,HttpServletResponse rs) {
		String name="KavinDharani";
		List<Integer> list=new ArrayList<>();
		list.add(19);
		list.add(43);
		list.add(1943);
		re.setAttribute("name_id",name);
		int age=40;
		HttpSession hs=re.getSession();
		hs.setAttribute("age", age+"");
		hs.setAttribute("Ages",list);
		RequestDispatcher rd=re.getRequestDispatcher("JSP.jsp");
		try {
			rd.forward(re,rs);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}

	}
}
