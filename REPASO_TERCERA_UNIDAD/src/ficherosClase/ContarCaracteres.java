package ficherosClase;
/*Haz un programa que pida al usuario la ruta de un archivo y nos diga cuántas letras, 
 * cuántos números y cuántos caracteres no-alfanuméricos tiene en total.*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ContarCaracteres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path;
		File file;
		
		System.out.print("Introduce La ruta de una carpeta: ");
		path = sc.nextLine();
		sc.close();
		
		file = new File(path);
		
		if (file.isFile()) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line;
				int letters = 0;
				int digits = 0;
				int others = 0;
				
				while ((line = br.readLine())!=null) {
						
					for (int i = 0; i < line.length(); i++) {
						if (Character.isAlphabetic(line.charAt(i))) {
							letters++;
						} else if (Character.isDigit(line.charAt(i))) {
							digits++;
						} else {
							others++;
						}
					}
				
					}
				br.close();
				System.out.println("Hay" + letters + " letras "
									+ digits + " digitos y "
									+others + " otros caracteres "
						);
								

			} catch (FileNotFoundException e) {
				System.err.println("ERROR: archivo no encontado.");
		
			} catch (IOException e) {
				System.err.println("ERROR: no se pudo leer el contenido.");
			}
		} else {
			System.out.println("ERROR: tienen que ser un archivo comun.");
	

	}
		
		sc.close();

}

	
}