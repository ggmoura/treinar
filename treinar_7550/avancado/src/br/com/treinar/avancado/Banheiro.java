package br.com.treinar.avancado;

public class Banheiro implements Comparable<Banheiro> {

	private String papel;
	private Sexo sexo;
	private String pia;
	private Pessoa pessoa;

	public String getPapel() {
		return papel;
	}

	public void setPapel(String papel) {
		this.papel = papel;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getPia() {
		return pia;
	}

	public void setPia(String pia) {
		this.pia = pia;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	@Override
	public int compareTo(Banheiro o) {
		return sexo.ordinal() - o.sexo.ordinal();
	}
}
