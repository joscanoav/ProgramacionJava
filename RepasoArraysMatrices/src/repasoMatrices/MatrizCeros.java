package repasoMatrices;

import java.util.Scanner;

public class MatrizCeros {

	/*public static void main(String[] args) {
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
}*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lado;
		int[][] matriz;

		System.out.print("Introduce el lado de la matriz: ");
		lado = sc.nextInt();

		matriz = new int[lado][lado];

		// Recorrido para asignar valores a la matriz (opcional)
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				// Puedes asignar aquí cualquier valor que desees
				matriz[i][j] = 0; // Ejemplo: asignando 0
			}
		}

		// Imprimir la matriz
		for (int[] fila : matriz) {
			for (int elemento : fila) {
				// Si el elemento es 0, imprime "*" en su lugar
				if (elemento == 0) {
					System.out.print("* ");
				} else {
					System.out.print(elemento + " ");
				}
			}
			System.out.println();
		}
	}
}