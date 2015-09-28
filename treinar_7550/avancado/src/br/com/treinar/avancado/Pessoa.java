package br.com.treinar.avancado;

public class Pessoa {

	private String nome;

	private Sexo sexo;

	public Pessoa(String nome, Sexo sexo) {
		this(nome);
		this.sexo = sexo;
	}

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public Pessoa(Sexo sexo) {
		super();
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

}
