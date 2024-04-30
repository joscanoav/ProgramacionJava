package repasoMatrices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CrearRellenarMatriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el n�mero de filas y columnas
        System.out.print("Ingresa el n�mero de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingresa el n�mero de columnas: ");
        int columnas = scanner.nextInt();

        // Crear la matriz con las dimensiones especificadas
        int[][] matriz = new int[filas][columnas];

        // Solicitar al usuario que ingrese los valores para cada posici�n de la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                boolean validInput = false;
                while (!validInput) {
                    try {
                        System.out.print("Ingresa el valor para la posici�n (" + i + ", " + j + "): ");
                        int valor = scanner.nextInt();
                        matriz[i][j] = valor;
                        validInput = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Ingresa un valor num�rico v�lido.");
                        scanner.next(); // Consume the invalid input
                    }
                }
            }
        }

        // Mostrar la matriz para verificar que est� bien
        System.out.println("Matriz resultante:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
	