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

public class ContaPoupanca extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public ContaPoupanca(Composite parent, int style) {
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
		fd_composite.bottom = new FormAttachment(0, 323);
		fd_composite.right = new FormAttachment(0, 547);
		fd_composite.top = new FormAttachment(0, 38);
		fd_composite.left = new FormAttachment(0, 10);
		composite.setLayoutData(fd_composite);
		toolkit.adapt(composite);
		toolkit.paintBordersFor(composite);

	}

}
