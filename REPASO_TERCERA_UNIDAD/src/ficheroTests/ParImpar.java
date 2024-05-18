package ficheroTests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ParImpar {

	public static void main(String[] args) {
		String path= "palabras.txt";
		String line;
		boolean esCorrecto = true;
		int numeroLinea = 1;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while ((line = br.readLine()) != null) {
				
				int longitud = line.length();
				// linea es impar
				if (numeroLinea % 2 != 0)
					if (longitud % 2 == 0) {
						esCorrecto = false;
                        System.out.println("Error en la línea " + numeroLinea + ": se esperaba un número impar de caracteres.");
                // linea par
				} else {
						if (longitud % 2 != 0) {
							esCorrecto = false;
	                        System.out.println("Error en la línea " + numeroLinea + ": se esperaba un número par de caracteres.");
				}
				
				}
				
				numeroLinea++;
			}
			
			
			if(esCorrecto) {
				System.out.println("es correcto");
			}else {
				System.out.println("no es correcto");
			}
			
	} catch (IOException e) {
			System.err.println("ERROR: no se pudo leer el archivo.");
	    }
	}

}

