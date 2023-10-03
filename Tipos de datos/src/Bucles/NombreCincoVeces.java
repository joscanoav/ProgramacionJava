package Bucles;

import java.util.Scanner;

public class NombreCincoVeces {

	public static void main(String[] args) {
		
		String nombre;
		int contador = 1;
		
		System.out.print("Introduce nombre: ");
		Scanner entrada = new Scanner(System.in);
		nombre = entrada.next();
		
		while (contador <= 5) {
			System.out.println(nombre);
		contador++;
			
		}
		
		
	}

}
