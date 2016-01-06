package br.com.treinarminas.treinar.operators;

public class Comparador {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println("a = " + a + " b = " + b);
		boolean c = a == b;
		
		System.out.println("a igual a b: " + c);
		
		c = a != b;
		System.out.println("a diferente de b: " + c);
		
		c = a > b;
		System.out.println("a maior do que b: " + c);

		c = a < b;
		System.out.println("a menor do que b: " + c);
		
		c = a >= b;
		System.out.println("a maior ou igual a b: " + c);
		
		c = a <= b;
		System.out.println("a menor ou igual a b: " + c);
		
		
		//quando utiliza dois '&&' quando a expressao eh satisfeita
		//nao continua a execucao
		c = a > b && b < 10;
		
		//quando utiliza um '&' indiferente de jah ter obtido o resultado
		//da expressao continua executando.
		c = a > b && b < 10;
		
		c = a > b | b < 10;
		
		int d = a > 10 ? a : b;
		
		System.out.println(a > 10 ? a : b);
		
		System.out.println("d = " + d);
		
		
		
	}
	
}
