package br.com.treinarminas.bb.entitdade.util;

import java.util.ArrayList;
import java.util.List;

import br.com.treinarminas.bb.entitdade.core.Conta;

public class BBSingleton {

	
	private static BBSingleton instance;
	//private Conta[] contas;
	private List<Conta> contas;

	static {
		instance = new BBSingleton();
	}
	
	private BBSingleton() {
		super();
		contas = new ArrayList<>();
	}
	
	public static BBSingleton getInstance() {
		return instance;
	}
	public void gravarConta(Conta c) {
		c.setNumeroConta(contas.size());
		contas.add(c);
	}
	
	public Conta recuperarConta(Integer numeroConta) {
		return contas.get(numeroConta);
	}

	public List<Conta> recuperarContas() {
		return contas;
	}
	
	public void excluirConta(Integer numeroConta) {
		contas.remove(numeroConta);
	}
	
}
