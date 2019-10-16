package br.com.treinarminas.estudo;

public class TipoDeDados {

	
	public static void main(String[] args) {
		
		byte by = 127;
		System.out.println("byte: " + by);
		short sh = 32000;
		System.out.println("short: " + sh);
		int in = 304_805_40;
		System.out.println("int: " + in);
		long ln = 249058;
		System.out.println("long: " + ln);
		
		float flt = (float) 3.14;
		flt = 3.144f;
		flt = 3.145F;
		System.out.println("float: " + flt);
		
		double db = 45666.9999;
		System.out.println("double: " + db);
		
		boolean estahLigado = false;
		System.out.println("boolean: " + estahLigado);
		
		char ch = '1';
		System.out.println("char: " + ch);
		
	}
	
}
