<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Filess</title>	
	</head>
	<body>
		<form action="FileUpload" method="post" enctype="multipart/form-data">
			<input type="file" name="file" multiple>
			<input type="submit">
		</form>
	</body>
</html>