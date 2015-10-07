package br.com.treinar.agenda.teste;

import br.com.treinar.agenda.dao.ContatoDAO;
import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.util.AgendaException;

public class TestaExcluiContato {

	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();
		try {
			Contato c = new Contato();
			c.setId(1l);
			dao.remover(c);
			System.out.println("Contato removido com sucesso...");
		} catch (AgendaException e) {
			System.err.println("Erro ao remover contato...");
		}
	}
	
}
