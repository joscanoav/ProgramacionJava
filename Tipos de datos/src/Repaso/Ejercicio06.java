package Repaso;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
/*Haz un programa que pida al usuario una cadena y un 
 * car�cter de b�squeda. Despu�s mostrar� la cadena y,
 *  debajo de esta, pondr� una flecha (^) indicando la posici�n donde se encuentre el car�cter de b�squeda. Ejemplo:
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
