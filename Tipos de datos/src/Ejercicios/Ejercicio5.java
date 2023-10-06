package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Haz un programa que pida al usuario su
		//año de nacimiento y le diremos si nación 
		//en año bisiesto o no. Un año bisiesto
		//cumple la siguiente condición: es divisible
		//entre 4 pero no es divisible entre 100, o 
		//bien es divisible entre 400.
		int año_nac;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce tu año de nacimiento: ");
		año_nac = teclado.nextInt();
		
		if  ((año_nac % 4 == 0 && año_nac % 100 != 0) || (año_nac % 400 == 0)) {
			
			System.out.println("El año que naciste es biciesto");	
			
		}else {
			System.out.println("El año que naciste no es biciesto");
		}
			
	}

}
