package br.com.treinar.agenda.comando;

import javax.servlet.http.HttpServletRequest;

public interface IComando {

	String executar(HttpServletRequest request);
	
}
