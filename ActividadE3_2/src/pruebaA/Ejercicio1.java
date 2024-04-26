package pruebaA;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {

	public static void main(String[] args) {

		String path = "prueba.txt";
		
			try {
				
				BufferedReader br = new BufferedReader(new FileReader(path));
					
				String line;
				boolean flag = false;

				
				while ((line = br.readLine()) != null) {
					for (int i = 0; i < line.length(); i++) {
						if(line.length() % 2 != 0) {
							flag = true;
						} else {
							flag = false;
						} 
					}
				}
				
					if (flag) {
						System.out.println("Cadena correcta!");
					} else {
						System.out.println("ERROR: cadena incorrecta.");
			}
				
				
				
				
			} catch (FileNotFoundException e) {
				System.err.println("ERROR: archivo no encontrado.");
			} catch (IOException e) {
				System.err.println("ERROR: no se pudo leer el contenido");
			}
		 
		}
		
	}
