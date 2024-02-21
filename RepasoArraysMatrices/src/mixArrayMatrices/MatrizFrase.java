package mixArrayMatrices;

import java.util.Arrays;

public class MatrizFrase {

	public static void main(String[] args) {
		//Esto seria lo que introduce el usuario:
		String cadena = "Esto es una cadena";
		String[] palabras = cadena.split(" ");
		// palabras = {"Esto", "es", "una","cadena"};
		String[][] letras = new String[palabras.length][];
		// letras = {
		// {},
		// {},
		// {},
		// {}
		//}
		
		for (int i = 0; i < letras.length; i++) {
			letras [i] = palabras[i].split(" ");
		}
		
		for ( palabras : letras) {
			System.out.println();
		}
		
		System.out.println(Arrays.toString(null));
	}
}
