package aula_03;

import java.util.Scanner;

public class Ex_04_If {
	
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		String grupo, classe, dieta, animal;
		animal = "Nenhum animal encontrado";
		
		System.out.println("Qual o Grupo do animal: ");
		grupo = leia.nextLine().toLowerCase();
		System.out.println("Qual a Classe do animal: ");
		classe = leia.nextLine().toLowerCase();
		System.out.println("Qual a Dieta do animal: ");
		dieta = leia.nextLine().toLowerCase();

		if(grupo.equals("vertebrado")) {
			
			if(classe.equals("ave")) {
				
				if(dieta.equals("carnívoro")){
					animal = "Águia";
				} else if(dieta.equals("onívoro")) {
					animal = "Pomba";
				}
				
			} else if (classe.equals("mamífero")) {
				
				if(dieta.equals("onívoro")){
					animal = "Homem";
				} else if(dieta.equals("herbívoro")) {
					animal = "Vaca";
				}
				
			}
							
		} else if(grupo.equals("invertebrado")) {
			
			if(classe.equals("inseto")) {
				
				if(dieta.equals("hematófago")){
					animal = "Pulga";
				} else if(dieta.equals("herbívoro")) {
					animal = "Lagarta";
				}
				
			} else if (classe.equals("anelídio")) {
				
				if(dieta.equals("hematófago")){
					animal = "Sanguessuga";
				} else if(dieta.equals("onívoro")) {
					animal = "Minhoca";
				}
				
			}
			
		}
		
		System.out.printf("O animal escolhido foi: %s", animal);
	}
	
}
		
	
