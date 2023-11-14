package aula_06;

import java.util.Scanner;
import java.util.Stack;

public class Ex_Pilha {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		String nome;
		int op;
		
		do {
			System.out.println("\n*********************************************\n");
			System.out.println("	1 - Adicionar Livro na pilha");
			System.out.println("	2 - Listar todos os Livros");
			System.out.println("	3 - Retirar Livro da pilha");
			System.out.println("	0 - Sair\n");
			System.out.println("*********************************************");
			System.out.print("Entre com a opção desejada: ");
			op = leia.nextInt();
			switch(op) {
			case 1:
				System.out.print("Digite o nome: ");
				leia.skip("\\R");
				nome = leia.nextLine();
				pilha.add(nome);
				System.out.println("\nPilha: ");
				for(var s: pilha) {
					System.out.println(s);
				}
				System.out.println("\nLivro adicionado!");
				break;
			case 2:
				if(!pilha.isEmpty()) {
					System.out.println("\nLista de Livros na Pilha: ");
					for(var s: pilha) {
						System.out.println(s);
					}
					break;
				}
				System.out.println("A Pilha está vazia!");
				break;
			case 3:
				if(!pilha.isEmpty()) {
					pilha.pop();
					System.out.println("\nPilha: ");
					for(var s: pilha) {
						System.out.println(s);
					}
					System.out.println("\nO Livro foi retirado da pilha!");
					break;
				}
				System.out.println("\nA Pilha está vazia!");
				break;	
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
			default:
				System.out.println("\nOpção Inválida");
				break;
			}
		
		} while (op!=0);

	}

}