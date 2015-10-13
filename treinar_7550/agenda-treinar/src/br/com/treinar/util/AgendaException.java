package br.com.treinar.util;

public class AgendaException extends Exception {

	private static final long serialVersionUID = 1L;

	private String erro;

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}
	
}
