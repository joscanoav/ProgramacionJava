package arrays;
/*Haz un programa que, partiendo de dos arrays de enteros en cddigo
(dos variables “array1” y “array2”) nos diga si se cumple lo siguiente: la
suma de los numeros impares de “array1” es igual a la suma de los
numeros impares de “array2” y la suma de los numeros pares de
“array1” y “array2” es 0.
Ejemplo de que si cumple: array1 = {-1, 2, -2, 3, 1, -6, -4, 10} y array2 =
{1, 1, -4, 2, 2, 1}. La suma de impares de array1 es 3, que es iguala la
suma de los impares de array2. La Suma de pares de array1 es 0, asi
como la suma de pares de array2 también lo es. Se cumple la condicion.*/

public class SumaImparesPares {

	public static void main(String[] args) {
        int[] array1 = {-1, 2, -2, 3, 1, -6, -4, 10};
        int[] array2 = {1, 1, -4, 2, 2, 1};

        boolean result = checkArrays(array1, array2);
        if (result) {
            System.out.println("Las condiciones se cumplen.");
        } else {
            System.out.println("Las condiciones no se cumplen.");
        }
    }

    public static boolean checkArrays(int[] array1, int[] array2) {
        int sumOdd1 = 0;
        int sumEven1 = 0;
        int sumOdd2 = 0;
        int sumEven2 = 0;

        // Sumar elementos impares y pares del primer array
        for (int num : array1) {
            if (num % 2 != 0) {
                sumOdd1 += num;
            } else {
                sumEven1 += num;
            }
        }

        // Sumar elementos impares y pares del segundo array
        for (int num : array2) {
            if (num % 2 != 0) {
                sumOdd2 += num;
            } else {
                sumEven2 += num;
            }
        }

        // Verificar las condiciones
        return (sumOdd1 == sumOdd2) && (sumEven1 == 0 && sumEven2 == 0);
    }


}

