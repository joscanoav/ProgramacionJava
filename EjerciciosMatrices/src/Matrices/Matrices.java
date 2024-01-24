package Matrices;

import java.util.Iterator;

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] matriz = {
				{0,1,2},
				{3,4,5},
				{6,7,8}
		};
		
		int [] fila0 = matriz[0];
		int [] fila1 = matriz[1];
		int [] fila2 = matriz[2];
		int [] [] matrizCeros = new int [4][4];
		
		System.out.println("Elemento central: " + fila1[1]);
		System.out.println("Elemento central: " + matriz[1] [1]);
		
		// i = 0
		for (int i = 0; i < matriz.length; i++) {
			//j = 0
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

}

