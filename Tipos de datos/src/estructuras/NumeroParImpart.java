package estructuras;

import java.util.Scanner;

public class NumeroParImpart {

	public static void main(String[] args) {
		int num;
		System.out.print("Introduce numero: ");
		Scanner entrada = new Scanner(System.in);
		num = entrada.nextInt();

		if (num % 2 == 0) {
			System.out.println("En numero es par.");

		} else {
			System.out.println("El numero es impar");

		}

		System.out.println("Fin del programa");
	}

}
