package tiposdedatos;

import java.util.Scanner;

public class Strings {
	
	public static void main(String[]arg) {
		Scanner entrada = new Scanner(System.in);
		String texto = "Hola";
		String texto2 = "!!!!";
		
		System.out.println("valor del string: " + texto);
		System.out.println(texto + texto2);
		
		String textoLeido;
		
		System.out.print("Introduce un texto: ");
		textoLeido = entrada.nextLine();
		
		System.out.println("El texto introducido es: " + textoLeido);
		
	}

}

