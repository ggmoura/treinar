package br.com.treinar.agenda.controller;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Telefone;
import br.com.treinar.agenda.modelo.TipoTelefone;

@ViewScoped
@ManagedBean
public class AgendaController {

	private Contato contato;
	// private String telefoneStr;

	@ManagedProperty(value = "#{login}")
	private Login login;

	public AgendaController() {
		contato = new Contato();
		contato.setDataNascimento(new Date());
		contato.setTelefone(new Telefone(31, 987749131));
		contato.getTelefone().setTipo(TipoTelefone.CELULAR);
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public void salvarContato() {
		System.out.println(contato.getNome());
		// contato.getTelefone().setTipo(TipoTelefone.valueOf(telefoneStr));
		System.out.println("Usuario logado: " + login.getNome());
		FacesMessage message = new FacesMessage("Contato salvo...");
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, message);

	}

	public String navegar() {
		System.out.println("Usuario logado: " + login.getNome());
		return "/pages/novo_contato.xhtml";
	}
	
	public void setLogin(Login login) {
		this.login = login;
	}

}
