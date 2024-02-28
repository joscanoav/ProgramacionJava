package preparacionDefinitiva;
/*Haz un programa que, dado un array de enteros en c√≥digo, nos diga si es puro o no en cuanto a paridad.

Un array es de paridad pura cuando los elementos en posici√≥n par son pares y los elementos en posici√≥n impar son impares.*/
public class PariedadPura {

	public static void main(String[] args) {
		int[] array = {2, 5, 6, 1, 8};
		boolean pariedadPura = true;
		
		for (int i = 0; i < array.length && pariedadPura; i++) {
		
			if (i % 2 == 0 && array[i] % 2 == 1 || i % 2 == 1 && array[i] % 2 ==0) {
				pariedadPura = false;
			}
	//La expresiÛn completa se eval˙a como verdadera si al menos una de las dos partes es verdadera. En otras palabras, la condiciÛn se cumple si el elemento en la posiciÛn i no es de paridad pura (ya sea que i sea par e array[i] sea impar, o que i sea impar e array[i] sea par).
		
		}
	if(pariedadPura) {
		System.out.println("Es de pariedad Pura.");
	}else {
		System.out.println("No es de pariedad pura.");
	}
	}

}
