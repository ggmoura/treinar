<%@page import="br.com.treinar.agenda.modelo.Contato"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agenda Treinar</title>
</head>
<body>

	<%
		List<Contato> contatos = (List<Contato>) request.getAttribute("contatos");
		for(Contato c : contatos) {
			out.print(c.getNome());
			out.print("<br />");
		}
	%>

</body>
</html>