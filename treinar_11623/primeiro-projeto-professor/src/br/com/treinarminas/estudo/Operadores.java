package br.com.treinarminas.estudo;

public class Operadores {

	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int soma = a + b;
		
		String textoImpresso = "A soma (a + b) = " + soma;
		
		System.out.println(textoImpresso);
		
		int c = 10;
		int d = 30;
		
		int subtracao = c - d;
		
		System.out.println("A subtração (c - d) = " + subtracao);
		
		
		int e = 9;
		int f = 5;
		float resultadoDivisao = (float) e / f;
		
		System.out.println("A divisão (e / f) = " + resultadoDivisao);
		
		
		int g = 10;
		int h = 2;
		
		System.out.println("A multiplicação (g * h) = " + g * h);
		
		
		int i = 11;
		int j = 3;
		
		System.out.println("O Módulo (i % j) = " + i % j);
		
		int k = 0;
		
		k = k + 1;
		
		k += 5;
		
		System.out.println("k = " + k);
		
		k++;
		
		System.out.println("k = " + k);

		k--;
		
		System.out.println("k = " + k);
		
		int pos = k--;
		System.out.println("pos: " + pos);
		System.out.println("k: " + k);
		
		int pre = --k;
		System.out.println("pre: " + pre);//4
		System.out.println("k: " + k);
		System.out.println("k" + k++);
		System.out.println("k" + ++k);
		
		
	}
	
	
}
