package Repaso;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
/*Haz un programa que pida dos números por teclado y nos
 *  diga cuáles son sus divisores comunes. Por ejemplo: si se
 *   introducen 6 y 24, hay que probar a dividirlos entre 1,
 *    2, 3... así hasta el 6, ya que es el más pequeño de los
 *    dos. En este caso, saldrían 1,  2, 3, 4 y 6.
*/
	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduce el primer numero: ");
	int num1 = teclado.nextInt();
	System.out.println("Introduce el segundo numero: ");
	int num2 = teclado.nextInt();
	System.out.println("Divisores comunes de " + num1 + " y " + num2 + ":");
	
	int menorNumero = Math.min(num1, num2);
	
	for(int i = 1; i <=menorNumero;i++) {
		if(num1 % i == 0 && num2 % i ==0) {
			System.out.println(i + " ");
		}
	}
	
	
	}

}
