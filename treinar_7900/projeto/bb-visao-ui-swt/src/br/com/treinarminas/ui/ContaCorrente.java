package br.com.treinarminas.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

import br.com.treinarminas.bb.entitdade.Cliente;
import br.com.treinarminas.controller.ContaController;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;

public class ContaCorrente extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Text taxaManutencao;
	private Text limiteCredito;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public ContaCorrente(Composite parent, int style) {
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
		FormData fd_compositeConta = new FormData();
		fd_compositeConta.bottom = new FormAttachment(0, 135);
		fd_compositeConta.right = new FormAttachment(0, 462);
		fd_compositeConta.top = new FormAttachment(0, 10);
		fd_compositeConta.left = new FormAttachment(0);
		compositeConta.setLayoutData(fd_compositeConta);
		toolkit.adapt(compositeConta);
		toolkit.paintBordersFor(compositeConta);
		
		Label lblTaxaManuteno = new Label(this, SWT.NONE);
		FormData fd_lblTaxaManuteno = new FormData();
		fd_lblTaxaManuteno.right = new FormAttachment(0, 128);
		fd_lblTaxaManuteno.top = new FormAttachment(0, 178);
		fd_lblTaxaManuteno.left = new FormAttachment(0, 23);
		lblTaxaManuteno.setLayoutData(fd_lblTaxaManuteno);
		toolkit.adapt(lblTaxaManuteno, true, true);
		lblTaxaManuteno.setText("Taxa Manuten\u00E7\u00E3o");
		
		taxaManutencao = new Text(this, SWT.BORDER);
		FormData fd_taxaManutencao = new FormData();
		fd_taxaManutencao.right = new FormAttachment(0, 267);
		fd_taxaManutencao.top = new FormAttachment(0, 178);
		fd_taxaManutencao.left = new FormAttachment(0, 134);
		taxaManutencao.setLayoutData(fd_taxaManutencao);
		toolkit.adapt(taxaManutencao, true, true);
		
		Label lblLimiteDeCrdito = new Label(this, SWT.NONE);
		FormData fd_lblLimiteDeCrdito = new FormData();
		fd_lblLimiteDeCrdito.right = new FormAttachment(0, 128);
		fd_lblLimiteDeCrdito.top = new FormAttachment(0, 205);
		fd_lblLimiteDeCrdito.left = new FormAttachment(0, 23);
		lblLimiteDeCrdito.setLayoutData(fd_lblLimiteDeCrdito);
		lblLimiteDeCrdito.setText("Limite de Cr\u00E9dito");
		toolkit.adapt(lblLimiteDeCrdito, true, true);
		
		limiteCredito = new Text(this, SWT.BORDER);
		FormData fd_limiteCredito = new FormData();
		fd_limiteCredito.right = new FormAttachment(0, 267);
		fd_limiteCredito.top = new FormAttachment(0, 205);
		fd_limiteCredito.left = new FormAttachment(0, 134);
		limiteCredito.setLayoutData(fd_limiteCredito);
		toolkit.adapt(limiteCredito, true, true);
		
		Button btnNewButton = new Button(this, SWT.NONE);
		FormData fd_btnNewButton = new FormData();
		fd_btnNewButton.right = new FormAttachment(0, 502);
		fd_btnNewButton.top = new FormAttachment(0, 238);
		fd_btnNewButton.left = new FormAttachment(0, 427);
		btnNewButton.setLayoutData(fd_btnNewButton);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ContaController controller = new ContaController();
				br.com.treinarminas.bb.entitdade.ContaCorrente conta = new br.com.treinarminas.bb.entitdade.ContaCorrente();
				conta.setCliente(new Cliente());
				conta.getCliente().setNome(compositeConta.getNomeCliente().getText());
				conta.setSaldo(Double.parseDouble(compositeConta.getSaldoConta().getText()));
				conta.setTaxaManutencao(Double.parseDouble(taxaManutencao.getText()));
				conta.setLimiteCreditoDisponivel(Double.parseDouble(limiteCredito.getText()));
				controller.cadastrarConta(conta);
			}
		});
		toolkit.adapt(btnNewButton, true, true);
		btnNewButton.setText("Salvar");

	}
}
