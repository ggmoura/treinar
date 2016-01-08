package br.com.treinarminas.treinar.heranca;

import br.com.treinarminas.treinar.heranca.testeprotected.Funcionario;

public class Gerente extends Funcionario {

	public Gerente(String nome) {
		super(nome);
	}

	public Gerente() {
		
	}

	private Double bonificacao;

	@Override
	public void calcularSalario() {
		setSalario(getHorasTrabalhadas() * 70 + bonificacao);
	}

	public Double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(Double bonificacao) {
		this.bonificacao = bonificacao;
	}

}
