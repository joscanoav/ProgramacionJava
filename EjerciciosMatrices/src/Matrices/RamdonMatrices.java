package Matrices;

import java.util.Random;
import java.util.Scanner;

public class RamdonMatrices{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la Fila");
		int fila = sc.nextInt();
		
		System.out.println("Ingrese la columna");
		int columna = sc.nextInt();
		
		//programación orientada a objetos (POO), una instancia 
		//es un objeto individual creado a partir de una clase.
		//Es como una copia de un molde (la clase) que se concreta con valores específicos.
		//Se utiliza la palabra clave new para crear una nueva instancia de la matriz con 
		//el tamaño especificado por filas y columnas.
		
		/*new int[fila][columna] crea la caja (matriz).
			int matriz [][] es la etiqueta que se coloca en la caja.
			La asignación int matriz [][] = new int[fila][columna] une
			 la etiqueta con la caja.*/
		
		int matriz [][] = new int[fila][columna];
	    /* new Random() crea un objeto para generar números aleatorios (random).
		Random random es la etiqueta que se coloca en dicho objeto. */
		Random random = new Random();
		
		System.out.println("Matriz generada");
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				matriz[i][j] = random.nextInt(10);
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
			
		}
	}
}
