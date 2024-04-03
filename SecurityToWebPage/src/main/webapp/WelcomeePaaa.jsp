<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Welcome User</title>
	</head>
	<body>
		<%
			response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
			response.setHeader("Pragma","no-cache");
			response.setHeader("Expires","0");
			if(request.getParameter("name")==null)
				response.sendRedirect("WelcomePage.html");
			session.setAttribute("name",request.getParameter("name"));
		%>
		${name}
		WelcomE KaVin_AdithYa_KavinDharani...
		<a href="AboutUs.jsp">About us.</a>	
		<a href="Videopage.jsp">Video</a>
		<form action="logout" method="post">
			<input type="submit" value="log-Out">
		</form>
	</body>
</html>