package br.com.treinar.agenda.comando;

import javax.servlet.http.HttpServletRequest;

public class CriaContatoComando implements IComando {

	@Override
	public String executar(HttpServletRequest request) {
		
		return "/pages/novo.jsp";
	}
}
