package preparacionDefinitiva;

public class MatricesIguales {

	public static void main(String[] args) {
		// Matrices.
				int[][] m1 = {
					{1, 2},
					{3, 4}
				};
				int[][] m2 = {
					{1, 2},
					{3, 4}
				};
		boolean iguales = true;
		// Si no coinciden en numero de filas, no seran iguales
		if(m1.length != m2.length) {
			iguales = false;
			
		} else {
			// "for" de las filas. Uso "m1", pero podr√≠a usar "m2", es indiferente.
			for (int i = 0; i < m1.length && iguales; i++) {
				// Si las filas "i" no tienen la misma longitud, no ser√°n iguales.	
			if (m1[i].length != m2[i].length) {
				iguales = false;
			} else {
				// "for" de las columnas. Comparamos las celdas de ambas matrices.
			for (int j = 0; j < m1[i].length && iguales; j++) {
				if(m1[i][j] != m2[i][j]) {
					iguales = false;
				}
				
			}	
			}
			
			
			}
		}
	
	// Mostramos si son iguales o no.
		if(iguales) {
			System.out.println("Son Iguales");
			
			 // Mostrar la matriz m1
            System.out.println("Matriz m1:");
            mostrarMatriz(m1);

            // Mostrar la matriz m2
            System.out.println("Matriz m2:");
            mostrarMatriz(m2);
			
		}else {
			System.out.println("No son iguales");
		}
	
	}
	
	private static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}

//matrices diferentes

/*package preparacionDefinitiva;

public class MatricesIguales {

    public static void main(String[] args) {
        // Matrices.
        int[][] m1 = {
            {1, 2},
            {3, 4}
        };
        int[][] m2 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        boolean iguales = true;

        try {
            // Si no coinciden en numero de filas o columnas, no seran iguales
            if (m1.length != m2.length || m1[0].length != m2[0].length) {
                iguales = false;
            } else {
                // "for" de las filas. Uso "m1", pero podrÌa usar "m2", es indiferente.
                for (int i = 0; i < m1.length && iguales; i++) {
                    // Si las filas "i" no tienen la misma longitud, no ser·n iguales.	
                    if (m1[i].length != m2[i].length) {
                        iguales = false;
                    } else {
                        // "for" de las columnas. Comparamos las celdas de ambas matrices.
                        for (int j = 0; j < m1[i].length && iguales; j++) {
                            if (m1[i][j] != m2[i][j]) {
                                iguales = false;
                            }
                        }
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Se ha accedido a un elemento fuera del rango de la matriz.");
            iguales = false;
        } catch (NullPointerException e) {
            System.out.println("Error: Se ha encontrado un elemento nulo en la matriz.");
            iguales = false;
        }

        // Mostramos si son iguales o no.
        if (iguales) {
            System.out.println("Son Iguales");

            // Mostrar la matriz m1
            System.out.println("Matriz m1:");
            mostrarMatriz(m1);

            // Mostrar la matriz m2
            System.out.println("Matriz m2:");
            mostrarMatriz(m2);

        } else {
            System.out.println("No son iguales");
        }
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
*/

