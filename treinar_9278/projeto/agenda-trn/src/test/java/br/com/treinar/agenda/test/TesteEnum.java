package br.com.treinar.agenda.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.treinar.agenda.modelo.TipoTelefone;

public class TesteEnum {

	@Test
	public void testeEnumOrdinal() {
		TipoTelefone tt = TipoTelefone.values()[0];
		Assert.assertEquals(TipoTelefone.RESIDENCIAL, tt);
	}
	
}
