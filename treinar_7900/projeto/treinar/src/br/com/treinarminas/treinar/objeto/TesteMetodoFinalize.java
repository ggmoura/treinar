package br.com.treinarminas.treinar.objeto;

public class TesteMetodoFinalize {

	public static void main(String[] args) throws InterruptedException {
		Aluno a = new Aluno();
		a = null;
		System.gc();
		Thread.sleep(50000);
		System.out.println("Finalizado..." + a);
	}
	
}
