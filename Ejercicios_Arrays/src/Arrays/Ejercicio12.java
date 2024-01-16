package Arrays;

import java.util.Arrays;

/*Hacer un programa que calcule para un array de 
 * alturas humanas (doubles o floats, escrito en código), 
 * calcule la altura media y luego cree un array de booleans 
 * de la misma longitud, indicando con un "true" si la altura de 
 * cada posición es igual o mayor a la media, así como con un "false"
 *  si está por debajo.
*/
public class Ejercicio12 {

	public static void main(String[] args) {
		// Array de alturas (doubles o floats)
		double[] alturas = {1.75, 1.68, 1.82, 1.60, 1.90};
		//Variables
		double media;
		boolean[] mayoresOIgualesALaMedia;
		//Calcular la altura media
		media = calcularMedia(alturas);
		// Crear un array de booleans indicando si la altua es igual
		mayoresOIgualesALaMedia = new boolean[alturas.length];
		for(int i = 0; i < alturas.length; i++) {
			mayoresOIgualesALaMedia[i] = alturas[i] >= media;
		}
		// Mostrar resultados
		
		System.out.println("Alturas: " + Arrays.toString(alturas));
		System.out.println("Altura media: " + media);
		System.out.println("¿Mayor o igual a la media?: " + Arrays.toString(mayoresOIgualesALaMedia));
		
	}
	
	public static double calcularMedia(double[] array) {
		double suma = 0;
		for (double numero : array) {
			suma += numero;
		}
		
		return suma / array.length;
	}

}
