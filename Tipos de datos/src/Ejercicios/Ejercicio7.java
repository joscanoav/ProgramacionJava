package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/* Haz un programa que pida al usuario un n�mero y nos diga todos sus divisores. Un divisor es aquel
		 *  que divide al n�mero en partes iguales, dando un resto 0. Por ejemplo: si el n�mero 
		 *  introducido es 8, sus divisores ser�n 1, 2, 4 y 8 (1 y el propio n�mero cuentan). 
		 *  Otro ejemplo: si el n�mero introducido es 12, sus divisores ser�n 1, 2, 3, 4, 6 y 12.*/
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
