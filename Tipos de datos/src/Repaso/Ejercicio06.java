package Repaso;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
/*Haz un programa que pida al usuario una cadena y un 
 * carácter de búsqueda. Después mostrará la cadena y,
 *  debajo de esta, pondrá una flecha (^) indicando la posición donde se encuentre el carácter de búsqueda. Ejemplo:
 * */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la cadena: ");
		String cadena = teclado.nextLine();
		
		System.out.println("Introduce el caracter de busqueda: ");
		char caracterBusqueda = teclado.next().charAt(0);
		System.out.println("Cadena original: " + cadena);
		
		for(int i = 0; i< cadena.length();i++) {
			System.out.print(cadena.charAt(i));
		}
		System.out.println();
		for (int i = 0; i< cadena.length();i++) {
			if(cadena.charAt(i)== caracterBusqueda) {
				System.out.print("^");
			}else {
				System.out.print(" ");
			}
		}
		
	}

}
