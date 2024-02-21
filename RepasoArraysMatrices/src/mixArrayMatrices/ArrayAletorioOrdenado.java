package mixArrayMatrices;

import java.util.Arrays;
import java.util.Random;

public class ArrayAletorioOrdenado {

	public static void main(String[] args) {
		
		int longitud = 4;
		int[] array = new int[longitud];
		boolean desordenado = true;
		Random rand = new Random();
		
		//Bucle atrapado hasta que este ordenado
		
		while(desordenado) {
			desordenado = false;
			
			//Rellenamos el array de forma aletoria
			
			for (int a = 0; a < array.length; a++) {
				array[a] = rand.nextInt(longitud);
			}
			
			//Mostramos array:
			System.out.println(Arrays.toString(array));
			
			// Comprobamos si hay desorden:
			for (int i = 0; i < array.length && !desordenado; i++) {
				if(array[i] > array[i+1]) {
					desordenado = true;
				}
			}
			
		}
		
	}

}
