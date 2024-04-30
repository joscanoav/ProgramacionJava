package resolucionExamenes;

import java.util.Scanner;

public class ContadorLetra {
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

	        // Cierra el objeto Scanner (ya no se necesita)
	        scanner.close();

	        // Recorre la matriz
	        for (int i = 0; i < matriz.length; i++) {
	            int contadorLetra = 0;

	            // Recorre cada cadena en la fila
	            for (int j = 0; j < matriz[i].length; j++) {
	                // Obtiene la cadena actual
	                String cadena = matriz[i][j];

	                // Cuenta las ocurrencias de la letra en la cadena
	                for (int k = 0; k < cadena.length(); k++) {
	                    if (cadena.charAt(k) == letra) {
	                        contadorLetra++;
	                    }
	                }
	            }

	            // Imprime la cantidad de veces que aparece la letra en la fila actual
	            System.out.println("Fila " + i + ": " + contadorLetra + " ocurrencias de la letra '" + letra + "'");
	        }
	    }
	}
