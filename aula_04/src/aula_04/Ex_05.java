package aula_04;

import java.util.Scanner;

public class Ex_05 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero, soma = 0;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		do {
			
				if (numero > 0)
						soma += numero;
				System.out.println("Digite um número: ");
				numero = leia.nextInt();
		} while (numero != 0 );
		
		System.out.println("A soma dos números positivos é: " + soma);
		}
	
}
		
		