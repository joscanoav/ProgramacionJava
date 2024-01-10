package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Pedir al usuario una cantidad de elementos y se genera un array 
 * con esa capacidad lleno de números aleatorios. Después, se muestra 
 * la suma de todos los elementos.
*/

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int [] array;
		int suma;
		// Pedimos al usuario la cantidad de elementos
		System.out.println("¿Cuantos elementos quieres en el Array?");
		n = sc.nextInt();
		//Creamos el array
		array = new int [n];
		// Llebanis el array con numeros aletorios
		for (int i = 0; i < n; i++) {
			//Se multiplica por 100 porque El método Math.random() devuelve un número aleatorio entre 0 y 1,
			array[i] = (int) (Math.random()*100);
		}
		
		// Calculamos la suma de todos los elementos
		suma = 0;
		for(int i = 0; i < n; i++) {
			suma += array[i];
		}
		
		// Mostramos la suma de los elementos
		System.out.println("La suma es : " + suma);
		// Mostramos el array
		System.out.println("El array es: " + Arrays.toString(array));
		
	}

}
