package Cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/* Mejorar el ejercicio 8 para que busque todos los índices donde se 
		 * encuentre la cadena de búsqueda (puede estar repetida). Por ejemplo: 
		 * si se introducen "mermelada" como cadena original y "me" como cadena de 
		 * búsqueda, deberá mostrar "Encontrada en índices: 0 y 3".
		 */

		Scanner entrada = new Scanner(System.in);
		String cadenaOriginal;
		String cadenaBusqueda;
		int[] indices;
		
		System.out.print("Introduce una cadena Original: ");
		cadenaOriginal = entrada.nextLine();
		System.out.println("Introduce una cadena de Busqueda: ");
		cadenaBusqueda = entrada.nextLine();
		
		//Inicia la funcion buscarCadena
		indices = buscarCadena(cadenaOriginal,cadenaBusqueda);
		
		if (indices.length > 0) {
			System.out.print("Encontrada en indices: ");
			for(int i= 0;i < indices.length;i++) {
				System.out.print(indices[i]);
				if (i < indices.length - 1) {
					System.out.print(" y ");
				}
			}
		}else {
			System.out.println("La cadena no se encuentra");
		}
	}	
		public static int[] buscarCadena(String cadenaOriginal, String cadenaBusqueda) {
			int longitudOriginal = cadenaOriginal.length();
			int	LongitudBusqueda = cadenaBusqueda.length();
			int[] indicesEncontrados = new int [longitudOriginal];
			
			int count =0;
			
			
			for(int i = 0; i <= longitudOriginal - LongitudBusqueda;i++) {
				if(cadenaOriginal.substring(i,i + LongitudBusqueda).equals(cadenaBusqueda)) {
					if (count < indicesEncontrados.length) {
					indicesEncontrados[count] = i;
					count++;
					
					}
			
				}
			}
			
		
			int[] ocurrencias = Arrays.copyOfRange(indicesEncontrados, 0, count);
			return ocurrencias;
	}

}


