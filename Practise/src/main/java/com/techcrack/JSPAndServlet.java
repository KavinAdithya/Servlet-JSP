package com.techcrack;
import javax.servlet.http.HttpServlet;
import com.techcrack.Student;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.util.*;
import javax.servlet.http.Cookie;
public class JSPAndServlet extends HttpServlet{
	public void service(HttpServletRequest re,HttpServletResponse rs) {
		String name="KavinDharani";
		
		List<Student> list1=new ArrayList<>();
		list1.add(new Student("DharaniKavin",40));
		list1.add(new Student("KavinDharani",40));
		list1.add(new Student("Dharani",20));
		list1.add(new Student("Kavin",20));
		
		List<Integer> list=new ArrayList<>();
		list.add(19);
		list.add(43);
		list.add(1943);
		
		re.setAttribute("name_id",name); //Adding Integer list to request Object
		
		re.setAttribute("students",list1); //Adding our list to request Object
		int age=40;
		
		HttpSession hs=re.getSession(); //Adding Object Session Which is Object Common for all Servlet
		hs.setAttribute("age", age+"");
		hs.setAttribute("Ages",list);
		
		
		/*Creating object of request Dispatcher which is forward from one servlet
		to another Servlet*/
		
		RequestDispatcher rd=re.getRequestDispatcher("JSP.jsp");
		try {													
			rd.forward(re,rs);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
		
		//It Will Be Added Only to response Object Because it will  Stored in the Client browser Area
		Cookie cook=new Cookie("students",list+"");
		
	}
}
