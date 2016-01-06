package br.com.treinarminas.TreinarJaque.decision;

import java.util.Scanner;

public class TesteSwitchCase {

	private static Scanner leitor;

	public static void main(String[] args) {
		
		leitor = new Scanner(System.in);
		
		System.out.println("Informe a opção: ");
		
		int opcao = leitor.nextInt ();
		
		leitor.close ();
		
		switch (opcao){
		case 1:
			System.out.println("Opção um");
			break;
			//break serve para parar a execução
		case 2:
			System.out.println("Opção dois");
			break;
		
		case 3:
			System.out.println("Opção três");
			break;
		
		case 4:
			System.out.println("Opção quatro");
			break;
		
		default:
			System.out.println("Opção inválida");
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

