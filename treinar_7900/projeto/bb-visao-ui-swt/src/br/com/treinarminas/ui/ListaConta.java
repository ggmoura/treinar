package br.com.treinarminas.ui;

import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;

import br.com.treinarminas.bb.entitdade.core.Conta;
import br.com.treinarminas.controller.ContaController;
import org.eclipse.swt.widgets.Label;

public class ListaConta extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Table table;
	private Conta[] contas;
	private ContaController controller;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public ListaConta(Composite parent, int style) {
		super(parent, style);
		controller = new ContaController();
		contas = controller.recuperarContas();
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		
		TableViewer tableViewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION);
		tableViewer.setColumnProperties(new String[] {"Nome", "Saldo"});
		table = tableViewer.getTable();
		table.setBounds(10, 22, 440, 268);
		toolkit.paintBordersFor(table);

	}
}
