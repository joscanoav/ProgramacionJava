package repasoArrays;
/*Hacer un programa que busque dentro de un array de enteros (escrito en código) el valor máximo y el valor mínimo.
*/
public class MaximoMinimo {

	public static void main(String[] args) {
		int[] numeros = {1,4,7,1,2,0,9,8};
		int menor = numeros[0];
		int mayor = numeros[0];
		
		for (int i = 1; i < numeros.length; i++) {
			// if para el menor
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
			//if para el mayor
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
		}
		
		System.out.println("Menor : " + menor);
		System.out.println("Mayor : " + mayor);
		
	}

}
