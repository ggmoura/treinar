package br.com.treinar.avancado.atividade.rodrigo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AtividadeDataNiver {

	public static void main(String[] args) {

		Calendar Nascimento = Calendar.getInstance();
		Nascimento.set(Calendar.DAY_OF_MONTH, 15);
		Nascimento.set(Calendar.MONTH, 03);
		Nascimento.set(Calendar.YEAR, 1987);

		DateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(formatador.format(Nascimento.getTime()));

		//System.out.println(Nascimento);

	}

}
