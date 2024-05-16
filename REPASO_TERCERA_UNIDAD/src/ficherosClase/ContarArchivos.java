package ficherosClase;

import java.io.File;
import java.util.Scanner;

/*Haz un programa que pida al usuario la ruta de una carpeta. 
 * Si, efectivamente, es una carpeta, tiene que decirnos cuántos de los archivos 
 * que contiene son archivos comunes y cuántos son subcarpetas.*/

public class ContarArchivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path;
		File file;
		int contFiles = 0;
		int contDirs = 0;
		
		System.out.print("Introduce La ruta de una carpeta: ");
		path = sc.nextLine();
		sc.close();
		
		file = new File(path);
		
		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				System.out.println("         - " + f.getName());
				if(f.isFile()) {
					contFiles++;
				} else {
					contDirs++;
				}
		
			}
			
			System.out.println("La carpeta contiene " + contFiles + " archivos y " +contDirs + " subcarpetas.");
		} else {
			System.out.println("ERROR: no es una carpeta");
		}
		
		
	}

}
