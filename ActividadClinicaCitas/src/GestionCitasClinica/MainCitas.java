package GestionCitasClinica;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCitas {
    public static void main(String[] args) {
        Clinica clinica = new Clinica();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();
            try {
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    solicitarCita(clinica, scanner);
                    break;
                case 2:
                    modificarCita(clinica, scanner);
                    break;
                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }catch (InputMismatchException e) {
        	System.out.println("Error: Ingrese un numero valido");
        	scanner.next();
        	continue;
        }
      }
    }
    
    public static void mostrarMenu() {
        System.out.println("\n**** Bienvenido a la Clinica IFP ****");
        System.out.println("\nMenú Principal:");
        System.out.println("1. Solicitar cita");
        System.out.println("2. Modificar cita");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void solicitarCita(Clinica clinica, Scanner scanner) {
        System.out.print("\nIngrese su DNI: ");
        String dni = scanner.next();

        System.out.print("Tipo de cita (1 para revisión, 2 para tratamiento): ");
        int tipo = scanner.nextInt() - 1;  // Restamos 1 para ajustarnos al índice del array

        System.out.print("Seleccione la franja horaria (1 para mañana, 2 para tarde): ");
        int franja = scanner.nextInt() - 1;

        clinica.mostrarHuecosDisponibles(franja, tipo);

        System.out.print("Seleccione un hueco disponible: ");
        int hueco = scanner.nextInt() - 1;

        clinica.solicitarCita(dni, tipo, franja, hueco);
    }

    public static void modificarCita(Clinica clinica, Scanner scanner) {
        System.out.print("\nIngrese su DNI: ");
        String dni = scanner.next();

        System.out.print("Tipo de cita actual (1 para revisión, 2 para tratamiento): ");
        int tipoActual = scanner.nextInt() - 1;

        System.out.print("Franja actual de la cita (1 para mañana, 2 para tarde): ");
        int franjaActual = scanner.nextInt() - 1;

        clinica.mostrarHuecosDisponibles(franjaActual, tipoActual);

        System.out.print("Seleccione el hueco actual: ");
        int huecoActual = scanner.nextInt() - 1;

        System.out.print("Seleccione la nueva franja horaria (1 para mañana, 2 para tarde): ");
        int nuevaFranja = scanner.nextInt() - 1;

        clinica.mostrarHuecosDisponibles(nuevaFranja, tipoActual);

        System.out.print("Seleccione el nuevo hueco disponible: ");
        int nuevoHueco = scanner.nextInt() - 1;

        clinica.modificarCita(dni, tipoActual, franjaActual, huecoActual, nuevaFranja, nuevoHueco);
    }
}