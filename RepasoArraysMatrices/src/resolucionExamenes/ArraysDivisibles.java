package resolucionExamenes;

public class ArraysDivisibles {
	
	public static void main(String[] args) {
		int[] enteros = {2, 4, 7, 14, 49, 8};
		int n1 = 2; // Asumimos que están leídos por teclado
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
				multDivsN1 *= enteros[i]; // Acumulamos el número
				stringDivsN1 += " * " + enteros[i]; // " * 1", por ejemplo
			}

			// Divisibles entre N2 SOLAMENTE
			if (enteros[i] % n2 == 0 && enteros[i] % n1 != 0) {
				multDivsN2 *= enteros[i]; // Acumulamos el número
				stringDivsN2 += " * " + enteros[i]; // " * 1", por ejemplo
			}
			
		}

		System.out.println("Por dentro: " + stringDivsN1.substring(3)  + " = " + multDivsN1);
		System.out.println("Por fuera: " + stringDivsN2.substring(3) + " = " + multDivsN2);
	}

}
	
//PROMEDIO MODA
/*
 * package resolucionExamenes;

import java.util.HashMap;
import java.util.Map;

public class PromedioModaArray {

    public static void main(String[] args) {
        int[] numeros = {5, 7, 2, 5, 3, 7, 2, 1, 2}; // Array de prueba
        double promedio = calcularPromedio(numeros);
        int moda = calcularModa(numeros);

        System.out.println("Promedio: " + promedio);
        System.out.println("Moda: " + moda);
    }

    private static double calcularPromedio(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return (double) suma / numeros.length;
    }

    private static int calcularModa(int[] numeros) {
        Map<Integer, Integer> conteoNumeros = new HashMap<>();
        int moda = -1; // Valor por defecto si no hay moda
        int maxConteo = 0; // Conteo máximo de apariciones

        for (int numero : numeros) {
            if (conteoNumeros.containsKey(numero)) {
                conteoNumeros.put(numero, conteoNumeros.get(numero) + 1);
            } else {
                conteoNumeros.put(numero, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entrada : conteoNumeros.entrySet()) {
            int valor = entrada.getKey();
            int conteo = entrada.getValue();

            if (conteo > maxConteo) {
                maxConteo = conteo;
                moda = valor;
            }
        }

        return moda;
    }
}
*/

