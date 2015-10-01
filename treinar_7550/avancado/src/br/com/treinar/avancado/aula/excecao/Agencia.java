package br.com.treinar.avancado.aula.excecao;

import br.com.treinar.avancado.Pessoa;
import br.com.treinar.avancado.Sexo;
import br.com.treinar.avancado.aula.Conta;

public class Agencia {

	public static void main(String[] args) {
		Caixa cx = new Caixa();
		Pessoa cliente = new Pessoa("Gleidson", Sexo.M);
		Conta c = new Conta();
		c.setCliente(cliente);
		c.setSaldo(10000d);
		try {
			cx.sacar(c, 50000d);
			System.out.println("saque efetuado...");			
		} catch (SaldoInsuficienteException e) {
			System.out.println("nao sacou, saldo insuficiente, valor disponivel para saque " + e.getSaldoDisponivel());
			oferecerEmprestimo();
		}
	}

	private static void oferecerEmprestimo() {
		System.out.println();
	}
	
	
}
