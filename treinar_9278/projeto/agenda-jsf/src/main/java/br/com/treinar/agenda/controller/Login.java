package br.com.treinar.agenda.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import javafx.scene.AccessibleAttribute;

@SessionScoped
@ManagedBean(eager = true)
public class Login {

	private String nome;

	public Login() {
		this.nome = "Maria Sophia";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String acessar() {
		return "/pages/contato.xhtml";
	}

}
