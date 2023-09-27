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
		String estado1,estado2;
		
		System.out.print("Introduce tu edad: ");
		edad = entrada.nextInt();
		
		System.out.print("Introduce tu altura: ");
		altura = entrada.nextFloat();
		
				
		System.out.print("Introduce tu nombre: ");
		nombre = entrada.next();
		
		System.out.print("¿Usted es casado?: SI NO");
		estado1 = entrada.next();
		System.out.print("¿Usted es soltero?: SI NO");
		estado2 = entrada.next();

		System.out.println("Su edad es : " + edad);
		System.out.println("Su altura es : " + altura);
		System.out.println("Su nombre es: "+ nombre);
		System.out.println("Su estado es: "+ (estado1=estado2));
	}

}
