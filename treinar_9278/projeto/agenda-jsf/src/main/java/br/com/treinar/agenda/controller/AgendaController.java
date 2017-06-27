package br.com.treinar.agenda.controller;

import javax.faces.bean.ManagedBean;

import br.com.treinar.agenda.modelo.Contato;

@ManagedBean
public class AgendaController {

	private Contato contato;
	
	public AgendaController() {
		contato = new Contato();
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public void salvarContato() {
		System.out.println(contato.getNome());
	}
	
}
