package examenUno;

import java.util.Scanner;

public class MainCalculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//crear la instancia calculadora
		Calculadora calculadora = new Calculadora();
		
		//Operaciones aritmeticas
		System.out.println("Ingrese el primer numero");
		int num1 = scanner.nextInt();
		System.out.println("Ingrese el segundo numero");
		int num2 = scanner.nextInt();
		
		//operaciones logicas
		calculadora.operacionesAritmeticas(num1, num2);
		//Bucles
		System.out.println("Ingrese un numero para el bucle:");
		int n = scanner.nextInt();
		System.out.println("Bucle While:");
		calculadora.bucleWhile(n);
		System.out.println("Bucle For:");
		calculadora.bucleFor(n);
		scanner.close();
	}

}
