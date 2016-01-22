package br.com.treinarminas.bb.entitdade;

import java.util.Date;

import br.com.treinarminas.bb.entitdade.core.IEntity;
import br.com.treinarminas.bb.entitdade.util.IArquivo;

public class Cliente implements IEntity, IArquivo {

	private static final long serialVersionUID = 1L;

	private String nome;
	private Long cpf;
	private Long id;
	private Date dataNascimetno;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Date getDataNascimetno() {
		return dataNascimetno;
	}

	public void setDataNascimetno(Date dataNascimetno) {
		this.dataNascimetno = dataNascimetno;
	}

	@Override
	public String csv() {
		StringBuilder csv = new StringBuilder();
		csv.append(nome).append(";").append(cpf);
		return csv.toString();
	}

}
