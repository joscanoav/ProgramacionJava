package repasoMatrices;

public class SumaMatrices {

	public static void main(String[] args) {
        // Definir dos matrices
        int[][] matrizA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrizB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Sumar las matrices
        int[][] matrizResultado = new int[matrizA.length][matrizA[0].length];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Mostrar la matriz resultante
        System.out.println("Matriz Resultante:");
        for (int[] fila : matrizResultado) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

	
}
