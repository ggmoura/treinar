package br.com.treinarminas.treinar.estatico;

public class CicloInicializacaoStatic {

	public static String nomeProjeto;
	
	
	//bloco de inicializacao de atributos static, este bloco eh executado
	//na ordem em que foi ecrito na classe
	static {
		nomeProjeto = "Iniciar atributos static";
	}
	
	static {
		
	}
	
	static {
		
	}

	public String nomePessoa;

	public static void imprimirNomeProjeto() {
		System.out.println(nomeProjeto);

		// nao eh possivel acessar atributos de instancia dentro de metodos
		// estaticos pois para tanto seria necessario utilizar o operador new
		// e criar um objeto
		// System.out.println(nomePessoa);
	}

}
