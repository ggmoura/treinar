package br.com.treinarminas.treinar;

public class PrimeiraClasse {

	public static void main(String[] args) {
		System.out.println("Olá Treinar");
		// tipo de byte limite de [-128 a 127] 
		byte tipoByte = 127;

		// tipo de byte short limte [-32768 a 32767]
		short tipoShort = 10000;

		// tipo de int limite [2147483648 a 
		int tipoInt = 1000000;

		// tipo de Long limite [2147483648 a 
		long tipoLong = 10000L;
		
		// tipo de Float
		float tipofloat = 10.1f;
		
		// tipo double
		double tipodouble = 10.4545454;

		System.out.println("Tipo de Byte = " + tipoByte);
		System.out.println("Tipo de Short = " + tipoShort);
		System.out.println("Tipo de Int = " + tipoInt);
		System.out.println("Tipo de Long = " + tipoLong);
		System.out.println("Tipo de Float = " + tipofloat);
		System.out.println("tipo de Double = " + tipodouble);
	}

}
