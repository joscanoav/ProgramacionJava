/*Pedir al usuario una cantidad de elementos
 *  y se genera un array con esa capacidad 
 *  lleno de números aleatorios. Después, 
 *  se muestra la suma de todos los elementos.
*/

package repasoArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GenerarArraysSuma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int cantidadElementos;
		int[] numeros;
		int suma = 0;
		
		//Pedir al usuario la cantidad de elementos
		
		System.out.println("Ingrese la cantidad de elementos para el array: ");
		cantidadElementos = sc.nextInt();
		
		// Verificar si la cantidad ingresada es valida
		
		if(cantidadElementos <=0) {
			System.out.println("La cantidad de elementos debe ser mayor que 0");
			//return se utiliza para salir del main
			return;
		}
		
		//Crear el array con la capacidad especificada
		
		numeros = new int[cantidadElementos];
		// LLenar el array con numeros aletorios
		
		for(int i=0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(100); // numeros aletorios entre 0 y 99
		}
		
		//Mostrar el array
		System.out.print("Array generado:" + Arrays.toString(numeros));
		
		for (int numero : numeros) {
			suma += numero;
			
		}
		
		System.out.println();
		System.out.println("La suma de los elementos es : " + suma);
		
			
		}
		
		
		
		
	}


