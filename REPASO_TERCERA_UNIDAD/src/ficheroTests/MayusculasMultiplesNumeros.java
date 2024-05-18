package ficheroTests;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MayusculasMultiplesNumeros {

	public static void main(String[] args) {
		String path = "cadenaNumero.txt";
		String line;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce una cadena: ");
		line = sc.nextLine();
		sc.close();
		
		try  (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (char c : line.toCharArray()) {
				if(esVocal(c)) {
				c = cambiarCaso(c);
				bw.write(c);
				bw.newLine();
				
				} else if (Character.isDigit(c)) {
					int valor = Character.getNumericValue(c);
					String repetido = String.valueOf(c).repeat(valor);
					bw.write(repetido);
					bw.newLine();
				} else {
					bw.write(c);
					bw.newLine();
				}
				
			}
			
			System.out.println("La cadena se ha escrito en el archivo correctamente");
			
		} catch (IOException e) {
			System.err.println("ERROR: no se pudo escribir." + e.getMessage());
		}
		
	}
	
	private static boolean esVocal(char c) {
		return "aeiouAEIOU".indexOf(c) != -1;
	}
	
	private static char cambiarCaso(char c) {
		if(Character.isUpperCase(c)) {
			return Character.toLowerCase(c);
		}else {
			return Character.toUpperCase(c);
		}
	}

		
}



