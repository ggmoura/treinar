package br.com.treinarminas.hudson.hernaca.animais;

public abstract class AnimalAquitico extends Animal {

	private String tipoAgua;

	public AnimalAquitico(Double peso, Double tamanho) {
		super(peso, tamanho);
	}

	public String getTipoAgua() {
		return tipoAgua;
	}

	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	}

}
