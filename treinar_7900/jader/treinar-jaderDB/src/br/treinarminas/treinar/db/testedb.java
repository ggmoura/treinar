package br.treinarminas.treinar.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testedb {

	public static void main(String[] args) throws SQLException {

			
		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/bb", "root", "");
		
		if(conexao != null){
			System.out.println("Conectado!");
		}
		
		conexao.close();
	}

}
