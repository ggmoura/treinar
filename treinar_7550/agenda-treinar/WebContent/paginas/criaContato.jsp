<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="treinar" uri="../WEB-INF/treinar.tld"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
	<script src="http://code.jquery.com/jquery-2.0.3.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Contato</title>
</head>
<body>
	<form action="cmd.agenda" id="form-1">
		<input type="hidden" name="comando" value="br.com.treinar.comando.CriaContato">
		<div class="ui-field-contain">
			<label for="nome">Nome:</label>
			<input name="nome" id="nome" data-clear-btn="true" value="" placeholder="Nome do contato" type="text"/>
		</div>
		
		<treinar:sexo id="sexo" nome="sexo" />
		
		<div class="ui-field-contain">
			<label for="telefone">Telefone:</label>
			<input name="telefone" id="telefone" data-clear-btn="true" value="" type="text"/>
		</div>
		<div class="ui-field-contain">
			<label for="select-1">Tipo Telefone:</label>
			<select name="tipoTelefone" id="tipoTelefone">
				<option value="-1">Selecione</option>
				<c:forEach items="${tiposTelefone}" var="tipo">
					<option value="${tipo}">${tipo.descricao}</option>
				</c:forEach>
			</select>
		</div>
		<div class="ui-field-contain">
			<label for="endereco">Endere�o:</label>
			<input name="endereco" id="endereco" data-clear-btn="true" value="${contato.endereco}" placeholder="Endere�o" type="text"/>
		</div>
		<div class="ui-field-contain">
			<label for="email">Email:</label>
			<input name="email" id="email" data-clear-btn="true" value="" placeholder="Endere�o" type="text"/>
		</div>
		<input type="submit" id="gravar" class="ui-btn ui-corner-all" value="Gravar">
	</form>

</body>
</html>