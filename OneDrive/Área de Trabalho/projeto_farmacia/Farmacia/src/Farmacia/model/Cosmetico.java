package Farmacia.model;

public class Cosmetico extends Produto{
	
	private String fragrancia;

	public Cosmetico(int id, String nome, int tipo, double preco, String fragrancia) {
		super(id, nome, tipo, preco);
		Object fragrancia1 = null;
		this.setFragrancia(fragrancia1);
		
	}

	public String getFragrancia() {
		return fragrancia;
	}

	public void setFragrancia(Object fragrancia1) {
		this.fragrancia = (String) fragrancia1;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
	System.out.println("Fragrância: " + this.fragrancia);
		
	}

}
