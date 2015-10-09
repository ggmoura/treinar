<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Primeira JSP</title>
</head>
<body>

<% 
	String nome = request.getParameter("nome");
	out.write(nome);
	out.write("<br />");
	
	String hoje = request.getParameter("data");
	
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	try {
		
		Date data = df.parse(hoje);
		df = new SimpleDateFormat("EEEE");
		
		out.write(df.format(data));
		
	} catch (Exception e){
		
		out.write("Não foi possível converter a data informada");
		
	}

%>


	
	
	
</body>
</html>