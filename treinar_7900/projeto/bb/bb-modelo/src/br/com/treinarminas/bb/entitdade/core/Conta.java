package br.com.treinarminas.bb.entitdade.core;

import br.com.treinarminas.bb.entitdade.AppException;
import br.com.treinarminas.bb.entitdade.Cliente;
import br.com.treinarminas.bb.entitdade.util.IArquivo;

public abstract class Conta implements IEntity, IArquivo {

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((numeroConta == null) ? 0 : numeroConta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numeroConta == null) {
			if (other.numeroConta != null)
				return false;
		} else if (!numeroConta.equals(other.numeroConta))
			return false;
		return true;
	}
	
	@Override
	public String csv() {
		StringBuilder csv = new StringBuilder(cliente.csv());
		csv.append(";").append(numeroConta.toString()).append(";");
		csv.append(saldo);
		return  csv.toString();
	}

}
