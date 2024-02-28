package preparacionDefinitiva;

import java.util.Arrays;

public class ArrayEliminarA {

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