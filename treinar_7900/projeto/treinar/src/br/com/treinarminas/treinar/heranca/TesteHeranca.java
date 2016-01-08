package br.com.treinarminas.treinar.heranca;

public class TesteHeranca {

	public static void main(String[] args) {

		Gerente g = new Gerente();
		g.setNome("gleidson");
		g.setIdade(25);
		g.setSalario(1000d);
		g.setBonificacao(100d);
		g.setHorasTrabalhadas(100);
		g.calcularSalario();
		System.out.println(g.getNome());

		Secretaria s = new Secretaria();
		s.setNome("Maria Sophia");
		s.setIdade(3);
		s.setSalario(10000d);
		// s.bonificacao = 100d; atributo exclusivo de gerente
		s.setDepartamento("diretoria");
		s.setHorasTrabalhadas(1000);
		s.calcularSalario();

		System.out.println("departamento:\n\t" + s.getDepartamento());

	}

}
