package br.com.treinarminas.bb.entitdade.core;

import br.com.treinarminas.bb.entitdade.Cliente;

public abstract class Conta {

	private Cliente cliente;
	private Double saldo;

	public Conta() {
		saldo = 0d;
	}

	public Conta(Double saldo) {
		this();
		this.saldo = saldo;
	}

	public abstract Boolean sacar(Double valor);

	public abstract void depositar(Double valor);

	public abstract Double recuperarSaldo();

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

}
