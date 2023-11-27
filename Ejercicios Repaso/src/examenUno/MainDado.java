package examenUno;

import java.util.Random;
import java.util.Scanner;

public class MainDado {

	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el numero de caras del dado: ");
		int caras = scanner.nextInt();
		Dado dado = new Dado(caras);
		
		while(true) {
			System.out.println("Opciones:");
			System.out.println("1. Lanzar dado");
			System.out.println("2. Apostar");
			System.out.println("3. Salir");
			
			int opcion = scanner.nextInt();
			
		switch (opcion) {
		
			case 1:
				dado.LanzarDado();
				break;
			case 2:
				System.out.println("Ingrese el numero al que quiere apoastar:");
				int numeroApostado = scanner.nextInt();
				System.out.println("Ingrese la cantidad de puntos que quiere apostar:");
				int puntosApostados = scanner.nextInt();
				dado.apostar(numeroApostado, puntosApostados);
				break;
			case 3:
				System.out.println("Fin del juego. Puntos acumulados " + dado.getPuntos() );
				System.exit(0);
			default:
				System.out.println("Opcion no valida. Intentalo de nuevo.");
		}
			
		
		}
		
	}

}
