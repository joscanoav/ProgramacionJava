package Bucles;

import java.util.Scanner;

public class SumaAcumulada {

	public static void main(String[] args) {
		// Pedir al usuario 10 numeros por teclado y mostrar
		// La suma de todos ellos
	
		int contador = 1;
		int numero;
		int acumulado = 0;
		while (contador <= 10) {
			System.out.print("Introduce un numero: ");
			Scanner entrada = new Scanner(System.in);
			numero = entrada.nextInt();	
			acumulado = (acumulado + numero);
			contador++;
		}
		
		System.out.println("FIN DEL PROGRAMA: valor de la sumatoria es " + acumulado);


	}

}
