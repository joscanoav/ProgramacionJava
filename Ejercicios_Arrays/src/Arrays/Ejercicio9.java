package Arrays;
/*Hacer un programa que pida al usuario una cadena y
 *  cree un array de cadenas mediante el método "split()" de la clase String. Por ejemplo: si tenemos la cadena "Hola qué tal?" en la variable "frase", al hacer "frase.split(" ")" nos devuelve un array de strings tal que {"Hola", "qué", "tal?"}, ya que usa el espacio como delimitador para trocear el string y poner cada subcadena en una posición independiente dentro de un array.
*/
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena;
		String[] subcadenas;
		
		System.out.println("Introduce una cadena: ");
		cadena = sc.nextLine();
		//Separamos la cadena en un array de subcadenas
		//subcadenas = cadena.split("[,.!?]");
		subcadenas = cadena.split(" ");
		//Imprimimos el array de subcadenas
		for(String subcadena : subcadenas) {
			System.out.println(subcadena);
		}
		
		
	}

}
