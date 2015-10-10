package br.com.treinar.agenda.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static ConnectionFactory factory;

	static {
		factory = new ConnectionFactory();
	}
	
	private ConnectionFactory() {
		super();
	}
	
	public static ConnectionFactory getInstance() {
		return factory;
	}
	
	public Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbagenda", "root", "");
		return connection;
	}
	
	
}
