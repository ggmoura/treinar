package br.com.treinarminas.hudson.testeCase;

import java.util.Scanner;

public class TesteCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe a opção:");
		int opcao = scanner.nextInt();
		scanner.close();
		switch (opcao) {
		case 1:
			System.out.println( "opção um" );
			break;
		case 2:
			System.out.println( "opção dois" );
			break;
		case 3:
			System.out.println( "opção três" );
			break;
		case 4:
			System.out.println( "opção quatro" );
			break;

		default:
			System.out.println( "nenhuma opção" );
			break;
		}
	}
}
