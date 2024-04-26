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
			
			//El c�digo entra en un bucle que contin�a siempre que el usuario ingrese una cadena no vac�a:
			do {
				System.out.print("Introduce una cadena: ");
				line = sc.nextLine();
				/*Se llama al m�todo ponerParentesis con la variable line como argumento para agregar par�ntesis alrededor de cada car�cter. El resultado se almacena nuevamente en la variable line.
					El programa escribe la cadena modificada con par�ntesis en el archivo usando pw.println(ponerParentesis(line));*/
				// Escribir la palabra con los "()"
				pw.println(ponerParentesis(line));
			} while (!line.isEmpty());

			sc.close();
			pw.close();
		} catch (IOException e) {
			System.err.println("ERROR: no se pudo escribir.");
		}

	}

	/*El c�digo define un m�todo privado llamado ponerParentesis que toma
	 *  una cadena como entrada y devuelve una nueva cadena con par�ntesis 
	 *  alrededor de cada car�cter:*/
	private static String ponerParentesis(String line) {
		//Se declara una variable de cadena vac�a llamada newLine para almacenar el resultado.
		String newLine = "";
		/*Un bucle itera sobre cada car�cter en la cadena line:
		Por cada car�cter, el car�cter se encierra entre par�ntesis usando la concatenaci�n de cadenas (newLine += "(" + line.charAt(i) + ")");) 
		y se agrega a la cadena `*/
		for (int i = 0; i < line.length(); i++) {
			//El operador += se utiliza para concatenar cadenas. En este caso, agrega el valor del lado derecho al valor actual de la variable newLine.
			
			newLine += "(" + line.charAt(i) + ")";
			/*line.charAt(i) accede al car�cter en la posici�n i de la cadena line. El m�todo charAt devuelve un valor de tipo char, 
			 * que representa un �nico car�cter.*/
		}

		return newLine;
	}

}