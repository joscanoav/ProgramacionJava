package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Haz un programa que pida al usuario un 
		//n�mero y diga si est� en el rango [0,100]
		//o no. Por ejemplo: 0, 5, 97, 44 y 100 est�n 
		//en el rango [0,100], pero -31, 903, 101, -14 
		//y 322 no lo est�n.
	
		int x;
	System.out.print("Introduce numero: ");
	Scanner teclado = new Scanner(System.in);
	x = teclado.nextInt();
	if (x <= 100 && x > 0) {
		
		System.out.println("El numero esta en el rango [0,100]");
	}else {
		System.out.println("El numero no esta en el rango");

	}
	
		
	}

}
