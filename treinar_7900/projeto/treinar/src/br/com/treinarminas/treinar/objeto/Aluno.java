package br.com.treinarminas.treinar.objeto;

public class Aluno {

	//construtor padrao
	public Aluno() {
		System.out.println("CRIOU UM ALUNO!");
	}
	
	//qdo crio um construtor diferente do defout (padrao) este deverah ser informado
	//explicitamente, caso contrario nao podera ser utilizado
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public Aluno(int idade) {
		this.idade = idade;
	}
	
	public Aluno(String nome, int idade) {
		this(nome);
		this.idade = idade;
	}
	
	
	
	public String nome;
	
	public int idade;
	
}
