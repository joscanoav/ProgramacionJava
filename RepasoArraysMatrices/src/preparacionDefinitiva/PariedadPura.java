package preparacionDefinitiva;
/*Haz un programa que, dado un array de enteros en código, nos diga si es puro o no en cuanto a paridad.

Un array es de paridad pura cuando los elementos en posición par son pares y los elementos en posición impar son impares.*/
public class PariedadPura {

	public static void main(String[] args) {
		int[] array = {2, 5, 6, 1, 8};
		boolean pariedadPura = true;
		
		for (int i = 0; i < array.length && pariedadPura; i++) {
		
			if (i % 2 == 0 && array[i] % 2 == 1 || i % 2 == 1 && array[i] % 2 ==0) {
				pariedadPura = false;
			}
	//La expresi�n completa se eval�a como verdadera si al menos una de las dos partes es verdadera. En otras palabras, la condici�n se cumple si el elemento en la posici�n i no es de paridad pura (ya sea que i sea par e array[i] sea impar, o que i sea impar e array[i] sea par).
		
		}
	if(pariedadPura) {
		System.out.println("Es de pariedad Pura.");
	}else {
		System.out.println("No es de pariedad pura.");
	}
	}

}
