package br.com.treinarminas.hudson.gui;

import javax.swing.JOptionPane;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import br.com.treinarminas.bb.entitdade.Cliente;
import br.com.treinarminas.bb.entitdade.ContaCorrente;
import br.com.treinarminas.controller.ContaController;

public class TelaSWT {

	protected Shell telaPrincipal;
	private Text nomeCorrentista;
	private Text valorSaldo;
	private Text limiteCredito;
	private Text taxaManutencao;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			TelaSWT window = new TelaSWT();
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
		telaPrincipal.open();
		telaPrincipal.layout();
		while (!telaPrincipal.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		telaPrincipal = new Shell();
		telaPrincipal.setSize(450, 300);
		telaPrincipal.setText("Banco do Brasil");
		
		Menu menu = new Menu(telaPrincipal, SWT.BAR);
		telaPrincipal.setMenuBar(menu);
		
		MenuItem mntmNewSubmenu = new MenuItem(menu, SWT.CASCADE);
		mntmNewSubmenu.setText("Criar Contas");
		
		Menu menu_1 = new Menu(mntmNewSubmenu);
		mntmNewSubmenu.setMenu(menu_1);
		
		MenuItem mntmContaCorrente = new MenuItem(menu_1, SWT.NONE);
	
		mntmContaCorrente.setText("Conta Corrente");
		
		Composite telaContaCorrente = new Composite(telaPrincipal, SWT.EMBEDDED);
		telaContaCorrente.setVisible(false);
		telaContaCorrente.setBounds(10, 10, 414, 207);
		
		Label lblNewLabel = new Label(telaContaCorrente, SWT.NONE);
		lblNewLabel.setBounds(17, 10, 33, 15);
		lblNewLabel.setText("Nome");
		
		nomeCorrentista = new Text(telaContaCorrente, SWT.BORDER);
		nomeCorrentista.setBounds(131, 10, 214, 21);
			
		Label lblValorSaldo = new Label(telaContaCorrente, SWT.NONE);
		lblValorSaldo.setBounds(17, 39, 65, 15);
		lblValorSaldo.setText("Valor Saldo");
		
		valorSaldo = new Text(telaContaCorrente, SWT.BORDER);
		valorSaldo.setBounds(131, 37, 214, 21);
		
		Label lblLimiteDeCrdito = new Label(telaContaCorrente, SWT.NONE);
		lblLimiteDeCrdito.setBounds(10, 67, 99, 15);
		lblLimiteDeCrdito.setText("Limite de Cr\u00E9dito");
		
		limiteCredito = new Text(telaContaCorrente, SWT.BORDER);
		limiteCredito.setBounds(131, 64, 214, 21);
		
		Label lblTaxaDeManuteno = new Label(telaContaCorrente, SWT.NONE);
		lblTaxaDeManuteno.setBounds(10, 97, 119, 15);
		lblTaxaDeManuteno.setText("Taxa de Manuten\u00E7\u00E3o");
		
		taxaManutencao = new Text(telaContaCorrente, SWT.BORDER);
		taxaManutencao.setBounds(131, 91, 214, 21);
		
		mntmContaCorrente.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				telaContaCorrente.setVisible(Boolean.TRUE);
				telaPrincipal.setText("Cadastrar conta Corrente");
			}
		});
		
		Button btnNewButton = new Button(telaContaCorrente, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ContaCorrente conta = new ContaCorrente();
				conta.setSaldo(Double.valueOf(valorSaldo.getText()));
				conta.setLimiteCreditoDisponivel(Double.valueOf(limiteCredito.getText()));
				conta.setTaxaManutencao(Double.valueOf(taxaManutencao.getText()));
				conta.setCliente(new Cliente());
				conta.getCliente().setNome(nomeCorrentista.getText());
				ContaController controller = new ContaController();
				controller.cadastrarConta(conta);
				JOptionPane.showMessageDialog(null, "Conta corrente cadastrada com sucesso!!!");
				telaContaCorrente.setVisible(Boolean.FALSE);
			}
		});
		btnNewButton.setBounds(186, 129, 75, 25);
		btnNewButton.setText("Cadastrar");

	}
}
