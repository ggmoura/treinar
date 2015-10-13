package br.com.treinar.modelo;


public enum TipoTelefone {

	RESIDENCIAL("Residencial"),
	COMERCIAL("Comercial"),
	CELULAR("Celular");

	private TipoTelefone(String descricao) {
		this.descricao = descricao;
	}

	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	
	/**
	 * Recupera o tipo de telefone a partir da descricao interna
	 * @param ordinal posicao do objeto no array values()
	 * @return Um <code>TipoTelefone</code> de acordo com a posicao 
	 * 		   passada como parametro
	 */
	public static TipoTelefone recuperarTipoTelefonePorOrdinal(Integer ordinal) {
		try {
			return values()[ordinal];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new IllegalArgumentException();
		}
	}
	
}
