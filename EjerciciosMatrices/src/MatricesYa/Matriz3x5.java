package MatricesYa;

import java.util.Scanner;

public class Matriz3x5 {
	
	private Scanner sc;
	private int[][] matriz;
	
	public void cargar() {
		sc = new Scanner(System.in);
		matriz = new int [3][5];
		for(int f=0; f<3;f++) {
			for(int c=0; c<5;c++) {
				System.out.print("Ingrese componente: ");
				matriz[f][c]=sc.nextInt();
			}
		}
	}
	
	public void imprimir () {
		for(int f=0; f<3; f++) {
			for(int c=0; c<5; c++) {
				System.out.print(matriz[f][c]+" ");
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] ar) {
		Matriz3x5 matriz = new Matriz3x5();
		matriz.cargar();
		matriz.imprimir();
	}

}
