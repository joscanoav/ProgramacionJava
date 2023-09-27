package tiposdedatos;

import java.util.Scanner;

public class Lectura {
	
	    public static void main(String[] args) {
		Scanner lectura = new Scanner(System.in);
		int numero;
		System.out.print("Introduce un numero: ");
		numero = lectura.nextInt();
		System.out.println("Has introducido el numero " + numero);
	}
}


