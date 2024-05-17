package ficherosClase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BuscarOcurrenciasSimple {

	public static void main(String[] args) {
		// Ruta del archivo
		String path =  "D:\\prueba.txt";
		// Cadena a buscar
		String search = "c";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(path)));
			
			String line;
			int count = 0;
			
			while((line = br.readLine()) != null) {
				int indice = 0;
				while ((indice = line.indexOf(search, indice)) != -1) {
					count++; //recuento de ocurrencia
					indice += search.length();
				}
				
			}
			
			System.out.println("la cadena " + search + " aparece " + count + " veces " );
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR: archivo no encontrado.");
		} catch (IOException e) {
			System.err.println("ERROR: no se pudo leer/escribir/cerrar.");
		}
	
	}

}
