package br.com.treinar.agenda.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;

public class TesteException {

	@Test
	public void enviarMalaDireta() throws BancoException {
		Logger.getLogger("TesteException").log(Level.INFO, "Exception");
	}

	@Test
	public void sacar() throws SaldoInsuficienteException {
		Logger.getLogger("TesteException").log(Level.INFO, "pode ou nao ter sacado");
		throw new SaldoInsuficienteException();
	}

	public void testChecked() {
		try {
			enviarMalaDireta();
		} catch (BancoException e) {

		}
	}

	public void testUnChecked() throws SaldoInsuficienteException {
		sacar();
	}

	public void testeSacar() throws SaldoInsuficienteException {
		try {
			testUnChecked();
		} catch (Exception e) {
			Assert.assertTrue(e instanceof SaldoInsuficienteException);
		}
	}

}
