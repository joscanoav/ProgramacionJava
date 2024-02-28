package preparacionDefinitiva;

import java.util.Arrays;
import java.util.Scanner;

public class BorrarLetraBidimensional {

	public static void main(String[] args) {
        // Solicitar al usuario que ingrese una cadena
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadenaUsuario = scanner.nextLine();

        // Solicitar al usuario que ingrese la letra a borrar
        System.out.print("Ingrese la letra que desea borrar: ");
        char letraBorrar = scanner.next().charAt(0);

        // Separamos por guiones.
        String[] palabras = cadenaUsuario.split("-");

        // Crear una matriz de dos dimensiones para almacenar las letras después de la eliminación.
        String[][] matrizPalabras = new String[palabras.length][];

        // Recorremos el array de palabras.
        for (int i = 0; i < palabras.length; i++) {
            // Eliminamos la letra especificada y dividimos cada palabra en un array de letras.
            matrizPalabras[i] = palabras[i].replaceAll(String.valueOf(letraBorrar), "").split("");
        }

        // Mostramos la matriz definitiva de manera ordenada.
        for (String[] fila : matrizPalabras) {
            System.out.println(Arrays.toString(fila).replaceAll("[\\[\\],]", ""));
        }

        scanner.close();
    }
}