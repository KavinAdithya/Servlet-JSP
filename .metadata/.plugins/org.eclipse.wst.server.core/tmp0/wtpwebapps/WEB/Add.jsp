<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="blue">
<h1>KAVINN DHARANI</h1>
<%@ page import="java.io.PrintWriter" %>
<%!
	String name="Kavin Dharani";
	public void tellMeAboutHer(){
	//out.println("She is the Most Beautiful Girl In the World!!!");
	name="dharanikavin";
	}
%>
<%
	out.println("KavinDharani"+name);
	tellMeAboutHer();

%>
<p>HE is A good Guy <%=     name %></p>
</body>
</html>