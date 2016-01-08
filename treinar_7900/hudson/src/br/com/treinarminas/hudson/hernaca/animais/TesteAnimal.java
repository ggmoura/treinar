package br.com.treinarminas.hudson.hernaca.animais;

public class TesteAnimal {

	public static void main(String[] args) {
		AnimalAquitico peixe = new Peixe(100.00, 30.00, "Doce");
		System.out.println("Este peixe é de água " + peixe.getTipoAgua());
		peixe.respirar();
		peixe.locomover();
	}

}