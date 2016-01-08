package br.com.treinarminas.treinar.objeto;

public class TesteAluno {

	public static void main(String[] args) {

		Aula aula1 = new Aula();
		aula1.aluno.nome = "fulano";

		Aluno j = criarAluno();
		imprimirNomeAluno(j);

		criarAluno();

		Aluno a = null;
		a = new Aluno();
		a.nome = "gleidson";
		a.idade = 25;

		Aluno b = new Aluno("maria sophia");
		b.idade = 3;

		a = b;

		imprimirNomeAluno(a);

		b.nome = "davi";

		imprimirNomeAluno(a);

		a = null;

		imprimirNomeAluno(b);

		Aula aula2 = new Aula();

		aula1.aluno = b;
		aula1.disciplina = "Programação Java";

		aula2.aluno = b;
		aula2.disciplina = "Programação C#";

		b = null;

		System.out.println(aula1.aluno.nome);

		aula1 = null;
	}

	private static Aluno criarAluno() {
		Aluno a = new Aluno();
		a.nome = "Miguel";
		a.idade = 1;
		return a;
	}

	private static void imprimirNomeAluno(Aluno aspira) {
		aspira.nome = "Maria cecilia";
		imprimir(aspira);
	}

	private static void imprimir(Aluno aspira) {
		System.out.println(aspira.nome);
		aspira = new Aluno();
		aspira.nome = "Joao carlos";
		System.out.println(aspira.nome);
	}

}
