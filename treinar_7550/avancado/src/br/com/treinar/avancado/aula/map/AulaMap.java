package br.com.treinar.avancado.aula.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import br.com.treinar.avancado.Pessoa;
import br.com.treinar.avancado.Sexo;

public class AulaMap {

	
	public static void main(String[] args) {
		Map<String, Pessoa> mapa = new HashMap<>();
		
		Pessoa p1 = new Pessoa("Gleidson", Sexo.M);
		p1.setCpf(55546265302L);
		Pessoa p2 = new Pessoa("Wagner", Sexo.M);
		p2.setCpf(55546265303l);
		Pessoa p3 = new Pessoa("Laila", Sexo.F);
		p3.setCpf(Long.valueOf(55546265304l));
		Pessoa p4 = new Pessoa("Bruno", Sexo.M);
		p4.setCpf(55546265305l);
		
		mapa.put(p1.getNome(), p1);
		mapa.put(p2.getNome(), p2);
		mapa.put(p3.getNome(), p3);
		mapa.put(p4.getNome(), p4);
		
		System.out.println("Escolha uma pessoa\n\t"
							+ "Gleidson\n\t"
							+ "Wagner\n\t"
							+ "Laila\n\t"
							+ "Bruno");
		
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		sc.close();
		Pessoa escolhido = mapa.get(nome);
	
		System.out.println(escolhido.getNome() + " - " + escolhido.getSexo().getDescricao() + " - " + escolhido.getCpf());
		
		Set<String> keys = mapa.keySet();
		
		for (String key : keys) {
			System.out.print(key + " ");
		}
		System.out.println();
		Collection<Pessoa> values = mapa.values();
		for (Pessoa pessoa : values) {
			System.out.println(pessoa.getSexo().getDescricao());
		}
		
		Set<Entry<String, Pessoa>> entrySet = mapa.entrySet();
		
		for (Entry<String, Pessoa> entry : entrySet) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getSexo());
		}
	
	}
	
	
	
	
	
	
	
}
