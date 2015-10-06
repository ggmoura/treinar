package br.com.treinar.avancado.aula.swing;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class WindowAdapterImpl extends WindowAdapter {

	public void windowClosing(WindowEvent windowEvent) {
		JOptionPane.showMessageDialog(null, "Obrigado In class...");
		System.exit(0);
	}
	
}
