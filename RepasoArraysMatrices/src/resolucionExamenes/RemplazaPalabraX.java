package resolucionExamenes;

import java.util.Scanner;

public class RemplazaPalabraX {
    public static void main(String[] args) {
        // Definición de la matriz bidimensional de strings
        String[][] matriz = {
            {"Pomelo", "Sol", "Linterna"},
            {"Clave", "Laca", "Tijeras"},
            {"Pincel", "Luz", "Titanio"}
        };

        // Crear un escáner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // Solicitar al usuario la palabra a reemplazar
        System.out.print("Ingrese la palabra que desea reemplazar por 'X': ");
        String palabraARemplazar = scanner.nextLine();

        // Reemplazar la palabra con 'X' si se encuentra en la matriz
        boolean encontrada = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].equalsIgnoreCase(palabraARemplazar)) {
                    matriz[i][j] = "X";
                    encontrada = true;
                }
            }
        }

        // Mostrar mensaje si la palabra no se encuentra en la matriz
        if (!encontrada) {
            System.out.println("La palabra no se encuentra en la matriz.");
        }

        // Mostrar la matriz actualizada
        System.out.println("Matriz actualizada:");
        mostrarMatriz(matriz);

        // Cerrar el escáner
        scanner.close();
    }

    // Función para mostrar una matriz bidimensional de strings
    public static void mostrarMatriz(String[][] matriz) {
        for (String[] fila : matriz) {
            System.out.print("[");
            for (int i = 0; i < fila.length; i++) {
                System.out.print(fila[i]);
                if (i < fila.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}