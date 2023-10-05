package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/* Haz un programa que pida al usuario 3 dígitos binarios 
		y muestre su valor en decimal. Por ejemplo, si introduce 1, 1 y 0,
		mostrará 6. */
		
		int x;
		int y;
		int z;
		
		System.out.print("Introduce el primer digito en Binario: ");
		Scanner teclado = new Scanner(System.in);
		x = teclado.nextInt();
		System.out.print("Introduce el primer digito en Binario: ");
		y = teclado.nextInt();
		System.out.print("Introduce el primer digito en Binario: ");
		z = teclado.nextInt();
		System.out.println("El numero decimal es: " + (( x * 4)  + (y* 2) + z ));

	}

}
