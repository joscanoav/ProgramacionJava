package Citas01;
import java.util.Scanner;

		public class Main {
		    public static void main(String[] args) {
		        Clinica clinica = new Clinica();
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Bienvenido a la aplicaci�n de gesti�n de citas en la cl�nica");

		        while (true) {
		            System.out.println("\n1. Ver horarios disponibles");
		            System.out.println("2. Solicitar cita");
		            System.out.println("3. Modificar cita");
		            System.out.println("4. Salir");
		            System.out.print("Seleccione una opci�n: ");

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
		                    System.out.println("Gracias por utilizar la aplicaci�n. �Hasta luego!");
		                    scanner.close();
		                    System.exit(0);
		                default:
		                    System.out.println("Opci�n no v�lida. Int�ntelo de nuevo.");
		            }
		        }
		    }

		    private static void mostrarHorarios(Clinica clinica) {
		        System.out.println("\nHorarios disponibles:");
		        Consulta[] consultas = clinica.getConsultas();

		        for (Consulta consulta : consultas) {
		            System.out.println("Consulta " + consulta.getNumero() + " (" + consulta.getMedico() + ", " + consulta.getTipo() + "):");
		            System.out.println("Ma�ana:");
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
		        // L�gica para solicitar una cita
		        // Implementa la l�gica seg�n tus requisitos
		        // Aseg�rate de marcar el horario como ocupado despu�s de asignar una cita
		    }

		    private static void modificarCita(Clinica clinica, Scanner scanner) {
		        // L�gica para modificar una cita
		        // Implementa la l�gica seg�n tus requisitos
		        // Aseg�rate de liberar el horario anterior y marcar el nuevo horario como ocupado
		    }
		
	}

