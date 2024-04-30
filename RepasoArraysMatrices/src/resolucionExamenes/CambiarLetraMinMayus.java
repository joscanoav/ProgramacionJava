package resolucionExamenes;

import java.util.Scanner;

public class CambiarLetraMinMayus {
    public static void main(String[] args) {
    	
    	        // Define una matriz de cadenas de texto (original content)
    	        String[][] matriz = {
    	                {"apple", "banana", "cherry"},
    	                {"grape", "orange", "strawberry"},
    	                {"kiwi", "watermelon", "lemon"}
    	        };

    	        // Print the original matrix content
    	        System.out.println("Matriz original:");
    	        for (int i = 0; i < matriz.length; i++) {
    	            for (int j = 0; j < matriz[i].length; j++) {
    	                System.out.print(matriz[i][j] + " ");
    	            }
    	            System.out.println();
    	        }

    	        // Crea un objeto Scanner para obtener la entrada del usuario
    	        Scanner scanner = new Scanner(System.in);

    	        // Pide al usuario que ingrese la letra a convertir
    	        System.out.print("Ingrese la letra a convertir a mayúsculas: ");
    	        char letra = scanner.next().charAt(0);

    	        // Convierte la letra ingresada a mayúsculas
    	        char letraMayuscula = Character.toUpperCase(letra);

    	        // Cierra el objeto Scanner (ya no se necesita)
    	        scanner.close();

    	        // Recorre la matriz y convierte la letra especificada a mayúsculas
    	        for (int i = 0; i < matriz.length; i++) {
    	            for (int j = 0; j < matriz[i].length; j++) {
    	                String palabra = matriz[i][j]; // Obtiene la palabra actual
    	                StringBuilder palabraModificada = new StringBuilder(palabra); // Crea un StringBuilder para modificar la palabra

    	                // Recorre la palabra carácter por carácter
    	                for (int k = 0; k < palabra.length(); k++) {
    	                    if (palabra.charAt(k) == letra) {
    	                        palabraModificada.setCharAt(k, letraMayuscula); // Cambia la letra a mayúsculas
    	                    }
    	                }

    	                // Actualiza la palabra en la matriz
    	                matriz[i][j] = palabraModificada.toString();
    	            }
    	        }

    	        // Print the modified matrix content
    	        System.out.println("\nMatriz modificada:");
    	        for (int i = 0; i < matriz.length; i++) {
    	            for (int j = 0; j < matriz[i].length; j++) {
    	                System.out.print(matriz[i][j] + " ");
    	            }
    	            System.out.println();
    	        }
    	    }
    	}
