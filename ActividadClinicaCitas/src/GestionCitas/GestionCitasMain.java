package GestionCitas;

import java.util.Scanner;

public class GestionCitasMain {

	public static void main(String[] args) {
        Clinica clinica = new Clinica();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    solicitarCita(clinica, scanner);
                    break;
                case 2:
                    modificarCita(clinica, scanner);
                    break;
                case 3:
                    System.out.println("Saliendo de la aplicación. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);
    }

    public static void mostrarMenu() {
        System.out.println("1. Solicitar cita");
        System.out.println("2. Modificar cita");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void solicitarCita(Clinica clinica, Scanner scanner) {
        System.out.print("Ingrese su DNI: ");
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
        System.out.print("Ingrese su DNI: ");
        String dni = scanner.next();

        System.out.print("Tipo de cita actual (1 para revisión, 2 para tratamiento): ");
        int tipoActual = scanner.nextInt() - 1;

        System.out.print("Franja horaria actual (1 para mañana, 2 para tarde): ");
        int franjaActual = scanner.nextInt() - 1;

        clinica.mostrarHuecosDisponibles(franjaActual, tipoActual);

        System.out.print("Seleccione un hueco disponible para la modificación: ");
        int huecoActual = scanner.nextInt() - 1;

        System.out.print("Seleccione la nueva franja horaria (1 para mañana, 2 para tarde): ");
        int nuevaFranja = scanner.nextInt() - 1;

        clinica.mostrarHuecosDisponibles(nuevaFranja, tipoActual);

        System.out.print("Seleccione un hueco disponible para la nueva franja horaria: ");
        int nuevoHueco = scanner.nextInt() - 1;

        clinica.modificarCita(dni, tipoActual, franjaActual, huecoActual, nuevaFranja, nuevoHueco);
    }
}