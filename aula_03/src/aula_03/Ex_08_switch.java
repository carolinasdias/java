package aula_03;

import java.util.Scanner;

public class Ex_08_switch {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int op;
		double saldo, valor;
		saldo = 1000.00;
		
		System.out.println("Operação: ");
		op = leia.nextInt();

		switch(op) {
			case 1:
				System.out.println("Operação - Saldo");
				System.out.println("Saldo: R$ " + saldo);
				break;
			case 2:
				System.out.println("Valor: ");
				valor = leia.nextDouble();
				
				System.out.println("Operação - Saque");
				if(valor <= saldo) {
					saldo = saldo - valor;
					System.out.println("Novo Saldo: " + saldo);
				} else {
					System.out.println("Saldo Insuficiente!");
				}
			
				break;
			case 3:
				System.out.println("Valor: ");
				valor = leia.nextDouble();
				
				saldo = valor + saldo;
				System.out.println("Operação - Saque");
				System.out.println("Novo Saldo: " + saldo);
				break;
			default:
				System.out.println("Operação Inválida!");
		}
		
	}

}