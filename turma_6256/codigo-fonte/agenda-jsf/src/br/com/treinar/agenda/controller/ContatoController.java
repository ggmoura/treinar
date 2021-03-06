package br.com.treinar.agenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.agenda.modelo.Contato;
import br.com.agenda.modelo.Pessoa;
import br.com.agenda.modelo.Telefone;
import br.com.treinar.agenda.modelo.Acao;

@ManagedBean
@ViewScoped
public class ContatoController {

	private Contato contato;
	private List<Contato> contatos;
	private Acao acao;

	public ContatoController() {
		contatos = new ArrayList<Contato>();
		criarNovoContato();
	}

	public void novo() {
		acao = Acao.CADASTRAR;
	}

	private void criarNovoContato() {
		contato = new Contato();
		contato.setPessoa(new Pessoa());
		contato.setTelefone(new Telefone());
	}

	public void salvar() {
		contatos.add(contato);
		criarNovoContato();
		FacesMessage message = new FacesMessage("Contato salvo com sucesso!");
		FacesContext.getCurrentInstance().addMessage(null, message);
		acao = Acao.LISTAR;
	}

	public Acao getAcao() {
		return acao;
	}

	public void setAcao(Acao acao) {
		this.acao = acao;
	}

	public void editar(Contato contato) {
		this.contato = contato;
		acao = Acao.EDITAR;
	}

	public void excluir(Contato contato) {
		contatos.remove(contato);
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

}
