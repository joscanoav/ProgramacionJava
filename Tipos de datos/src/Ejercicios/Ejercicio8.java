package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*Haz un programa que pida al usuario un n�mero y nos diga si es primo o no. 
		Un n�mero primo es aquel que tiene solo dos divisores (v�ase el ejercicio anterior): 
		1 y �l mismo. Por ejemplo, �stos son algunos n�meros primos: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37...*/

		Scanner teclado = new Scanner (System.in);
		int a=0,i,numero;
		System.out.println("Ingrese numero");
		numero = teclado.nextInt();
		for (i=1; i<(numero+1);i++) {
			if(numero%i==0) {
				a++;
			}
		
		}
		if (a!=2) {
			System.out.println("No es Primo");
		} else {
			System.out.println("Si es Primo");
		}
		
	}

}
