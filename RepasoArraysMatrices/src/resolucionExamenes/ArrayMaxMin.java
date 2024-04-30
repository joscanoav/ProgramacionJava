package resolucionExamenes;

public class ArrayMaxMin {
	

	    public static void main(String[] args) {
	        // Array de ejemplo
	        int[] array = {2, 4, 12, 24, 55, 110, -10, -5, 0};

	        // Variables para almacenar el máximo y el mínimo
	        int maximo = array[0];
	        int minimo = array[0];

	        // Recorrer el array para encontrar el máximo y el mínimo
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > maximo) {
	                maximo = array[i];
	            }
	            if (array[i] < minimo) {
	                minimo = array[i];
	            }
	        }

	        // Mostrar el máximo y el mínimo
	        System.out.println("Máximo: " + maximo);
	        System.out.println("Mínimo: " + minimo);
	    }
	}


