package resolucionExamenes;

import java.util.Scanner;

public class CambiarLetraMinMayus {
    public static void main(String[] args) {
        // Define una matriz de cadenas de texto
        String[][] matriz = {
            {"apple", "banana", "cherry"},
            {"grape", "orange", "strawberry"},
            {"kiwi", "watermelon", "lemon"}
        };

        // Crea un objeto Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que ingrese la letra a contar
        System.out.print("Ingrese la letra a contar: ");
        char letra = scanner.next().charAt(0);

        // Convierte la letra ingresada a mayúsculas
        char letraMayuscula = Character.toUpperCase(letra);

        // Cierra el objeto Scanner (ya no se necesita)
        scanner.close();

        // Recorre la matriz
        for (int i = 0; i < matriz.length; i++) {
            int contadorLetra = 0;

            // Recorre cada cadena en la fila
            for (int j = 0; j < matriz[i].length; j++) {
                // Obtiene la cadena actual
                String cadena = matriz[i][j];

                // Convierte la cadena a mayúsculas para la comparación
                String cadenaMayusculas = cadena.toUpperCase();

                // Cuenta las ocurrencias de la letra en la cadena
                for (int k = 0; k < cadenaMayusculas.length(); k++) {
                    if (cadenaMayusculas.charAt(k) == letraMayuscula) {
                        contadorLetra++;
                    }
                }
            }

            // Imprime la cantidad de veces que aparece la letra en la fila actual
            System.out.println("Fila " + i + ": " + contadorLetra + " ocurrencias de la letra '" + letraMayuscula + "'");
        }
    }
}