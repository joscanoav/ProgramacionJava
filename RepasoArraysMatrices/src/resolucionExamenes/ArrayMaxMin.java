package resolucionExamenes;

public class ArrayMaxMin {
	

	    public static void main(String[] args) {
	        // Array de ejemplo
	        int[] array = {2, 4, 12, 24, 55, 110, -10, -5, 0};

	        // Variables para almacenar el m�ximo y el m�nimo
	        int maximo = array[0];
	        int minimo = array[0];

	        // Recorrer el array para encontrar el m�ximo y el m�nimo
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > maximo) {
	                maximo = array[i];
	            }
	            if (array[i] < minimo) {
	                minimo = array[i];
	            }
	        }

	        // Mostrar el m�ximo y el m�nimo
	        System.out.println("M�ximo: " + maximo);
	        System.out.println("M�nimo: " + minimo);
	    }
	}


