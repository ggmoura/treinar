package br.com.treinar.avancado.aula.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import br.com.treinar.avancado.Pessoa;
import br.com.treinar.avancado.Sexo;

public class TesteData {

	
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Gleidson", Sexo.M);
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.DAY_OF_MONTH, 90);
		c.set(Calendar.MONTH, 12);
		c.set(Calendar.YEAR, 1980);
		
		p.setDataNascimento(c.getTime());
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println(df.format(p.getDataNascimento()));
		
		
		Calendar old = Calendar.getInstance();		
		
		old.setTimeInMillis(p.getDataNascimento().getTime());
		
		old.add(Calendar.YEAR, 1);
		
		System.out.println("Old: " + df.format(old.getTime()));
		
		old.add(Calendar.MONTH, 13);
		
		System.out.println("Old: " + df.format(old.getTime()));
		
		
	}
	
}
