package br.com.treinarminas.hudson.testeCase;

import java.util.Scanner;

public class TesteCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe a op��o:");
		int opcao = scanner.nextInt();
		scanner.close();
		switch (opcao) {
		case 1:
			System.out.println( "op��o um" );
			break;
		case 2:
			System.out.println( "op��o dois" );
			break;
		case 3:
			System.out.println( "op��o tr�s" );
			break;
		case 4:
			System.out.println( "op��o quatro" );
			break;

		default:
			System.out.println( "nenhuma op��o" );
			break;
		}
	}
}
