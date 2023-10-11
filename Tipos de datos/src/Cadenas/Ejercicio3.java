package Cadenas;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// Haz un programa que pida al usuario 
		//un texto y muestre sus caracteres en 
		//mayúsculas. Hacer este ejercicio sin 
		//emplear "toUpperCase()", sólo con lo que 
		//hemos visto de caracteres hasta el momento.
		Scanner in = new Scanner(System.in);
			
		System.out.println("Escriba un texto");
		String texto = in.nextLine();
		
		char[] caracteres = new char[texto.length()];
		
		for (int i=0;i<texto.length();i++) {
			char caracter = texto.charAt(i);
			if(caracter >= 'a' && caracter <= 'z') {
				caracter = (char) (caracter - ('a'-'A'));
			}
			caracteres[i]=caracter;

		}
		String mayusculas = String.valueOf(caracteres);

		System.out.println("El texto en mayusculas: " + mayusculas);

	}

}
