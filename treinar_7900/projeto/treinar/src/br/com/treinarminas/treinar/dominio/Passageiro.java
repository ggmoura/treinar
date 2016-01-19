package br.com.treinarminas.treinar.dominio;

public class Passageiro {

	private String nome;
	private FaixaEtaria faixaEtaria;
	private Long cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public FaixaEtaria getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(FaixaEtaria faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

}
