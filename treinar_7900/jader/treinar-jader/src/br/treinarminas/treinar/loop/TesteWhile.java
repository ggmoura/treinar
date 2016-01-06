package br.treinarminas.treinar.loop;

import java.util.Scanner;

public class TesteWhile {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o nome ");
		String nome = leitor.nextLine();
		
		while (!nome.equals("sair")); {

			System.out.println("O nome " + nome + " possui " + nome.length() + " letras." );
			
			System.out.print("Informe o nome ");
			nome = leitor.nextLine();
						
		} 
		leitor.close();
		System.out.println("fim do programa...");
	}

}
