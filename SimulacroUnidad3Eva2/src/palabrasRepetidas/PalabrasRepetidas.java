package palabrasRepetidas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PalabrasRepetidas {

	public static void main(String[] args) {
		String path = "palabras.txt";
		String line;
		ArrayList<String> palabras = new ArrayList<>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(path));

			while ((line = br.readLine()) != null) {

				if (!palabras.contains(line)) {
					palabras.add(line);
				}

			}

			br.close();

			System.out.println("Palabras sin repetir: " + palabras);
		} catch (IOException e) {
			System.err.println("ERROR: no se pudo leer el archivo.");
		}

	}

}
