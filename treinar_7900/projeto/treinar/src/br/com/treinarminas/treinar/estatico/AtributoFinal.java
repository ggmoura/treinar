package br.com.treinarminas.treinar.estatico;

public class AtributoFinal {

	public static final String NOME_PROJETO;
	
	
	//bloco de inicializacao de atributos static, este bloco eh executado
	//na ordem em que foi ecrito na classe
	static {
		NOME_PROJETO = "Atributo final...";
	}
	
	static {
		
	}
	
	static {
		
	}

	public String nomePessoa;

	public static void imprimirNomeProjeto() {
		System.out.println(NOME_PROJETO);

		// nao eh possivel acessar atributos de instancia dentro de metodos
		// estaticos pois para tanto seria necessario utilizar o operador new
		// e criar um objeto
		// System.out.println(nomePessoa);
	}

}
