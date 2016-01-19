package br.com.treinarminas.hudson.enums;

import java.util.Scanner;

public class TesteFaixaEtaria {
	public static void main(String[] args) {
		FaixaEtaria[] faixa = FaixaEtaria.values();
		Scanner sc = new Scanner(System.in);
		Integer inteiro = null;
		System.out.println("Informe o indice da faixa Etária : 0 - Infantil 1 - Juvenil ou 2 para Adulto ");
		inteiro = sc.nextInt();
		System.out.println(faixa[inteiro]);	
		sc.close();
	}
}
