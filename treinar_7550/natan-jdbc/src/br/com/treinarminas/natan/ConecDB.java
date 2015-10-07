package br.com.treinarminas.natan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConecDB {

	
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbagenda", "root","");
		
		if(con != null){
			System.out.println("conectou");
		}
	}
	
	
}
