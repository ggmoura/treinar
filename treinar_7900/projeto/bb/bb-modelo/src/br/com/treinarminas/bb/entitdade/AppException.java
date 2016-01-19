package br.com.treinarminas.bb.entitdade;

public class AppException extends Exception {

	private static final long serialVersionUID = 1L;

	private Integer codigoErro;

	public AppException(Integer codigoErro) {
		this.codigoErro = codigoErro;
	}

	public Integer getCodigoErro() {
		return codigoErro;
	}
	
}
