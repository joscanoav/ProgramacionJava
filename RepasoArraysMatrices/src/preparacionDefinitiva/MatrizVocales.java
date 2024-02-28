package preparacionDefinitiva;

import java.util.Random;
import java.util.Scanner;

public class MatrizVocales {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int filas;
		int columnas;
		char[][] matriz;
		Random rand = new Random();
		String vocales = "AEIOU";
		
		// Pedir al usuario las dimensiones:
		System.out.print("Introduce las filas: ");
		filas = sc.nextInt();
		System.out.print("Introduce las columnas: ");
		columnas = sc.nextInt();
		
		// Creamos la matriz. Todos los chars están por defecto a 0:
		matriz = new char[filas][columnas];
		
		// Rellenar con aleatorios:
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[0].length; j++) {
				// int nVocales = vocales.length();
				// int aleatorio = rand.nextInt(nVocales);
				// char caracter = vocales.charAt(aleatorio);
				// matriz[i][j] = caracter;
				matriz[i][j] = vocales.charAt(rand.nextInt(vocales.length()));
				System.out.print(matriz[i][j]);
			}
			
			System.out.println();
		}
		
	}

}