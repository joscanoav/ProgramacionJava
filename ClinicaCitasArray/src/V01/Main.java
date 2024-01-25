package V01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clinica clinica = new Clinica();

        System.out.println("¡Bienvenido a la Clínica IFP!");

        while (true) {
            System.out.println("\n¿Qué desea hacer?");
            System.out.println("1 - Solicitar cita");
            System.out.println("2 - Modificar cita");
            System.out.println("3 - Salir");

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir la línea en blanco

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
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido");
                scanner.next(); // Limpiar el buffer del scanner
                continue;
            }
        }
    }

    public static void solicitarCita(Clinica clinica, Scanner scanner) {
        System.out.print("\nIngrese su DNI: ");
        String dni = scanner.next();

        System.out.print("Tipo de cita (0 para revisión, 1 para tratamiento): ");
        int tipoCita = scanner.nextInt();

        System.out.print("Seleccione la franja horaria (0 para mañana, 1 para tarde): ");
        int franjaHoraria = scanner.nextInt();

        clinica.mostrarHuecosDisponibles(franjaHoraria, tipoCita);

        System.out.print("Seleccione un hueco disponible: ");
        int hueco = scanner.nextInt() - 1; // Restar 1 para ajustar al índice del array

        clinica.solicitarCita(dni, tipoCita, franjaHoraria, hueco);
    }

    public static void modificarCita(Clinica clinica, Scanner scanner) {
        System.out.print("\nIngrese su DNI: ");
        String dni = scanner.next();

        System.out.print("Tipo de cita actual (0 para revisión, 1 para tratamiento): ");
        int tipoCita = scanner.nextInt();

        System.out.print("Franja actual de la cita (0 para mañana, 1 para tarde): ");
        int franjaHorariaActual = scanner.nextInt();

        clinica.mostrarHuecosDisponibles(franjaHorariaActual, tipoCita);

        System.out.print("Seleccione el hueco actual: ");
        int huecoActual = scanner.nextInt() - 1;

        System.out.print("Seleccione la nueva franja horaria (0 para mañana, 1 para tarde): ");
        int nuevaFranjaHoraria = scanner.nextInt();

        clinica.mostrarHuecosDisponibles(nuevaFranjaHoraria, tipoCita);

        System.out.print("Seleccione el nuevo hueco disponible: ");
        int nuevoHueco = scanner.nextInt() - 1;

        clinica.modificarCita(dni, tipoCita, franjaHorariaActual, huecoActual, nuevaFranjaHoraria, nuevoHueco);
    }
}
