package tiposdedatos;
//Primero el programa pide el nombre de la persona.
//Luego, pide la edad.
//Despues, pide la altura.
//Por ultimo, pide el estado civil (Soltero/Casado).
//Nombre: ?
// Edad: ?
//Altura: ?
//Estado: ?

import java.util.Scanner;

public class DatosPersona {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int edad;
		float altura;
		String nombre;
		char estado;
		
		
		System.out.print("Introduce tu edad: ");
		edad = entrada.nextInt();
		
		System.out.print("Introduce tu altura: ");
		altura = entrada.nextFloat();
		
				
		System.out.print("Introduce tu nombre: ");
		nombre = entrada.CharAt();
		
		System.out.print("Introduce estado: ");
		estado = entrada.next();
		
		System.out.println("Se ha leido el caracter: " + c1);
		System.out.println("Se ha leido el caracter: " + c2);
		System.out.println("c1 > c2? -> "+ (c1 > c2));
	}

}
