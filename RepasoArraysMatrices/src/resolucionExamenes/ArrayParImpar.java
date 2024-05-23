package resolucionExamenes;

public class ArrayParImpar {
	
		    public static void main(String[] args) {
	        // Array de ejemplo
	        int[] array = {2, 4, 12, 24, 55, 110, 1, 3, 5, 7};

	        // Muestra el array original
	        System.out.print("Array: ");
	        for (int i : array) {
	            System.out.print(i + " ");
	        }
	        System.out.println();

	        // Calcula y muestra si cada elemento es par o impar
	        System.out.print("Par/Impar: ");
	        for (int i : array) {
	            if (i % 2 == 0) {
	                System.out.print("Par ");
	            } else {
	                System.out.print("Impar ");
	            }
	        }
	    }
	}



/*import java.util.Arrays;

public class InvertirMatrizSimple {

    public static void main(String[] args) {

        // Create a sample matrix
        double[][] matrizDatos = {
                {2, 3, -1},
                {4, 5, 1},
                {1, -2, 3}
        };

        // Check if the matrix is invertible (determinant != 0)
        double determinante = calcularDeterminante(matrizDatos);
        if (determinante != 0) {

            // Invert the matrix using Gauss-Jordan method
            double[][] matrizInvertida = invertirMatrizGaussJordan(matrizDatos);

            // Print the original and inverted matrices
            System.out.println("Matriz original:");
            imprimirMatriz(matrizDatos);

            System.out.println("\nMatriz inversa:");
            imprimirMatriz(matrizInvertida);

        } else {
            System.out.println("La matriz no es invertible");
        }
    }

    // Helper function to calculate the determinant
    private static double calcularDeterminante(double[][] matriz) {
        double det = 1;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][i] == 0) {
                // Pivoting needed if diagonal element is 0
                int k = i + 1;
                while (k < matriz.length && matriz[k][i] == 0) {
                    k++;
                }
                if (k == matriz.length) {
                    return 0; // Matrix is singular
                }
                intercambiarFilas(matriz, i, k);
            }
            det *= matriz[i][i];
            for (int j = i + 1; j < matriz.length; j++) {
                eliminarFila(matriz, j, i, det);
            }
        }
        return det;
    }

    // Helper function to swap rows
    private static void intercambiarFilas(double[][] matriz, int i, int k) {
        double[] tmp = matriz[i];
        matriz[i] = matriz[k];
        matriz[k] = tmp;
    }

    // Helper function to eliminate a row using another row
    private static void eliminarFila(double[][] matriz, int j, int i, double det) {
        double factor = matriz[j][i] / matriz[i][i];
        for (int k = 0; k < matriz[0].length; k++) {
            matriz[j][k] -= factor * matriz[i][k];
        }
    }

    // Helper function to invert matrix using Gauss-Jordan method
    private static double[][] invertirMatrizGaussJordan(double[][] matriz) {
        double[][] inversa = new double[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            // Make diagonal element equal to 1
            if (matriz[i][i] != 1) {
                double factor = 1 / matriz[i][i];
                for (int k = 0; k < matriz[0].length; k++) {
                    matriz[i][k] *= factor;
                    inversa[i][k] *= factor;
                }
            }
            // Eliminate other elements in the column
            for (int j = 0; j < matriz.length; j++) {
                if (j != i) {
                    double factor = matriz[j][i];
                    for (int k = 0; k < matriz[0].length; k++) {
                        matriz[j][k] -= factor * matriz[i][k];
                        inversa[j][k] -= factor * inversa[i][k];
                    }
                }
            }
        }
        return inversa;
    }

    // Helper function to print a matrix
    private static void imprimirMatriz(double[][] matriz) {
        for (double[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }
}*/
