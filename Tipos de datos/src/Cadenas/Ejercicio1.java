package Cadenas;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
	 /* Haz un programa que pida al usuario un texto 
	  * y muestre sus caracteres separados por guiones. 
	  * Por ejemplo: si el string es "HOLA", saldría 
	  * "H-O-L-A".*/
		Scanner in = new Scanner(System.in);
		String texto;
		String SeparadorPalabra = "";
		System.out.println("Introduce una palabra: ");
		texto = in.nextLine();
		
		for(int i=0; i < texto.length();i++) {
			if (i < texto.length()- 1) {
				SeparadorPalabra += texto.charAt(i) + "-";
				
		} else {
			
			SeparadorPalabra += texto.charAt(i);
		}
		}
		
		System.out.println(SeparadorPalabra);

	}

}
