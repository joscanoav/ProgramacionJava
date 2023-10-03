package estructuras;

import java.util.Scanner;

public class NumerosOrdenados {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escriba un  primer numero:  ");
		x = entrada.nextInt();
		System.out.println("Escriba un  segundo numero:  ");
		y = entrada.nextInt();
		System.out.println("Escriba un  tercer numero:  ");
		z = entrada.nextInt();
		if (x > y && y > z) {
			System.out.println("Numero 1 es mayor = " + x);
			System.out.println("Numero 2 es medio = " + y);
			System.out.println("Numero 3 es menor = " + z);
		} else if (y > x && x > z) {
			System.out.println("Numero 1 es medio = " + x);
			System.out.println("Numero 2 es mayor = " + y);
			System.out.println("Numero 3 es  menor= " + z);
		} else if (y > x && x > z) {
			System.out.println("Numero 2 es mayor = " + y);
			System.out.println("Numero 1 es medio = " + x);
			System.out.println("Numero 3 es menor = " + z);
		} else if (y > z && z > x) {
			System.out.println("Numero 2 es mayor = " + y);
			System.out.println("Numero 3 es medio = " + z);
			System.out.println("Numero 1 es menor = " + x);
		} else if (z > x && x > y) {
			System.out.println("Numero 3 es mayor = " + z);
			System.out.println("Numero 1 es medio = " + x);
			System.out.println("Numero 2 es menor = " + y);
		} else if (z > y && y > x) {
			System.out.println("Numero 3 es mayor = " + z);
			System.out.println("Numero 2 es medio = " + y);
			System.out.println("Numero 1 es menor = " + x);
		}

	}

}
