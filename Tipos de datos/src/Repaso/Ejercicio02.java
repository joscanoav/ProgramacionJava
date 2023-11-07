package Repaso;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*Haz un programa que pida una cadena por teclado y nos diga si cumple este patr�n: 
		 * L{1,15}$D{1,2} Esto quiere decir: de 1 (m�nimo) a 15 letras (m�ximo) may�sculas, 
		 * un s�mbolo del d�lar y de 1 (m�nimo) a 2 (m�ximo) d�gitos.*/
		
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = teclado.nextLine();

        boolean cumplePatron = true;
        int contadorLetras = 0;
        int contadorDigitos = 0;

        // Comprobamos que la cadena comience con una letra may�scula
        if (!Character.isUpperCase(cadena.charAt(0))) {
            cumplePatron = false;
        }

        // Comprobamos que la cadena contenga de 1 a 15 letras may�sculas
        for (int i = 1; i < cadena.length(); i++) {
            if (Character.isUpperCase(cadena.charAt(i))) {
                contadorLetras++;
            } else {
            	 if (contadorLetras < 1 || contadorLetras > 15) {
                     cumplePatron = false;
                     break;
                 }
            }
        }

        // Comprobamos que la cadena contenga de 1 a 2 d�gitos
        for (int i = contadorLetras; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                contadorDigitos++;
            } else {
                if (contadorDigitos < 1 || contadorDigitos > 2) {
                    cumplePatron = false;
                    break;
                }
            }
        }

        // Comprobamos que el �ltimo car�cter de la cadena sea un s�mbolo del d�lar
        if (cadena.charAt(cadena.length() - 1) != '$') {
            cumplePatron = false;
        }

        if (cumplePatron) {
            System.out.println("La cadena cumple el patr�n.");
        } else {
            System.out.println("La cadena no cumple el patr�n");
        }
    }
}
