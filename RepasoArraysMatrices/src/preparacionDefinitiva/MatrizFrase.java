package preparacionDefinitiva;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizFrase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena;
		// palabras = {"Esto", "es", "una","cadena"};
		// letras = {
		//     {},
		//     {},
		//	   {},
		//	   {}
		// }
		System.out.println("Introduce una cadena");
		cadena = sc.nextLine();
		String[] palabras = cadena.split(" ");
		String[][] letras = new String[palabras.length][];

		for (int i  = 0; i < letras.length; i++) {
			letras[i] = palabras[i].split("");
		}
		for (String[] palabra : letras) {
			System.out.println(Arrays.toString(palabra));
			
		}
		
		
	}

}
