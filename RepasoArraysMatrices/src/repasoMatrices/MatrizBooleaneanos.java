package repasoMatrices;
/*Hacer un programa que tenga una matriz de booleanos, todos puestos a falses. Pide al usuario una fila y una columna. Despu�s, convierte a true el booleano de esa posici�n. Si la matriz no tiene esa posici�n (�ndices fuera de rango), se muestra un mensaje de error. El programa termina cuando se hayan convertido todos los booleans a true;
*/
import java.util.Scanner;

public class MatrizBooleaneanos {

	public static void main(String[] args) {

		int filas = 3;
		int columnas = 3;
		boolean[][] matriz = new boolean[filas][columnas];
		int contFalses = filas * columnas;
		int fila;
		int columna;
		Scanner sc = new Scanner(System.in);

		while (contFalses > 0) {
			// Pedir al usuario la posici�n:
			System.out.print("Introduce la fila: ");
			fila = sc.nextInt();
			System.out.print("Introduce la columna: ");
			columna = sc.nextInt();
			
			if (!matriz[fila][columna]) {
				// Cambiar el valor de la posici�n:
				matriz[fila][columna] = true;
				
				// Decrementamos el contador:
				contFalses--;
			} else {
				System.out.println("Esta posici�n ya est� en true.");
			}

		}

		System.out.println("Todas las posiciones est�n en true.");
	}

}
	