package ficherosClase;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertarCadenaInversa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> linea = new ArrayList<>();
		System.out.println("Introduce cadenas (una por linea). Deja una linea vacia para terminar");
		
		while(true) {
			String input = sc.nextLine();
			if(input.isEmpty()) {
				break;
			}
			linea.add(input);
		}
		sc.close();
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("cadenaInversa.txt"))){
			//Escribir las lineas en orden inverso
			/*	Con linea = ["manzana", "banana", "cereza"]:
				Primera Iteración (i = 2):
				linea.get(2) es "cereza".
				Se escribe "cereza" en cadenaInversa.txt.
				Se agrega un salto de línea después de "cereza".*/
			
			for(int i = linea.size() - 1; i >=0 ; i--) {
				writer.write(linea.get(i));
				writer.newLine();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Las cadenas han sido escritra en el archivo");
	}
}
