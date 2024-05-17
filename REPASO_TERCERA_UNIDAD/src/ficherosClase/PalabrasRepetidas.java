package ficherosClase;
/*Haz un programa que lea un archivo (la ruta está escrita en una variable "path"). 
 * El archivo contendrá cadenas en líneas independientes. Se tienen que mostrar esas 
 * mismas cadenas, pero quitando duplicados. Por ejemplo: si el archivo contiene 
 * "aguacate", "cedro", "olmo", "aguacate", "encina", "encina", "olmo" y "aguacate", 
 * el resultado será "aguacate", "cedro", "olmo" y "encina".*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PalabrasRepetidas {

	public static void main(String[] args) {
		String path= "palabras.txt";
		String line;
		ArrayList<String> palabras = new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while ((line = br.readLine()) != null) {
				if (!palabras.contains(line)) {
					palabras.add(line);
				}
			}
			
			br.close();
			System.out.println("palabras son repetir: " + palabras);
	} catch (IOException e) {
			System.err.println("ERROR: no se pudo leer el archivo.");
	    }
	}

}
