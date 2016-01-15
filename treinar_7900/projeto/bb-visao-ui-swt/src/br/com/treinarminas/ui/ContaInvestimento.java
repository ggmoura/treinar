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

public class ContaInvestimento extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Text text;
	private Text text_1;

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
		
		CadastroConta composite = new CadastroConta(this, SWT.NONE);
		FormData fd_composite = new FormData();
		fd_composite.bottom = new FormAttachment(0, 134);
		fd_composite.right = new FormAttachment(0, 460);
		fd_composite.top = new FormAttachment(0, 10);
		fd_composite.left = new FormAttachment(0, 10);
		composite.setLayoutData(fd_composite);
		toolkit.adapt(composite);
		toolkit.paintBordersFor(composite);
		
		Label lblTaxaManuteno = new Label(this, SWT.NONE);
		FormData fd_lblTaxaManuteno = new FormData();
		fd_lblTaxaManuteno.bottom = new FormAttachment(0, 163);
		fd_lblTaxaManuteno.right = new FormAttachment(0, 124);
		fd_lblTaxaManuteno.top = new FormAttachment(0, 140);
		fd_lblTaxaManuteno.left = new FormAttachment(0, 20);
		lblTaxaManuteno.setLayoutData(fd_lblTaxaManuteno);
		toolkit.adapt(lblTaxaManuteno, true, true);
		lblTaxaManuteno.setText("Taxa Manuten\u00E7\u00E3o");
		
		text = new Text(this, SWT.BORDER);
		FormData fd_text = new FormData();
		fd_text.right = new FormAttachment(0, 261);
		fd_text.top = new FormAttachment(0, 142);
		fd_text.left = new FormAttachment(0, 130);
		text.setLayoutData(fd_text);
		toolkit.adapt(text, true, true);
		
		Label lblTaxaRendimento = new Label(this, SWT.NONE);
		FormData fd_lblTaxaRendimento = new FormData();
		fd_lblTaxaRendimento.bottom = new FormAttachment(0, 202);
		fd_lblTaxaRendimento.right = new FormAttachment(0, 124);
		fd_lblTaxaRendimento.top = new FormAttachment(0, 179);
		fd_lblTaxaRendimento.left = new FormAttachment(0, 20);
		lblTaxaRendimento.setLayoutData(fd_lblTaxaRendimento);
		lblTaxaRendimento.setText("Taxa Rendimento");
		toolkit.adapt(lblTaxaRendimento, true, true);
		
		text_1 = new Text(this, SWT.BORDER);
		FormData fd_text_1 = new FormData();
		fd_text_1.right = new FormAttachment(0, 261);
		fd_text_1.top = new FormAttachment(0, 181);
		fd_text_1.left = new FormAttachment(0, 130);
		text_1.setLayoutData(fd_text_1);
		toolkit.adapt(text_1, true, true);

	}

}
