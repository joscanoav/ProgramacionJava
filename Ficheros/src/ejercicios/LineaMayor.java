package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*Haz un programa que pida al usuario la ruta de un archivo y 
 * nos muestre la línea que mayor longitud (más caracteres) tiene.
*/
public class LineaMayor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path;
		File file;
		
		System.out.print("Introduce la ruta de un archivo: ");
		path = sc.nextLine();
		sc.close();
		
		file = new File(path);
		if (file.isFile()) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line;
				String largest = "";
				while ((line = br.readLine()) != null) {
					if (line.length() > largest.length()) {
						largest = line;	
					}
				}
				
				br.close();
				System.out.println(" La linea con mas caracteres es: " + largest);
			}catch (FileNotFoundException e) {
				System.out.println("Error: archivo no encontrado.");
				
			}catch (IOException e) {
				System.err.println("ERROR: No se pudo leer el contenido.");
			}
		}else {
			System.out.println("ERROR: tiene que ser un archivo común.");
		}

	}

}
