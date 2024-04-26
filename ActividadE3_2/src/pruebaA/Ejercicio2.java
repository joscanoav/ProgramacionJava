package pruebaA;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		String path = "resultado.txt";
		Scanner sc = new Scanner(System.in);
		String line;

		try {
			
			PrintWriter pw = new PrintWriter(new FileWriter(path));
			
			do {
				System.out.print("Introduce una cadena: ");
				line = sc.nextLine();

				pw.println(ponerParentesis(line));
			} while (!line.isEmpty());

			sc.close();
			pw.close();
		} catch (IOException e) {
			System.err.println("ERROR: no se pudo escribir.");
		}

	}


	private static String ponerParentesis(String line) {
		String newLine = "";

		for (int i = 0; i < line.length(); i++) {
			newLine += line.charAt(i) + "\n";

		}
			
		return newLine.toUpperCase();
		
	}

}


