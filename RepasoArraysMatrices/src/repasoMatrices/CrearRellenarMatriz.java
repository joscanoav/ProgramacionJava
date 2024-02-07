package repasoMatrices;

import java.util.Scanner;

public class CrearRellenarMatriz {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número de filas y columnas
        System.out.print("Ingresa el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingresa el número de columnas: ");
        int columnas = scanner.nextInt();

        // Crear la matriz con las dimensiones especificadas
        int[][] matriz = new int[filas][columnas];

        // Solicitar al usuario que ingrese los valores para cada posición de la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingresa el valor para la posición (" + i + ", " + j + "): ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrar la matriz para verificar que está bien
        System.out.println("Matriz resultante:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
	