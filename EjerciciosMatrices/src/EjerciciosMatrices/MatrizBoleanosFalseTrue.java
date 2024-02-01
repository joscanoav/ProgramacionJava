package EjerciciosMatrices;

import java.util.Scanner;

public class MatrizBoleanosFalseTrue {

	public static void main(String[] args) {
		
		int filas = 3;
		int columnas = 3;
		int fila;
		int columna;
		boolean [][] matriz = new boolean[filas][columnas];
		int contFalses = filas * columnas;
		Scanner sc = new Scanner(System.in);
		
		while(contFalses > 0) {
			// Pedir al usuario la posicion:
			System.out.println("Introduce la fila: ");
			fila = sc.nextInt();
			System.out.println("Introduce la columna: ");
			columna = sc.nextInt();
			
			
			if(!matriz[fila][columna]) {
			//Cambiar el valor de la posicion
			matriz[fila][columna] = true;
			//Decrementamos el contador:
			contFalses--;
		} else {
			System.out.println("Esta posicion ya esta en true.");
			}
		}
		
		
	}

}
