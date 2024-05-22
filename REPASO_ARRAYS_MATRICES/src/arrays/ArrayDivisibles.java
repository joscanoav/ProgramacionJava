package arrays;

public class ArrayDivisibles {
	public static void main(String[] args) {
		int[] enteros = {2, 4, 7, 14, 49, 8};
		int n1 = 2; // Asumimos que est�n le�dos por teclado
		int n2 = 7;
		int multDivsN1 = 1;
		int multDivsN2 = 1;
		String stringDivsN1 = "";
		String stringDivsN2 = "";

		// 2 * 4 * 8 = 64
		// 7 * 49 = 343

		for (int i = 0; i < enteros.length; i++) {
			
			// Divisibles entre N1 SOLAMENTE
			if (enteros[i] % n1 == 0 && enteros[i] % n2 != 0) {
				multDivsN1 *= enteros[i]; // Acumulamos el n�mero
				stringDivsN1 += " * " + enteros[i]; // " * 1", por ejemplo
			}

			// Divisibles entre N2 SOLAMENTE
			if (enteros[i] % n2 == 0 && enteros[i] % n1 != 0) {
				multDivsN2 *= enteros[i]; // Acumulamos el n�mero
				stringDivsN2 += " * " + enteros[i]; // " * 1", por ejemplo
			}
			
		}

		System.out.println("Por dentro: " + stringDivsN1.substring(3)  + " = " + multDivsN1);
		System.out.println("Por fuera: " + stringDivsN2.substring(3) + " = " + multDivsN2);
	}

}
