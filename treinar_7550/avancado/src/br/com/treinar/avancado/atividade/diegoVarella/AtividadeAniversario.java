package br.com.treinar.avancado.atividade.diegoVarella;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AtividadeAniversario {

	public static void main(String[] args) {

		Calendar aniversario = Calendar.getInstance();

		aniversario.set(Calendar.DAY_OF_MONTH, 05);
		aniversario.set(Calendar.MONTH, 7);
		aniversario.set(Calendar.YEAR, 1991);

		DateFormat formata = new SimpleDateFormat("dd-MM-yyy");

		System.out.println("Você nasceu em " + formata.format(aniversario.getTime()));

	}

}