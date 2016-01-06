package br.com.treinarminas.hudson.loopings;

import java.util.Scanner;

public class TesteLoopDoWhile {
	
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		String nome = null;
		do {
			System.out.print( "Informe um nome:" );
			nome = scanner.nextLine();
			if(!nome.equals("sair")){
				System.out.println( "O nome informado: " + nome + " possui " + nome.length() + " letras" );
			}
		} while (!nome.equals("sair"));
		scanner.close();
		System.out.println("Fim do programa");
		System.exit(0);
	}

}
