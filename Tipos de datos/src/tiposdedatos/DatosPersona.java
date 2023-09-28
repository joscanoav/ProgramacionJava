package tiposdedatos;
import java.util.Scanner;

public class DatosPersona {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int edad;
		float altura;
		String nombre;
		boolean casado;
		System.out.print("Introduce tu edad: ");
		edad = entrada.nextInt();
		System.out.print("Introduce tu altura: ");
		altura = entrada.nextFloat();		
		System.out.print("Introduce tu nombre: ");
		nombre = entrada.next();
		System.out.print("�Esta casado?: (true/false) ");
		casado = entrada.nextBoolean();
		System.out.println("Su nombre es: "+ nombre);
		System.out.println("Su edad es : " + edad);
		System.out.println("Su altura es : " + altura);
		
		if (casado) {
			System.out.println("Esta casado");
		} else {System.out.println("Esta soltero");
		
		}
	}
}


