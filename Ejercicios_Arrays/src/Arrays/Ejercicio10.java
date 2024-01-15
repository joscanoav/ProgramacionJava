package Arrays;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		// Solicitar al usuario una cadena
		System.out.print("Ingrese una cadena: ");
		String cadena = sc.nextLine();
		// Solicitar al usuario una letra objetivo
		System.out.print("Ingrese una letra objetivo: ");
		char letraObjetivo = sc.nextLine().charAt(0);
		// Separar las palabras mediante el metodo "split()"
		String[] palabras = cadena.split(" ");
		// Crear un array de enteros para contar el nmero de veces que
		// aparece la letra objetivo en cada palabra
		
		int[] contadorLetras = new int[palabras.length];
		//Contar el numero de veces que aparece la letra objetivo
		for(int j = 0; j < palabras.length; j++) {}
		
		
		
		
		
	}

}
