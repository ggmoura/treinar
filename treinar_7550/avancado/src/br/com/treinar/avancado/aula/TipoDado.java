package br.com.treinar.avancado.aula;

public class TipoDado {

	public static void main(String[] args) {
		Integer a = 1000;
		Integer b = 1000;
		
		Integer c = 10;
		Integer d = 10;
		Integer e = new Integer(10);
		
		
		System.out.println("a == b: " + (a == b));
		System.out.println(c == d);
		System.out.println(d == e);
		System.out.println(e.equals(e));
		
		
		
		
		
	}
	
	
	
}
