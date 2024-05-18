package ficheroTests;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MayuMinuNumSimple {

	public static void main(String[] args) {
		String path = "cadenaNumero2.txt";
		String line;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce una cadena: ");
		line = sc.nextLine();
		sc.close();
		
		try  (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (char c : line.toCharArray()) {
				// verificar si el caracter es un vocal
				if("aeiou".indexOf(c) >= 0) {
					c = Character.toUpperCase(c);
				} else if ("AEIOU".indexOf(c) >= 0) {
					c = Character.toLowerCase(c);
				}
				
				// Verificar si el caracter es un digito
								
				if (Character.isDigit(c)) {
					int valor = Character.getNumericValue(c);
					for (int i = 0; i < valor; i++ ) {
						bw.write(c);
					}
					bw.write('\n');

				} else {
					bw.write(c);
					bw.write('\n');
				}
				
			}
			
			System.out.println("La cadena se ha escrito en el archivo correctamente");
			
		} catch (IOException e) {
			System.err.println("ERROR: no se pudo escribir." + e.getMessage());
		}
	}
}

		
