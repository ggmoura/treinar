package br.com.treinarminas.encapsulamento;

public class Aluno {

	private int idade;

	public void incluirIdadeAluno(int idadeDoAluno) {
		if (idadeDoAluno < 7) {
			idade = idadeDoAluno;
		}
	}

	public int pegarIdadeAluno() {
		return idade;
	}

}
