package Arrays;
/*Hacer un programa que, dado un array de chars escrito en código, 
 * muestre todos sus desplazamientos posibles. Por ejemplo, para el array
 *  {'A', 'B', 'C', 'D'} se vería en consola:
A B C D
D A B C
C D A B
B C D A*/
public class Ejercicio13 {

	public static void main(String[] args) {
		//Array de chars
		char[] caracteres = {'A', 'B', 'C', 'D'};
		// Mostrar el array original
		mostrarArray(caracteres);
		
		// Realizar los desplazamientos
		for(int i=0; i < caracteres.length - 1; i++) {
			desplazarArray(caracteres);
			mostrarArray(caracteres);
		}
	}

	// Método para desplzar un array de chars hacia la derecha
	
	public static void desplazarArray(char[] array) {
		char temp = array[array.length - 1];
		System.arraycopy(array, 0, array, 1, array.length - 1);
		array[0] = temp;
	}
	
	
	// Método para mostrar un array de chars hacia la derecha

	public static void mostrarArray(char[] array) {
		for(char c: array) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
}
