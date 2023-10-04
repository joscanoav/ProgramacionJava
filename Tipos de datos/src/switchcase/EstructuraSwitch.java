package switchcase;

import java.util.Scanner;

public class EstructuraSwitch {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion;
		System.out.print(
				"Seleciona una opcion: \n"
					+ "1. Opcion 1\n"
					+ "2. Opcion 2\n"
					+ "3. Opcion 3\n"
					+ ">>"
			);
		
			opcion = teclado.nextInt();
			
			/* if (opcion == 1) {
				System.out.println("Has seleccionado la 1.");
			} else if (opcion == 2) {
				
				System.out.println("Has seleccionado la 2.");

			} else if (opcion == 3) {
				
				System.out.println("Has seleccionado la 3.");
			} else {
				
				System.out.println("ERROR: opcion desconocida.");

			}*/
			
			switch (opcion) {
				case 1:
					System.out.println("Has seleccionado la 1.");
					//break;
				case 2:
					System.out.println("Has seleccionado la 2.");
					break;
				case 3:
					System.out.println("Has seleccionado la 3.");
					break;
				default:
					System.out.println("ERROR: opcion desconocida.");

			}
			
	}

}
