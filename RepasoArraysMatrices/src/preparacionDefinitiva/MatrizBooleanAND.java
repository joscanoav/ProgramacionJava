package preparacionDefinitiva;

import java.util.Arrays;
/*Haz un programa que tenga una matriz (array 2D) de booleans, inicializada directamente en el código, y cree un vector (1D) de booleans con el cálculo && de cada columna. Ejemplo:

matriz = {
    {true, false, false, true},
    {true, true, true, true},
    {false, true, false, true},
}

array && -> {false, false, false, true}*/

public class MatrizBooleanAND {

	public static void main(String[] args) {
		boolean[][] matriz = {
			    {true, false, false, true},
			    {true, true, true, true},
			    {false, true, false, true},
			};
			boolean[] andsCols = new boolean[matriz[0].length];
			
			// Rellena el array con todo "true".
			Arrays.fill(andsCols, true);

			for (int i = 0; i < matriz.length; i++) {
				
				for (int j = 0; j < matriz[i].length; j++) {
					andsCols[j] = andsCols[j] && matriz[i][j];
				}
				
			}
			
			System.out.println(Arrays.toString(andsCols));
		}

	
	}


