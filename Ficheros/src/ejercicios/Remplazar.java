package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Remplazar {

	public static void main(String[] args) {
		// Ruta del archivo 1
		String path = "C:\\DAN\\prueba.txt";
		// Cadena objetivo
		//String target = "\\?";
		String target = "@";
		// Cadena de reemplazo
		String replace = "#";
		
		try {
			
			BufferedReader br = new BufferedReader(
					new FileReader(new File(path))
					); 
					String line;
					String newContent = "";
					
					while ((line = br.readLine()) != null) {
						newContent += line.replaceAll(target, replace) + "\n";
					}
					br.close();
					
					PrintWriter pw = new PrintWriter(
							new FileWriter(new File(path))
							);
							pw.print(newContent);
							pw.close();
			
			
							pw.close();
						} catch (FileNotFoundException e) {
							System.err.println("ERROR: archivo no encontrado.");
						} catch (IOException e) {
							System.err.println("ERROR: no se pudo leer/escribir/cerrar.");
						}

					}

				}
