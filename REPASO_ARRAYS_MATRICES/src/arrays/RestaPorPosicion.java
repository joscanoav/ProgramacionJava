package arrays;

public class RestaPorPosicion {

	    public static void main(String[] args) {
	        int[] array1 = {-1, 2, -2, 3, 1, -6, -4, 10};
	        int[] array2 = {-1, 2, -2, 3, 1, -6, -4, 10};

	        if (array1.length != array2.length) {
	            System.out.println("Los arrays deben tener la misma longitud.");
	            return;
	        }

	        int sumDifference = 0;

	        // Restar elementos correspondientes de los arrays y acumular la diferencia
	        for (int i = 0; i < array1.length; i++) {
	            int diff = array1[i] - array2[i];
	            sumDifference += diff;
	        }

	        // Verificar si la suma de las diferencias es 0
	        if (sumDifference == 0) {
	            System.out.println("Las condiciones se cumplen.");
	        } else {
	            System.out.println("Las condiciones no se cumplen.");
	        }
	    }
	}