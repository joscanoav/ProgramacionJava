package Arrays;

import java.util.Arrays;

public class Ejercicio1212 {

	public static void main(String[] args) {

		double [] alturas = {1.6 , 1.8, 1.7, 1.75, 1.65};
		boolean[] verificaciones = new boolean[alturas.length];
		double media = 0;
		
		for (double altura : alturas) {
			media += altura;
		}
		
		media /= alturas.length;
		System.out.println("La altura media es : " + media);
		
		for (int i = 0; i < alturas.length; i++) {
			// Si la altura de esa posicion supera o iguala a la media ....
			if(alturas[i] >= media) {
				// Se cambia la bandera de esa posicion a true.
				verificaciones[i] = true;
			}
			
		}
		
		System.out.println(Arrays.toString(verificaciones));
	}

}
