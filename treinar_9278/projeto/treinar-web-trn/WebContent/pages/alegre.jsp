<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%! String[] nomes = {"Maria Sophia", "Davi Lucas", "Ana Cecilia"}; %>

	<%= "tese" %>
	
	${teste}
	

	<h1><%= request.getParameter("nome") %></h1><br>
	
	<h1><%= request.getAttribute("idadeMariaSophia") %></h1><br>
	<h1><%= request.getSession().getAttribute("contador") %></h1><br>
	<h1><%= request.getServletContext().getAttribute("users") %></h1>

	<table border="1">
	<%
		Date hoje = new Date();
		for(String nome : nomes) {
			out.append("<tr><td>");
			out.append(nome);
			out.append("</td></tr>");
		}
	%>
	</table>
	<br>
	<br>
	<br>
	<br>
	<input type="text" value="Gleidson" name="apelido">
	<form action="PageRedirect" method="post">
		<input type="text" value="Gleidson" name="nome">
		<input type="submit" value="Tutorialspoint">
	</form>
	

</body>
</html>