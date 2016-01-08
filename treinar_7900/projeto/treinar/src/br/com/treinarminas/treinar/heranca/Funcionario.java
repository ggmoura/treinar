package br.com.treinarminas.treinar.heranca;

public abstract class Funcionario {

	public Funcionario() {
		super();
	}
	
	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	public String nome;
	
	public Integer idade;
	
	public Double salario;
	
	public Integer horasTrabalhadas;
	
	public void calcularSalario() {
		salario = horasTrabalhadas * 60d;
	}
	
	
}
