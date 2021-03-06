package br.com.treinar.bb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.bb.modelo.exception.BBException;
import br.com.treinar.bb.util.BBUtil;

public class ListarContaComando implements IComando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse resp)
			throws BBException {
		
		req.setAttribute("contas", BBUtil.getInstance().getContas());
		
		return "/telas/listaConta.jsp";
	}

}
