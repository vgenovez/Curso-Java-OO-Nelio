package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");;
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2 , "Marco");
		list.add("Vitor");
		list.add("Vitor2");
		
		list.remove("Vitor");
		System.out.println(list.size());// mostrar o tamanho da lista
		
		for (String x : list) {
			System.out.println(x);
		}
		
		list.remove(5);
		
		System.out.println("----------------");
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob")); //Indexof retorna o numero do indice que o resultado se encontra na list
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("Index of Anna: " + list.indexOf("Anna"));
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("----------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}

}
