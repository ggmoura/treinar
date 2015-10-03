package br.com.treinar.avancado;

import javax.swing.JOptionPane;

public class OlaMundo {

	public static void main(String[] args) {
		Pessoa p = new Pessoa(Sexo.F);
		p.setNome(Messages.getString("OlaMundo.0")); //$NON-NLS-1$
		StringBuilder sb = new StringBuilder();
		
		sb.append(Messages.getString("OlaMundo.1")).append(p.getNome()).append(Messages.getString("OlaMundo.2")); //$NON-NLS-1$ //$NON-NLS-2$
		
		JOptionPane.showMessageDialog(null, sb.toString());
	}
	
}
