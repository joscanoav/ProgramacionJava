package recuperaciónE21;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Create the attraction
	        Atraccion atraccion = new Atraccion("Montaña Rusa", 100, 20);

	        int opcion;

	        do {
	            System.out.println("\n**Menú**");
	            System.out.println("1. Añadir usuario a cola");
	            System.out.println("2. Ver colas de espera");
	            System.out.println("3. Avanzar cola de espera");
	            System.out.println("4. Salir");

	            System.out.print("Introduce una opción: ");
	            opcion = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (opcion) {
	                case 1:
	                    agregarUsuario(scanner, atraccion);
	                    break;
	                case 2:
	                    verColas(atraccion);
	                    break;
	                case 3:
	                    avanzarCola(scanner, atraccion);
	                    break;
	                default:
	                    System.out.println("Opción no válida.");
	            }
	        } while (opcion != 4);

	        scanner.close();
	    }

	    private static void agregarUsuario(Scanner scanner, Atraccion atraccion) {
	        System.out.print("Introduce el nombre del usuario: ");
	        String nombre = scanner.nextLine();

	        System.out.print("Introduce el número de estrellas (0 para normal): ");
	        int estrellas = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        if (estrellas > 0) {
	            atraccion.agregarUsuarioColaVIP(new Usuario(nombre, estrellas));
	        } else {
	            atraccion.agregarUsuarioColaNormal(new Usuario(nombre, estrellas));
	        }
	    }

	    private static void verColas(Atraccion atraccion) {
	        System.out.println("\nCola normal:");
	        System.out.println(atraccion.verColaNormal());
	        System.out.println("\nCola VIP:");
	        System.out.println(atraccion.verColaVIP());
	    }

	    private static void avanzarCola(Scanner scanner, Atraccion atraccion) {
	        System.out.print("¿Cuántos usuarios quieres avanzar? ");
	        int cantidad = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        for (int i = 0; i < cantidad; i++) {
	            if (!atraccion.colaVIP.estaVacia()) {
	                Usuario usuario = atraccion.colaVIP.eliminarUsuario();
	                System.out.println(usuario.getNombre() + " (VIP) se ha montado");
	            } else if (!atraccion.colaNormal.estaVacia()) {
	                Usuario usuario = atraccion.colaNormal.eliminarUsuario();
	                System.out.println(usuario.getNombre() + " (normal) se ha montado");
	            } else {
	                System.out.println("No hay más usuarios en las colas.");
	                break;
	            }
	        }

	        System.out.println("\nUsuarios avanzados: " + cantidad);
	    }
	}