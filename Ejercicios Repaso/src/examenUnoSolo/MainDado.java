package examenUnoSolo;

import java.util.Scanner;

public class MainDado {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese numero de caras del dado: ");
		int caras = teclado.nextInt();
		Dado dado = new Dado(caras);
		
		while(true) {
			System.out.println("Elija una opcion");
			System.out.println("1. Desea Apostar: ");
			System.err.println("2.Salir");
			
			int opcion = teclado.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("Ingrese el numero a apostar");
			int numero = teclado.nextInt();
			System.out.println("Ingrese la cantidad a apostar");
			int apuesta = teclado.nextInt();
			dado.apostar(numero, apuesta);
			break;
		case 2:

			System.out.println("Fin del juego puntos finales: " + dado.puntos);
			return;
		}
		
		} 
		
	}

}
