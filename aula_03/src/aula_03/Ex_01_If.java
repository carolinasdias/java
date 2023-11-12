package aula_03;

import java.util.Scanner;

public class Ex_01_If {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
			
		
		int numeroA, numeroB, numeroC;
		String valor;
		
		System.out.println("Digite o numero A: ");
		numeroA = leia.nextInt();
		
		System.out.println("Digite o numero B: ");
		numeroB = leia.nextInt();
		
		System.out.println("Digite o numero C: ");
		numeroC = leia.nextInt();
		
		int x = (numeroA + numeroB);
		
		if(x < numeroC) {
				valor = "Menor";
		} else if (x == numeroC) {
				valor = "Igual";
		}else {
				valor = "Maior";
				
		}	
				
				System.out.printf("A soma de A + B é %s do que C", valor);
		}
		
		

	}


