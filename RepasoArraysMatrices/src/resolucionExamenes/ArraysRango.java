package resolucionExamenes;

public class ArraysRango {
	/*
	 * Dado un array, mostrar la suma de los n�meros que est�n entre [N1, N2]
	 * y los que est�n por fuera de (N1, N2), siendo N1 y N2 enteros le�dos
	 * por teclado.
	 */
	public class ArrayRangos {

		public static void main(String[] args) {
			int[] enteros = {1, 0, 2, 2, 1, 5, 7, 9};
			int n1 = 2; // Asumimos que est�n le�dos por teclado
			int n2 = 7;
			int sumaDentro = 0;
			int sumaFuera = 0;
			String stringDentro = "";
			String stringFuera = "";

			// 2 + 2 + 5 + 7 = 16
			// 1 + 0 + 2 + 2 + 1 + 7 + 9 = 22

			for (int i = 0; i < enteros.length; i++) {
				
				// Por dentro...
				if (enteros[i] >= n1 && enteros[i] <= n2) {
					sumaDentro += enteros[i]; // Acumulamos el n�mero
					stringDentro += " + " + enteros[i]; // " + 1", por ejemplo
				}

				// Por fuera...
				if (enteros[i] <= n1 || enteros[i] >= n2) {
					sumaFuera += enteros[i]; // Acumulamos el n�mero
					stringFuera += " + " + enteros[i];
				}
				
			}

			System.out.println("Por dentro: " + stringDentro.substring(3)  + " = " + sumaDentro);
			System.out.println("Por fuera: " + stringFuera.substring(3) + " = " + sumaFuera);
		}

	}
}