package br.com.treinarminas.treinar.string;

public class TesteString {

	public static void main(String[] args) {
		String nome = "Gleidson Guimarães Moura";
		System.out.println(nome.substring(0, 8).replace("G", "g"));
		System.out.println(nome);
		
		nome = "Maria Sophia";
		
		//pedaco de uma string
		System.out.println(nome.substring(0, nome.indexOf(" ")));
		
		System.out.println(nome.isEmpty());
		
		//verifica se contem sequencia de caracteres
		//transforma string em minuscula
		System.out.println(nome.toLowerCase().contains("maria"));
		
		//Tamanho da string
		System.out.println(nome.length());
		
	}
	
}
