package ficheroTests;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProcesarCadena {

	public static void main(String[] args) {

		// Definir la ruta del archivo de salida
		String rutaArchivo = "salida.txt";
		// Leer cadena desde tecladp
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String cadena = sc.nextLine();
		sc.close();
	
		// Procesar la cadena y escribir en el archivo
	    try {
			FileWriter fw = new FileWriter(rutaArchivo);
			
			for (char caracter : cadena.toCharArray()) {
				if(esVocal(caracter)) {
					fw.write(caracter + "\n");
				}else if (Character.isDigit(caracter)) {
					int valor = Character.getNumericValue(caracter);
					for(int i = 0; i < valor; i++) {
						fw.write(caracter);
					}
					fw.write("\n");
				}else {
					fw.write(caracter);
				}
			}
			fw.close();
			System.out.println("El resultado ha sido escrito en el archivo " + rutaArchivo);	
						
		} catch (IOException e) {
			System.out.println("Ocurrio un error al escribir el archivo");
			e.printStackTrace();
		
		}
	
	}

// metodo para verificar si un caracter es vocal
	
	private static boolean esVocal(char caracter) {
		return "aeiouAEIOU".indexOf(caracter) != -1;
	}
	}
