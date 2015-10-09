<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Primeira JSP</title>
</head>
<body>
	
	<% 	
		
		nome n = request.getAttribute("nome");
				
		out.write(nome);
		
		String hoje = request.getAttribute("data");
		DateFormat df = new SimpleDateFormat("dd/MM/yyy");
		try {
			Date data = df.parse(hoje);
			df = new SimpleDateFormat("EEE");
			out.write(df.format(data));
		} catch (Exception e) {
			out.write("Não foi possível formatar a data.");
		}
	%>
	
	
</body>
</html>