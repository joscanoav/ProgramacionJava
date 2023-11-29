package examenUno;

import java.util.Scanner;

public class MainBalanza {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el peso en gramos del plato izquierdo");
		int pesoIzquierdo = scanner.nextInt();
		
		System.out.println("Ingrese el peso en gramos del plato derecho:");
		int pesoDerecho = scanner.nextInt();
		
		Balanza balanza = new Balanza(pesoIzquierdo, pesoDerecho);
		while (true) {
			System.out.println("Opciones:");
			System.out.println("1.Calcular inclinacion");
			System.out.println("2.Equilibrar");
			System.out.println("3.Salir");
			
			int opcion = scanner.nextInt();
			
			switch (opcion) {
			
			case 1:
				balanza.calcularInclinacion();
				break;
			case 2:
				balanza.equilibrar();
				break;
			case 3:
				System.out.println("Fin del programa");
				System.exit(0);
				
			default: 
				System.out.println("Opcion no validad. Intentalo de nuevo");
			}
		}
		
	}

}
