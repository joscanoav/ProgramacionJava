package ficherosClase;
/*Haz un programa que pida al usuario cadenas hasta que introduzca una vacía 
 * (condición de fin). Cuando acabe, se escribe un archivo "resultado.txt" en la 
 * carpeta del proyecto (simplemente en la ruta poned "archivo.txt" y se creará ahí 
 * seguro, independientemente de la máquina que uséis). En dicho archivo, estarán, en 
 * líneas separadas, todas las cadenas del usuario, según se introdujeron, pero rodeando 
 * cada letra entre paréntesis. Por ejemplo: si el usuario pone "vaca", "luz" y "tierra",
 *  se guardarán las cadenas "(v)(a)(c)(a)", "(l)(u)(z)" y "(t)(i)(e)(r)(r)(a)".*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LetrasParentesis {

	public static void main(String[] args) {
		String path = "resultado.txt";
		Scanner sc = new Scanner(System.in);
		String line;
		
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(path));
			
			do {
				System.out.print("Introduce una cadena: ");
				line = sc.nextLine();
				// Escribir la palabra con los "()"
				pw.println(ponerParentesis(line));
				
			} while(!line.isEmpty());
			
			sc.close();
			pw.close();
		
		} catch (IOException e) {
			System.err.println("ERROR: no se pudo escribir.");
		}
		
	}
	
	private static String ponerParentesis(String line) {
		String newLine = "";
		
		for (int i = 0; i < line.length(); i++) {
				newLine += "(" + line.charAt(i) + ")";
			
		}
		
		return newLine;
		
	}

}
