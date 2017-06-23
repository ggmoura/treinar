package br.com.treinar.agenda.comando;

import javax.servlet.http.HttpServletRequest;

public class ListaContatoComando implements IComando {

	@Override
	public String executar(HttpServletRequest request) {
		request.setAttribute("cdu", "Listagem");
		return "/pages/lista.jsp";
	}
	
}
