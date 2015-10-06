package br.com.treinar.avancado.atividade.natan;

public class AtividadeThread implements Runnable {
	
	private static int p = 1;

	public static void main(String[] args) {

		AtividadeThread a = new AtividadeThread();

		
		Thread threada = new Thread(a);

		threada.start();

		AtividadeThread b = new AtividadeThread();

		Thread threadb = new Thread(b);

		threadb.start();

	}

	@Override
	public void run() {
		thread1();

	}

	public static void thread1() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Processo: "+p+"\nExecução: " + i);
		}
		p++;
	}

}
