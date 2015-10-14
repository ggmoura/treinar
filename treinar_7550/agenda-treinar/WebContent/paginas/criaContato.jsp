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
<title>Cadastrar Contato</title>
</head>
<body>
	<form action="cmd.agenda" id="form-1">
		<input type="hidden" name="comando" value="br.com.treinar.comando.CriaContato">
		<div class="ui-field-contain">
			<label for="nome">Nome:</label>
			<input name="nome" id="nome" data-clear-btn="true" value="" placeholder="Nome do contato" autofocus="true" type="text"/>
		</div>
		<div class="ui-field-contain">
			<label for="nome">Sexo</label>
			<fieldset data-role="" id="radio-1">
				<input name="sexo" id="sexoFeminino" value="0" type="radio"/>
				<label for="sexoFeminino">Feminino</label>
				<input name="sexo" id="sexoMasculino" value="1" type="radio"/>
				<label for="sexoMasculino">Masculino</label>
			</fieldset>
		</div>
		<div class="ui-field-contain">
			<label for="telefone">Telefone:</label>
			<input name="telefone" id="telefone" data-clear-btn="true" value="" type="text"/>
		</div>
		<div class="ui-field-contain">
			<label for="endereco">Endereço:</label>
			<input name="endereco" id="endereco" data-clear-btn="true" value="" placeholder="Endereço" type="text"/>
		</div>
		<div class="ui-field-contain">
			<label for="email">Email:</label>
			<input name="email" id="email" data-clear-btn="true" value="" placeholder="Endereço" type="text"/>
		</div>
		<input type="submit" id="gravar" class="ui-btn ui-corner-all" value="Gravar">
	</form>

</body>
</html>