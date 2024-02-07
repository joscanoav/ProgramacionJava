package repasoMatrices;

public class SumaColumnasFilas {

	public static void main(String[] args) {
        // Definir la matriz
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Mostrar la matriz inicial
        System.out.println("Matriz Inicial:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Calcular sumas de filas y columnas
        int[] sumaFilas = new int[matriz.length];
        int[] sumaColumnas = new int[matriz[0].length];

        // Calcular suma de filas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaFilas[i] += matriz[i][j];
            }
        }

        // Calcular suma de columnas
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                sumaColumnas[j] += matriz[i][j];
            }
        }

        // Mostrar resultados
        System.out.println("\nSuma total de cada fila:");
        for (int elemento : sumaFilas) {
            System.out.print(elemento + " ");
        }
        System.out.println();

        System.out.println("\nSuma total de cada columna:");
        for (int elemento : sumaColumnas) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}