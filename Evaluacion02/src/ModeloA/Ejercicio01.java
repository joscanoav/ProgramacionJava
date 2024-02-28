package ModeloA;

import java.lang.reflect.Array;

public class Ejercicio01 {

	public static void main(String[] args) {
		int[] numeros = {2,3,4,3,4,2,0};
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
		
	}


	}

