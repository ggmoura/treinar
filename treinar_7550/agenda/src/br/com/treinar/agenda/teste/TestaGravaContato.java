package br.com.treinar.agenda.teste;

import java.util.Calendar;

import br.com.treinar.agenda.dao.ContatoDAO;
import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.util.AgendaException;

public class TestaGravaContato {

	public static void main(String[] args) {
		Contato c = new Contato();
		c.setNome("Isabela");
		c.setTelefone("(31) 8774-9131");
		c.setEmail("gleidson.gmoura@gmail.com");
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 9);
		calendar.set(Calendar.MONTH, 11);
		calendar.set(Calendar.YEAR, 1980);
	
		c.setDataNascimento(calendar.getTime());
		
		ContatoDAO dao = new ContatoDAO();
		try {
			dao.gravarContato(c);
			System.out.println("Contato [id:" + c.getId()+ "] gravado com sucesso!!!");
		} catch (AgendaException e) {
			System.err.println("Erro ao gravar o contato...");
		}
		
	}
	
}
