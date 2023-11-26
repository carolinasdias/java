

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import Farmacia.controller.ProdutoController;
import Farmacia.model.Cosmetico;
import Farmacia.model.Medicamento;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ProdutoController produtos = new ProdutoController();

		int opcao, id, tipo, quantidade, novaQuantidade;
		String nomeDeletar, nome, nomeConsulta, novoNome, listaProdutos;
		double preco, novoPreco;

		Medicamento fm1 = new Medicamento(1, "Tatiane", 1, 250.00f, "Sim");
		produtos.criarProduto(fm1);

		Cosmetico fc2 = new Cosmetico(2, "Talita", 2, 180.00f, "Fresh");
		produtos.criarProduto(fc2);

while (true) {		
	
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("                MENU FARMACIA              ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Criar Produto                          ");
		System.out.println("            2 - Listar todos os produtos               ");
		System.out.println("            3 - Consultar Produto por ID             ");
		System.out.println("            4 - AtualizarProduto             ");
		System.out.println("            5 - Apagar Produto                        ");
		System.out.println("            6 - Sair                        ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("Entre com a opção desejada:                          ");
		System.out.println("                                                     ");

		try {
			opcao = leia.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Digite valores inteiros!");
			leia.nextLine();
			opcao = 0;
		}

		if (opcao == 6) {
			System.out.println("\nObrigado - Volte Sempre!");
			sobre();
			leia.close();
			System.exit(0);
		}

		switch (opcao) {
		case 1:
			System.out.println("Digite o nome, o preço e a quantidade do produto");
			nome = leia.next();
			preco = leia.nextDouble();
			quantidade = leia.nextInt();
			System.out.println("Produto criado com sucesso!");
			break;

		case 2:
			System.out.println("Lista de produtos:");
			break;

		case 3:
			System.out.println("Digite o nome do produto que deseja consultar");
			nomeConsulta = leia.next();
			

		case 4:
			System.out.println("Digite o nome do produto que deseja atualizar");
			break;

		case 5:
			System.out.println("Digite o nome do produto que deseja deletar");
			nomeDeletar = leia.next();
			break;

		case 6:
			System.out.println("Obrigado por utilizar nossos serviços!");
			break;

		default:

			System.out.println("Opção inválida!");
			break;
		}
	}
}

	

		

	private static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Carolina Dias");
		System.out.println("https://github.com/carolinasdias/projeto_farmacia");
		System.out.println("*********************************************************");
		
	}
	public static void keyPress() {
		try {

			System.out.println("\n\nPressione a tecla Enter para continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla inválida!");
		}
	}
}