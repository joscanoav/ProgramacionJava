package Arrays;

public class Ejercicio1111 {

	public static void main(String[] args) {
		int[] numeros = {1, 4 ,7, 1, 2, 0 ,9, 8};
		int menor = numeros[0];
		int mayor = numeros[0];
		
		for (int i = 1; i < numeros.length; i++) {
			//if para el menor
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
			
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
		}
		
		System.out.println("El menor es " + menor);
		System.out.println("El mayor es " + mayor);
		
	}

}
