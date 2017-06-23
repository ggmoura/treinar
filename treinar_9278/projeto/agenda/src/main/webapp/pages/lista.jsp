<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.treinar.agenda.modelo.Contato"%>
<%@ page import="java.util.List"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "ex" uri = "/WEB-INF/custom.tld"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agenda Treinar</title>
</head>
<body>


	<table border="1">
		<c:forEach items="${contatos}" var="contato">
			<tr>
				<td>${contato.nome}</td>
				<td>${contato.telefone.ddd}<c:out value="-"/>${contato.telefone.numero}</td>
			</tr>
		</c:forEach>
	</table>


	<ex:Hello message="Olá Mundo..." />

</body>
</html>