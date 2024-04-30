package preparacionDefinitiva;

import java.util.Arrays;
import java.util.Random;

public class MatrizAletorioOrdenado {
	

	    public static void main(String[] args) {
	        // Definimos la matriz fija
	        int[][] matriz = {
	            {5, 1, 3},
	            {9, 7, 2},
	            {6, 8, 4}
	        };

	        // Mostramos la matriz desordenada
	        System.out.println("Matriz desordenada:");
	        for (int[] fila : matriz) {
	            System.out.println(Arrays.toString(fila));
	        }

	        // Ordenamos la matriz por filas
	        ordenarPorFilas(matriz);

	        // Mostramos la matriz ordenada
	        System.out.println("\nMatriz ordenada:");
	        for (int[] fila : matriz) {
	            System.out.println(Arrays.toString(fila));
	        }
	    }

	    // Método para ordenar la matriz por filas
	    private static void ordenarPorFilas(int[][] matriz) {
	        for (int i = 0; i < matriz.length; i++) {
	            Arrays.sort(matriz[i]); // Ordena cada fila usando Arrays.sort()
	        }
	    }
	}

// POR COLUMNAS

/*package preparacionDefinitiva;

import java.util.Arrays;

public class MatrizFijaOrdenadaColumnas {

    public static void main(String[] args) {
        // Definimos la matriz fija
        int[][] matriz = {
            {5, 9, 6},
            {1, 7, 8},
            {3, 2, 4}
        };

        // Mostramos la matriz desordenada
        System.out.println("Matriz desordenada:");
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }

        // Ordenamos la matriz por columnas
        ordenarPorColumnas(matriz);

        // Mostramos la matriz ordenada
        System.out.println("\nMatriz ordenada por columnas:");
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }

    // Método para ordenar la matriz por columnas
    private static void ordenarPorColumnas(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Creamos un array auxiliar para almacenar las columnas ordenadas
        int[][] matrizAux = new int[filas][columnas];

        // Transponemos la matriz original (filas <-> columnas)
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizAux[j][i] = matriz[i][j];
            }
        }

        // Ordenamos cada columna del array auxiliar
        for (int i = 0; i < columnas; i++) {
            Arrays.sort(matrizAux[i]);
        }

        // Transponemos la matriz auxiliar de vuelta (columnas <-> filas)
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = matrizAux[j][i];
            }
        }
    }
}*/

    /*public static void main(String[] args) {
        // Definimos las dimensiones de la matriz
        int filas = 3;
        int columnas = 4;

        int[][] matriz = new int[filas][columnas];
        boolean desordenada = true;
        Random rand = new Random();

        // Bucle atrapado hasta que este ordenada
        while (desordenada) {
            // Reiniciamos la bandera de desorden
            desordenada = false;

            // Rellenamos la matriz de forma aleatoria
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    matriz[i][j] = rand.nextInt(filas * columnas) + 1;
                }
            }

            // Mostramos la matriz:
            System.out.println("Matriz desordenada:");
            for (int i = 0; i < filas; i++) {
                System.out.println(Arrays.toString(matriz[i]));
            }

            // Comprobamos si hay orden: recorremos por filas
            for (int i = 0; i < filas - 1 && !desordenada; i++) {
                // Comprobamos cada fila con la siguiente
                for (int j = 0; j < columnas; j++) {
                    if (matriz[i][j] > matriz[i + 1][j]) {
                        desordenada = true;
                        break; // Salimos del bucle interno si encontramos desorden
                    }
                }
            }
        }

        // La matriz está ordenada, la mostramos
        System.out.println("Matriz ordenada:");
        for (int i = 0; i < filas; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}*/
