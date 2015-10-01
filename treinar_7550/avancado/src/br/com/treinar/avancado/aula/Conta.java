package br.com.treinar.avancado.aula;

import br.com.treinar.avancado.Pessoa;
import br.com.treinar.avancado.aula.excecao.SaldoInsuficienteException;

public class Conta {

	private Double saldo;
	private Pessoa cliente;
	private Double limiteCredito;

	public void sacar(Double valor) throws SaldoInsuficienteException {
		if (valor <= saldo) {
			saldo -= valor;
		} else {
			SaldoInsuficienteException sie = new SaldoInsuficienteException();
			sie.setSaldoDisponivel(saldo + limiteCredito);
			throw sie;
		}
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

}
