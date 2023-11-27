package Farmacia.model;

public class Medicamento extends Produto {
	
	private String generico;

	public Medicamento(int id, String nome, int tipo, double preco, String generico) {
		super(id, nome, tipo, preco);
		this.setGenerico(generico);
		
	}

	public String getGenerico() {
		return generico;
	}

	public void setGenerico(String generico) {
		this.generico = generico;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Genérico: " + this.generico);
	}

}
