package br.com.treinarminas.hudson.datatypes;

public class TiposdeDados {
	public static void main(String[] args) {

		// tipo de dados byte limite ( -128 ate +127 )
		byte b = 127;
		System.out.println("Tipo de dados byte: " + b);

		// tipo de dados short limite ( -32768 ate +32767 )
		short s = 127;
		System.out.println("Tipo de dados short: " + s);

		// tipo de dados int limite ( -32768 ate +32767 )
		int tipoInt = 100000;
		System.out.println("Tipo de dados short: " + tipoInt);

		// tipo de dados long
		long tipoLong = 1000005252l;
		System.out.println("Tipo de dados long: " + tipoLong);

		// tipo de dados double
		double tipoDouble = 1000555550052.52;
		System.out.println("Tipo de dados double: " + tipoDouble);

		// tipo de dados float
		float tipoFloat = 100055555005252.555f;
		System.out.println("Tipo de dados float: " + tipoFloat);
		
		// tipo de dados boolean
		boolean tipoBoolean = true;
		System.out.println("Tipo de dados boolean: " + tipoBoolean);
		
		// tipo de char caractere único
		char tipoChar = 'T';
		System.out.println("Tipo de dados boolean: " + tipoChar);
		
		
	}
}
