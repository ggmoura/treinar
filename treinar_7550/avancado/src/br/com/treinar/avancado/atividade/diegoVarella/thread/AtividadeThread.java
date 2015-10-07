package br.com.treinar.avancado.atividade.diegoVarella.thread;

public class AtividadeThread {

	public static void main(String[] args) {

		GeraNome nome = new GeraNome();
		nome.setNome("Diego");
		Thread threadNome = new Thread(nome);
		threadNome.start();

		GeraNome nome2 = new GeraNome();
		nome2.setNome("Teste");
		Thread threadNome2 = new Thread(nome2);
		threadNome2.start();

		System.out.println("Fim...");

	}

}
