package br.com.treinarminas.TreinarJaque.DataTypes;

public class TipoDado {
	
	public static void main(String[] args) {
		
		//tipos de dado byte limite [-128 ~ 127]
		byte tipoByte = 12;
		System.out.println("Tipo de dado byte: " + tipoByte);
		
		//tipos de dado short limite [-32768 ~ 32767]
		short tipoShort = 10000;
		System.out.println("Tipo de dado short: " + tipoShort);
				
		//tipos de dado int limite [-2147483648 ~ 2147483647]
		int tipoInt = 200000;
		System.out.println("Tipo de dado int: " + tipoInt);
				
		//tipos de dado long limite
		long tipoLong = 1000000L;
		System.out.println("Tipo de dado long: " + tipoLong);
		
		//tipos de dado float com ponto flutuante para 32bits
		float tipoFloat = 10.1f;
		System.out.println("Tipo de dado float: " + tipoFloat);
		
		//tipos de dado double com ponto flutuante para 64bits
		double tipoDouble = 10.12;
		System.out.println("Tipo de dado double: " + tipoDouble);
		
		//tipos de dado boolean logico
		boolean tipoBoolean = false;
		System.out.println("Tipo de dado boolean: " + tipoBoolean);
		
		//tipos de dado char caracter
		char tipoChar = 'A';
		System.out.println("Tipo de dado char: " + tipoChar);
		tipoChar = 66;
		System.out.println("Tipo de dado char: [editado]" + tipoChar);
		
	}
}
