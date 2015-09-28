package br.com.treinar.avancado;

import java.util.Scanner;

public class Portaria {

	public static void main(String[] args) {

		Banheiro bM = new Banheiro();
		Banheiro bF = new Banheiro();
		Banheiro ocupado = null;

		bF.setSexo(Sexo.F);
		bM.setSexo(Sexo.M);

		Scanner sc = new Scanner(System.in);
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("F - Feminino\nM -Masculino");
		String sexoPessoa = sc.nextLine();

		Sexo sexo = Sexo.valueOf(sexoPessoa);

		Pessoa p = new Pessoa(nome, sexo);

		if (bF.getSexo().equals(p.getSexo())) {
			bF.setPessoa(p);
			ocupado = bF;
			System.out.println("Você está no banheiro feminino");
		} else if (bM.getSexo().equals(p.getSexo())) {
			bM.setPessoa(p);
			ocupado = bM;
			System.out.println("Você está no banheiro masculino");
		}
		p = null;

		StringBuilder saida = new StringBuilder();
		saida.append("A Pessoa ");
		saida.append(ocupado.getPessoa().getNome());
		saida.append(" do sexo ");
		saida.append(ocupado.getPessoa().getSexo().getDescricao());

		saida.append(" Está no banheiro ").append(ocupado.getSexo().getDescricao());

		// saida.append(ocupado.getSexo() == 0 ? "Feminino" : "Masculino");

		System.out.println(saida);

		// saida.append(ocupado.getPessoa().getSexo() == 0 ? "Feminino" :
		// "Masculino");

		// System.out.println("A pessoa " + ocupado.getPessoa().getNome());
		sc.close();

	}

}
