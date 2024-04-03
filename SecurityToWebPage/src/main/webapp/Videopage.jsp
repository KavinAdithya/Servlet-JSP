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
		response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
		response.setHeader("Pragma","no-cache");
		response.setHeader("Expires","0");
			if(session.getAttribute("name")==null)
				response.sendRedirect("WelcomePage.html");
		%>
		${name}
		<a href="https://www.youtube.com/watch?v=-Q_RHzmETIM&list=RD-Q_RHzmETIM&start_radio=1">
		<iframe width="560" height="315" src="https://www.youtube.com/embed/-Q_RHzmETIM?si=XQQw4jAuKX5PEbaK" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
				Hridayam-Arikye?.../
		</a>
		<form action="logout" method="post">
				<input type="submit" value="Log OuT">
		</form>
</body>
</html>