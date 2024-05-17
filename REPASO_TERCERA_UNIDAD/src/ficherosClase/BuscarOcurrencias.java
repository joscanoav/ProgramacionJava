package ficherosClase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*Haz un programa que pida al usuario la ruta de un archivo y una cadena. 
 * Después, nos dirá cuántas veces aparece dicha cadena en el archivo.
*/
public class BuscarOcurrencias {

	public static void main(String[] args) {
		// Ruta del archivo
		String path =  "D:\\prueba.txt";
		// Cadena a buscar
		String search = "c";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(path)));
			
			String line;
			int count = 0;
			int lineNumber = 0;
			int charNumber;
			int offset = 0;
			
			while((line = br.readLine()) != null) {
				while ((charNumber = line.indexOf(search)) != -1) {
					System.out.println("Ocurrencia en linea " + lineNumber + " caracter " + (charNumber + offset));
					offset += line.substring(0, charNumber + search.length()).length();
					line = line.substring(charNumber + search.length()); 
					count++; //recuento de ocurrencia
				}
				
				offset = 0;
				lineNumber++;
			}
			
			System.out.println("Se han detectado " + count + " ocurrencias.");
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR: archivo no encontrado.");
		} catch (IOException e) {
			System.err.println("ERROR: no se pudo leer/escribir/cerrar.");
		}
	
	}

}
