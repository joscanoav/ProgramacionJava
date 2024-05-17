package ficherosClase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*Haz un programa que pida al usuario la ruta de un archivo, 
 * una cadena objetivo y una cadena de reemplazo. Se tienen que reemplazar 
 * en el archivo original (sobreescritura) todas las coincidencias de la cadena
 * objetivo por la cadena de reemplazo.
*/
public class RemplazoCadena {

	public static void main(String[] args) {
		// Ruta del archivo
		String path =  "D:\\prueba.txt";
		// Cadeba Objetivo
		String target = "@";
		
		// Cadena de remplazo
		String replace = "#";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(path)));
		
			String line;
			String newContent = "";
			
			
			while((line = br.readLine()) != null) {
					newContent += line.replaceAll(target,replace) + "\n";
				}
				br.close();
				
				PrintWriter pw = new PrintWriter(
						new FileWriter(new File(path))
						);
				pw.print(newContent);
				pw.close();
		
		} catch (FileNotFoundException e) {
			System.err.println("ERROR: archivo no encontrado.");
		} catch (IOException e) {
			System.err.println("ERROR: no se pudo leer/escribir/cerrar.");
		}
	}
}
