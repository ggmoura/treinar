package br.com.treinarminas.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;

public class TelaPrincipal {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			TelaPrincipal window = new TelaPrincipal();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		shell.setLayout(new FormLayout());
		
		ContaCorrente contaCorrente = new ContaCorrente(shell, SWT.NONE);
		FormData fd_contaCorrente = new FormData();
		fd_contaCorrente.bottom = new FormAttachment(0, 241);
		fd_contaCorrente.right = new FormAttachment(0, 434);
		fd_contaCorrente.top = new FormAttachment(0);
		fd_contaCorrente.left = new FormAttachment(0);
		contaCorrente.setLayoutData(fd_contaCorrente);
		contaCorrente.setLayout(new FormLayout());
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(shell, SWT.NONE);
		FormData fd_contaPoupanca = new FormData();
		fd_contaPoupanca.bottom = new FormAttachment(0, 261);
		fd_contaPoupanca.right = new FormAttachment(0, 434);
		fd_contaPoupanca.top = new FormAttachment(0);
		fd_contaPoupanca.left = new FormAttachment(0);
		contaPoupanca.setLayoutData(fd_contaPoupanca);
		
		ContaSalario contaSalario = new ContaSalario(shell, SWT.NONE);
		FormData fd_contaSalario = new FormData();
		fd_contaSalario.bottom = new FormAttachment(0, 261);
		fd_contaSalario.right = new FormAttachment(0, 434);
		fd_contaSalario.top = new FormAttachment(0);
		fd_contaSalario.left = new FormAttachment(0);
		contaSalario.setLayoutData(fd_contaSalario);
		
		ContaInvestimento contaInvestimento = new ContaInvestimento(shell, SWT.NONE);
		FormData fd_contaInvestimento = new FormData();
		fd_contaInvestimento.bottom = new FormAttachment(0, 251);
		fd_contaInvestimento.right = new FormAttachment(0, 424);
		fd_contaInvestimento.top = new FormAttachment(0);
		fd_contaInvestimento.left = new FormAttachment(0);
		contaInvestimento.setLayoutData(fd_contaInvestimento);

		TelaCadastroTaxaRendimento compositeTaxarendimento = new TelaCadastroTaxaRendimento(shell, SWT.NONE);
		FormData fd_compositeTaxarendimento = new FormData();
		fd_compositeTaxarendimento.bottom = new FormAttachment(0, 241);
		fd_compositeTaxarendimento.right = new FormAttachment(0, 434);
		fd_compositeTaxarendimento.top = new FormAttachment(0);
		fd_compositeTaxarendimento.left = new FormAttachment(0);
		compositeTaxarendimento.setLayoutData(fd_compositeTaxarendimento);
		
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		MenuItem mntmNewSubmenu = new MenuItem(menu, SWT.CASCADE);
		mntmNewSubmenu.setText("Cadastro Conta");
		
		Menu menu_1 = new Menu(mntmNewSubmenu);
		mntmNewSubmenu.setMenu(menu_1);
		
		MenuItem mntmCorrente = new MenuItem(menu_1, SWT.NONE);
		mntmCorrente.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				contaCorrente.setVisible(Boolean.TRUE);
				contaPoupanca.setVisible(Boolean.FALSE);
				contaSalario.setVisible(Boolean.FALSE);
				contaInvestimento.setVisible(Boolean.FALSE);
			}
		});
		mntmCorrente.setText("Corrente");
		
		MenuItem mntmPoupana = new MenuItem(menu_1, SWT.NONE);
		mntmPoupana.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				contaCorrente.setVisible(Boolean.FALSE);
				contaPoupanca.setVisible(Boolean.TRUE);
				contaSalario.setVisible(Boolean.FALSE);
				contaInvestimento.setVisible(Boolean.FALSE);
			}
		});
		mntmPoupana.setText("Poupan\u00E7a");
		
		MenuItem mntmSalario = new MenuItem(menu_1, SWT.NONE);
		mntmSalario.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				contaCorrente.setVisible(Boolean.FALSE);
				contaPoupanca.setVisible(Boolean.FALSE);
				contaSalario.setVisible(Boolean.TRUE);
				contaInvestimento.setVisible(Boolean.FALSE);
			}
		});
		mntmSalario.setText("Salario");
		
		MenuItem mntmInvestimento = new MenuItem(menu_1, SWT.NONE);
		mntmInvestimento.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				contaCorrente.setVisible(Boolean.FALSE);
				contaPoupanca.setVisible(Boolean.FALSE);
				contaSalario.setVisible(Boolean.FALSE);
				contaInvestimento.setVisible(Boolean.TRUE);
			}
		});
		mntmInvestimento.setText("Investimento");
		
		MenuItem mntmAo = new MenuItem(menu, SWT.CASCADE);
		mntmAo.setText("A\u00E7\u00E3o");
		
		Menu menu_2 = new Menu(mntmAo);
		mntmAo.setMenu(menu_2);
		
		MenuItem mntmDepositar = new MenuItem(menu_2, SWT.NONE);
		mntmDepositar.setText("Depositar");
		
		MenuItem mntmSacar = new MenuItem(menu_2, SWT.NONE);
		mntmSacar.setText("Sacar");
		
		MenuItem mntmListarContas = new MenuItem(menu_2, SWT.NONE);
		mntmListarContas.setText("Listar Contas");
		
		MenuItem mntmBanco = new MenuItem(menu, SWT.CASCADE);
		mntmBanco.setText("Banco");
		
		Menu menu_3 = new Menu(mntmBanco);
		mntmBanco.setMenu(menu_3);
		
		MenuItem mntmTaxaRendimento = new MenuItem(menu_3, SWT.NONE);
		mntmTaxaRendimento.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				contaCorrente.setVisible(Boolean.FALSE);
				contaPoupanca.setVisible(Boolean.FALSE);
				contaSalario.setVisible(Boolean.FALSE);
				contaInvestimento.setVisible(Boolean.FALSE);
				compositeTaxarendimento.setVisible(Boolean.TRUE);
			}
		});
		mntmTaxaRendimento.setText("Taxa Rendimento");
		

	}
}
