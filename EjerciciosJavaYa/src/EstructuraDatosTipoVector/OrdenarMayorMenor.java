package EstructuraDatosTipoVector;

import java.util.Scanner;

public class OrdenarMayorMenor {
	private Scanner teclado;
	private int[] vec;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		vec= new int[10];
		for(int f=0;f<10;f++) {
			System.out.println("Ingrese elemento:");
			vec[f] = teclado.nextInt();
		}
	}
	
	public void verificarOrdenado() {
	int orden=1;
	for(int f=0;f<9;f++) {
		if(vec[f+1] < vec[f]) {
			orden=0;
		}
		
	}
	if (orden==1) {
		System.out.println("Esta ordenado de menor a mayor");
	}else {
		System.out.println("No esta ordenado de menor a mayor");
	}
}

public static void main(String[]ar) {
	OrdenarMayorMenor ordenar = new OrdenarMayorMenor();
	ordenar.cargar();
	ordenar.verificarOrdenado();
 }
}
