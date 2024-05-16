package ficherosClase;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*Haz un programa que pida al usuario la ruta de un archivo
 * y nos diga cuántas líneas tiene.
*/
import java.util.Scanner;

public class ContarLineas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		File file;
		String path;
		int lines = 0;
		
		System.out.println("Introduzca la ruta del archivo");
		path = sc.nextLine();
		sc.close();
		
		file = new File(path);
		
		if(file.isFile()) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				while (br.readLine()!=null) {
					lines++;
				}
				br.close();
				System.out.println("Se han leido " + lines + " lineas");
			} catch (FileNotFoundException e) {
				System.err.println("ERROR: archivo no encontado.");
		
			} catch (IOException e) {
				System.err.println("ERROR: no se pudo leer el contenido.");
			}
		} else {
			System.out.println("ERROR: tienen que ser un archivo comun.");
		}
		
	}
	
}
