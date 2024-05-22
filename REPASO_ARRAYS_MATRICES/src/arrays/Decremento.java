package arrays;
/*Haz un programa que comience con un vector (1D) de enteros y vaya mostrando 
 * dicho vector en la consola con decrementos hasta que todos los elementos valgan 0.
 *  Ejemplo:
*/
import java.util.Arrays;

public class Decremento {
	
	public static void main(String[] args) {
		int[] contadores = {4, 1, 0, 2, 3};
		int contadorCeros = 0;
		
		// Bucle hasta obtener tantos ceros como contadores haya en el array.
		while (contadorCeros != contadores.length) {
			// Mostramos los contadores.
			System.out.println(Arrays.toString(contadores));

			// Ponemos el contador de ceros a 0, para borrar el valor de la anterior vuelta.
			contadorCeros = 0;
			
			// Recorremos el array de contadores.
			for (int i = 0; i < contadores.length; i++) {
				
				// Si el contador en posición "i" aún no está a 0, lo decrementamos.
				// Si no, entonces incrementamos el contador de ceros +1.
				if (contadores[i] > 0) {
					contadores[i]--;
				} else {
					contadorCeros++;
				}
				
			}
			
		}
		
	}

}