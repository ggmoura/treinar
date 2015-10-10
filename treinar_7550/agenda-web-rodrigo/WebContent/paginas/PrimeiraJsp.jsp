

<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String nome = request.getParameter("nome");
		out.write(nome);
		out.write("<br />");
		
		String hoje = request.getParameter("Data");
		DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
		
		try{
			Date data = df.parse(hoje);
			df = new SimpleDateFormat("EEEE");
			out.write(df.format(data));
			
		
		}
		catch (Exception e){
		
		out.write("Não foi possivel resolver!");
			
		}
	%>

</body>
</html>