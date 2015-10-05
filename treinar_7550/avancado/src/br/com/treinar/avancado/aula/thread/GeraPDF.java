package br.com.treinar.avancado.aula.thread;

public class GeraPDF implements Runnable {

	private Integer codigoProcesso;
	private StringBuffer texto;

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			texto.append("Processo GeraPDF: " + codigoProcesso + ": " + i + "\n");
		}
	}

	public Integer getCodigoProcesso() {
		return codigoProcesso;
	}

	public void setCodigoProcesso(Integer codigoProcesso) {
		this.codigoProcesso = codigoProcesso;
	}

	public StringBuffer getTexto() {
		return texto;
	}

	public void setTexto(StringBuffer texto) {
		this.texto = texto;
	}

}