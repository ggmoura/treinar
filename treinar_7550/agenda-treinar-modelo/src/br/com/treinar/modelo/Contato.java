package br.com.treinar.modelo;

import java.io.Serializable;

public class Contato implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Telefone telefone;
	private Pessoa pessoa;
	private String endereco;
	private String email;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
