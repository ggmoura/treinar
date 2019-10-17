package br.com.treinarminas.estudo;

import br.com.treinarminas.modelo.Pessoa;

public class EstudoMetodo {

	public static void main(String[] args) {
		
		System.out.println("Pessoa novata correndo");
		Pessoa p = new Pessoa();
		p.idade = 1000;
		p.nome = "Maria Sophia";
		System.out.println(p.nome + " Vai correr");
		
		p.correr(3);
		
		System.out.println("Pessoa antiga correndo");
		Pessoa p2 = new Pessoa();
		p2.nome = "Gleidson Moura";
		System.out.println(p2.nome + " Vai correr");
		p2.correr();
		
		p.correr();
		
		int quantidade = p.recuperarQuantidadeDePassosNoDia();
		
		// p.quantidadeDePassosNoDia += 10;
		
		System.out.println("Hoje o p correu: " + quantidade);
		p = p2;
		System.out.println(p.nome);
		System.out.println(p2.nome);
		
		
	}

}
