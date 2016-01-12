package br.com.treinarminas.treinar.contrato.modelo;

import java.util.Date;

public class NotaPromissoria extends Debito implements IEmail, ITarifador {
	
	private Date dataVencimento;
	
	private Cliente cliente;

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String textoEmailEnviadoCliente() {
		return "Nota Promissoria gerada bla bla bla...	";
	}
	
	@Override
	public String gerarTextoEmail() {
		return "Nota Promissoria gerada bla bla bla...	";
	}

	@Override
	public String enderecoEmail() {
		return cliente.getEmail();
	}

	@Override
	public String assuntoEmail() {
		return "Nota Promissoria Gerada...";
	}
	@Override
	public void tarifar() {
		setValor(getValor() * 0.95); 
	}
}
