package Ejercicios;
import  java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		/* Haz un programa que pida al usuario dos n�meros y muestre
		la multiplicaci�n desarrollada como suma de ambas formas. Por 
		ejemplo: si introduce 4 y 6, por consola saldr�:
		6 + 6 + 6 + 6
		4 + 4 + 4 + 4 + 4 + 4 */
		int  num1;
		int  num2;
		int	 i = 0;
		int j=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un primer numero a multiplicar: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce un segundo numero a multiplicar: ");
		num2 = teclado.nextInt();

		while (i < num1 ) {
			
			System.out.print(num2);
			if (i < num1 - 1 ) {
				System.out.print(" + ");
			}
			i++;
		} 
		System.out.println();

		
		while (j < num2 ) {

			System.out.print(num1);	
			if (j < num2 - 1 ) {
				System.out.print(" + ");
			}
			j++;
		}
		System.out.println();
				
		}
	
}

