package Farmacia.repository;

import Farmacia.model.Produto;

public interface ProdutoRepository {
	
	//CRUD
	
	public void criarProduto(Produto produto);
	public void listarTodosOsProdutos();
	public void consultarProdutoPorId(int id);
	public void atualizarProduto(Produto produto);
	public void deletarProduto(int id);

}
