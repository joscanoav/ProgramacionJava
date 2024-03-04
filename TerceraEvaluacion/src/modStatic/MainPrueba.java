package modStatic;

import java.util.Scanner;

public class MainPrueba {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		System.out.println("Introduce un numero: ");
		n = leerNumero();

	}
	
	public static int leerNumero() {
		return scanner.nextInt();
	}
}
