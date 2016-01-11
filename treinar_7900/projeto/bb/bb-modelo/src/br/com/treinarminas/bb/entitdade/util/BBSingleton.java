package br.com.treinarminas.bb.entitdade.util;

import br.com.treinarminas.bb.entitdade.core.Conta;

public class BBSingleton {

	
	private static BBSingleton instance;
	private Conta conta;
	
	static {
		instance = new BBSingleton();
	}
	
	private BBSingleton() {
		super();
	}
	
	public static BBSingleton getInstance() {
		return instance;
	}
	
	
	public void gravarConta(Conta c) {
		conta = c;
	}
	
	public Conta recuperarConta() {
		return conta;
	}
	
}
