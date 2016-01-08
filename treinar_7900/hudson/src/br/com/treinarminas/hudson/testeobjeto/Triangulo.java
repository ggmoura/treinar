package br.com.treinarminas.hudson.testeobjeto;

public class Triangulo {

	private Double lado1;
	private Double lado2;
	private Double lado3;
	private String tipoTriangulo;

	public Triangulo(Double l1, Double l2, Double l3) {
		this.lado1 = l1;
		this.lado2 = l2;
		this.lado3 = l3;
		tipoTriangulo();
	}

	public Double getLado1() {
		return lado1;
	}

	public void setLado1(Double lado1) {
		this.lado1 = lado1;
	}

	public Double getLado2() {
		return lado2;
	}

	public void setLado2(Double lado2) {
		this.lado2 = lado2;
	}

	public Double getLado3() {
		return lado3;
	}

	public void setLado3(Double lado3) {
		this.lado3 = lado3;
	}

	public String getTipoTriangulo() {
		return tipoTriangulo;
	}

	public void setTipoTriangulo(String tipoTriangulo) {
		this.tipoTriangulo = tipoTriangulo;
	}

	private void tipoTriangulo() {
		if (lado1 == lado2 & lado1 == lado3 & lado2 == lado3) {
			tipoTriangulo = "Equilátero";
		}
	}

}
