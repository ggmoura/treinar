package br.com.treinarminas.hudson.arrays;

import javax.swing.JOptionPane;

public class TesteArray {

	public static void main(String[] args) {

		String[] alunos;

		String qtdAlunosStr = JOptionPane
				.showInputDialog("Informe a quantidade de alunos presentes");

		Integer qtdAlunos = Integer.valueOf(qtdAlunosStr);

		alunos = new String[qtdAlunos];

		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = JOptionPane.showInputDialog("Aluno " + (i + 1));
		}
		StringBuilder str = new StringBuilder();
		for (int j = 0; j < alunos.length; j++) {
			str.append("Aluno " + (j + 1) + " - Nome: " + alunos[j] + "\n");
		}

		JOptionPane.showMessageDialog(null, str);

	}

}
