/**
 * 
 */
package arrays;

/**
 * 
 */
public class MitadSiguienteSiNo {
    public static void main(String[] args) {
        int[] array = {2, 4, 12, 24, 55, 110};
        
        System.out.println("Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("Cumplen:");
        for (int i = 0; i < array.length; i++) {
            int nextIndex = (i + 1) % array.length; // índice del siguiente elemento (el último con el primero)
            if (array[i] * 2 == array[nextIndex]) {
                System.out.print("SI ");
            } else {
                System.out.print("NO ");
            }
        }
    }
}