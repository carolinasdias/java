package Farmacia.controller;

import java.util.ArrayList;
import java.util.Optional;

import Farmacia.model.Produto;
import Farmacia.repository.ProdutoRepository;


public class ProdutoController implements ProdutoRepository {
	

private ArrayList<Produto> listaProduto = new ArrayList<Produto>();
	
		
    
	@Override
	public void criarProduto(Produto produto) {
		listaProduto.add(produto);
		System.out.println("O produto" + produto.getId() + "foi criada com sucesso");
    }
	@Override
	public void listarTodosOsProdutos() {
		for(var produto : listaProduto) {
			produto.visualizar();
		}
		
	}

	@Override
	public void consultarProdutoPorId(int id) {
		Optional<Produto> produto = buscarNaCollection(id);
		
		if(produto.isPresent())
			produto.get().visualizar();
		else
			System.out.println("\nO ID " + id + " não foi encontrado na lista de Produtos!");
		
	}

	@Override
	public void atualizarProduto(Produto produto) {
		Optional<Produto> buscaProduto = buscarNaCollection(produto.getId());
		
		if(buscaProduto.isPresent()) {
			listaProduto.set(listaProduto.indexOf(buscaProduto.get()), produto);
			System.out.println("O Produto de ID " + produto.getId() + " foi atualizado com sucesso!");
		}else {
			System.out.println("O ID " + produto.getId() + " não foi encontrado na lista de produtos!");
		}
		
		
	}

	@Override
	public void deletarProduto(int id) {
		Optional<Produto> produto = buscarNaCollection(id);
		
		if(produto.isPresent()) {
			if(listaProduto.remove(produto.get()) == true){
				System.out.println("\nO Produto de ID " + id + " foi deletado com sucesso!");
			}else {
				System.out.println("\nO Produto de ID  " + id + " não foi encontrado!");
			}
		}
	}
	
	public Optional<Produto> buscarNaCollection(int id) {
		for(var produto : listaProduto) {
			if(produto.getId() == id) {
				return Optional.of(produto);
			} 
		}
		return Optional.empty(); 
	}
	
}