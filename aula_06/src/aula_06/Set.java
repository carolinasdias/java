package aula_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;



public class Set {

	public static void main(String[] args) {
		
		HashSet<String> frutas = new HashSet<String>();
		
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Abacate");
		frutas.add("Morango");
		frutas.add("Jaboticaba");
		frutas.add("Kiwi");
		//frutas.add(null);
		
		System.out.println(frutas);
		
		for(var fruta : frutas)
			System.out.println(fruta.hashCode());
		
		System.out.println("A fruta Morango existe? " + frutas.contains("Morango"));
		
		frutas.remove("Morango");
		
		System.out.println(frutas);
		
		Iterator<String> iFrutas = frutas.iterator();
		
		while(iFrutas.hasNext())
			System.out.println(iFrutas.next());
		
		//Criamos ArrayList
		ArrayList<String> frutasList = new ArrayList<String>();
		
		// Adicionamos todos os elemntos da Coleção Hashest no ArrayList
		frutasList.addAll(frutas);
		
		// ordeamos em ordem crescente
		frutasList.sort(null);
		
		System.out.println(frutasList);
		
		// ordenamos em ordem decrescente
		frutasList.sort(Comparator.reverseOrder());
		
		System.out.println(frutasList);
			
		

	}

}
