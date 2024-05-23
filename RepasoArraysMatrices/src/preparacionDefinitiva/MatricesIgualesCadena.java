package preparacionDefinitiva;

import java.util.Arrays;

public class MatricesIgualesCadena {

	    public static void main(String[] args) {

	        // Create two string matrices
	        String[][] matriz1 = {
	                {"Hola", "Mundo", "!"},
	                {"Adios", "Java", "Programacion"},
	                {"Bienvenido", "a", "este", "ejemplo"}
	        };

	        String[][] matriz2 = {
	                {"Holaa", "Mundo", "!"},
	                {"Adios", "Java", "Programacion"},
	                {"Bienvenido", "a", "este", "ejemplo"}
	        };

	        // Compare the matrices using Arrays.deepEquals()
	        boolean sonIguales = Arrays.deepEquals(matriz1, matriz2);

	        if (sonIguales) {
	            System.out.println("Las matrices son iguales");
	        } else {
	            System.out.println("Las matrices no son iguales");
	        }
	    }
	}
