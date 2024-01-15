package Arrays;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena;
		String[] subcadenas;
		
		System.out.println("Introduce una cadena: ");
		cadena = sc.nextLine();
		//Separamos la cadena en un array de subcadenas
		//subcadenas = cadena.split("[,.!?]");
		subcadenas = cadena.split(" ");
		//Imprimimos el array de subcadenas
		for(String subcadena : subcadenas) {
			System.out.println(subcadena);
		}
		
		
	}

}
