package resolucionExamenes;

public class ArrayParImpar {
	
		    public static void main(String[] args) {
	        // Array de ejemplo
	        int[] array = {2, 4, 12, 24, 55, 110, 1, 3, 5, 7};

	        // Muestra el array original
	        System.out.print("Array: ");
	        for (int i : array) {
	            System.out.print(i + " ");
	        }
	        System.out.println();

	        // Calcula y muestra si cada elemento es par o impar
	        System.out.print("Par/Impar: ");
	        for (int i : array) {
	            if (i % 2 == 0) {
	                System.out.print("Par ");
	            } else {
	                System.out.print("Impar ");
	            }
	        }
	    }
	}

