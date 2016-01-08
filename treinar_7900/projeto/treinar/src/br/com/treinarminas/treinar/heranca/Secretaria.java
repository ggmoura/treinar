package br.com.treinarminas.treinar.heranca;

import br.com.treinarminas.treinar.heranca.testeprotected.Funcionario;

public class Secretaria extends Funcionario {

	private String departamento;

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
