package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Haz un programa que pida al usuario su
		//a�o de nacimiento y le diremos si naci�n 
		//en a�o bisiesto o no. Un a�o bisiesto
		//cumple la siguiente condici�n: es divisible
		//entre 4 pero no es divisible entre 100, o 
		//bien es divisible entre 400.
		int a�o_nac;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce tu a�o de nacimiento: ");
		a�o_nac = teclado.nextInt();
		
		if  ((a�o_nac % 4 == 0 && a�o_nac % 100 != 0) || (a�o_nac % 400 == 0)) {
			
			System.out.println("El a�o que naciste es biciesto");	
			
		}else {
			System.out.println("El a�o que naciste no es biciesto");
		}
			
	}

}
