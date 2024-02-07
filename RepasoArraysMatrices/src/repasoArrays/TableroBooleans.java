package repasoArrays;

import java.util.Random;
import java.util.Scanner;

public class TableroBooleans {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Tama�o del tablero
        int tamanoTablero = 10;

        // Inicializar el tablero con valores aleatorios
        boolean[] tablero = new boolean[tamanoTablero];
        for (int i = 0; i < tablero.length; i++) {
            tablero[i] = random.nextBoolean();
        }

        // Juego
        while (!todosSonTrue(tablero)) {
            // Mostrar el tablero actual
            mostrarTablero(tablero);

            // Hacer una ronda
            System.out.println("Elige una posici�n para invertir (0 - " + (tamanoTablero - 1) + "): ");
            int posicionElegida = sc.nextInt();

            // Verificar si la posici�n es v�lida
            if (posicionElegida < 0 || posicionElegida >= tamanoTablero) {
                System.out.println("Posici�n no v�lida. Int�ntalo de nuevo.");
                continue;
            }

            // Invertir el valor en la posici�n elegida
            tablero[posicionElegida] = !tablero[posicionElegida];

            // Mostrar cu�ntos "true" hay en el tablero
            int truesEnTablero = contarTrues(tablero);
            System.out.println("Hay " + truesEnTablero + " 'true' en el tablero.");
        }

        System.out.println("�Has ganado! Todos los valores son 'true'.");
    }

    // M�todo para mostrar el tablero
    private static void mostrarTablero(boolean[] tablero) {
        System.out.print("Tablero: ");
        for (boolean valor : tablero) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    // M�todo para contar cu�ntos "true" hay en el tablero
    private static int contarTrues(boolean[] tablero) {
        int contador = 0;
        for (boolean valor : tablero) {
            if (valor) {
                contador++;
            }
        }
        return contador;
    }

    // M�todo para verificar si todos los valores en el tablero son "true"
    private static boolean todosSonTrue(boolean[] tablero) {
        for (boolean valor : tablero) {
            if (!valor) {
                return false;
            }
        }
        return true;
    }
}