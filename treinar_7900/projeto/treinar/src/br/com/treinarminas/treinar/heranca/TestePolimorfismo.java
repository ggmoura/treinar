package br.com.treinarminas.treinar.heranca;

import br.com.treinarminas.treinar.heranca.testeprotected.Funcionario;

public class TestePolimorfismo {

	public static void main(String[] args) {
		Funcionario f = new Secretaria();
		
		f.setHorasTrabalhadas(100);
		calcularSalario(f);
		System.out.println("salario secretaria: " + f.getSalario());
		
		f = new Gerente();
		f.setHorasTrabalhadas(500);
		((Gerente)f).setBonificacao(100d);
		calcularSalario(f);
		System.out.println("salario gerente: " + f.getSalario());
	}

	private static void calcularSalario(Funcionario f) {
		//polimorfismo se comporta de maneira 
		//diferente em tempo de execução
		f.calcularSalario();
	}
	
}
