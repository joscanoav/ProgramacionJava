package arrays;

public class ArrayCharPosicion {
	public static void main(String[] args) {
		char[] letras = {'A', 'B', 'C', 'D'};

		// Para ir tomando la letra de referencia: 1º A, 2º B...
		for (int i = 0; i < letras.length; i++) {
			int pos = i;

			// Sólo lo usamos para contar 4 vueltas
			for (int j = 0; j < letras.length; j++) {
				System.out.print(letras[pos]);
				pos = (pos + 1) % letras.length; // pos -> 0, 1, 2, 3; 1, 2, 3, 0; 2, 3, 0, 1; 3, 0, 1, 2
			}

			System.out.println();
		}
	}

}