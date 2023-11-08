package aula_02;

import java.util.Scanner;

public class Ex_04 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	float numero1, numero2, numero3, numero4;
	
	System.out.println("Numero 1: ");
	numero1 =leia.nextFloat();
	
	System.out.println("Numero 2: ");
	numero2 =leia.nextFloat();
	
	System.out.println("Numero 3: ");
	numero3 =leia.nextFloat();
	
	System.out.println("Numero 4: ");
	numero4 =leia.nextFloat();
	
	
	System.out.println("CALCULO: " + ((numero1 * numero2) - (numero3 * numero4)));
	
	}
}
