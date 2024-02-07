package repasoMatrices;

import java.util.Scanner;

public class MatrizBooleans2 {

	public static void main(String[] args) {
        int filas = 3;
        int columnas = 3;
        boolean[][] matriz = new boolean[filas][columnas];
        int contFalses = filas * columnas;
        int fila;
        int columna;
        Scanner sc = new Scanner(System.in);

        while (contFalses > 0) {
            // Pedir al usuario la posición:
            System.out.print("Introduce la fila: ");
            fila = sc.nextInt();
            System.out.print("Introduce la columna: ");
            columna = sc.nextInt();

            if (!matriz[fila][columna]) {
                // Cambiar el valor de la posición:
                matriz[fila][columna] = true;

                // Decrementamos el contador:
                contFalses--;

                // Mostrar la matriz booleana después de cada iteración:
                System.out.println("Matriz booleana:");
                mostrarMatrizBooleana(matriz);
            } else {
                System.out.println("Esta posición ya está en true.");
            }
        }

        System.out.println("Todas las posiciones están en true.");
    }

    private static void mostrarMatrizBooleana(boolean[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}