package br.com.treinarminas.treinar.modificadoracesso.modificadorprotected;

import br.com.treinarminas.treinar.modificadoracesso.modificadorprotected.ModificadorProtected;

public class TesteModificadorProtected {

	public static void main(String[] args) {

		ModificadorProtected mptc = new ModificadorProtected();
		//pode ser acessado pois estah no mesmo pacote
		mptc.nome = "Gleidosn";

	}

}
