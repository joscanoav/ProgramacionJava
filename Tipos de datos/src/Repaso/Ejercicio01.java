package Repaso;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
/*Haz un programa que pida una cadena por teclado y nos diga 
 * si cumple este patrón: L{4}D{2}$
 * Esto quiere decir: 4 letras mayúsculas,
 * dos dígitos y un símbolo del dólar.*/
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String cadena = teclado.nextLine();
		
		boolean cumplePatron = true;
		int contadorLetras = 0;
		int contadorDigitos =0;
					
			for(int i=0;i< cadena.length();i++) {
				char caracter = cadena.charAt(i);
				
				if (Character.isUpperCase(caracter)) {
					contadorLetras++;
				}else if (Character.isDigit(caracter)) {
					contadorDigitos++;
				}else {
					cumplePatron = false;
					break;
				}
			}
			
			if(contadorLetras == 4 && contadorDigitos == 2 && cadena.charAt(cadena.length() - 1) == '$') {
		
				System.out.println("La cadena cumple el patron.");
			}else {
				System.out.println("La cadena no cumple el patron");
			}
		}

		
	}

