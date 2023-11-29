package EstructuraDatosTipoVector;

import java.util.Scanner;

public class PromedioCincoEstudiantes {
	private Scanner teclado;
	private int[] cursoa;
	private int []cursob;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		cursoa = new int[5];
		cursob = new int [5];
		System.out.println("Carga de notas del curso A");
		for(int f=0; f<5;f++) {
			System.out.print("Integrese nota: ");
			cursoa[f] = teclado.nextInt();
		}
		
		System.out.println("Carga de notas del curso B");
		for(int f=0; f<5;f++) {
			System.out.print("Integrese nota: ");
			cursob[f] = teclado.nextInt();
	}

}
		public void calculaPromedios() {
			int suma1=0;
			int suma2=0;
			for (int f=0; f<5; f++) {
				suma1=suma1+cursoa[f];
				suma2=suma2+cursob[f];
			}
			int promedioa = suma1/5;
			int promediob = suma2/5;
			
			if (promedioa > promediob) {
				System.out.println("El curso A tiene un promedio mayor");
			} else if (promedioa < promediob) {
				System.out.println("El curso B tiene un promedio mayor.");

			} else {
				System.out.println("Son promedios iguales.");

			}
			
			}

		
		public static void main (String[] ar) {
			PromedioCincoEstudiantes PromEs = new PromedioCincoEstudiantes();
			PromEs.cargar();
			PromEs.calculaPromedios();
		}
	
}
