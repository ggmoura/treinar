<%@page import="br.com.treinar.modelo.Contato"%>
<%@page import="java.util.List"%>
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

	<form action="cmd.agenda">
		
		<table data-role="table" id="contatos" class="ui-responsive">
		<thead>
			<tr>
				<th>Nome</th>
				<th data-priority="1">Sexo</th>
				<th data-priority="2">Telefone</th>
				<th data-priority="3">Endereço</th>
				<th data-priority="4">E-Mail</th>
			</tr>
		</thead>
		<tbody>
			<%
				if(request.getAttribute("contatos") != null) {
					List<Contato> contatos = (List<Contato>) request.getAttribute("contatos");
					for(Contato contato: contatos) {
						out.write("<tr>");
						out.write("<td>");
						out.write(contato.getPessoa().getNome());
						out.write("</td>");
						out.write("<td>");
						out.write(contato.getPessoa().getSexo().getDescricao());
						out.write("</td>");
						out.write("<td>");
						out.write(contato.getTelefone().toString());
						out.write("</td>");
						out.write("<td>");
						out.write(contato.getEndereco());
						out.write("</td>");
						out.write("<td>");
						out.write(contato.getEmail());
						out.write("</td>");
						
						
					}
					
				}
			%>
		</tbody>
	</table>
	
	</form>


</body>
</html>