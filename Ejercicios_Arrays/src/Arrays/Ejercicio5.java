package Arrays;

import java.util.Random;
import java.util.Scanner;

/*Implementa el siguiente juego:
1. Se genera un "tablero" (array de booleans) aleatorio (los valores de cada posición son "true" o "false" generados con "nextBoolean()" de "Random").
2. El usuario hace una ronda: elige una posición y el boolean de dicha posición se invierte (de "true" pasa a "false" o al revés).
3. Luego, el ordenador le dice cuántos "trues" hay en el tablero.
4. Si todas las posiciones están a "true", termina el juego. Si no, se hace una nueva ronda.*/

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 10;
		boolean [] tab = new boolean[size];
		Random randGen = new Random();
		int pos;
		int contTrues = 0;
		
		// Se llena el array con booleans aletorios.
		for (int i=0; i < tab.length; i++) {
			tab[i] = randGen.nextBoolean();
		}
		//Bucle del juego.
		do {
			System.out.println("Introduce la ficha que quieres invertir (de 1 a " + size + " ): ");
			pos = sc.nextInt();
			// Como le hemos pedido la posicion desde 1, hay que decrementar para que vaya desde 0.
			pos--;
			// Si la posicion es valida...
			if(pos >=0 && pos < size) {
				//Invertir el valor del boolean.
				tab[pos] = !tab[pos];
				// Poner "ContTrues" a 0.
				contTrues = 0;
				
				// Contar los trues.
				for (boolean b : tab) {
					if (b) {
						contTrues++;
					}
				}
				System.out.println("Hay " + contTrues + " fichas bien colocadas.");
			} else { // Si la posicion no es valida...
				System.out.println("ERROR: posicion no valida.");
			}
		}while (contTrues != size);
		
		System.out.println("Enhorabuena, todas las fichas estan bien colocadas");
	}

}
