package Cadenas;

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
		int indice;
		
		System.out.print("Introduce una cadena Original: ");
		cadenaOriginal = entrada.nextLine();
		System.out.println("Introduce una cadena de Busqueda: ");
		cadenaBusqueda = entrada.nextLine();
		indice = buscarCadena(cadenaOriginal,cadenaBusqueda);
		
		if (indice != -1) {
			System.out.print("Encontrada en indice: " + indice);
		}else {
			System.out.println("La cadeba no se encuentra");
		}
	}	
		public static int buscarCadena(String cadenaOriginal, String cadenaBusqueda) {
			int longitudOriginal = cadenaOriginal.length();
			int	LongitudBusqueda = cadenaBusqueda.length();
			for(int i = 0; i <= longitudOriginal - LongitudBusqueda;i++) {
				if(cadenaOriginal.substring(i,i + LongitudBusqueda).equals(cadenaBusqueda)) {
					return i;
				}
			}
			
			return -1;
		
		
		
		
		
	}

}
