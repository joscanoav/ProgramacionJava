package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/* Haz un programa que pida al usuario un número y nos diga todos sus divisores. Un divisor es aquel
		 *  que divide al número en partes iguales, dando un resto 0. Por ejemplo: si el número 
		 *  introducido es 8, sus divisores serán 1, 2, 4 y 8 (1 y el propio número cuentan). 
		 *  Otro ejemplo: si el número introducido es 12, sus divisores serán 1, 2, 3, 4, 6 y 12.*/
		Scanner teclado = new Scanner (System.in);
		int numero;
		int i = 1; 
		System.out.println("Escriba un numero");
		numero = teclado.nextInt();
		
		while (numero >= i) {
			
			if (numero % i ==0) {
				System.out.print( i + " ");
			}
		
		i++;
		}
		
	
	}

}
