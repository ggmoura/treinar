package br.com.treinar.itau.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.treinar.itau.exception.ItauException;
import br.com.treinar.itau.modelo.principal.Pessoa;

public class PessoaDAO extends GenericDAO<Pessoa, Long> {

	public PessoaDAO(Connection connection) {
		super(connection);
	}

	@Override
	public Pessoa recuperar(Long id) {
		return null;
	}

	@Override
	public Pessoa gravar(Pessoa entity) throws ItauException, Exception {
		String sql = "insert into pessoa (nome, cpf) values (?, ?)";
		PreparedStatement stmt = null;
		try {
			//connexao.setAutoCommit(Boolean.FALSE);;
			stmt = getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			stmt.setString(1, entity.getNome());
			stmt.setLong(2, entity.getCpf());
			stmt.execute();
			// recupera chave do objeto
			ResultSet rs = stmt.getGeneratedKeys();
			if(rs.next()) {
				entity.setId(Long.valueOf(rs.getInt(1)));
			}
			stmt.close();
			return entity;
		} catch (SQLException e) {
			throw new ItauException(e);
		}
	}

	@Override
	public void remover(Long id) {

	}

	@Override
	public void editar(Pessoa entity) {

	}

	@Override
	public void excluir(Long id) {

	}

	@Override
	public List<Pessoa> recuperarTodos() {
		return null;
	}

}