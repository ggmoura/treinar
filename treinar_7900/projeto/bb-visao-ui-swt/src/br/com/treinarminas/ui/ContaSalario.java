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
		
		CadastroConta composite = new CadastroConta(this, SWT.NONE);
		FormData fd_composite = new FormData();
		fd_composite.bottom = new FormAttachment(0, 246);
		fd_composite.right = new FormAttachment(0, 440);
		fd_composite.top = new FormAttachment(0);
		fd_composite.left = new FormAttachment(0);
		composite.setLayoutData(fd_composite);
		toolkit.adapt(composite);
		toolkit.paintBordersFor(composite);

	}

}
