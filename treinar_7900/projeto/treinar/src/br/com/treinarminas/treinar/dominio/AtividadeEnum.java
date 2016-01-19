package br.com.treinarminas.treinar.dominio;

import java.util.Scanner;

public class AtividadeEnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a posição: ");
		FaixaEtaria[] faixas = FaixaEtaria.values();
		for (FaixaEtaria faixaEtaria : faixas) {
			System.out.println(faixaEtaria.ordinal() + " - " + faixaEtaria);
		}
		
		System.out.print("=> ");
		Integer opcao = sc.nextInt();
		sc.close();
		
		
		System.out.println(faixas[opcao]);
		
	}
	
}
