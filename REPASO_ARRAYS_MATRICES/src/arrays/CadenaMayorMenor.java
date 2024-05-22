package arrays;

public class CadenaMayorMenor {

	public static void main(String[] args) {
		String[] cadenas = {"1", "22", "333", "4444"};
		String cadenaMenor = cadenas[0];
		String cadenaMayor = cadenas[0];

		for (int i = 1; i < cadenas.length; i++) {

			if (cadenas[i].length() < cadenaMenor.length()) {
				cadenaMenor = cadenas[i];
			}

			if (cadenas[i].length() > cadenaMayor.length()) {
				cadenaMayor = cadenas[i];
			}

		}

		System.out.println("La cadena de menor longitud es " + cadenaMenor);
		System.out.println("La cadena de mayor longitud es " + cadenaMayor);
	}

}