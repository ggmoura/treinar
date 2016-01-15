package br.com.treinarminas.ui;

import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;

public class CadastroConta extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Text nomeCliente;
	private Text saldoConta;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public CadastroConta(Composite parent, int style) {
		super(parent, style);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new FormLayout());
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		FormData fd_lblNewLabel = new FormData();
		fd_lblNewLabel.left = new FormAttachment(0, 11);
		fd_lblNewLabel.top = new FormAttachment(0, 20);
		lblNewLabel.setLayoutData(fd_lblNewLabel);
		toolkit.adapt(lblNewLabel, true, true);
		lblNewLabel.setText("Nome");
		
		nomeCliente = new Text(this, SWT.BORDER);
		fd_lblNewLabel.right = new FormAttachment(100, -384);
		FormData fd_nomeCliente = new FormData();
		fd_nomeCliente.top = new FormAttachment(lblNewLabel, -3, SWT.TOP);
		fd_nomeCliente.right = new FormAttachment(lblNewLabel, 278, SWT.RIGHT);
		fd_nomeCliente.left = new FormAttachment(lblNewLabel, 21);
		nomeCliente.setLayoutData(fd_nomeCliente);
		toolkit.adapt(nomeCliente, true, true);
		
		Label lblNewLabel_1 = new Label(this, SWT.NONE);
		FormData fd_lblNewLabel_1 = new FormData();
		fd_lblNewLabel_1.top = new FormAttachment(lblNewLabel, 39);
		fd_lblNewLabel_1.right = new FormAttachment(lblNewLabel, 0, SWT.RIGHT);
		lblNewLabel_1.setLayoutData(fd_lblNewLabel_1);
		toolkit.adapt(lblNewLabel_1, true, true);
		lblNewLabel_1.setText("Saldo");
		
		saldoConta = new Text(this, SWT.BORDER);
		FormData fd_saldoConta = new FormData();
		fd_saldoConta.left = new FormAttachment(nomeCliente, 0, SWT.LEFT);
		fd_saldoConta.top = new FormAttachment(nomeCliente, 36);
		fd_saldoConta.right = new FormAttachment(nomeCliente, -181, SWT.RIGHT);
		saldoConta.setLayoutData(fd_saldoConta);
		toolkit.adapt(saldoConta, true, true);

	}

	public Text getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(Text nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Text getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(Text saldoConta) {
		this.saldoConta = saldoConta;
	}

}
