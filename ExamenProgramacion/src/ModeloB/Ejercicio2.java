package ModeloB;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int fila1Negativos=0;
		int fila0Negativos=0;
		int fila2Negativos=0;
		
        int[][] matriz = {
                {-2,5,7,8},
                {-9,-1,1,-2},
                {8,0,1,9}
            };
        
        
        System.out.println("Dada la siguiente matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        for (int i = 1; i == 1; i++) {
            for (int j = 0; j < 4; j++) {
    			if(matriz[i][j] < 0) {
    				fila1Negativos++;
            }
        }
            
        }
        
        
        for (int i = 0; i == 0; i++) {
            for (int j = 0; j < 4; j++) {
    			if(matriz[i][j] < 0) {
    				fila0Negativos++;
            }
        }
            
        }
        
        for (int i = 2; i == 2; i++) {
            for (int j = 0; j < 4; j++) {
    			if(matriz[i][j] < 0) {
    				fila2Negativos++;
            }
        }
            
        }
        
        System.out.println();
        System.out.println("El resultado es: ");
        System.out.println("Fila 0: " + fila0Negativos);
        System.out.println("Fila 1: " + fila1Negativos);
        System.out.println("Fila 2: " + fila2Negativos);

	}
}
        
        
        
        
        
        
        
	
