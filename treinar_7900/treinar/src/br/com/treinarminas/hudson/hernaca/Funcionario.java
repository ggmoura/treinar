package br.com.treinarminas.hudson.hernaca;

public abstract class Funcionario {

	public Double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	private String nome;
	private Integer idade;
	private Double salario;
	private Double horasTrabalhadas;
	
	public Funcionario( String nome, Integer idade, Double salario ){
		this.nome    = nome;
		this.idade   = idade;
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
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
	
	public void calcularSalario( Double horas ){
		this.horasTrabalhadas = horas;
		salario = horasTrabalhadas * 60 ;
	}

}
