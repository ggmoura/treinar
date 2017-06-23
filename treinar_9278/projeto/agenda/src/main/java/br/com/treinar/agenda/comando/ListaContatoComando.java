package br.com.treinar.agenda.comando;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.util.Database;

public class ListaContatoComando implements IComando {

	@Override
	public String executar(HttpServletRequest request) {
		
		List<Contato> contatos = Database.getInstance().recuperarContatos();
		request.setAttribute("contatos", contatos);
		
		return "/pages/lista.jsp";
	}
	
}
