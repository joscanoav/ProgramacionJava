package Cadenas;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		/* Haz un programa que pida al usuario una cadena original 
		 * y otra cadena de b�squeda. El programa deber� decir en qu� 
		 * �ndice (posici�n) se encuentra la cadena de b�squeda dentro 
		 * de la cadena original. Busca una operaci�n de las disponibles 
		 * que te facilite esta tarea. Por ejemplo: si se introducen "mermelada" 
		 * como cadena original y "la" como cadena de b�squeda, deber� mostrar "
		 * Encontrada en �ndice 5" (la letra ele est� en esa posici�n).*/
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
