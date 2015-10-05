package br.com.treinar.avancado.atividade.diegoVarella.thread;

public class GeraNome implements Runnable {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(nome);
		}
		
	}

}
