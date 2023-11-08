package aula_02;

		import java.util.Scanner;
		
public class Ex_02 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	float Nota1, Nota2, Nota3, Nota4;
	
	System.out.println("Digite a Nota 1: ");
	Nota1 =leia.nextFloat();
	
	System.out.println("Digite a Nota 2: ");
	Nota2 =leia.nextFloat();
	
	System.out.println("Digite a Nota 3: ");
	Nota3 =leia.nextFloat();
	
	System.out.println("Digite a Nota 4: ");
	Nota4 =leia.nextFloat();
	
	
	System.out.println("A média final do aluno é: " + ((Nota1 + Nota2 + Nota3 + Nota4)/4));
	
	
	}
}
