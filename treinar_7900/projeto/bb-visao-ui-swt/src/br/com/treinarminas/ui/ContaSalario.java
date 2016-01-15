package br.com.treinarminas.ui;

import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import br.com.treinarminas.bb.entitdade.Cliente;
import br.com.treinarminas.controller.ContaController;

public class ContaSalario extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public ContaSalario(Composite parent, int style) {
		super(parent, style);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new FormLayout());
		
		CadastroConta compositeConta = new CadastroConta(this, SWT.NONE);
		FormData fd_composite = new FormData();
		fd_composite.bottom = new FormAttachment(0, 246);
		fd_composite.right = new FormAttachment(0, 440);
		fd_composite.top = new FormAttachment(0);
		fd_composite.left = new FormAttachment(0);
		compositeConta.setLayoutData(fd_composite);
		toolkit.adapt(compositeConta);
		toolkit.paintBordersFor(compositeConta);
		
		Button btnSalvar = new Button(compositeConta, SWT.NONE);
		btnSalvar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ContaController controller = new ContaController();
				br.com.treinarminas.bb.entitdade.ContaSalario conta = new br.com.treinarminas.bb.entitdade.ContaSalario();
				conta.setCliente(new Cliente());
				conta.getCliente().setNome(compositeConta.getNomeCliente().getText());
				conta.setSaldo(Double.parseDouble(compositeConta.getSaldoConta().getText()));
				controller.cadastrarConta(conta);
			}
		});
		FormData fd_btnSalvar = new FormData();
		fd_btnSalvar.top = new FormAttachment(compositeConta.getNomeCliente(), 91);
		fd_btnSalvar.right = new FormAttachment(100, -164);
		btnSalvar.setLayoutData(fd_btnSalvar);
		toolkit.adapt(btnSalvar, true, true);
		btnSalvar.setText("Salvar");

	}

}
