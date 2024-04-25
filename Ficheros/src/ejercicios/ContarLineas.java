package ejercicios;
/*Haz un programa que pida al usuario la ruta de un archivo 
 * y nos diga cuántas líneas tiene.
*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ContarLineas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path;
		File file;
		int lines = 0;
		
		System.out.println("Introduce la ruta de un archivo: ");
		path = sc.nextLine();
		sc.close();
		
		file = new File(path);
		
		if (file.isFile()) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				while (br.readLine() !=null) {
						lines++;
				}
					br.close();
				System.out.println("Se han leido " + lines + " lineas");
			} catch (FileNotFoundException e) {
				System.err.println("ERROR: archivo no encontrado.");				
			} catch (IOException e) {
				System.out.println("ERROR: no se pudo leer el contenido.");
			}
		}else {
			System.out.println("ERROR: tiene que ser un archivo comun.");
		}
	}
}
