package br.com.treinar.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IComando {

	/**
	 * Executa um comando e retora a pagina que devera ser atingida
	 * @param request
	 * @param response
	 * @return
	 * @throws AgendaException
	 */
	String executar(HttpServletRequest request, HttpServletResponse response) throws AgendaException;
	
}
