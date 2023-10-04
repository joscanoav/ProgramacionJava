package switchcase;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// El programa pide al usuario dos numero y una operacion
		// Las operaciones posibles son suma resta, multiplicacion division
		// EL programa muestra el resultado de la operacion
		Scanner teclado = new Scanner(System.in);

		int opcion = 0;
		double x;
		double y;
		
		
			
		System.out.print("Introduce el primer numero: ");
		x = teclado.nextInt();
		System.out.print("Introduce el segundo numero: ");
		y = teclado.nextInt();
		
	
		
			System.out.print(
				"Seleciona una operacion: \n"
					+ "1. Suma \n"
					+ "2. Resta \n"
					+ "3. Multiplicacion \n"
					+ "4. Division \n"
					+ "5. Salir \n"
					+ ">>"
			);
			
			
			
			while (opcion != 5) {
				
					opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Has seleccionado la suma, el resultado es: " + (x + y));
				break;
			case 2:
				System.out.println("Has seleccionado la resta, el resultado es: " + (x - y));
				break;
			case 3:
				System.out.println("Has seleccionado la multiplicación, el resultado es: " + (x * y));
				break;
			case 4:
				System.out.println("Has seleccionado la división, el resultado es:  " + (x / y));
				break;
			case 5:
				System.out.println("Gracias por usar la calculadora:  ");

				break;
		
			default:
				System.out.println("ERROR: opcion desconocida.");

				}
		

			}
	



}
}
