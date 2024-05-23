package arrays;

public class RodeadoNumerosIguales {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 3, 4, 2, 0};

        System.out.println("Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("Cumplen:");
        for (int i = 0; i < array.length; i++) {
            int leftIndex = (i - 1 + array.length) % array.length; // Índice del elemento a la izquierda
            int rightIndex = (i + 1) % array.length; // Índice del elemento a la derecha

            if (array[leftIndex] == array[rightIndex]) {
                System.out.print("SI ");
            } else {
                System.out.print("NO ");
            }
        }
    }
}