package Cadenas;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		/*Busca informaci�n sobre las operaciones "replace()"
		 *y "replaceAll()". Util�zalas para lo siguiente: pedir al usuario 
		 *una cadena y eliminar todas sus vocales. Luego mostrar el resutado. 
		 *Por ejemplo: si se introduce "Cadena", saldr� "Cdn".*/
	String cadena;
	String sinvocales;
	Scanner entrada = new Scanner(System.in);
	System.out.println("Escriba su texto con vocales: ");
	cadena = entrada.nextLine();
	sinvocales = cadena.replaceAll("[AEIOUaeiou]", "");
	System.out.println("La palabra sin vocales es: " + sinvocales);
		
	}
}
