package br.com.treinarminas.treinar.objeto;

public class TesteEquals {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		Aluno b = new Aluno();
		
		a.nome = "Maria Sophia";
		a.idade = 130;
		
		b.nome = "Maria Cecilia";
		b.idade = 130;
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
	}
	
}
