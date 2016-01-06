package br.com.treinarminas.TreinarJaque.Operadores;

public class Operadores {
	
	public static void main(String[] args) {
		int ValorUm = 10;
		int ValorDois = 20;
		int soma = ValorUm + ValorDois;
		
		System.out.println("Soma: 10 + 20 = " + soma);
		
		int subtracao = ValorUm - ValorDois;
		
		System.out.println("Subtração: 10 - 20 = " + subtracao);
		
		int multiplicacao = ValorUm * ValorDois;
		
		System.out.println("Multiplicação: 10 * 20 = " + multiplicacao);
		
		int divisao = ValorUm / ValorDois;
		
		System.out.println("Divisão números inteiros: 10 / 20 = " + divisao);
		
		float divisaoflutuante = ValorUm / (float)ValorDois;
		
		System.out.println("Divisão com pontos flutuantes: 10 / 20 = " + divisaoflutuante);
		
		float divisaomodular = ValorUm % (float)ValorDois;
		
		System.out.println("Divisão com pontos flutuantes: 10 % 20 = " + divisaomodular);
		
		
	}

}
