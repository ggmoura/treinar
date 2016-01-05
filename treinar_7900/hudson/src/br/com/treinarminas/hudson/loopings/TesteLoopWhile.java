package br.com.treinarminas.hudson.loopings;

import java.util.Scanner;

public class TesteLoopWhile {
	
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		String nome = null;
		System.out.print( "Informe um nome:" );
		nome = scanner.nextLine();
		while( !nome.equals("sair") ){
			System.out.println( "O nome informado: " + nome + " possui " + nome.length() + " letras" );
			System.out.print( "Informe um nome:" );
			nome = scanner.nextLine();
		}
		scanner.close();
		System.out.println("Fim do programa");
		System.exit(0);
	}

}