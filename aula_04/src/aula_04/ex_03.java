package aula_04;

import java.util.Scanner;

public class ex_03 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int menor21 = 0, maior50 = 0, idade = 0;
		while(!(idade < 0)) {
			System.out.println("Digite uma idade ");
			idade = leia.nextInt();
			
			if(idade >= 0 && idade < 21) {
				menor21++;
				
			} else if(idade > 50) {		
				maior50++;
				
				} 
				
			}
		
		System.out.printf("Total de pessoas menores de 21 anos: %d\n", menor21);
		System.out.printf("Total de pessoas maiores de 50 anos: %d\n", maior50);
		}
	

		

	}


