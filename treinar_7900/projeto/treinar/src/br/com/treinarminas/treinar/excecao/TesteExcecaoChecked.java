package br.com.treinarminas.treinar.excecao;

public class TesteExcecaoChecked {

	public static void main(String[] args) {
		try {
			metodoIntermediario();
			String[] nomes = {};
			System.out.println(nomes[0]);
		} catch (ExcecaoChecked e) {
			System.out.println("minha excecao " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println(e.getClass().getSimpleName());
		} catch (Exception e) {
			System.out.println("qualquer erro que ocorrer...");
		}
		
		try {
			metodoIntermediario();
			String[] nomes = {};
			System.out.println(nomes[0]);
		} catch (ExcecaoChecked | RuntimeException e) {
			System.out.println("minha excecao " + e.getMessage());
		}  catch (Exception e) {
			System.out.println("qualquer erro que ocorrer...");
		}
	}
	
	private static void metodoIntermediario() throws ExcecaoChecked {
		testeExcecaoCheckedMetodo();
	}
	
	private static void testeExcecaoCheckedMetodo() throws ExcecaoChecked {
		if (!"".equals("errado")) {
			throw new ExcecaoChecked();			
		}
	}
	
}
