package Cadenas;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		/* Haz un programa que pida al usuario un texto y muestre
		 *  cuántas vocales tiene. Las vocales pueden ser mayúsculas 
		 *  o minúsculas. Por ejemplo: si el string es "CadEnA", mostrará
		 *  "CadEnA tiene 3 vocales".*/
		String texto="";
		int cvocales=0;
		char [] c= texto.toCharArray();
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe un texto: ");
		texto = in.nextLine();
		
		for (int i = 0; i < texto.length();i++) {
			switch (c[i]) {
		case 'a':
			cvocales++;
			i++;
			
			}
			
		}
		
		
		
	}

}
