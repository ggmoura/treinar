package br.com.treinarminas.bb.entitdade.core;

import br.com.treinarminas.bb.entitdade.Cliente;

public class Conta {

	private Cliente cliente;
	private Double saldo;
	private Double limiteCreditoUtilizado;
	private Double limiteCreditoDisponivel;

	public Conta() {
		limiteCreditoUtilizado = 0d;
		saldo = 0d;
	}

	public Conta(Double saldo) {
		this();
		this.saldo = saldo;
	}

	public Boolean sacar(Double valor) {

		Boolean sacou = Boolean.FALSE;
		if (valor <= saldo) {
			saldo -= valor;
			sacou = Boolean.TRUE;
		} else if (valor <= (saldo + (limiteCreditoDisponivel - limiteCreditoUtilizado))) {
			limiteCreditoUtilizado += (valor - saldo);
			saldo = 0d;
			sacou = Boolean.TRUE;
		}

		return sacou;
	}

	public void depositar(Double valor) {
		saldo += valor;
	}

	public Double recuperarSaldo() {
		return saldo + limiteCreditoDisponivel - limiteCreditoUtilizado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteCreditoUtilizado() {
		return limiteCreditoUtilizado;
	}

	public void setLimiteCreditoUtilizado(Double limiteCredito) {
		this.limiteCreditoUtilizado = limiteCredito;
	}

	public Double getLimiteCreditoDisponivel() {
		return limiteCreditoDisponivel;
	}

	public void setLimiteCreditoDisponivel(Double limiteCreditoDisponivel) {
		this.limiteCreditoDisponivel = limiteCreditoDisponivel;
	}

}
