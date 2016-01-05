package br.com.treinarminas.treinar.datatypes;

public class TipoDado {

	public static void main(String[] args) {

		// tipo de dado byte limite [-128 ~ 127]
		byte tipoByte = 12;
		System.out.println("Tipo de dado byte: " + tipoByte);

		// tipo de dado byte limite [-32768 ~ 32767]
		short tipoShort = 10000;
		System.out.println("Tipo de dado short: " + tipoShort);

		// tipo de dado int limite [-2147483648 ~ 2147483647]
		int tipoInt = 1000000;
		System.out.println("Tipo de dado int: " + tipoInt);

		// tipo de dado int limite [-2147483648 ~ 2147483647]
		long tipoLong = 454_665_466_56L;
		System.out.println("Tipo de dado int: " + tipoLong);
		
		//ponto flutuante 32-bit
		float tipoFloat = 10.1f;
		System.out.println("Tipo de dado float: " + tipoFloat);
		
		//ponto flutuante 64-bit
		double tipoDouble = 10.1654654654;
		System.out.println("Tipo de dado double: " + tipoDouble);

		//tipo de dalo logico [true ou false]
		boolean tipoBoolean = false;
		System.out.println("Tipo de dado boolean: " + tipoBoolean);
		
		//caracteres
		char tipoChar = 'A';
		System.out.println("Tipo de dado char: " + tipoChar);
		tipoChar = 66;
		System.out.println("Tipo de dado char [editado]: " + tipoChar);
		
		
	}

}
