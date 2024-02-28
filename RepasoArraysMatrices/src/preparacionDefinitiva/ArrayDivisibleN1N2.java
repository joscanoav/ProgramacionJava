package preparacionDefinitiva;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDivisibleN1N2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] enteros = {2, 4, 7, 14 , 49, 8};
		int numDivisible1;
		int numDivisible2;
		int mulDivN1 = 1;
		int mulDivN2 =1;
		String stringDivsN1 = "";
		String stringDivsN2 = "";
		
		//  2*4*8 = 64
		//	7*49 =  343
		System.out.println("Array :" + Arrays.toString(enteros));
		System.out.println("Introduce el numero para la operacion: ");
		numDivisible1 = sc.nextInt();
		System.out.println("Introduce el numero para la operacion: ");
		numDivisible2 = sc.nextInt();
		
		for (int i = 0; i < enteros.length; i++) {
			//Divisibles entre N1 solamente
			if(enteros[i]% numDivisible1 == 0 && enteros[i] % numDivisible2 != 0) {
				
				mulDivN1 *= enteros[i]; // acumulamos el numero
				stringDivsN1 += " * " + enteros[i]; // "* 1", por ejemplo
				}
			
			//Divisibles entre N2 solamente
			if(enteros[i]% numDivisible2 == 0 && enteros[i] % numDivisible1 != 0) {
					
				mulDivN2 *= enteros[i]; // acumulamos el numero
				stringDivsN2 += " * " + enteros[i]; // "* 1", por ejemplo
				}
					
			}
		
		System.out.println(" Divisible entre 2: " + stringDivsN1.substring(3) + " = " + mulDivN1);
		System.out.println(" Divisible entre 7: " + stringDivsN2.substring(3) + " = " + mulDivN2);
	
		


		}
		
	}

