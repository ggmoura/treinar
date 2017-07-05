package br.com.treinar.agenda.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.treinar.agenda.modelo.Contato;

public class TesteQuery {

	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda");
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Contato> contatosQuery = manager.createQuery("select t.contato from Telefone t where t.ddd = :ddd", Contato.class);
		contatosQuery.setParameter("ddd", 31);
		List<Contato> contatos = contatosQuery.getResultList();
		
		TypedQuery<Contato> contatosNomeQuery = manager.createQuery("select new Contato(c.nome) from Contato c", Contato.class);
		List<Contato> contatosNome = contatosNomeQuery.getResultList();
		System.out.println(contatosNome.size());
		
		TypedQuery<Contato> contatosNomeNamedQuery = manager.createNamedQuery("Contato.selecionarTodosOsNomes", Contato.class);
		contatosNome = contatosNomeNamedQuery.getResultList();
		
		System.out.println(contatos.size());
	
	}
	
}
