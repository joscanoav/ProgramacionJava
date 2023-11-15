package Principal;

import java.util.Scanner;

import Objetos.Hospital;


public class GestionHospital {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del hospital: ");
		String nombreHospital = teclado.nextLine();
		
		System.out.println("Ingrese el numero de plantas del hospital: ");
		int numPlantas = teclado.nextInt();
		
		System.out.println("Ingrese el numero de medicos del hospital: ");
		int numMedicos = teclado.nextInt();
		
		Hospital hospital = new Hospital(nombreHospital, numPlantas, numMedicos);
		teclado.nextLine();
		
		while(true) {
			System.out.println("\nMenu");
			System.out.println("1.Reservar Cita: ");
			System.out.println("2.Mostrar registro de citas");
			System.out.println("3.Salir");
			System.out.println("4.Seleccione una opcion");
		
			int opcion = teclado.nextInt();
			teclado.nextLine();
			
			switch(opcion) {
			case 1:
				System.out.println("\nReservar Cita: ");
				System.out.println("Nombre de la Persona: ");
				String nombrePersona = teclado.nextLine();
				System.out.print("Fecha (ej. 21 de mayo de 2024): ");
				String fecha = teclado.nextLine();
				System.out.print("Hora (ej. 9:40): ");
				String hora = teclado.nextLine();
				hospital.reservarCitas(nombrePersona, fecha, hora);
				System.out.println("Cita reservada con exito.");
				break;
				
			case 2:
				hospital.mostrarRegistroCitas();
				break;
			
			case 3:
				System.out.println("Saliendo del programa. !Hasta luego!");
				teclado.close();
				System.exit(0);
				
				default:
					System.out.println("Opcion no valida. Intentelo de nuevo");
			}

		}
		
	}

}
