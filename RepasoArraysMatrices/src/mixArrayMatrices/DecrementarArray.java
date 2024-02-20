package mixArrayMatrices;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DecrementarArray {

	public static void main(String[] args) {
		int[] contadores = {4,1,2};
		boolean todosCeros=false;
		
		while(!todosCeros) {
			todosCeros = true;
	
		// Mostramos el array
		System.out.println(Arrays.toString(contadores));
		
		for (int i = 0; i < contadores.length; i++) {
			//Decrementamos la posicion si > 0:
			if(contadores[i] > 0) {
				todosCeros= false;
				contadores[i]--;
			}
		  }
		}
	}
}
// Buena practica programacion
// Un return por metodo
// no puede haber breaks ni continuos ni multiples returns
