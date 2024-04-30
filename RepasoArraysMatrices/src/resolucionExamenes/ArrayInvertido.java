package resolucionExamenes;

public class ArrayInvertido {


	    public static void main(String[] args) {
	        // Array de ejemplo
	        int[] array = {2, 4, 12, 24, 55, 110};

	        // Muestra el array original
	        System.out.print("Array original: ");
	        for (int i : array) {
	            System.out.print(i + " ");
	        }
	        System.out.println();

	        // Invertir el array
	        for (int i = 0; i < array.length / 2; i++) {
	            int temp = array[i];
	            array[i] = array[array.length - 1 - i];
	            array[array.length - 1 - i] = temp;
	        }

	        // Muestra el array invertido
	        System.out.print("Array invertido: ");
	        for (int i : array) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }
	}

