package tiposdedatos;

import java.util.Scanner;

public class LecturaTeclado2 {
	public static void main(String[]arg) {
		Scanner entrada = new Scanner(System.in);
		double n1;
		double n2;
		char c1;
		char c2;
		
		
		System.out.print("Introduce el primer numero: ");
		n1 = entrada.nextDouble();
		
		System.out.print("Introduce el segundo numero: ");
		n2 = entrada.nextDouble();
		
		System.out.println("El numero n1 = el numero n2 da = " + (n1 == n2));
		
		System.out.print("Introduce un caracter: ");
		c1 = (char)entrada.nextInt();
		
		System.out.print("Introduce otro caracter: ");
		c2 = (char)entrada.nextInt();
		
		System.out.println("Se ha leido el caracter: " + c1);
		System.out.println("Se ha leido el caracter: " + c2);
		System.out.println("c1 > c2? -> "+ (c1 > c2));

	}

}
