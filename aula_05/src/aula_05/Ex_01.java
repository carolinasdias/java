package aula_05;

import java.util.Scanner;

public class Ex_01 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] n = {2, 5, 1, 3, 4, 9, 7, 8, 10, 67};
		int numero;
		
		for(int indice = 0; indice < n.length; indice++) {
		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();

		int posicao = -1;
		for(int i = 0; i < n.length; i++) {
			if(n[i] == numero) {
				posicao = i;
				break;
			}
		}
		if(posicao!= -1) {
			System.out.println("O numero " + numero + " foi encontrado na posição " + posicao);
			break;
		}else {
			System.out.println("O numero " + numero + " não foi encontrado!");
			break;
		}
		
		}
	}

}
