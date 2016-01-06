package br.com.treinarminas.hudson.operadores.comparacao;

public class Comparador {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		boolean c = a == b;
		System.out.println("a == b " + c);
		c = a != b;
		System.out.println("a diferente b " + c);
		c = a > b;
		System.out.println("a maior b " + c);
		c = a < b;
		System.out.println("a menor b " + c);
		c = a <= b;
		System.out.println("a menor ou igual b " + c);
		c = a >= b;
		System.out.println("a maior ou igual b " + c);
		// operador ternário
		int d = a > 10 ? a : b;
		System.out.println("o valor de d é: " + d);
	}
}
