package br.com.treinarminas.estudo;

import br.com.treinarminas.modelo.Pessoa;

public class EstudoMetodo {

	public static void main(String[] args) {
		System.out.println("Pessoa novata correndo");
		Pessoa p = new Pessoa();
		p.correr(3);
		System.out.println("Pessoa antiga correndo");
		Pessoa p2 = new Pessoa();
		p2.correr();
		
	}

}
