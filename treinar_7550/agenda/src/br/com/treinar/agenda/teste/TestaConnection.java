package br.com.treinar.agenda.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.treinar.agenda.util.ConnectionFactory;

public class TestaConnection {

	
	public static void main(String[] args) {
		ConnectionFactory factory = ConnectionFactory.getInstance();
		try {
			Connection c = factory.getConnection();
			System.out.println("Conectado..." + c.getCatalog());
		} catch (SQLException e) {
			System.err.println("Erro ao se conectar com o banco de dados...");
			e.printStackTrace();
		}
		
	}
	
	
}
