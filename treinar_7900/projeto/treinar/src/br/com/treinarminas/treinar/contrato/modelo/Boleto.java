package br.com.treinarminas.treinar.contrato.modelo;

import java.util.Date;

public class Boleto extends Debito implements IEmail, IInposto {

	private Date dataVencimento;

	private String numeracao;

	private Cliente cliente;

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(String numeracao) {
		this.numeracao = numeracao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String textoDoEmail() {
		return "Email boleto bla bla bla...";
	}
	
	@Override
	public String gerarTextoEmail() {
		return "Email boleto bla bla bla...";
	}

	@Override
	public String enderecoEmail() {
		return cliente.getEmail();
	}

	@Override
	public String assuntoEmail() {
		return "Geração de Boleto";
	}

	@Override
	public void tarifar() {
		setValor(getValor() * 0.95);
	}

}
