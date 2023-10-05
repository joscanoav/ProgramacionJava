package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/* Haz un programa que pida al usuario el radio de una circunferencia
		y nos muestre su longitud, así como el área del círculo que abarca.
		Puedes buscar en Google las fórmulas para su obtención.*/
		
		int radio;
		double pi = 3.14;
		
		System.out.print("Introduce el radio de la circunferencia: ");
		Scanner teclado = new Scanner(System.in);
		radio = teclado.nextInt();

		System.out.println("El area de la circunferencia es: " + (pi * radio * radio));
		System.out.println("La longitud de la circunferencia es: " + (2 * pi * radio));
				
	}

}
