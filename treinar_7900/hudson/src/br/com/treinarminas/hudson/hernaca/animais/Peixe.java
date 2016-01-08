package br.com.treinarminas.hudson.hernaca.animais;

public class Peixe extends AnimalAquitico {

	public Peixe(Double peso, Double tamanho, String tipoAgua) {
		super(peso, tamanho);
		setTipoAgua(tipoAgua);
	}

	@Override
	public void respirar() {
		System.out.println("O peixe respira debaixo da água");
	}

	@Override
	public void locomover() {
		System.out.println("O peixe nada");
	}
	
	public void tipoPeixe(){
		System.out.println("Eu sou um peixe de água: " + getTipoAgua());
	}

}
