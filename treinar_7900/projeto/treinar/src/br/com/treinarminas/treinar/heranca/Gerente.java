package br.com.treinarminas.treinar.heranca;

public class Gerente extends Funcionario {

	public Gerente(String nome) {
		super(nome);
	}
	
	public Gerente() {
		
	}
	
	public Double bonificacao;
	
	@Override
	public void calcularSalario() {
		salario = horasTrabalhadas * 70 + bonificacao;
	}
	
}
