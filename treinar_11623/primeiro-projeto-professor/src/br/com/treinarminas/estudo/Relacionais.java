package br.com.treinarminas.estudo;

public class Relacionais {

	public static void main(String[] args) {
		int idade = 17;
		
		boolean maiorDeIdade = idade >= 18;
		System.out.println("É maior de idade? " + maiorDeIdade);
	
		int nota = 60;
		
		boolean reprovado = nota < 60;
		System.out.println("O aluno foi reprovado: " + reprovado);
		
		int idadeFilho1 = 10;
		int idadeFilho2 = 10;
		
		boolean gemeos = idadeFilho1 == idadeFilho2;//a idade do filho um e igual a do filho dois
		System.out.println("Os irmãos são gêmeos: " + gemeos);
		
		gemeos = idadeFilho1 != idadeFilho2; // a idade do filho um e diferente da do filho dois
		System.out.println("Os irmãos são gêmeos: " + !gemeos);//a exclamacao inverte a expressao
		
		boolean possuiIngresso = true;
		
		boolean podeEntrarNaBoate = maiorDeIdade && possuiIngresso;
		System.out.println("podeEntrarNaBoate: " + podeEntrarNaBoate);
		
		boolean ehParenteDoAniversariante = true;
		
		boolean ehConvidado = podeEntrarNaBoate || ehParenteDoAniversariante; 
	
		System.out.println("podeEntrarNaBoate: " + ehConvidado);
		
	}
	
}
