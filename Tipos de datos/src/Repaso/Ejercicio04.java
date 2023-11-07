package Repaso;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
/* Haz un programa pida una cadena y vaya mostrándola conforme se borran sus caracteres de los bordes. Ejemplo: si la cadena es "Prueba", saldrá:
Prueba
rueb
ue
FIN
*/
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String cadena = teclado.nextLine();
		System.out.println(cadena);
		while (cadena.length()>2) {
			cadena = cadena.substring(1,cadena.length()-1);
			System.out.println(cadena);
		}
		
		System.out.println("FIN");
	}

}
