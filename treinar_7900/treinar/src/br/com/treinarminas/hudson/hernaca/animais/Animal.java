package br.com.treinarminas.hudson.hernaca.animais;

public abstract class Animal {
	
	private Double peso;
	private Double tamanho;
	
	public Animal( Double peso, Double tamanho ){
		this.tamanho = tamanho;
		this.peso    = peso;
	}

	public abstract void locomover();

	public abstract void respirar();

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getTamanho() {
		return tamanho;
	}

	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	};
}
