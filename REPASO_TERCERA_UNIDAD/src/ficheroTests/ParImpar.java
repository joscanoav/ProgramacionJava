package ficheroTests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ParImpar {

	public static void main(String[] args) {
		String path= "LineaParImpar.txt";
		String linea;
		boolean esCorrecto = true;
		int numeroLinea = 1;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while ((linea = br.readLine()) != null) {
				for(char c : linea.toCharArray()) {
					if (!Character.isDigit(c)) {
					   esCorrecto = false;
					   break;
					}
					//convierte el valor entero a 
					//int digito = c - '0';
					int digito = Character.getNumericValue(c);
					if(numeroLinea % 2 != 0 && digito % 2 == 0) {
						esCorrecto = false;
						break;
					}
					
					if(numeroLinea % 2 == 0 && digito % 2 != 0) {
						esCorrecto = false;
						break;
					}
					
				}
				
				numeroLinea++;
			}
				
			if(esCorrecto) {
				System.out.println("Es correcto");
			} else {
				System.out.println("Es incorrecto");
			}
				
			
	} catch (IOException e) {
			System.err.println("ERROR: no se pudo leer el archivo.");
	    }
	}

}

