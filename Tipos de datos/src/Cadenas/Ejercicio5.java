package Cadenas;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		/* Hacer un programa que pida al usuario una
		 *  cadena y compruebe si es un palíndromo. 
		 *  Un palíndromo es aquel texto que se lee igual de 
		 *  izquierda a derecha que de derecha a izquierda. 
		 *  Por ejemplo: ojo, ala, acurruca, hannah, rayar, 11211...*/
	Scanner entrada = new Scanner(System.in);
	String cadena;
	int longitud;
	boolean esPalindromo=true;
	System.out.println("Escriba un texto");
	cadena = entrada.nextLine();
	//Elimina los espacios en blanco y convierte a minuscula
	cadena = cadena.replaceAll("\\s+", "").toLowerCase();
	longitud = cadena.length();
	
	for(int i = 0; i < longitud/2;i++) {
		if(cadena.charAt(i) != cadena.charAt(longitud - i - 1)) {
			esPalindromo=false;
			break;
		}
	}
	
	if(esPalindromo) {
			
			System.out.println("Es palíndromo");
		
	}else {
			System.out.println("No es palíndromo");
	    }
	}
	
  }
	
