package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1010 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String frase;
		String[] palabras;
		String letra;
		char caracter;
		int [] recuentos;
		
		System.out.println("Introduce una frase: ");
		frase = scanner.nextLine();
		
		palabras = frase.split(" ");
		recuentos = new int[palabras.length];
		
		System.out.println("Introduce una letra: ");
		letra = scanner.nextLine();
		caracter = letra.charAt(0);

		for (int i = 0; i < palabras.length; i++) {
			
			for (int j = 0; j < palabras[i].length(); j++) {
				
				if(palabras[i].charAt(j) == caracter) {
					recuentos[i]++;
				}
				
			}
			
		}
		
		System.out.println(Arrays.toString(recuentos));
		
	}

}
