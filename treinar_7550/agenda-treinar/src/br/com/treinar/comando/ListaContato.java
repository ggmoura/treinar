package br.com.treinar.comando;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.util.AgendaException;
import br.com.treinar.util.DataBase;
import br.com.treinar.util.IComando;

public class ListaContato implements IComando {

	@Override
	public String executar(HttpServletRequest request,
			HttpServletResponse response) throws AgendaException {
		
		request.setAttribute("contatos", DataBase.getInstance().recuperarContatos());
		
		return "/paginas/listaContatos.jsp";
		
		
	}

	
}
