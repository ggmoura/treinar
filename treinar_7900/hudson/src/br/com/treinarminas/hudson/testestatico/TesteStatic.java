package br.com.treinarminas.hudson.testestatico;

public class TesteStatic {
	public static final String nomeProjeto;
	public String nome;
	// bloco de inicilaliza��o de vari�veis estaticas
	// para estes blocos a ordem de defini��o faz diferen�a na execu��o, sendo
	// executados na ordem en que
	// os mesmos s�ao definidos
	static {
		nomeProjeto = "Arender Java";
	}
}
