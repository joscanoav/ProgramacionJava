package preparacionDefinitiva;

import java.util.Arrays;
import java.util.Random;

public class ArrayAletorioOrdenado {

	public static void main(String[] args) {
		
		int longitud = 7;
		int [] array = new int[longitud];
		boolean desordenado = true;
		Random rand = new Random();
		
		//Bucle atrapado hasta que este ordenado
		while(desordenado){
			//Ponemos desordenado a false:
			desordenado = false;
			// Rellenamos el array de forma aletoria
			for (int i = 0; i < array.length; i++) {
				array[i] = rand.nextInt(longitud) + 1;
				
			}
			
			// Mostramos el array:
			System.out.println(Arrays.toString(array));
			// Comprobamos si hay orden:
			for (int i = 0; i < array.length -1 && !desordenado; i++) {
				if(array[i] > array[i + 1]) {
					desordenado = true;
				}
			}
		}
		
	}

}
