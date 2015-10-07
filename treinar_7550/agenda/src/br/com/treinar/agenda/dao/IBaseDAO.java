package br.com.treinar.agenda.dao;

import java.util.List;

import br.com.treinar.agenda.util.AgendaException;

public interface IBaseDAO<T, ID> {

	void gravar(T obj) throws AgendaException;
	
	List<T> recuperarLista() throws AgendaException;
	
	void remover(T obj) throws AgendaException;
	
	void atualizar(T obj) throws AgendaException;
	
	T recuperarPorId(ID id) throws AgendaException;

}
