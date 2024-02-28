package preparacionDefinitiva;

import java.util.Arrays;
import java.util.Scanner;

public class EliminarLetraCualquiera {

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

        // Recorremos el array de palabras.
        for (int i = 0; i < palabras.length; i++) {
            // Sobreescribimos el String de la posición "i" eliminando la letra especificada.
            palabras[i] = palabras[i].replaceAll(String.valueOf(letraBorrar), "");
        }

        // Mostramos el array definitivo.
        System.out.println(Arrays.toString(palabras));

        scanner.close();
    }
}