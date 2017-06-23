package br.com.treinar.agenda.util;

import java.util.ArrayList;
import java.util.List;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Telefone;
import br.com.treinar.agenda.modelo.TipoTelefone;

public class Database {

	private List<Contato> contatos;
	private static Database instance;
	
	static {
		instance = new Database();
	}
	
	private Database() {
		contatos = new ArrayList<>();
		mock();
	}
	
	public static Database getInstance() {
		return instance;
	}
	
	public List<Contato> recuperarContatos() {
		return contatos;
	}

	private void mock() {
		Contato e = new Contato();
		e.setNome("Maria Sophia");
		Telefone telefone = new Telefone();
		telefone.setDdd(31);
		telefone.setNumero(987749131);
		telefone.setTipo(TipoTelefone.CELULAR);
		e.setTelefone(telefone);
		contatos.add(e);
		
		e = new Contato();
		e.setNome("Davi Lucas");
		telefone = new Telefone();
		telefone.setDdd(31);
		telefone.setNumero(987749132);
		telefone.setTipo(TipoTelefone.CELULAR);
		e.setTelefone(telefone);		
		contatos.add(e);
	}
	
}
