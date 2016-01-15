package br.com.treinarminas.ui;

import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import br.com.treinarminas.bb.entitdade.Cliente;
import br.com.treinarminas.controller.ContaController;

public class ContaInvestimento extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Text taxaManutencao;
	private Text taxaRendimento;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public ContaInvestimento(Composite parent, int style) {
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
		fd_composite.bottom = new FormAttachment(0, 134);
		fd_composite.right = new FormAttachment(0, 460);
		fd_composite.top = new FormAttachment(0, 10);
		fd_composite.left = new FormAttachment(0, 10);
		compositeConta.setLayoutData(fd_composite);
		toolkit.adapt(compositeConta);
		toolkit.paintBordersFor(compositeConta);
		
		Label lblTaxaManuteno = new Label(this, SWT.NONE);
		FormData fd_lblTaxaManuteno = new FormData();
		fd_lblTaxaManuteno.bottom = new FormAttachment(0, 163);
		fd_lblTaxaManuteno.right = new FormAttachment(0, 124);
		fd_lblTaxaManuteno.top = new FormAttachment(0, 140);
		fd_lblTaxaManuteno.left = new FormAttachment(0, 20);
		lblTaxaManuteno.setLayoutData(fd_lblTaxaManuteno);
		toolkit.adapt(lblTaxaManuteno, true, true);
		lblTaxaManuteno.setText("Taxa Manuten\u00E7\u00E3o");
		
		taxaManutencao = new Text(this, SWT.BORDER);
		FormData fd_taxaManutencao = new FormData();
		fd_taxaManutencao.right = new FormAttachment(0, 261);
		fd_taxaManutencao.top = new FormAttachment(0, 142);
		fd_taxaManutencao.left = new FormAttachment(0, 130);
		taxaManutencao.setLayoutData(fd_taxaManutencao);
		toolkit.adapt(taxaManutencao, true, true);
		
		Label lblTaxaRendimento = new Label(this, SWT.NONE);
		FormData fd_lblTaxaRendimento = new FormData();
		fd_lblTaxaRendimento.bottom = new FormAttachment(0, 202);
		fd_lblTaxaRendimento.right = new FormAttachment(0, 124);
		fd_lblTaxaRendimento.top = new FormAttachment(0, 179);
		fd_lblTaxaRendimento.left = new FormAttachment(0, 20);
		lblTaxaRendimento.setLayoutData(fd_lblTaxaRendimento);
		lblTaxaRendimento.setText("Taxa Rendimento");
		toolkit.adapt(lblTaxaRendimento, true, true);
		
		taxaRendimento = new Text(this, SWT.BORDER);
		FormData fd_taxaRendimento = new FormData();
		fd_taxaRendimento.right = new FormAttachment(0, 261);
		fd_taxaRendimento.top = new FormAttachment(0, 181);
		fd_taxaRendimento.left = new FormAttachment(0, 130);
		taxaRendimento.setLayoutData(fd_taxaRendimento);
		toolkit.adapt(taxaRendimento, true, true);
		
		Button btnSalvar = new Button(this, SWT.NONE);
		btnSalvar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ContaController controller = new ContaController();
				br.com.treinarminas.bb.entitdade.ContaInvestimento conta = new br.com.treinarminas.bb.entitdade.ContaInvestimento();
				conta.setCliente(new Cliente());
				conta.getCliente().setNome(compositeConta.getNomeCliente().getText());
				conta.setSaldo(Double.parseDouble(compositeConta.getSaldoConta().getText()));
				conta.setTaxaManutencao(Double.parseDouble(taxaManutencao.getText()));
				conta.setTaxaRendimento(Double.parseDouble(taxaRendimento.getText()));
				controller.cadastrarConta(conta);

			}
		});
		FormData fd_btnSalvar = new FormData();
		fd_btnSalvar.bottom = new FormAttachment(100, -26);
		fd_btnSalvar.right = new FormAttachment(100, -112);
		btnSalvar.setLayoutData(fd_btnSalvar);
		toolkit.adapt(btnSalvar, true, true);
		btnSalvar.setText("Salvar");

	}

}
