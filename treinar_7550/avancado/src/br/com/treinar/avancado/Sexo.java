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
	
	public static Sexo recuperarSexoPorOrdinal(Integer ordinal) {
		try {
			return values()[ordinal];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new IllegalArgumentException();
		}
	}
	
	
}
