package br.com.treinarminas.hudson.hernaca.animais;

public class TesteAnimal {

	public static void main(String[] args) {
		Animal peixe = new Peixe(100.00, 30.00, "Doce");
		if(peixe instanceof Peixe){
			((Peixe)peixe).tipoPeixe();
		}
		peixe.respirar();
		peixe.locomover();
	}

}