package Arrays;
/*Hacer un programa que busque dentro de un array de enteros
 *(escrito en código) el valor máximo y el valor mínimo.
*/

public class Ejercicio11 {

	public static void main(String[] args) {
		// Array de enteros
		int[] numeros = {5, 12, 8, 19, 3, 25, 10};
		//Variables para el valor maximo y minimo
		
		int maximo = encontrarMaximo(numeros);
		int minimo = encontrarMinimo(numeros);
		
		// Mostrar resultados
		System.out.println("Valor maximo: " + maximo);
		System.out.println("Valor minimo: " + minimo);
	}
	
	// Metodo para encontrar el valor maximo en un array de enteros


// Metodo para encontrar el valor maximo de un array de enteros

public static int encontrarMaximo(int[] array) {
	int maximo = array[0];
	for (int i = 1; i < array.length; i++) {
		if(array[i]  > maximo) {
			maximo = array[i];
		}
	}
	return maximo;
}

public static int encontrarMinimo(int[]array) {
	int minimo = array[0];
	for(int i = 1; i < array.length; i++) {
		if(array[i] < minimo) {
			minimo = array[i];
		}
	}
	return minimo;
}

}

