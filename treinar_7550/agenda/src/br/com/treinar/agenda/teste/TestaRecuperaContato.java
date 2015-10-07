package br.com.treinar.agenda.teste;

import br.com.treinar.agenda.dao.ContatoDAO;
import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.util.AgendaException;

public class TestaRecuperaContato {

	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();
		try {
			Contato c = dao.recuperarPorId(3l);
			System.out.println(c);
		} catch (AgendaException e) {
			System.err.println("Erro ao recuperar contato...");
		}
	}
	
}
