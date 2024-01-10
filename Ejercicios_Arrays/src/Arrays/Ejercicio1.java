package Arrays;

/*Sobre un array en código, que el usuario introduzca un número a buscar y nos diga la/s posición/es donde está dicho número. 
* Si no está, comunica un error "número no encontrado".*/

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int buscado;
		int[] numeros = {9, 1, 4, 5, 1, 7, 8, 0};
		boolean encontrado = false;
		
		//Se pide buscar
		System.out.println("Introduce el numero deseado: ");
		buscado = teclado.nextInt();
		// for () que recorre el array
		for ( int i=0; i< numeros.length; i++) {
			// Si el elemento en la posicion "i" es el buscado...
			if (numeros[i] == buscado) {
				//cambia la bandera "encontrado" a "true".
				encontrado = true;
				// Muestra la posicion
				System.out.println("El numero se encuentra en la posicion " + i);
			}
		}
		
		// Si la bandera vale false...
		if(!encontrado) {
			// Mensaje de error.
			System.out.println("Error: ese numero no esta en el array");
		}
		
		
	}

}
