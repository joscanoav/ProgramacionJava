package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio99 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String frase;
		String[] palabras;
		System.out.println("Introduce una frase: ");
		frase = scanner.nextLine();
		palabras = frase.split(" ");
		System.out.println(Arrays.toString(palabras));
	}

}
