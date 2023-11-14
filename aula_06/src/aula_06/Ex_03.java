package aula_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex_03 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<Integer>();
		int numeroDigitado;
		
		for(int i=0; i<10;i++) {
			System.out.println("Digite um número: ");
			numeros.add(numeroDigitado = leia.nextInt());
		}
		
		Iterator<Integer> iNum = numeros.iterator();
		while(iNum.hasNext())
			System.out.println(iNum.next());
		
		
	}

}