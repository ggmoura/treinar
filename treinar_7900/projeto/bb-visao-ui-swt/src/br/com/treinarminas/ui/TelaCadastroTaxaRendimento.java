package br.com.treinarminas.ui;

import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;

import br.com.treinarminas.bb.entitdade.ContaCorrente;
import br.com.treinarminas.bb.entitdade.ContaPoupanca;
import br.com.treinarminas.controller.ContaController;

public class TelaCadastroTaxaRendimento extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Text taxaRendimento;
	private Text textTaxaRendimentoAtual;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public TelaCadastroTaxaRendimento(Composite parent, int style) {
		
		super(parent, style);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		
		ContaController controller = new ContaController();
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new FormLayout());
		
		Label lblNovaTaxaDe = new Label(this, SWT.NONE);
		FormData fd_lblNovaTaxaDe = new FormData();
		fd_lblNovaTaxaDe.top = new FormAttachment(0, 75);
		fd_lblNovaTaxaDe.left = new FormAttachment(0, 20);
		fd_lblNovaTaxaDe.right = new FormAttachment(0, 165);
		lblNovaTaxaDe.setLayoutData(fd_lblNovaTaxaDe);
		toolkit.adapt(lblNovaTaxaDe, true, true);
		lblNovaTaxaDe.setText("Nova Taxa de Rendimento");
		
		taxaRendimento = new Text(this, SWT.BORDER);
		FormData fd_taxaRendimento = new FormData();
		fd_taxaRendimento.top = new FormAttachment(lblNovaTaxaDe, -3, SWT.TOP);
		fd_taxaRendimento.left = new FormAttachment(lblNovaTaxaDe, 6);
		taxaRendimento.setLayoutData(fd_taxaRendimento);
		toolkit.adapt(taxaRendimento, true, true);
		
		Button btnAlterar = new Button(this, SWT.NONE);
		FormData fd_btnAlterar = new FormData();
		fd_btnAlterar.top = new FormAttachment(lblNovaTaxaDe, -5, SWT.TOP);
		fd_btnAlterar.left = new FormAttachment(taxaRendimento, 6);
		fd_btnAlterar.right = new FormAttachment(100, -122);
		btnAlterar.setLayoutData(fd_btnAlterar);
		btnAlterar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ContaController controller = new ContaController();
				controller.alterarTaxaRendimento(Double.parseDouble(taxaRendimento.getText()));
				textTaxaRendimentoAtual.setText(ContaPoupanca.getTaxaRendimento().toString());
			}
		});
		toolkit.adapt(btnAlterar, true, true);
		btnAlterar.setText("Alterar");
		
		Label lblTaxaDeRendimento = new Label(this, SWT.NONE);
		FormData fd_lblTaxaDeRendimento = new FormData();
		fd_lblTaxaDeRendimento.top = new FormAttachment(0, 10);
		fd_lblTaxaDeRendimento.left = new FormAttachment(lblNovaTaxaDe, 0, SWT.LEFT);
		lblTaxaDeRendimento.setLayoutData(fd_lblTaxaDeRendimento);
		toolkit.adapt(lblTaxaDeRendimento, true, true);
		lblTaxaDeRendimento.setText("Taxa de rendimento atual: ");
		
		textTaxaRendimentoAtual = new Text(this, SWT.BORDER);
		textTaxaRendimentoAtual.setEnabled(false);
		textTaxaRendimentoAtual.setText(ContaPoupanca.getTaxaRendimento().toString());
		FormData fd_textTaxaRendimentoAtual = new FormData();
		fd_textTaxaRendimentoAtual.top = new FormAttachment(lblTaxaDeRendimento, 0, SWT.TOP);
		fd_textTaxaRendimentoAtual.left = new FormAttachment(taxaRendimento, 0, SWT.LEFT);
		textTaxaRendimentoAtual.setLayoutData(fd_textTaxaRendimentoAtual);
		toolkit.adapt(textTaxaRendimentoAtual, true, true);

	}
}
