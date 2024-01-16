package Arrays;
/*Hacer un programa que pida al usuario una cadena y separe palabras por espacios mediante el método "split()". También le pide una letra objetivo y después crea un array de enteros que tenga en cada posición el número de veces que aparece dicha letra en una palabra concreta de las obtenidas con "split()".
Ejemplo:
USUARIO: "Esta es una cadena"
USUARIO: Buscar "a"
PROGRAMA: [1, 0, 1, 2]*/
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		// Solicitar al usuario una cadena
		System.out.print("Ingrese una cadena: ");
		String cadena = sc.nextLine();
		// Solicitar al usuario una letra objetivo
		System.out.print("Ingrese una letra objetivo: ");
		char letraObjetivo = sc.nextLine().charAt(0);
		// Separar las palabras mediante el metodo "split()"
		String[] palabras = cadena.split(" ");
		// Crear un array de enteros para contar el nmero de veces que
		// aparece la letra objetivo en cada palabra
		
		int[] contadorLetras = new int[palabras.length];
		//Contar el numero de veces que aparece la letra objetivo
		
		for(int i = 0; i < palabras.length; i++) {
			String palabra = palabras[i];
			int conteo = 0;
			for (int j = 0; j< palabra.length(); j++) {
				if(palabra.charAt(j) == letraObjetivo) {
					conteo++;
				}
			}
			contadorLetras[i] = conteo;
		}
		// Mostrar el resultado
			System.out.print("PROGRAMA: [");
			for(int i = 0; i < contadorLetras.length; i++) {
				System.out.print(contadorLetras[i]);
				
				if (i < contadorLetras.length - 1) {
					System.out.print(", ");
				}
					
				}
			System.out.println("]");
			}
			
	}


