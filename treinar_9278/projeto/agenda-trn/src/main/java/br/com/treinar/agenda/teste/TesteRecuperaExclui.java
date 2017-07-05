package br.com.treinar.agenda.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.treinar.agenda.modelo.Contato;

public class TesteRecuperaExclui {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();    
		
		Contato c = manager.find(Contato.class, Long.valueOf(1));
//		Contato c = manager.getReference(Contato.class, 2L);
		
		manager.remove(c);
		
		manager.getTransaction().commit();
		System.exit(0);
	}
	
}
