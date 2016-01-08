package br.com.treinarminas.treinar.metodo;

public class TesteMetodo {

	public static void main(String[] args) {
		
		System.out.println("teste");
		Pessoa p = new Pessoa();
		p.nome = "Maria Sophia";
		p.idade = 3;
		p.correr();
		p.envelhecer();
		System.out.println(p.nome);
		System.out.println(p.idade);
		
		Pessoa p2 = new Pessoa();
		System.out.println(p2.nome);
		
	}
	
}
