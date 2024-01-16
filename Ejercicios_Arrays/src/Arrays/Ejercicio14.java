package Arrays;
/*Hacer un programa que, dado un array de cadenas escrito en código, 
 * muestre la cadena de menor, así como la de mayor, longitud.
*/
public class Ejercicio14 {

	public static void main(String[] args) {
		
		// Array de cadenas
		String[] cadenas = {"Hola", "Java","Programacion","Cadena"};
		
		// Variables
		String cadenaMenor = null;
		String cadenaMayor = null;
		
		// Encontrar la cadena de menor y mayor longitud
		for(String cadena : cadenas) {
			if(cadenaMenor == null || cadena.length() < cadenaMenor.length()) {
				cadenaMenor = cadena;
			}
			
			if(cadenaMayor == null || cadena.length() > cadenaMayor.length()) {
				cadenaMayor = cadena;
			}
		}
		// Mostrar resultados
		System.out.println("Cadena de menor longitud: " + cadenaMenor);
		System.out.println("Cadena de mayor longitud: " + cadenaMayor);
	}

}
