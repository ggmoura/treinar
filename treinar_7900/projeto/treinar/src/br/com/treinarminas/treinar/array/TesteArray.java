package br.com.treinarminas.treinar.array;

import javax.swing.JOptionPane;

public class TesteArray {

	public static void main(String[] args) {

		String[] alunos;
		
		String qtdAlunosStr = JOptionPane
				.showInputDialog("Informe a quantidade de alunos presentes");

		Integer qtdAlunos = Integer.valueOf(qtdAlunosStr);
		
		alunos = new String[qtdAlunos];
		
		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = JOptionPane.showInputDialog("Aluno " + (i + 1) + " de " + qtdAlunos);
		}

		System.out.println("utilizando for iterate over array");
		for (int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i]);
		}
		
		System.out.println("utilizando foreach...");
		for (String nome : alunos) {
			System.out.println(nome);
		}
		

	}

}
