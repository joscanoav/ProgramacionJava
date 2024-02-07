package ModeloB;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] enteros = {2,8,3,14,21,7};
		int num1;
		int num2;
		int divisiblePrimero=0;
		int divisibleSegundo=0;
		int productoPrimero =0;
		int productoSegundo =0;

		
		System.out.println("Array :" + Arrays.toString(enteros));
		System.out.println("Introduce el numero para la operacion: ");
		num1 = sc.nextInt();
		System.out.println("Introduce el numero para la operacion: ");
		num2 = sc.nextInt();
		
		
		for (int i = 0; i < enteros.length; i++) {
			if(enteros[i] % 2 == 0) {
				divisiblePrimero = enteros[i];
			}else {
				divisibleSegundo =enteros[i];
			}
		}
		
		productoPrimero = divisiblePrimero * num1;
		productoSegundo = divisibleSegundo * num2;

		

			System.out.println("Divisible solo entre el primero: " + num1 + " * " + divisiblePrimero + " = " + productoPrimero);
			System.out.println("Divisible solo entre el segundo: " + num2 + " * " + divisibleSegundo + " = " + productoSegundo);
		}
	}

