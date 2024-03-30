<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Error Page</title>
	</head>
 	<body>
		<p>
			Un excepted things happen Due to mis Understanding !! <br/>We can Rectify It As sooon As Possible
		</p>
		${exception.getMessage()}
    </body>
</html>