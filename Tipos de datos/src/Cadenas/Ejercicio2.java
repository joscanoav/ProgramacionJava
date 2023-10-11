package Cadenas;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		/* Haz un programa que pida al usuario un texto y muestre
		 *  cuántas vocales tiene. Las vocales pueden ser mayúsculas 
		 *  o minúsculas. Por ejemplo: si el string es "CadEnA", mostrará
		 *  "CadEnA tiene 3 vocales".*/
		int cvocales=0;
				
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe un texto: ");
		String texto = in.nextLine();
		
		for (int i = 0; i < texto.length();i++) {

			char caracter = texto.charAt(i);
			if(caracter == 'a' || caracter == 'e'|| caracter == 'i'|| caracter == 'o'|| caracter == 'u' ||
			caracter == 'A' || caracter == 'E'|| caracter == 'I'|| caracter == 'O'|| caracter == 'U'	) {
				cvocales++;
			}
			
			}
		System.out.println("El texto tiene las siguiente vocales: " + cvocales);

		}
		
		
		
	}


