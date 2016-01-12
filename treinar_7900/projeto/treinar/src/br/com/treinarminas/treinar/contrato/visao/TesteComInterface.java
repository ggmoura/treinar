package br.com.treinarminas.treinar.contrato.visao;

import java.util.Date;

import br.com.treinarminas.treinar.contrato.modelo.Boleto;
import br.com.treinarminas.treinar.contrato.modelo.Cliente;
import br.com.treinarminas.treinar.contrato.modelo.IEmail;
import br.com.treinarminas.treinar.contrato.modelo.ITarifador;
import br.com.treinarminas.treinar.contrato.modelo.NotaPromissoria;

public class TesteComInterface {

	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		c.setNome("Juan Pablo");
		
		Boleto b = new Boleto();
		b.setCliente(c);
		b.setDataVencimento(new Date());
		b.setValor(120.0);
		b.setNumeracao("321321.132132.321.321.321.3213213");
		
		enviarEmail(b);
		
		NotaPromissoria np = new NotaPromissoria();
		np.setCliente(c);
		np.setDataVencimento(new Date());
		np.setValor(15.5);
		
		enviarEmail(np);
		
		tarifarCobranca(np);
		tarifarCobranca(b);
	
		System.out.println(np.getValor());
		System.out.println(b.getValor());
		
		//Cliente nao cumpriu o contrato IEMail portanto
		//nao pode ser passado como parametro para o 
		//metodo de envio de emails
		//enviarEmail(c);
		
	}
	
	
	public static void enviarEmail(IEmail email) {
		System.out.println(email.assuntoEmail());
		System.out.println(email.enderecoEmail());
		System.out.println(email.gerarTextoEmail());
	}
	
	public static void tarifarCobranca(ITarifador conta) {
		conta.tarifar();
	}
	
}
