package aula_02;

	import java.util.Scanner;

public class Ex_03 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float salbruto, addnot, hrextra, desc;
		
		System.out.println("Salário Bruto: ");
		salbruto =leia.nextFloat();
		
		System.out.println("Adicional Noturno: ");
		addnot =leia.nextFloat();
		
		System.out.println("Horas extras: ");
		hrextra =leia.nextFloat();
		
		System.out.println("Descontos: ");
		desc =leia.nextFloat();

		System.out.println("O salário líquido é: " + (salbruto + addnot + (hrextra*5) - desc));
	}

}
