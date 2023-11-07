package Repaso;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*Haz un programa que pida una cadena por teclado y nos diga si cumple este patrón: 
		 * L{1,15}$D{1,2} Esto quiere decir: de 1 (mínimo) a 15 letras (máximo) mayúsculas, 
		 * un símbolo del dólar y de 1 (mínimo) a 2 (máximo) dígitos.*/
		
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = teclado.nextLine();

        boolean cumplePatron = true;
        int contadorLetras = 0;
        int contadorDigitos = 0;

        // Comprobamos que la cadena comience con una letra mayúscula
        if (!Character.isUpperCase(cadena.charAt(0))) {
            cumplePatron = false;
        }

        // Comprobamos que la cadena contenga de 1 a 15 letras mayúsculas
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

        // Comprobamos que la cadena contenga de 1 a 2 dígitos
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

        // Comprobamos que el último carácter de la cadena sea un símbolo del dólar
        if (cadena.charAt(cadena.length() - 1) != '$') {
            cumplePatron = false;
        }

        if (cumplePatron) {
            System.out.println("La cadena cumple el patrón.");
        } else {
            System.out.println("La cadena no cumple el patrón");
        }
    }
}
