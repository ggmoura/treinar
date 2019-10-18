package br.com.inter.modelo.principal;

import br.com.inter.modelo.Cliente;

public abstract class Conta {

	private Integer numero;
	private Integer senha;
	private Double saldo;
	private Integer agencia;
	private Cliente cliente;

	public Conta(Integer numero) {
		this();
		this.numero = numero;
	}

	public Conta() {
		this.saldo = Double.valueOf(0);
	}

	public Double recuperarSaldo() {
		return this.saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getSenha() {
		return senha;
	}

	public void setSenha(Integer senha) {
		this.senha = senha;
	}

	protected Double getSaldo() {
		return saldo;
	}

	protected void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
