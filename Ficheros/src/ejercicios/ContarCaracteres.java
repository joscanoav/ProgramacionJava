package ejercicios;

import java.io.BufferedReader;
/*Te permite leer el archivo línea por línea y mejora el rendimiento
 *  en comparación con la lectura caracter por caracter.*/
import java.io.File;
/*La clase File representa un archivo o directorio en el sistema de archivos.
 *  Puedes usar esta clase para verificar si existe un archivo, obtener su ruta, 
 *  tamaño y realizar otras operaciones en el archivo.*/
import java.io.FileNotFoundException;
/*Esta excepción se lanza cuando el programa intenta leer 
 * un archivo que no existe.*/
import java.io.FileReader;
/*La clase FileReader se utiliza para crear un flujo de lectura de caracteres 
 * desde un archivo. */
import java.io.IOException;
/*Esta es una clase de excepción general que puede ser lanzada por varios métodos 
 * relacionados con la lectura y escritura de archivos. Al importar esta excepción, 
 * puedes manejar posibles problemas que puedan surgir durante las operaciones con 
 * archivos, como errores de disco o problemas de permisos.*/
import java.util.Scanner;

public class ContarCaracteres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path;
		File file;
		
		System.out.print("Introduce la ruta de un archivo: ");
		path = sc.nextLine();
		sc.close();
		/*Se declara una variable File llamada file para representar el archivo 
		 * en el sistema de archivos.*/
		file = new File(path);
		/*Se verifica si el archivo representado por file existe y es un archivo 
		 * común usando file.isFile().*/
		if(file.isFile()) {
			
			/*Se usa un bloque try-catch para manejar posibles excepciones durante 
			 * la lectura del archivo.*/
			
			try {
					/*Se crea un objeto BufferedReader llamado br para leer el archivo 
					 * línea por línea de manera eficiente.*/
					/*Imagina que estás sacando agua de un pozo. FileReader sería como sacar 
					 * una sola taza de agua cada vez, mientras que BufferedReader sería como 
					 * usar un balde para sacar varias tazas a la vez. De esta manera, puedes 
					 * llenar tu contenedor (leer el archivo) mucho más rápido con BufferedReader.*/
				
					BufferedReader br = new BufferedReader(new FileReader(file));
					
					/*Se declara una variable String llamada line para almacenar cada
					 *  línea que se leerá del archivo.*/
					String line;
					int letters = 0;
					int digits = 0;
					int others = 0;
					
					/*Se usa un ciclo while para leer el archivo línea por línea. La condición 
					 * (line = br.readLine()) != null verifica si se pudo leer una línea del archivo. 
					 * Si br.readLine() devuelve null, significa que no hay más líneas para leer y el 
					 * ciclo termina.*/
					
					while ((line = br.readLine()) != null) {
						for (int i = 0; i < line.length(); i++) {
							if(Character.isAlphabetic(line.charAt(i))) {
								letters++;
							} else if (Character.isDigit(line.charAt(i))) {
								digits++;
							} else {
								others++;
							}
						}
					}
										
					System.out.println(
							"Hay " + letters + " letras, "
							+ digits + " digitos y "
							+ others + " otros caracteres. "
							);
					
			} catch (FileNotFoundException e) {
				System.err.println("ERROR: archivo no encontrado.");
			} catch (IOException e) {
				System.err.println("ERROR: no se pudo leer el contenido");
			}
		} else {
			System.out.println("ERROR: tiene que ser un archivo común");
		}
		
	}

}
