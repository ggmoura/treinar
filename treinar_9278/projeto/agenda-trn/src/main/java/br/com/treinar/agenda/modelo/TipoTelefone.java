package br.com.treinar.agenda.modelo;

public enum TipoTelefone {

	RESIDENCIAL("Residencial"), 
	CELULAR("Celular"), 
	COMERCIAL("Comercial");

	private String descricao;

	private TipoTelefone(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
