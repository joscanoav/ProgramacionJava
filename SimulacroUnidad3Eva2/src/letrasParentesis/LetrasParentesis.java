package letrasParentesis;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LetrasParentesis {

	public static void main(String[] args) {
		String path = "resultado.txt";
		Scanner sc = new Scanner(System.in);
		String line;
		
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(path));
		do {
			System.out.println("Introduce una cadena: ");
			line = sc.nextLine();
			// Escribir la palabra con los "()"
			pw.println(ponerParentesis(line));
		} while (!line.isEmpty());
		 sc.close();
		 pw.close();
		}catch (IOException e) {
			System.err.println("Error no se pudo escribir");
		}
	}

	private static String ponerParentesis(String line) {
			for(int i = 0; i < line.length(); i++) {}
		return null;
	}

}
