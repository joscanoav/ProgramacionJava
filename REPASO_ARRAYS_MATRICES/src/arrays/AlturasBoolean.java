package arrays;
/*Hacer un programa que calcule para un array de alturas humanas (doubles o floats, escrito en c�digo), calcule la altura media y luego cree un array de booleans de la misma longitud, indicando con un "true" si la altura de cada posici�n es igual o mayor a la media, as� como con un "false" si est� por debajo.
*/
import java.util.Arrays;

public class AlturasBoolean {

	public static void main(String[] args) {
		double[] alturas = {1.6, 1.8, 1.7, 1.75, 1.65};
		boolean[] verificaciones = new boolean[alturas.length];
		double media = 0;

		for (double altura : alturas) {
			media += altura;
		}

		media /= alturas.length;

		System.out.println("La altura media es: " + media);

		for (int i = 0; i < alturas.length; i++) {

			// Si la altura en esa posici�n supera o iguala a la media...
			if (alturas[i] >= media) {
				// Se cambia la bandera de esa posici�n a true.
				verificaciones[i] = true;
			}

		}

		System.out.println(Arrays.toString(verificaciones));
	}

}