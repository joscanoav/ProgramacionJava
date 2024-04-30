/*Hacer un programa que tenga una matriz definida en el c�digo y pida al usuario una fila y una columna. Despu�s, muestra el elemento en la posici�n indicada. Si la matriz no tiene esa posici�n (�ndices fuera de rango), se muestra un mensaje de error.
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
        System.out.print("Ingresa el n�mero de fila: ");
        int fila = scanner.nextInt();
        System.out.print("Ingresa el n�mero de columna: ");
        int columna = scanner.nextInt();

        // Verificar si los �ndices est�n dentro del rango de la matriz
        if (0 <= fila && fila < matriz.length && 0 <= columna && columna < matriz[0].length) {
            // Mostrar el elemento en la posici�n indicada
            int elemento = matriz[fila][columna];
            System.out.println("El elemento en la posici�n (" + fila + ", " + columna + ") es: " + elemento);
        } else {
            System.out.println("Error: �ndices fuera de rango. Por favor, ingresa �ndices v�lidos.");
        }
    }

}


