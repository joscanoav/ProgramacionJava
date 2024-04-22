package atributosMetodos;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Persona p = leerPersona();
		Coche c = leerCoche(p);
		
		mostrarDatosCoche(c);
	}
	
	private static Coche leerCoche(Persona p) {
		String matricula;
		System.out.println("Introduce la matricula del coche: ");
		matricula = scanner.nextLine();
		
		return new Coche(matricula, p);
	}
	
	private static void mostrarDatosCoche(Coche coche) {
		Persona conductor = coche.getConductor();
		System.out.print(
				"Coche:\n	"
				+ "Matricula:	" + coche.getMatricula()
				+ "\n	Persona:	"
				+ conductor.getDni() + " / " + conductor.getNombre()
				
				);
	}
	
	private static Persona leerPersona() {
		String nombre;
		String dni;
		
		System.out.print("Introduce tu nombre: ");
		nombre = scanner.nextLine();
		System.out.print("Introduce tu DNI: ");
		dni = scanner.nextLine();
		
		return new Persona(nombre, dni);
		
	}
	


	}


