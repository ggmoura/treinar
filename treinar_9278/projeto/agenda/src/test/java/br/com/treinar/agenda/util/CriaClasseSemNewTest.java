package br.com.treinar.agenda.util;

import org.junit.Test;

import br.com.treinar.agenda.modelo.Contato;

public class CriaClasseSemNewTest {

	@Test
	public void testeNew() throws Exception {
	
		Contato c = (Contato) Class.forName("br.com.treinar.agenda.modelo.Contato").newInstance();
		c.setNome("Gleidson");
		System.out.println(c.getNome().equals("Gleidson"));
		
	}
	
}
