<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agenda Treinar</title>
</head>
<body>

	<form action="menu.agenda">
	
		<input type="hidden" name="comando" value="listaContatos"> 
		<input type="submit" value="Listar Contatos">

	</form>

	<jsp:include page="/pages/rodape.jsp" />

</body>
</html>