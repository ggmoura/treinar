<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1><%= request.getParameter("nome") %></h1><br>
	<h1><%= request.getSession().getAttribute("contador") %></h1><br>
	<h1><%= request.getServletContext().getAttribute("users") %></h1>

</body>
</html>