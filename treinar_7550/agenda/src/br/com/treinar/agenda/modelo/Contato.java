package br.com.treinar.agenda.modelo;

import java.util.Date;

public class Contato {

	private Long id;
	private String nome;
	private String telefone;
	private String email;
	private Date dataNascimento;

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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", telefone="
				+ telefone + ", email=" + email + ", dataNascimento="
				+ dataNascimento + "]";
	}


}
