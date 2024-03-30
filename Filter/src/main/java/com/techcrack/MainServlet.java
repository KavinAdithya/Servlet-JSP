package com.techcrack;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tester")
public class MainServlet extends HttpServlet{
	
	//Servlet Service method Which is Invoked By Web Container(Tom CAt)
	public void service(HttpServletRequest hsr,HttpServletResponse re) {
		
		//Getting data From client
		
		String name=hsr.getParameter("name");
		int ID=Integer.parseInt(hsr.getParameter("id"));
		
		//Instantiang JDBC Object DAO->data Access Object
		String dbName="KaVin_AdithYa";
		String passWord="KavinDharani@3";
		
		Student student=new Student(name,ID);
		JDBC db=new JDBC();
		db.connectDB(dbName, passWord);
		System.out.println(db.dataBaseIntoDB(dbName, passWord, student));

		
		RequestDispatcher rd=hsr.getRequestDispatcher("FinalResponseToUser.jsp");
		ResultSet rs=db.isUserPresent(dbName, passWord);
		
		if(checkAboutUser(rs,student)) 
			hsr.setAttribute("login", "Success Fully Log - In");
		else
			hsr.setAttribute("login","fail To Log In");
		
		try {
			rd.forward(hsr, re);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	//chacking user is present or not
	public boolean checkAboutUser(ResultSet rs,Student student) {
		String name=student.getName();
		int Id=student.getID();
		try {
			while(rs.next()) {
				try {
					if(name.equals(rs.getString(1))&&(Id==rs.getInt(2))){
						return true;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
				e.printStackTrace();
		}
		return false;
	}
}
