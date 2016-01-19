package br.treinarminas.treinar.exempleEnum;

public enum FaixaEtaria {
	
	INFANTIL(0, 12, "Infantil"), ADOLECENTE(13, 18, "Adolescente"), ADULTO(19, 65, "Adulto"), IDOSO(66, "Idoso");
	
	private Integer idadeMinima;
	private Integer idadeMaxima;
	private String descricao;
	
	private FaixaEtaria(Integer idadeMinima, Integer idadeMaxima, String descricao) {
		this.idadeMinima = idadeMinima;
		this.idadeMaxima = idadeMaxima;
		this.descricao = descricao;
	}
	
	private FaixaEtaria(Integer idadeMinima, String descricao) {
		this.idadeMinima = idadeMinima;
		this.descricao = descricao;
	}
	
	public Integer getIdadeMinima() {
		return idadeMinima;
	}
	
	public Integer getIdadeMáxima() {
		return idadeMaxima;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
