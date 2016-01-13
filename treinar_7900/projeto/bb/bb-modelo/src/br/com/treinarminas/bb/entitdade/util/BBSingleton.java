package br.com.treinarminas.bb.entitdade.util;

import br.com.treinarminas.bb.entitdade.core.Conta;

public class BBSingleton {

	
	private static BBSingleton instance;
	private Conta[] contas;
	private Integer index;
	
	static {
		instance = new BBSingleton();
	}
	
	private BBSingleton() {
		super();
		index = 0;
		contas = new Conta[Constante.QUANTIDADE_CONTAS];
	}
	
	public static BBSingleton getInstance() {
		return instance;
	}
	
	
	public void gravarConta(Conta c) {
		c.setNumeroConta(index);
		contas[index++] = c;
	}
	
	public Conta recuperarConta(Integer numeroConta) {
		return contas[numeroConta];
	}

	public Conta[] recuperarContas() {
		return contas;
	}
	
}
