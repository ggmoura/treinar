<%@ page import="br.com.treinar.modelo.Contato"%>
<%@ page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
	<script src="http://code.jquery.com/jquery-2.0.3.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contatos</title>
</head>
<body>

	<form action="cmd.agenda" method="post">
		
		<table data-role="table" id="contatos" class="ui-responsive">
		<thead>
			<tr>
				<th>Nome Contato</th>
				<th data-priority="1">Sexo</th>
				<th data-priority="2">Telefone</th>
				<th data-priority="2">Tipo</th>
				<th data-priority="3">Endereço</th>
				<th data-priority="4">E-Mail</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="c" items="${contatos}">
				<tr>
					<td>${c.pessoa.nome}</td>
					<td>${c.pessoa.sexo.descricao}</td>					
					<td>${c.telefone}</td>
					<td>${c.telefone.tipo.descricao}</td>
					<td>${c.endereco}</td>
					<td>${c.email}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	</form>


</body>
</html>