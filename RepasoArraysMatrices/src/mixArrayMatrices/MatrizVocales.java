package mixArrayMatrices;

import java.util.Random;
import java.util.Scanner;

public class MatrizVocales {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int filas;
		int columnas;
		char[][] matriz;
		Random rand = new Random();
		String vocales =  "AEIOU";
		
		//Pedir al usuario las dimensiones:
		System.out.println("Introduce las filas: ");
		filas = sc.nextInt();
		System.out.println("Introduce las columnas:  ");
		columnas = sc.nextInt();
		
		
		//Creaamos la matriz. Todos los chars estan por defecto a 0:
		matriz = new char[filas][columnas];
		//Rellenar con aletorios: 
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = vocales.charAt(rand.nextInt(vocales.length()));
				System.out.println(matriz[i][j]);
				
			}
			
		}
	}

}
