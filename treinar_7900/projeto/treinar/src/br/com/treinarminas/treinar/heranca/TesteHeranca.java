package br.com.treinarminas.treinar.heranca;

public class TesteHeranca {

	
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.nome = "gleidson";
		g.idade = 25;
		g.salario = 1000d;
		g.bonificacao = 100d;
		g.horasTrabalhadas = 100;
		g.calcularSalario();
		System.out.println(g.nome);
		
		Secretaria s = new Secretaria();
		s.nome = "gleidson";
		s.idade = 25;
		s.salario = 1000d;
		//s.bonificacao = 100d;
		s.departamento = "diretoria";
		s.horasTrabalhadas = 50;
		s.calcularSalario();
		
		System.out.println(s.departamento);
		
		
	}
	
}
