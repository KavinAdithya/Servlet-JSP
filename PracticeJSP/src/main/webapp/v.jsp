<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p> KAVIN ADITHYAAAA </p>
	<%@ page import="java.util.Scanner" %>
	<%!
		String name="KavinDharani";
		public void show(){
			name+=" Be Joy ";
		}
	%>
	<%
		out.println(name);
		show();
		out.println(name);
	%>
	<p> Kavinn Dharani <%=name %></p>
</body>
</html>