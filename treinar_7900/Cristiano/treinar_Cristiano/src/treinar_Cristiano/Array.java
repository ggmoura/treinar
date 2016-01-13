package treinar_Cristiano;

import javax.swing.JOptionPane;

public class Array {

	public static void main(String[] args) {

		String[] alunos;
		String nomes = "";
		
		String qtdAlunosStr = JOptionPane.showInputDialog("Informe a quantidade de alunos presentes");
		Integer qtdAlunos = Integer.valueOf(qtdAlunosStr);
		
		alunos = new String[qtdAlunos];
		
		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = JOptionPane.showInputDialog("Aluno " + (i + 1));
		}
		
		/*for (int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i]);
		}*/
		
		for (int i = 0; i < alunos.length; i++) {
			nomes += alunos[i] + " ";
		}
		
		JOptionPane.showMessageDialog(null, nomes);
		
		
	}

}

