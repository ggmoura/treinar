package br.treinarminas.treinar.decision;

import java.util.Scanner;

public class TesteSwitchCase {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe a op��o");
		
		int opcao = leitor.nextInt();
		
		leitor.close();
		
		switch (opcao) {
		case 1:
			System.out.println("Op��o Um");
			break;
		case 2:
			System.out.println("Op��o Dois");
			break;
		case 3:
			System.out.println("Op��o Tr�s");
			break;			
		case 4:
			System.out.println("Op��o Quatro");
			break;

		default:
			System.out.println("Op��o Invalida");
			break;
		}
	}

}
