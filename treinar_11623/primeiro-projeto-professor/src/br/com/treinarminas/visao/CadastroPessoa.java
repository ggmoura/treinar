package br.com.treinarminas.visao;

import br.com.treinarminas.modelo.Pessoa;

public class CadastroPessoa {

	public static void main(String[] args) {

		System.out.println("Olá, bem vindo ao projeto blah");

		Pessoa pessoa1 = new Pessoa();
		pessoa1.altura = 1.86f;
		pessoa1.idade = 26;
		pessoa1.sexo = 'M';
		pessoa1.nome = "Gleidson";

		pessoa1.aprender();
		
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Maria Sophia";
		p2.aprender();
		
		pessoa1.aprender();

	}

}
