package arrays;
/*Haz un programa que pida al usuario una cadena. Luego, crea un vector (1D) de strings a partir de esa cadena usando el símbolo '-' como delimitador de elementos. Después, elimina de cada string la letra 'A' o 'a' y muestra el vector resultante. Ejemplo:

"Esta-es-una-CADENA" -> {"Esta", "es", "una", "CADENA"} -> {"Est", "es", "un", "CDEN"}*/
import java.util.Arrays;

public class EliminaLetra {
	public static void main(String[] args) {
		// Asumimos que esta cadena la ha puesto el usuario.
		String cadenaUsuario = "EstA-es-una-CADENa";
		// Separamos por guiones.
		String[] palabras = cadenaUsuario.split("-");
		
		// Recorremos el array de palabras.
		for (int i = 0; i < palabras.length; i++) {
			// Sobreescribimos el String de la posición "i" por él mismo con las 'A' y 'a' eliminadas.
			// Cada "replaceAll" retorna un String, así que podemos ponerlos seguidos para ahorrar líneas.
			palabras[i] = palabras[i].replaceAll("A", "").replaceAll("a", "");
		}
		
		// Mostramos el array definitivo.
		System.out.println(Arrays.toString(palabras));
	}

}