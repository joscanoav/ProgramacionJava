package ModeloA;

import java.lang.reflect.Array;
import java.util.Iterator;

public class Ejercicio01 {

	public static void main(String[] args) {
		int[] numeros = {2,4,12,24,55,110};
		int menor = numeros[0];
		int mayor = numeros[0];
		
		for (int i = 1; i < numeros.length; i++) {
			// if para el menor
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
			//if para el mayor
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
		}
		
		System.out.println("Menor : " + menor);
		System.out.println("Mayor : " + mayor);
		
		for (int i = 0; i < numeros.length - 1; i++) {
			if (numeros[i] == numeros[i+1] / 2) {
		        System.out.println("SI");
			}else {
				System.out.println("NO");
			}
			
			
		}
	}

}

