package br.com.treinarminas.treinar.heranca.testeprotected;

import br.com.treinarminas.treinar.heranca.Gerente;

public class TesteProtected {

	public static void main(String[] args) {
		Funcionario f = new Gerente();
		System.out.println(f.testeAtributoDefault);
		System.out.println(f.testeAtributoProtected);
	}
	
}
