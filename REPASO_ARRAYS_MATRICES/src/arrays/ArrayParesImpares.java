package arrays;
/*Hacer un programa que tenga un array (escrito en c�digo) y nos diga 
 * cu�ntos n�meros pares y cu�ntos impares hay.
*/
public class ArrayParesImpares {

	public static void main(String[] args) {
		int[] nums = {6, 0, 5, 1};
		int contPares = 0;
		int contImpares = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 == 0) {
				contPares++;
			} else {
				contImpares++;
			}

		}

		System.out.println("Hay " + contPares + " pares y " + contImpares + " impares.");
	}

}

