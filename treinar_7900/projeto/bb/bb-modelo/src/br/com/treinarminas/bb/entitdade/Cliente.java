package br.com.treinarminas.bb.entitdade;

import br.com.treinarminas.bb.entitdade.util.IArquivo;

public class Cliente implements IArquivo {

	private String nome;
	private Long cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	@Override
	public String csv() {
		StringBuilder csv = new StringBuilder();
		csv.append(nome).append(";").append(cpf);
		return csv.toString();
	}

}
