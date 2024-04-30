/*Hacer un programa que tenga una matriz definida en el código y pida al usuario una fila y una columna. Después, muestra el elemento en la posición indicada. Si la matriz no tiene esa posición (índices fuera de rango), se muestra un mensaje de error.
*/
package repasoMatrices;

import java.util.Scanner;

public class DefinirMatrizPosicion {

	public static void main(String[] args) {
		
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la fila y la columna
        System.out.print("Ingresa el número de fila: ");
        int fila = scanner.nextInt();
        System.out.print("Ingresa el número de columna: ");
        int columna = scanner.nextInt();

        // Verificar si los índices están dentro del rango de la matriz
        if (0 <= fila && fila < matriz.length && 0 <= columna && columna < matriz[0].length) {
            // Mostrar el elemento en la posición indicada
            int elemento = matriz[fila][columna];
            System.out.println("El elemento en la posición (" + fila + ", " + columna + ") es: " + elemento);
        } else {
            System.out.println("Error: Índices fuera de rango. Por favor, ingresa índices válidos.");
        }
    }

}


