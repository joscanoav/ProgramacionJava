package ficherosClase;
/*Haz un programa que pida al usuario cadenas hasta que introduzca una vac�a 
 * (condici�n de fin). Cuando acabe, se escribe un archivo "resultado.txt" en la 
 * carpeta del proyecto (simplemente en la ruta poned "archivo.txt" y se crear� ah� 
 * seguro, independientemente de la m�quina que us�is). En dicho archivo, estar�n, en 
 * l�neas separadas, todas las cadenas del usuario, seg�n se introdujeron, pero rodeando 
 * cada letra entre par�ntesis. Por ejemplo: si el usuario pone "vaca", "luz" y "tierra",
 *  se guardar�n las cadenas "(v)(a)(c)(a)", "(l)(u)(z)" y "(t)(i)(e)(r)(r)(a)".*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LetrasParentesis {

	public static void main(String[] args) {
		String path = "resultado.txt";
		String line;
		ArrayList<String> palabras = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			while ((line = br.readLine()) != null) {
				if(!palabras.contains(line)) {
					palabras.add(line);
				}
			}
			
			br.close();
			
			System.out.println("Palabras sin repetir: " + palabras);
			
			
		} catch (IOException e) {
			System.err.println("ERROR: no se pudo leer el archivo");

		}
	}

}
