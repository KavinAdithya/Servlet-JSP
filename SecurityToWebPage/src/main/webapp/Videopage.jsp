<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%
			if(session.getAttribute("name")==null)
				response.sendRedirect("WelcomePage.html");
		%>
		<a href="https://www.youtube.com/watch?v=-Q_RHzmETIM&list=RD-Q_RHzmETIM&start_radio=1">
				Hridayam-Arikye?.../
		</a>
		<form action="logout" method="post">
				<input type="submit" value="Log OuT">
		</form>
</body>
</html>