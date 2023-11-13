package aula_05;

public class Ex_03 {

	public static void main(String[] args) {

		int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
		int DiagonalP = 0;
        int DiagonalS = 0;
		
        for (int i = 0; i < matriz.length; i++) {  
            DiagonalP += matriz[i][i];
        }
        for (int i = 0; i < matriz.length; i++) { 
            DiagonalS += matriz[i][2 - i];
        }
        
        System.out.println("Elementos da diagonal principal: ");
        for(int i = 0; i < matriz.length; i++) {
        	System.out.println(matriz[i][i]);
        }
        
        System.out.println("Elementos da diagonal secundária: ");
        for(int i = 0; i < matriz.length; i++) {
        	System.out.println(matriz[i][2 - i]); 
	}
        System.out.println("Soma dos Elementos da Diagonal Principal: " + DiagonalP);
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + DiagonalS);

	}
}