package br.com.treinarminas.treinar.loop;

import java.util.Scanner;

public class TesteDoWhile {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		String nome = null;
		
		do {
			System.out.println("Informe o nome: ");
			nome = leitor.nextLine();
			System.out.println("O nome " + nome + " possui " + (nome.length() ) + " letras");
		} 
		
		while (!nome.equals("sair"));{
		leitor.close();
		System.out.println("fim do programa...");
		}
	}

}
