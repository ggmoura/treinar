package br.com.treinarminas.hudson.enums;

public class TesteEnum {
	
	public static void main(String[] args) {
		Livros[] livros = Livros.values();
		for (Livros livros2 : livros) {
			System.out.println(livros2);
		}
	}

}
