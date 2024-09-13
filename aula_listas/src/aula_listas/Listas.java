package aula_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		// Sintaxe da lista
		// lista não aceita tipos primitivos aprnas wrapper class
		
		List <String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex Brabo");
		list.add("João");
		list.add("bob");
		list.add(2, "Jose");
		
		System.out.println("--------------------------");
		for(String x : list) {
			System.out.println(x);
		
		}
		
		System.out.println("Tamanho da lista " + list.size());
		
		list.remove("bob");
		System.out.println("--------------------------");
		for(String x : list) {
			System.out.println(x);
		
		}
		
		list.remove(1);
		System.out.println("--------------------------");
		for(String x : list) {
			System.out.println(x);
		
		}
		System.out.println("--------------------------");
		//Funcão lambda chamada de predicado
		list.removeIf(x -> x.charAt(0) == 'J');
		
		for(String x : list) {
			System.out.println(x);
		
		}
		
		list.add("Mona");
		list.add("Antonia");
		list.add("Alex Brabo");
		list.add("João");
		list.add("bob");
		list.add(2, "Jose");
		
		
		System.out.println("--------------------------");
		for(String x : list) {
			System.out.println(x);
		
		}
		
		System.out.println("Index de bob: " + list.indexOf("bob"));
		System.out.println("Index de Marco" + list.indexOf("marco") + " Index '-1' significa que não esta na lista");
		
		// metodo stream() usado para usar funcões lambda com lista, e metodo collect para converter novamente para lista
		List <String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		System.out.println("--------------------------");
		for(String x : result) {
			System.out.println(x);
		
		}
		System.out.println("--------------------------");
		//Encontrar elemento com base no predicado
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		// se elemnto não existir resuldado é null
		name = list.stream().filter(x -> x.charAt(0) == 'K').findFirst().orElse(null);
		System.out.println(name);
		
		
	}
	
}
