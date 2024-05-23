package preparacionDefinitiva;

public class ContarLetrasFilas {

	    public static void main(String[] args) {

	        // Create the string matrix
	        String[][] matriz = {
	                {"Hola", "Mundo", "!"},
	                {"Adios", "Java", "Programacion"},
	                {"Bienvenido", "a", "este", "ejemplo"}
	        };

	        // Target letter (change this to your desired letter)
	        char letraObjetivo = 'a';

	        // Initialize counters
	        int contLetraFila = 0;
	        int contLetraTotal = 0;

	        // Iterate through rows
	        for (int i = 0; i < matriz.length; i++) {

	            // Reset row counter
	            contLetraFila = 0;

	            // Iterate through columns
	            for (int j = 0; j < matriz[i].length; j++) {

	                // Get the current string
	                String cadena = matriz[i][j];

	                // Count occurrences of the target letter
	                for (char c : cadena.toCharArray()) {
	                    if (Character.isLetter(c) && c == letraObjetivo) {
	                        contLetraFila++;
	                        contLetraTotal++;
	                    }
	                }
	            }

	            // Print row results
	            System.out.println("Fila " + i + ": " + contLetraFila + " '" + letraObjetivo + "'s");
	        }

	        // Print total letter count
	        System.out.println("Total '" + letraObjetivo + "'s: " + contLetraTotal);
	    }
	}
