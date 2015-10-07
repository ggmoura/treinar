package br.com.treinar.agenda.teste;

import java.util.List;

import br.com.treinar.agenda.dao.ContatoDAO;
import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.util.AgendaException;

public class TestaListaContato {

	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();
		try {
			List<Contato> contatos = dao.recuperarContatos();
			for (Contato contato : contatos) {
				System.out.println(contato);
			}
		} catch (AgendaException e) {
			System.err.println("Erro ao recuperar lista de contatos...");
		}
	}
	
}
