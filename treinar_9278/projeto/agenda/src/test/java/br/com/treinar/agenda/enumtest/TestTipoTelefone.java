package br.com.treinar.agenda.enumtest;

import org.junit.Assert;
import org.junit.Test;

import br.com.treinar.agenda.modelo.TipoTelefone;

public class TestTipoTelefone {

	
	@Test
	public void testNewEnum() {
		TipoTelefone CELULAR = TipoTelefone.CELULAR;
		Assert.assertEquals(TipoTelefone.CELULAR, CELULAR);
	}
	
	@Test
	public void testValueOf() {
		TipoTelefone CELULAR = TipoTelefone.valueOf("CELULAR");
		Assert.assertEquals(TipoTelefone.CELULAR, CELULAR);
	}
	
}
