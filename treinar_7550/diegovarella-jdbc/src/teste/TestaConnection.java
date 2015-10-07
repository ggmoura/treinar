package teste;

import java.sql.Connection;
import java.sql.DriverManager;


public class TestaConnection {

	public static void main(String[] args) {
		
		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbagenda", "root", "");
			System.out.println("Conexão com o banco de dados estabelecida com sucesso ao bando " + con.getCatalog());
			
		} catch (Exception e) {
			
			System.err.println("Falha ao se conectar com o banco de dados.");
			
		}

		
		
	}

}
