package br.com.treinarminas.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

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
		
		ContaCorrente contaCorrente = new ContaCorrente(shell, SWT.NONE);
		contaCorrente.setBounds(0, 0, 434, 261);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(shell, SWT.NONE);
		contaPoupanca.setBounds(0, 0, 434, 261);
		
		ContaSalario contaSalario = new ContaSalario(shell, SWT.NONE);
		contaSalario.setBounds(0, 0, 434, 261);
		
		ContaInvestimento contaInvestimento = new ContaInvestimento(shell, SWT.NONE);
		contaInvestimento.setBounds(0, 0, 424, 251);
		
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

	}
}
