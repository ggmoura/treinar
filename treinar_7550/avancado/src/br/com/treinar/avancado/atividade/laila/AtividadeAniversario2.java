package br.com.treinar.avancado.atividade.laila;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import br.com.treinar.avancado.Pessoa;
import br.com.treinar.avancado.Sexo;

public class AtividadeAniversario2 {

	public static void main(String[] args) {
		

		Pessoa p = new Pessoa("Laila", Sexo.F);
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.DAY_OF_MONTH, 30);
		c.set(Calendar.MONTH, 02);
		c.set(Calendar.YEAR, 1984);
		
		p.setDataNascimento(c.getTime());
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		
		System.out.println(df.format(p.getDataNascimento()));
		
	}

}
