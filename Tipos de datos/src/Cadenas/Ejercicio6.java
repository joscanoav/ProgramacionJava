package Cadenas;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		/*Hacer un programa que pida una
		 * cadena y la muestre en espejo. 
		 * Por ejemplo: si el usuario 
		 * introduce "manos", deberá 
		 * mostrar "manossonam".*/
	String cadena;
	String espejo="";
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Escriba un texto");
	cadena = entrada.nextLine();
	
	for(int i=cadena.length() - 1; i >=0; i--) {
		espejo +=cadena.charAt(i);
	}
	
	System.out.println("El espejo es: "+ cadena + espejo);

	}

}
