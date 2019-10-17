package br.com.treinarminas.encapsulamento;

public class Escola {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.incluirIdadeAluno(5000);
		int idadeDoAlunoUm = aluno.pegarIdadeAluno();
		System.out.println("Idade Do Aluno Um: " + idadeDoAlunoUm);

		aluno.incluirIdadeAluno(idadeDoAlunoUm + 1);

		Aluno outroAluno = new Aluno();
		outroAluno.incluirIdadeAluno(1);
		System.out.println("Idade Do Aluno Dois: " + outroAluno.pegarIdadeAluno());
		// aluno.idade = 1000;
		
		
		System.out.println();
		
		
	}

}
