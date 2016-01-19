package br.com.treinarminas.treinar.collections.modelo;

public class Carro implements Comparable<Carro> {

	private String chassi;
	private Double valor;
	private String cor;
	private String marca;
	private String modelo;

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chassi == null) ? 0 : chassi.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		if (chassi == null) {
			if (other.chassi != null)
				return false;
		} else if (!chassi.equals(other.chassi))
			return false;
		return true;
	}
	@Override
	public int compareTo(Carro o) {
		return this.chassi.compareTo(o.chassi);
	}
}
