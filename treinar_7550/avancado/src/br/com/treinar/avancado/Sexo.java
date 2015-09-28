package br.com.treinar.avancado;

public enum Sexo {

	
	F("Feminino"),
	M("Masculino");

	private Sexo(String descricao) {
		this.descricao = descricao;
	}

	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	
	
}
