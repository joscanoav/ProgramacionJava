package ficherosClase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PalabraMasRepite {

	public static void main(String[] args) {
		String filePath = "PalabrasRepetidas.txt";
		List<String> words = new ArrayList<>();
		List<Integer> counts = new ArrayList<>();
		
		//Leer el archivo y contar las palabras
		
		try (BufferedReader reader = new BufferedReader(new FileReader("PalabrasRepetidas.txt"))){
			String linea;
			while ((linea = reader.readLine()) != null){
				linea = linea.trim();
				if (!linea.isEmpty()) {
					int index = words.indexOf(linea);
					if(index == -1) {
						words.add(linea);
						counts.add(1);
					} else {
						counts.set(index,counts.get(index) + 1 );
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String mostFrequentWord = null;
		int maxCount = 0;
		
		for(int i = 0; i < words.size();i++) {
			if(counts.get(i) > maxCount) {
				maxCount = counts.get(i);
				mostFrequentWord = words.get(i);
			}
		}
		
		// imprimir resultado
		
		if (mostFrequentWord != null) {
			System.out.println("La palabra que mas se repite es: " + mostFrequentWord);
			System.out.println("Se repite " + maxCount + " veces.");
		}else {
			System.out.println("Nose se encontraron palabras en el archivo");
		}
		
		}
	}


