package br.com.treinar.agenda.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.util.AgendaException;
import br.com.treinar.agenda.util.ConnectionFactory;

public class ContatoDAO implements IBaseDAO<Contato, Long> {

	private ConnectionFactory instance;

	public ContatoDAO() {
		instance = ConnectionFactory.getInstance();
	}

	public void gravar(Contato contato) throws AgendaException {
		try {
			Connection con = instance.getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("insert into contato ");
			sql.append("(nome, email, telefone, dataNascimento) ");
			sql.append("values (?, ?, ?, ?)");

			PreparedStatement stmt = con.prepareStatement(sql.toString(),
					Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getTelefone());
			stmt.setDate(4, new java.sql.Date(contato.getDataNascimento()
					.getTime()));

			// executa
			stmt.execute();
			ResultSet rs = stmt.getGeneratedKeys();
			if (rs.next()) {
				contato.setId(rs.getLong(1));
			}

			stmt.close();

		} catch (SQLException e) {
			AgendaException ae = new AgendaException();
			throw ae;
		}
	}

	public List<Contato> recuperarLista() throws AgendaException {
		PreparedStatement stmt;
		ResultSet rs;
		List<Contato> contatos = null;
		try {
			Connection con = instance.getConnection();
			stmt = con.prepareStatement("select * from contato");
			rs = stmt.executeQuery();
			contatos = new ArrayList<Contato>();
			Contato contato = null;
			while (rs.next()) {

				// criando o objeto Contato
				contato = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setTelefone(rs.getString("telefone"));

				// montando a data através do Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data.getTime());

				// adicionando o objeto à lista
				contatos.add(contato);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			throw new AgendaException();
		}
		return contatos;
	}
	
	public void remover(Contato contato) throws AgendaException {
		try {
			Connection con = instance.getConnection();
			PreparedStatement stmt = con.prepareStatement("delete from contato where id = ?");
			stmt.setLong(1, contato.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new AgendaException();
		}
	}
	
	public void atualizar(Contato contato) throws AgendaException {
		String sql = "update contato set nome=?, email=?, telefone=?," +
				"dataNascimento=? where id=?";
		try {
			Connection con = instance.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getTelefone());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTime()));
			stmt.setLong(5, contato.getId());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new AgendaException();
		}
	}

	@Override
	public Contato recuperarPorId(Long id) throws AgendaException {
		PreparedStatement stmt;
		ResultSet rs;
		try {
			Connection con = instance.getConnection();
			stmt = con.prepareStatement("select * from contato c where id = ?");
			stmt.setLong(1, id);
			rs = stmt.executeQuery();
			Contato contato = null;
			if (rs.next()) {

				// criando o objeto Contato
				contato = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setTelefone(rs.getString("telefone"));

				// montando a data através do Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data.getTime());

			}
			rs.close();
			stmt.close();
			return contato;
		} catch (SQLException e) {
			throw new AgendaException();
		}
	}

}
