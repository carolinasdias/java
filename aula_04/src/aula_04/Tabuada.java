package aula_04;

import java.util.Scanner;

public class Tabuada {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		
		for(int c = 1; c<=10; c++ ) {
			System.out.println(numero + " x " + c + " = " + (numero * c));
		}
	}

}
