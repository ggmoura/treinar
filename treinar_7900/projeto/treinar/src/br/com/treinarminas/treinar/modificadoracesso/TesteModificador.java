package br.com.treinarminas.treinar.modificadoracesso;

import br.com.treinarminas.treinar.modificadoracesso.modificadorprotected.ModificadorProtected;

public class TesteModificador {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		ModificadorPrivate mpte = new ModificadorPrivate();
		//o modificador de acesso do atributo nome é private
		//portanto so eh visivel dentro da classe ModificadorPrivate
		//mpte.nome = "Gleidson";
		
		ModificadorPublic mpc = new ModificadorPublic();
		//eh possivel acessar o atributo nome pois foi definido como 
		//public na classe ModificadorPublic
		mpc.nome = "Gleidson";
		
		@SuppressWarnings("unused")
		ModificadorProtected mptc = new ModificadorProtected();
		
		//nao eh possivel pois o modificador foi definido como protected
		//e nao estah no mesmo pacote
		//mptc.nome = "Gleidson";
		
		
	}
	
}
