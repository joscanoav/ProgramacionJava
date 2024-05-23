package preparacionDefinitiva;

public class ContarCaracteres {
	    public static void main(String[] args) {

	        // Create the string matrix
	        String[][] matriz = {
	                {"H%la", "Mundo", "!"},
	                {"Adios", "Java", "Programacion"},
	                {"Bienvenido", "a", "este", "ejemplo"}
	        };

	        // Target characters (change these to your desired characters)
	        char[] caracteresObjetivo = {'%', '#'};

	        // Initialize counters
	        int[] contCaracteresFila = new int[caracteresObjetivo.length];
	        int[] contCaracteresTotal = new int[caracteresObjetivo.length];

	        // Iterate through rows
	        for (int i = 0; i < matriz.length; i++) {

	            // Reset row counters
	            for (int k = 0; k < caracteresObjetivo.length; k++) {
	                contCaracteresFila[k] = 0;
	            }

	            // Iterate through columns
	            for (int j = 0; j < matriz[i].length; j++) {

	                // Get the current string
	                String cadena = matriz[i][j];

	                // Count occurrences of the target characters
	                for (char c : cadena.toCharArray()) {
	                    for (int k = 0; k < caracteresObjetivo.length; k++) {
	                        if (c == caracteresObjetivo[k]) {
	                            contCaracteresFila[k]++;
	                            contCaracteresTotal[k]++;
	                        }
	                    }
	                }
	            }

	            // Print row results
	            System.out.print("Fila " + i + ": ");
	            for (int k = 0; k < caracteresObjetivo.length; k++) {
	                System.out.print(contCaracteresFila[k] + " '" + caracteresObjetivo[k] + "'s, ");
	            }
	            System.out.println();
	        }

	        // Print total character counts
	        System.out.println("Total character counts:");
	        for (int k = 0; k < caracteresObjetivo.length; k++) {
	            System.out.println("'" + caracteresObjetivo[k] + "'s: " + contCaracteresTotal[k]);
	        }
	    }
	}
