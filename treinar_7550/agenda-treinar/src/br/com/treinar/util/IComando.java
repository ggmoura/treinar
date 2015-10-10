package br.com.treinar.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IComando {

	void executar(HttpServletRequest request, HttpServletResponse response);
	
}
