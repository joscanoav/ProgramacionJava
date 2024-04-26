package letrasParentesis;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LetrasParentesis {

	public static void main(String[] args) {
		String path = "resultado.txt";
		Scanner sc = new Scanner(System.in);
		String line;

		try {
			
			/*se crea un objeto PrintWriter llamado pw usando el constructor 
			 * FileWriter. Este objeto se usa para escribir datos en el archivo 
			 * especificado por la variable path.*/
			PrintWriter pw = new PrintWriter(new FileWriter(path));
			
			//El código entra en un bucle que continúa siempre que el usuario ingrese una cadena no vacía:
			do {
				System.out.print("Introduce una cadena: ");
				line = sc.nextLine();
				/*Se llama al método ponerParentesis con la variable line como argumento para agregar paréntesis alrededor de cada carácter. El resultado se almacena nuevamente en la variable line.
					El programa escribe la cadena modificada con paréntesis en el archivo usando pw.println(ponerParentesis(line));*/
				// Escribir la palabra con los "()"
				pw.println(ponerParentesis(line));
			} while (!line.isEmpty());

			sc.close();
			pw.close();
		} catch (IOException e) {
			System.err.println("ERROR: no se pudo escribir.");
		}

	}

	/*El código define un método privado llamado ponerParentesis que toma
	 *  una cadena como entrada y devuelve una nueva cadena con paréntesis 
	 *  alrededor de cada carácter:*/
	private static String ponerParentesis(String line) {
		//Se declara una variable de cadena vacía llamada newLine para almacenar el resultado.
		String newLine = "";
		/*Un bucle itera sobre cada carácter en la cadena line:
		Por cada carácter, el carácter se encierra entre paréntesis usando la concatenación de cadenas (newLine += "(" + line.charAt(i) + ")");) 
		y se agrega a la cadena `*/
		for (int i = 0; i < line.length(); i++) {
			//El operador += se utiliza para concatenar cadenas. En este caso, agrega el valor del lado derecho al valor actual de la variable newLine.
			
			newLine += "(" + line.charAt(i) + ")";
			/*line.charAt(i) accede al carácter en la posición i de la cadena line. El método charAt devuelve un valor de tipo char, 
			 * que representa un único carácter.*/
		}

		return newLine;
	}

}