package mixArrayMatrices;

import java.util.Arrays;
import java.util.Scanner;

public class EliminarA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cadena;
		String[] palabras;
		
		System.out.print("Introduce una cadena con guiones: ");
		cadena = sc.nextLine();
		palabras = cadena.split("-");
		
		for (int i = 0; i < palabras.length; i++) {
			//palabras[i] = palabras[i].replaceAll("A"," ");
			//palabras[i] = palabras[i].replaceAll("a"," ");
			
			palabras[i] = palabras[i].replaceAll("A", " ").replaceAll("a"," ");
		}
		System.out.println(Arrays.toString(palabras));
		
	}

}
