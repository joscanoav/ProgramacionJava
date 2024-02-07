package repasoMatrices;

import java.util.Scanner;

public class MatrizCeros {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado;
        int[][] matriz;

        System.out.print("Introduce el lado de la matriz: ");
        lado = sc.nextInt();

        matriz = new int[lado][lado];

        for (int i = 0; i < matriz.length; i++) {
            // No asignamos 1 aquí, dejamos los valores como 0
        }

        // Imprimir la matriz
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}