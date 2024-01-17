package Citas01;
import java.util.Scanner;

		public class Main {
		    public static void main(String[] args) {
		        Clinica clinica = new Clinica();
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Bienvenido a la aplicación de gestión de citas en la clínica");

		        while (true) {
		            System.out.println("\n1. Ver horarios disponibles");
		            System.out.println("2. Solicitar cita");
		            System.out.println("3. Modificar cita");
		            System.out.println("4. Salir");
		            System.out.print("Seleccione una opción: ");

		            int opcion = scanner.nextInt();

		            switch (opcion) {
		                case 1:
		                    mostrarHorarios(clinica);
		                    break;
		                case 2:
		                    solicitarCita(clinica, scanner);
		                    break;
		                case 3:
		                    modificarCita(clinica, scanner);
		                    break;
		                case 4:
		                    System.out.println("Gracias por utilizar la aplicación. ¡Hasta luego!");
		                    scanner.close();
		                    System.exit(0);
		                default:
		                    System.out.println("Opción no válida. Inténtelo de nuevo.");
		            }
		        }
		    }

		    private static void mostrarHorarios(Clinica clinica) {
		        System.out.println("\nHorarios disponibles:");
		        Consulta[] consultas = clinica.getConsultas();

		        for (Consulta consulta : consultas) {
		            System.out.println("Consulta " + consulta.getNumero() + " (" + consulta.getMedico() + ", " + consulta.getTipo() + "):");
		            System.out.println("Mañana:");
		            mostrarHorariosDisponibles(consulta.getHorariosManana());
		            System.out.println("Tarde:");
		            mostrarHorariosDisponibles(consulta.getHorariosTarde());
		            System.out.println();
		        }
		    }

		    private static void mostrarHorariosDisponibles(boolean[] horarios) {
		        for (int i = 0; i < horarios.length; i++) {
		            if (!horarios[i]) {
		                System.out.println((i + 9) + ":00 - " + (i + 9) + ":30");
		            }
		        }
		    }

		    private static void solicitarCita(Clinica clinica, Scanner scanner) {
		        // Lógica para solicitar una cita
		        // Implementa la lógica según tus requisitos
		        // Asegúrate de marcar el horario como ocupado después de asignar una cita
		    }

		    private static void modificarCita(Clinica clinica, Scanner scanner) {
		        // Lógica para modificar una cita
		        // Implementa la lógica según tus requisitos
		        // Asegúrate de liberar el horario anterior y marcar el nuevo horario como ocupado
		    }
		
	}

