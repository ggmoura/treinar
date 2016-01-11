package br.com.treinarminas.treinar.estatico;

public class TesteStatic {

	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		ClasseAtributoStatic atrStatic = new ClasseAtributoStatic();
		ClasseAtributoStatic atrStatic1 = new ClasseAtributoStatic();
		ClasseAtributoStatic atrStatic2 = new ClasseAtributoStatic();
		ClasseAtributoStatic atrStatic3 = new ClasseAtributoStatic();
		ClasseAtributoStatic atrStatic4 = new ClasseAtributoStatic();
		ClasseAtributoStatic atrStatic5 = new ClasseAtributoStatic();
		
		atrStatic.nomePessoa = "Gleidosn";
		
		//o ideal eh alterar o valor de atributos static pela classe e nao 
		//por um determinado objeto da mesma.
		//atrStatic.nomeProjeto = "Aprender Java";
		
		ClasseAtributoStatic.nomeProjeto = "Aprender Java";
		
		System.out.println(ClasseAtributoStatic.nomeProjeto);
		System.out.println(atrStatic.nomePessoa);
		System.out.println(atrStatic.nomeProjeto);
		System.out.println(atrStatic1.nomeProjeto);
		System.out.println(atrStatic2.nomeProjeto);
		System.out.println(atrStatic3.nomeProjeto);
		System.out.println(atrStatic4.nomeProjeto);
		System.out.println(atrStatic5.nomeProjeto);
	
	
	}
	
	
}
