package br.com.treinar.avancado.aula.thread;


public class MeuPrograma {
	public static void main(String[] args) {

		StringBuffer texto = new StringBuffer();

		GeraPDF gerapdf = new GeraPDF();
		gerapdf.setTexto(texto);
		gerapdf.setCodigoProcesso(1);
		Thread threadDoPdf = new Thread(gerapdf);
		threadDoPdf.start();
		
		BarraDeProgresso barraDeProgresso = new BarraDeProgresso();
		barraDeProgresso.setTexto(texto);
		barraDeProgresso.setCodigoProcesso(2);
		Thread threadDaBarra = new Thread(barraDeProgresso);
		threadDaBarra.start();

		System.out.println(texto.toString() + "\n" + "Fim...");

	}
}