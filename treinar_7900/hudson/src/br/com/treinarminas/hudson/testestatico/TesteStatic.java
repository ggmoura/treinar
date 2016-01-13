package br.com.treinarminas.hudson.testestatico;

public class TesteStatic {
	public static final String nomeProjeto;
	public String nome;
	// bloco de inicilalização de variáveis estaticas
	// para estes blocos a ordem de definição faz diferença na execução, sendo
	// executados na ordem en que
	// os mesmos sçao definidos
	static {
		nomeProjeto = "Arender Java";
	}
}
