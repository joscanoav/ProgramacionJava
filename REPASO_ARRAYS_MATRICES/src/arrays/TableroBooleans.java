package arrays;

import java.util.Random;
import java.util.Scanner;

public class TableroBooleans {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = 10;
		boolean[] tab = new boolean[size];
		Random randGen = new Random();
		int pos;
		int contTrues = 0;

		// Se llena el array con booleans aleatorios.
		for (int i = 0; i < tab.length; i++) {
			tab[i] = randGen.nextBoolean();
		}

		// Bucle del juego.
		do {
			System.out.print("Introduce la ficha que quieres invertir (de 1 a " + size + "): ");
			pos = scanner.nextInt();

			// Como le hemos pedido la posición desde 1, hay que decrementar para que vaya desde 0.
			pos--;

			// Si la posición es válida...
			if (pos >= 0 && pos < size) {
				// Invertir el valor del boolean.
				tab[pos] = !tab[pos];

				// Poner "contTrues" a 0.
				contTrues = 0;

				// Contar los trues.
				for (boolean b : tab) {

					if (b) {
						contTrues++;
					}

				}

				System.out.println("Hay " + contTrues + " fichas bien colocadas.");
			} else { // Si la posición no es válida...
				System.out.println("ERROR: posición no válida.");
			}

		} while (contTrues != size);

		System.out.println("Enhorabuena, todas las fichas están bien colocadas!");
	}

}