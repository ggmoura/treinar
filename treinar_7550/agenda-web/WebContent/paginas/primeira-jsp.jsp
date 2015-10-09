<%@ page import="br.com.treinar.agenda.Pessoa"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Primeira JSP</title>
</head>
<body>

	<% out.println("Gleidson"); %>
	
	
	<%
		String[] nomes = {"Gleidson", "Natan", "Isabela"};
		for(String nome: nomes) {
			out.print(nome);
			out.print("<br />");
		}
	
	%>
	
	<% 
		Pessoa p = (Pessoa) request.getAttribute("pessoa"); 
		out.write("Nome: " + p.getNome());
		out.write("<br />");
		out.write("Telefone: " + p.getTelefone());
			
	%>

	
	<%-- comentário em JSP aqui: nossa primeira página JSP --%>
	<form action="action.treinar">
		<input type="text" name="nome">
		<input type="submit">
	</form>


</body>
</html>