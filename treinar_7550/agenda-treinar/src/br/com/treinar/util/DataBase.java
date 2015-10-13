package br.com.treinar.util;

import java.util.ArrayList;
import java.util.List;

import br.com.treinar.modelo.Contato;

public class DataBase {

	private static DataBase instace;
	private List<Contato> contatos;
	
	private DataBase() {
		contatos = new ArrayList<>();
	}
	
	static {
		instace = new DataBase();
	}
	
	public static DataBase getInstance() {
		return instace;
	}
	
	public void adicionarContato(Contato contato) {
		contatos.add(contato);
	}

	public Object recuperarContatos() {
		return contatos;
	}
	
	
	
}
