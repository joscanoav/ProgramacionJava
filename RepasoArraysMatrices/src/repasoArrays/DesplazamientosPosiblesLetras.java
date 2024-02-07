package repasoArrays;

public class DesplazamientosPosiblesLetras {

	public static void main(String[] args) {
		char[] letras = {'A', 'B', 'C', 'D'};

		// Para ir tomando la letra de referencia: 1� A, 2� B...
		for (int i = 0; i < letras.length; i++) {
			int pos = i;

			// S�lo lo usamos para contar 4 vueltas
			for (int j = 0; j < letras.length; j++) {
				System.out.print(letras[pos]);
				pos = (pos + 1) % letras.length; // pos -> 0, 1, 2, 3; 1, 2, 3, 0; 2, 3, 0, 1; 3, 0, 1, 2
			}

			System.out.println();
		}
	}

}

/*char[] letras = {'A', 'B', 'C', 'D'};: Se declara e inicializa un array de caracteres llamado letras con las letras A, B, C y D.

for (int i = 0; i < letras.length; i++) {: Comienza un bucle externo que itera sobre cada letra en el array letras. La variable i se utiliza como �ndice de referencia para determinar desde qu� letra comenzar.

int pos = i;: Se declara e inicializa una variable pos con el valor de i. Esta variable se utilizar� para controlar desde qu� posici�n imprimir las letras en cada iteraci�n del bucle interno.

for (int j = 0; j < letras.length; j++) {: Comienza un bucle interno que se ejecuta cuatro veces (la longitud del array letras).

System.out.print(letras[pos]);: Imprime la letra en la posici�n actual (pos) del array letras.

pos = (pos + 1) % letras.length;: Actualiza la variable pos para pasar a la siguiente letra en el array. Utiliza la operaci�n de m�dulo (%) para asegurarse de que pos vuelva a 0 cuando llega al final del array.

Se repiten los pasos 5-6 hasta que se han impreso las cuatro letras.

System.out.println();: Despu�s de imprimir una fila completa de letras, se agrega un salto de l�nea para pasar a la siguiente l�nea.

El bucle exterior (paso 2) contin�a con una nueva letra de referencia hasta que se hayan impreso todas las combinaciones posibles*/
