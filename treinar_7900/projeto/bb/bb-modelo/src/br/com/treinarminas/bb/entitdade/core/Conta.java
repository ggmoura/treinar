package br.com.treinarminas.bb.entitdade.core;

import br.com.treinarminas.bb.entitdade.AppException;
import br.com.treinarminas.bb.entitdade.Cliente;

public abstract class Conta implements IEntity {

	private static final long serialVersionUID = 1L;
	
	private Cliente cliente;
	private Double saldo;
	private Integer numeroConta;

	public Conta() {
		saldo = 0d;
	}

	public Conta(Double saldo) {
		this();
		this.saldo = saldo;
	}

	@Override
	public Long getId() {
		return numeroConta.longValue();
	}
	
	public abstract void sacar(Double valor) throws AppException;

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

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer id) {
		this.numeroConta = id;
	}

	@Override
	public String toString() {
		return numeroConta + " " + cliente.getNome();
	}
	
}
