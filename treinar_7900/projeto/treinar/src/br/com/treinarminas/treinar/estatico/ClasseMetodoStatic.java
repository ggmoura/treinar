package br.com.treinarminas.treinar.estatico;

public class ClasseMetodoStatic {

	public static String nomeProjeto;
	
	public String nomePessoa;
	
	
	public static void imprimirNomeProjeto() {
		System.out.println(nomeProjeto);
		
//		nao eh possivel acessar atributos de instancia dentro de metodos 
//		estaticos pois para tanto seria necessario utilizar o operador new 
//		e criar um objeto
//		System.out.println(nomePessoa);
	}
	
	
}
