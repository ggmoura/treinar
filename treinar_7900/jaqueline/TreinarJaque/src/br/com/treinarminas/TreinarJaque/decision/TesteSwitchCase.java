package br.com.treinarminas.TreinarJaque.decision;

import java.util.Scanner;

public class TesteSwitchCase {

	private static Scanner leitor;

	public static void main(String[] args) {
		
		leitor = new Scanner(System.in);
		
		System.out.println("Informe a op��o: ");
		
		int opcao = leitor.nextInt ();
		
		leitor.close ();
		
		switch (opcao){
		case 1:
			System.out.println("Op��o um");
			break;
			//break serve para parar a execu��o
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
		
		String nome = "Jaqueline";
		//pode ser utilizado em string
		switch (nome){
		case "Jaqueline":
			System.out.println("Nome: ");
			break;
	}
	
}

}

