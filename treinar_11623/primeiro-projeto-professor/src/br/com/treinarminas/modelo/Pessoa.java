package br.com.treinarminas.modelo;

public class Pessoa {

	public float altura;
	public int idade;
	public char sexo;
	private int quantidadeDePassosNoDia;

	public String nome;

	public void aprender() {
		System.out.println(nome + " Estou aprendendo");
	}

	public int recuperarQuantidadeDePassosNoDia() {
		//Alguma regra
		return quantidadeDePassosNoDia;
	}

	public void correr(int quantidadeDePassos) {
		for (int i = 0; i < quantidadeDePassos; i++) {
			String texto = i > 0 ? " passos" : " passo";
			System.err.println((i + 1) + texto);
		}
		quantidadeDePassosNoDia += quantidadeDePassos;
	}

	public void correr() {
		correr(5);
	}

}
