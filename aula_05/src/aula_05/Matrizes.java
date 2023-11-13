package aula_05;

public class Matrizes {

	public static void main(String[] args) {
		
		int[][] matriz = {{1, 2, 3}, {4, 5, 6},{7, 8, 9}};
		
		// Controlar a linha
		for(int indiceI = 0; indiceI < matriz.length; indiceI ++) {
			
			// controlar a coluna
			for(int indiceJ = 0; indiceJ < matriz.length; indiceJ ++) {
				System.out.println("Matriz[" + indiceI + "][" + indiceJ + "] = " + matriz[indiceI][indiceJ]);
				
			}
		}

	}

}
