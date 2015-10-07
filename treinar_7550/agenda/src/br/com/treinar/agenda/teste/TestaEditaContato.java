package br.com.treinar.agenda.teste;

import java.util.Date;

import br.com.treinar.agenda.dao.ContatoDAO;
import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.util.AgendaException;

public class TestaEditaContato {

	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();
		try {
			Contato c = new Contato();
			c.setId(2l);
			c.setNome("Gleidson");
			c.setDataNascimento(new Date());
			c.setEmail("teste@treinar.com");
			c.setTelefone("(31) 2535-9131");
			dao.atualizar(c);
			System.out.println("Contato removido com sucesso...");
		} catch (AgendaException e) {
			System.err.println("Erro ao remover contato...");
		}
	}
	
}
