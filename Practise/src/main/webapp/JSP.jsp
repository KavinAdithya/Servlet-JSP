<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Scanner" %>
<!DOCTYPE html>
	<html>
		<head>
		<meta charset="ISO-8859-1">
			<title>Insert title here</title>
		</head>
		<body bgcolor="grey">
			<%!
				//String name="KAvinDharani_Adithi_Adithya";
			%>
			<%
				Scanner scan=new Scanner(System.in);
				int age=Integer.parseInt(request.getParameter("age"));
				if(age>=18)
					out.println("Your Are Eligibe For Voting!!!\n");
				else
					out.println("You Are Not Eligible For Voting!!!\n");
				pageContext.setAttribute("name","KavinDharani");
				String name=String.valueOf(pageContext.getAttribute("name"));
				out.println(name);
			%>
			<p>Hello<%=age %></p>
		</body>
	</html>