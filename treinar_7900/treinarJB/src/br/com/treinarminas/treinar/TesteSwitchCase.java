package br.com.treinarminas.treinar;

import java.util.Scanner;

public class TesteSwitchCase {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a op��o: ");
		
		int opcao =  leitor.nextInt();
		
		leitor.close();
		
		switch (opcao) {
		case 1:
			System.out.println("Op��o um");
			break;
		case 2:
			System.out.println("Op��o dois");
			
			break;
		case 3:
			System.out.println("Op��o tr�s");
			
			break;
		case 4:
			System.out.println("Op��o quatro");
			
			break;

		default:
			System.out.println("Op��o inv�lida");
			break;
		}
		
	}

}
