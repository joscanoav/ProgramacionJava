package preparacionDefinitiva;

import java.util.Scanner;

public class ArrayContadorParesImpares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tama�o del vector
        System.out.print("Ingrese el tama�o del vector: ");
        int tama�o = scanner.nextInt();

        // Crear un vector de enteros con el tama�o proporcionado
        int[] vector = new int[tama�o];

        // Solicitar al usuario ingresar los elementos del vector
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < tama�o; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        // Contadores para n�meros pares e impares
        int pares = 0;
        int impares = 0;

        // Contar n�meros pares e impares en el vector
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
        System.out.println("N�meros pares: " + pares);
        System.out.println("N�meros impares: " + impares);

        scanner.close();
    }
}
