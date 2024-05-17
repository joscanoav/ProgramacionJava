package ficherosClase;
/*Haz un programa que pida al usuario las rutas de dos archivos y 
 * nos diga si contienen lo mismo, es decir, si son copias exactas
 *  en contenido.
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CopiasExactas {
	public static void main(String[] args) {
	// Ruta del archivo  1
	String path1 = "D:\\prueba.txt";
	// Ruta del archivo  2
	String path2 = "D:\\pruebaCopy.txt";
	
	try {
		BufferedReader br1 = new BufferedReader(
				new FileReader(new File(path1))
		);
		
		BufferedReader br2 = new BufferedReader(
				new FileReader(new File(path2))
		);
		
		String line1;
		String line2 = null;
		boolean sonIguales = true;
		
		while ((line1 = br1.readLine()) != null
				&& (line2 = br2.readLine()) != null
				) {
				if (!line1.equals(line2)) {
					sonIguales = false;
					break;
				}
		}
		
		if( 
				// Archivo 1 terminado pero puede que el e2 no
				line1 == null && br2.readLine() != null
				||
				// Archivo 1 no terminado y el 2 si terminado
				line1 != null && line2 == null
				
				) {
					sonIguales = false;
		}
		
		if (sonIguales) {
			System.out.println("Son Copias");
		}else {
			System.out.println("No son copias");
		}
		
		br1.close();
		br2.close();
	} catch (FileNotFoundException e) {
		System.err.println("ERROR: archivo no encontrado");
	} catch (IOException e) {
		System.err.println("ERROR: no se pudo leer/escribir/cerrar");
	}
}
	}