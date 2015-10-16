package br.com.treinar.agenda.mb;

import javax.faces.bean.ManagedBean;

import br.com.treinar.modelo.Contato;
import br.com.treinar.modelo.Pessoa;
import br.com.treinar.modelo.Telefone;

@ManagedBean
public class CadastroContatoMB {

	private Contato contato;

	public CadastroContatoMB() {
		contato = new Contato();
		contato.setTelefone(new Telefone());
		contato.setPessoa(new Pessoa());
	}
	
	public void gravarContato() {
		System.out.println("O contato " + contato.getPessoa().getNome() + " será gravado");
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
