package EstructuraDatosTipoVector;

import java.util.Scanner;

public class PruebaVector1 {
	public Scanner teclado;
	public int[] sueldos;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		sueldos = new int [5];
		for (int f=0; f<5;f++) {
			System.out.println("Ingrese valor de la componente");
			sueldos [f]= teclado.nextInt();
		}
	}
	
	public void imprimir() {
		for(int f=0; f<5;f++) {
			System.out.println(sueldos[f]);
		}
	}
	
	public static void main(String[] ar) {
		PruebaVector1 pv = new PruebaVector1();
		pv.cargar();
		pv.imprimir();
	}

}
