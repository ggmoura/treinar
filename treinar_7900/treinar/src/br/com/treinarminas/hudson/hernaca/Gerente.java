package br.com.treinarminas.hudson.hernaca;

public class Gerente extends Funcionario {

	private Double bonificacao;
	
	public Gerente ( String nome, Integer idade, Double salario ){
		super(nome, idade, salario);
	}

	public Double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(Double bonificacao) {
		this.bonificacao = bonificacao;
	}
	
	@Override
	public void calcularSalario(Double horas) {
		super.calcularSalario(horas);
		setSalario(getSalario() + bonificacao);
	}
	
}
