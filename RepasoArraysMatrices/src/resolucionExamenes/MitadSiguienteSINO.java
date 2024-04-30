package resolucionExamenes;

public class MitadSiguienteSINO {
    public static void main(String[] args) {
        // Array de ejemplo
        int[] array = {2, 4, 12, 24, 55, 110};

        // Muestra el array original
        System.out.print("Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Calcula y muestra cuáles cumplen la condición "ser la mitad del siguiente"
        System.out.print("Cumplen: ");
        for (int i = 0; i < array.length; i++) {
            // Calcula el índice del siguiente elemento
            int siguienteIndice = (i + 1) % array.length;

            // Comprueba si el elemento actual es la mitad del siguiente
            if (array[i] * 2 == array[siguienteIndice]) {
                System.out.print("SI ");
            } else {
                System.out.print("NO ");
            }
        }
    }
}