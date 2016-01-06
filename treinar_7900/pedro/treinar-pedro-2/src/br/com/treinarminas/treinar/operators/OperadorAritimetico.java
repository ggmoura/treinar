package br.com.treinarminas.treinar.operators;

public class OperadorAritimetico {

	
	public static void main(String[] args) {
		int valorUm = 10;
		
		int valorDois = 20;
		
		int valorTres = 0;
		
		int soma = valorUm + valorDois;
		
		System.out.println("Soma: 10 + 20 = " + soma);

		int subtracao = valorUm - valorDois;
		System.out.println("Subtracao: 10 - 20 = " + subtracao);
		
		int multiplicacao = valorUm * valorDois;
		System.out.println("Multiplicacao: 10 * 20 = " + multiplicacao);

		int divisao = valorUm / valorDois;
		System.out.println("Divisao numeros inteiros: 10 / 20 = " + divisao);

		float divisaoFlutuante = valorUm / (float)valorDois;
		System.out.println("Divisao ponto flutuante: 10 / 20 = " + divisaoFlutuante);
		
		
		int divisaoModular = valorUm % valorDois;
		System.out.println("Divisao ponto modular: 10 % 20 = " + divisaoModular);
	
		valorTres = valorTres + 1;
		valorTres = valorTres + 1;
		valorTres = valorTres + 1;
		valorTres += 1;
		
		System.out.println("Valor Três = " + valorTres);
		
	}
	
	
}
