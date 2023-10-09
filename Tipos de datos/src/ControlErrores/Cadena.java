package ControlErrores;

import java.util.Scanner;

public class Cadena {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nombre;
		int numero;
		
		do	{
			System.out.print("Introduce un numero: ");
			numero = input.nextInt();
			input.nextLine();
			
			if (numero < 0 || numero > 9) {
				System.out.println("Error : dato invalido");
			}
			
			
	 	}while (numero < 0 || numero > 9);
		
		
		do	{
			System.out.print("Introduce tu nombre: ");
			nombre = input.nextLine();
			
			if ( nombre == "") {
				System.out.println("Error : nombre vacio");
			}
					
	 	}while (nombre == "");
		
		System.out.println("El numero es: " + numero);
		System.out.println("Tu nombre es: "+ nombre);
		
		
	}

}
