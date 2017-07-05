package br.com.treinar.agenda.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Hibernate;

import br.com.treinar.agenda.modelo.Contato;

public class TesteSelect {

	
	public static void main(String[] args) {
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda");
			EntityManager manager = factory.createEntityManager();
			Contato c = manager.find(Contato.class, 1L);
			Hibernate.initialize(c.getTelefones());
			manager.close();
			
//			System.out.println(c.getNome() + " - " + c.getTelefone().getNumero());
			
		} finally {
			System.exit(0);
		}
	}
	
}
