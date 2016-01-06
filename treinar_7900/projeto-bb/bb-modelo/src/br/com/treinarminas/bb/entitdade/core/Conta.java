package br.com.treinarminas.bb.entitdade.core;

public class Conta {

	public String nomeCorrentista;
	private double saldo;
	public double limiteCredito;
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public double recuperarSaldo() {
		return saldo + limiteCredito;
	}
}
