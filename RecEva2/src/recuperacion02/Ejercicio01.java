package recuperacion02;

public class Ejercicio01 {

	public static void main(String[] args) {
	        int[] array = {2, 4, 5, 9, 11, 17};
	        
	        System.out.println("Array:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	        
	        System.out.println("Cumplen:");
	        for (int i = 0; i < array.length; i++) {
	            if ((array[i] % 1 == 0) && (array[i] % array[i] == 0)) {
	                System.out.print("SI ");
	            } else{
	                System.out.print("NO ");
	            }
	           
	        }   
	    }
	}

