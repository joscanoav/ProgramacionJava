package palabrasRepetidas;

import java.util.ArrayList;

public class PalabrasRepetidas {

	public static void main(String[] args) {
		string path = 'palabras.txt';
		String line;
		ArrayList<String> palabras = new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			if(!palabras.contains(line)) {
				palabras.add(line);
			}
			System.err.println("Palabras sin repetir: " + palabras);
		} catch (Exception e) {
			System.err.println();
		}
	}

}
