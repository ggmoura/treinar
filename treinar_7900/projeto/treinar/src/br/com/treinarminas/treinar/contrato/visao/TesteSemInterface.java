package br.com.treinarminas.treinar.contrato.visao;

import java.util.Date;

import br.com.treinarminas.treinar.contrato.modelo.Boleto;
import br.com.treinarminas.treinar.contrato.modelo.Cliente;
import br.com.treinarminas.treinar.contrato.modelo.NotaPromissoria;

public class TesteSemInterface {

	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		c.setNome("Juan Pablo");
		
		Boleto b = new Boleto();
		b.setCliente(c);
		b.setDataVencimento(new Date());
		b.setValor(120.0);
		b.setNumeracao("321321.132132.321.321.321.3213213");
		
		enviarEmailBoleto(b);
		
		NotaPromissoria np = new NotaPromissoria();
		np.setCliente(c);
		np.setDataVencimento(new Date());
		np.setValor(15.5);
		
		enviarEmailNotaPromissoria(np);
		
	}
	
	
	public static void enviarEmailNotaPromissoria(NotaPromissoria np) {
		System.out.println(np.textoEmailEnviadoCliente());
	}
	
	public static void enviarEmailBoleto(Boleto b) {
		System.out.println(b.textoDoEmail());		
	}
	
}
