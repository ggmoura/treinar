package br.com.treinarminas.estudo;

import java.util.Scanner;

public class DecisaoSwitch {

	public static void main(String[] args) {
		
		Scanner leitorTeclado = new Scanner(System.in);
		System.out.print("Informe uma opção: ");
		int opcao = leitorTeclado.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Digitou o numero UM");
			break;
		case 2:
			System.out.println("Digitou o numero DOIS");
			break;
		case 3:
			System.out.println("Digitou o numero TRES");
			break;
		case 4:
			System.out.println("Digitou o numero QUATRO");
			break;
		default:
			System.out.println("Digitou um numero INVALIDO");			
			break;
		}
		leitorTeclado.close();
	}
	
}
