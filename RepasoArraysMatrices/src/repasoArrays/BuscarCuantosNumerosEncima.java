/*Sobre un array en código, que el
 *  usuario introduzca un número a 
 *  buscar y nos diga cuántos 
 *  números por encima de éste existen dentro del array.
*/

package repasoArrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BuscarCuantosNumerosEncima {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Crear un array de ejemplo
		int[] numeros = {9,1,4,5,1,7,8,0};
		// Mostrar el array
		System.out.print("Array es: "  + Arrays.toString(numeros));
		System.out.println();
		System.out.println("Introduce el numero a buscar: ");
		int numeroBuscado = sc.nextInt();
		//Contrar cuantos numeros son mayores que el numero ingresado
		int contadorMayores = 0;
		
		for (int numero : numeros) {
			if(numero > numeroBuscado) {
				contadorMayores++;
			}
		}
		System.out.print("Hay " + contadorMayores + " numeros mayores");
		System.out.println();
		System.out.print("Los numeros mayores son:" );

		for (int num : numeros) {
			if(num > numeroBuscado) {
				System.out.print( " " + num + " ");
			}
		}
			
		
	}

}
