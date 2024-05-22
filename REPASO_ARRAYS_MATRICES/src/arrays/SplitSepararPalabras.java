package arrays;
/*Hacer un programa que pida al usuario una cadena y separe palabras por
 *  espacios mediante el método "split()". También le pide una letra objetivo y después crea un array de enteros que tenga en cada posición el número de veces que aparece dicha letra en una palabra concreta de las obtenidas con "split()".
*/
import java.util.Arrays;
import java.util.Scanner;

public class SplitSepararPalabras {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String frase;
		String[] palabras;
		String letra;
		char caracter;
		int[] recuentos;

		System.out.print("Introduce una frase: ");
		frase = scanner.nextLine();

		palabras = frase.split(" ");
		recuentos = new int[palabras.length];

		System.out.print("Introduce una letra: ");
		letra = scanner.nextLine();
		caracter = letra.charAt(0);

		for (int i = 0; i < palabras.length; i++) {

			for (int j = 0; j < palabras[i].length(); j++) {

				if (palabras[i].charAt(j) == caracter) {
					recuentos[i]++;
				}

			}

		}

		System.out.println(Arrays.toString(recuentos));
	}

}
