package Cadenas;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// Haz un programa que pida al usuario un texto
		//y dos �ndices (dos n�meros que indiquen posiciones
		//dentro de la cadena). Despu�s, muestra la subcadena 
		//del texto. Por ejemplo: si se introducen "Prueba", "2" 
		//y "4", se mostrar� "ueb". Hacer este ejercicio sin emplear 
		//"substring()", s�lo con lo que hemos visto de caracteres 
		//hasta el momento.
		Scanner entrada = new Scanner(System.in);
		String cadena;
		int indice0;
		int indice1;
		
		System.out.println("Introduce e texto");
		cadena = entrada.nextLine();
		System.out.print("Introduce el primer indice: ");
		indice0 = entrada.nextInt();
		System.out.print("Introduce el segundo indice: ");
		indice1 = entrada.nextInt();
		for	(int i=indice0;i <= indice1;i++) {
			System.out.print(cadena.charAt(i));
		}

	}

}
