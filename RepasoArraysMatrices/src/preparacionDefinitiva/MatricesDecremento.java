package preparacionDefinitiva;

import java.util.Arrays;

public class MatricesDecremento {
	public static void main(String[] args) {
	    // Definimos la matriz bidimensional
	    int[][] contadores = {{4, 1, 0}, {2, 3, 0}};
	    int contadorCeros = 0;

	    // Bucle hasta obtener tantos ceros como filas y columnas tenga la matriz
	    while (contadorCeros != contadores.length * contadores[0].length) {
	        // Mostramos los contadores
	        System.out.println(Arrays.deepToString(contadores));

	        // Ponemos el contador de ceros a 0, para borrar el valor de la anterior vuelta
	        contadorCeros = 0;

	        // Recorremos la matriz bidimensional
	        for (int i = 0; i < contadores.length; i++) {
	            for (int j = 0; j < contadores[i].length; j++) {

	                // Si el contador en la posición (i, j) aún no está a 0, lo decrementamos.
	                // Si no, entonces incrementamos el contador de ceros +1.
	                if (contadores[i][j] > 0) {
	                    contadores[i][j]--;
	                } else {
	                    contadorCeros++;
	                }
	            }
	        }
	    }
	}

}
