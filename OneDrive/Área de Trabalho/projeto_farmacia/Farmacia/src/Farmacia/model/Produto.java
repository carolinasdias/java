package Farmacia.model;

public abstract class Produto {
	int id, tipo;
	String nome;
	double preco;

	public Produto(int id, String nome, int tipo, double preco) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void visualizar() {
String tipo = "";
		
		switch(this.tipo) {
		case 1 -> tipo = "Medicamento";
		case 2 -> tipo = "Cosmético";
		}
		
		System.out.println("**************************************************************");
		System.out.println("\nDados do Produto:                                             \n");
		System.out.println("**************************************************************\n");
		System.out.println("ID do Produto: " + this.id);
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Tipo: " + tipo);
		System.out.println("Preço: " + this.preco);
	}
	
	
		
	}
	
	
