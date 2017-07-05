package br.com.treinar.agenda.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Telefone;
import br.com.treinar.agenda.modelo.TipoTelefone;

public class TesteJPA {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();    
		
		Telefone t = new Telefone(31, 987749131);
		t.setTipo(TipoTelefone.CELULAR);
		
		Telefone t2 = new Telefone(38, 987749131);
		t2.setTipo(TipoTelefone.RESIDENCIAL);
//		Não gravei no banco o telefone
//		manager.persist(t);
//		manager.persist(t2);
		
		Contato c = new Contato();
		c.setNome("Maria Sophia");
		c.setTelefone(t);
		
		manager.persist(c);
		
		Contato c2 = new Contato();
		c2.setNome("Davi Lucas");
		c2.setTelefone(t2);
		
		manager.persist(c2);
		manager.getTransaction().commit(); 
		
		System.exit(0);
	}
	
}
