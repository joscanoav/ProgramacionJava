package preparacionDefinitiva;
/*Haz un programa que tenga una matriz (array bidimensional) de doubles, inicializada directamente en el código, y cree un vector (1D) de doubles con la media de cada fila. Ejemplo:*/

import java.util.Arrays;

public class MatrizMediasFilas {

	public static void main(String[] args) {
		double[][] matriz = {
				{2, 2, 1},
				{3, 4, 5},
				{1, 1, 6}
			};
			double[] medias = new double[matriz.length];
			
			for (int i = 0; i < matriz.length; i++) {

				for (int j = 0; j < matriz[i].length; j++) {
					medias[i] += matriz[i][j];
				}
				
				medias[i] /= matriz[i].length;
			}
			/*En resumen, el operador /= en la l�nea medias[i] /= matriz[i].length; realiza la operaci�n de dividir medias[i] por la longitud de la fila y asigna el resultado nuevamente a medias[i]. Esto se hace para calcular la media de cada fila de la matriz.*/
			System.out.println(Arrays.toString(medias));
		}

	
	}


