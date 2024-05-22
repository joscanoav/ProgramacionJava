package arrays;
/*Sobre un array en c�digo, que el usuario introduzca un n�mero a
 *  buscar y nos diga la/s posici�n/es donde est� dicho n�mero. Si no est�, comunica un error "n�mero no encontrado".
*/

import java.util.Scanner;

public class BuscaPosicion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int buscado;
		int[] numeros = {9, 1, 4, 5, 1, 7, 8, 0};
		boolean encontrado = false;

		// Se pide el n�mero a buscar.
		System.out.print("Introduce el n�mero deseado: ");
		buscado = sc.nextInt();

		// for() que recorre el array.
		for (int i = 0; i < numeros.length; i++) {

			// Si el elemento en la posici�n "i" es el buscado...
			if (numeros[i] == buscado) {
				// Cambia la bandera "encontrado" a "true".
				encontrado = true;
				// Muestra la posici�n.
				System.out.println("El n�mero se encuentra en la posici�n " + i);
			}

		}

		// Si la bandera vale false...
		if (!encontrado) {
			// Mensaje de error.
			System.out.println("ERROR: ese n�mero no est� en el array");
		}

	}


	}

