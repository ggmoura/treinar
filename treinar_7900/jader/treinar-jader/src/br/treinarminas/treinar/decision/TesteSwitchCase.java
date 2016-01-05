package br.treinarminas.treinar.decision;

import java.util.Scanner;

public class TesteSwitchCase {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe a opção");
		
		int opcao = leitor.nextInt();
		
		leitor.close();
		
		switch (opcao) {
		case 1:
			System.out.println("Opção Um");
			break;
		case 2:
			System.out.println("Opção Dois");
			break;
		case 3:
			System.out.println("Opção Três");
			break;			
		case 4:
			System.out.println("Opção Quatro");
			break;

		default:
			System.out.println("Opção Invalida");
			break;
		}
	}

}
