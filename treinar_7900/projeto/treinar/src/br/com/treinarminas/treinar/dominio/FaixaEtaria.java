package br.com.treinarminas.treinar.dominio;

public enum FaixaEtaria {

	INFANTIL(0, 12, "Infantil"), 
	ADOLECENTE(13, 18, "Adolecente"), 
	ADULTO(19, 65, "Adulto"), 
	IDOSO(65, "Idoso");

	private Integer idadeMinima;
	private Integer idadeMaxima;
	private String descricao;

	private FaixaEtaria(Integer idadeMinina, Integer idadeMaxima, String descricao) {
		this(idadeMinina, descricao);
		this.idadeMaxima = idadeMaxima;
	}

	private FaixaEtaria(Integer idadeMinina, String descricao) {
		this.idadeMinima = idadeMinina;
		this.descricao = descricao;
	}

	public Integer getIdadeMaxima() {
		return idadeMaxima;
	}

	public Integer getIdadeMinima() {
		return idadeMinima;
	}

	public String getDescricao() {
		return descricao;
	}

	public static FaixaEtaria recuperarPorDescricao(String descricao) {
		
		FaixaEtaria recuperado = null;
		
		for (FaixaEtaria faixa : values()) {
			if (faixa.getDescricao().equals(descricao)) {
				recuperado = faixa;
				break;
			}
		}
		
		if (recuperado != null) {
			return recuperado;
		} else {
			throw new IllegalArgumentException();
		}
	}

}
