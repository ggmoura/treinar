package br.com.treinarminas.treinar.heranca.testeprotected;

public abstract class Funcionario {

	public Funcionario() {
		super();
	}

	public Funcionario(String nome) {
		this.nome = nome;
	}

	private String nome;

	private Integer idade;

	private Double salario;

	private Integer horasTrabalhadas;
	
	String testeAtributoDefault;
	
	protected String testeAtributoProtected;

	public void calcularSalario() {
		salario = horasTrabalhadas * 60d;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

}
