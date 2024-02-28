package preparacionDefinitiva;

import java.util.Scanner;

public class ArrayContadorParesImpares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        int tamaño = scanner.nextInt();

        // Crear un vector de enteros con el tamaño proporcionado
        int[] vector = new int[tamaño];

        // Solicitar al usuario ingresar los elementos del vector
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        // Contadores para números pares e impares
        int pares = 0;
        int impares = 0;

        // Contar números pares e impares en el vector
        for (int numero : vector) {
            if (numero % 2 == 0) {
                // Es par
                pares++;
            } else {
                // Es impar
                impares++;
            }
        }

        // Mostrar los resultados
        System.out.println("\nResultados:");
        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);

        scanner.close();
    }
}
