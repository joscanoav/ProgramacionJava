package ClinicaCitas;
import java.util.ArrayList;

public class Clinica {
    private ArrayList<Consulta> consultasRevision;
    private ArrayList<Consulta> consultasTratamiento;
    private boolean[][] disponibilidadManana;
    private boolean[][] disponibilidadTarde;

    public Clinica() {
        consultasRevision = new ArrayList<>();
        consultasTratamiento = new ArrayList<>();
        disponibilidadManana = new boolean[10][2];
        disponibilidadTarde = new boolean[10][2];

        // Inicializar consultas de ejemplo
        consultasRevision.add(new Consulta(1, "Revisión", "Dr. A"));
        consultasTratamiento.add(new Consulta(2, "Tratamiento", "Dr. B"));

        // Inicializar disponibilidad de huecos
        for (int i = 0; i < 10; i++) {
            disponibilidadManana[i][0] = true;
            disponibilidadManana[i][1] = true;
            disponibilidadTarde[i][0] = true;
            disponibilidadTarde[i][1] = true;
        }
    }

    public void reservarCita(Cita cita) {
        int numeroHueco = cita.getNumeroHueco() - 1;

        if (cita.getFranjaHoraria().equalsIgnoreCase("Mañana")) {
            if (disponibilidadManana[numeroHueco][0]) {
                disponibilidadManana[numeroHueco][0] = false;
                disponibilidadManana[numeroHueco][1] = false;
                System.out.println("Cita reservada con éxito:");
                mostrarDatosCita(cita);
            } else {
                System.out.println("El hueco seleccionado está ocupado. Por favor, elige otro.");
            }
        } else if (cita.getFranjaHoraria().equalsIgnoreCase("Tarde")) {
            if (disponibilidadTarde[numeroHueco][0]) {
                disponibilidadTarde[numeroHueco][0] = false;
                disponibilidadTarde[numeroHueco][1] = false;
                System.out.println("Cita reservada con éxito:");
                mostrarDatosCita(cita);
            } else {
                System.out.println("El hueco seleccionado está ocupado. Por favor, elige otro.");
            }
        } else {
            System.out.println("Franja horaria no válida. Debe ser 'Mañana' o 'Tarde'.");
        }
    }

    public void modificarCita(Cita cita, String nuevaFranjaHoraria, int nuevoNumeroHueco) {
        int numeroHueco = nuevoNumeroHueco - 1;

        if (nuevaFranjaHoraria.equalsIgnoreCase("Mañana")) {
            if (disponibilidadManana[numeroHueco][0]) {
                // Liberar el hueco anterior
                liberarHueco(cita.getFranjaHoraria(), cita.getNumeroHueco());
                // Reservar el nuevo hueco
                disponibilidadManana[numeroHueco][0] = false;
                disponibilidadManana[numeroHueco][1] = false;
                // Actualizar la información de la cita
                cita.setFranjaHoraria("Mañana");
                cita.setNumeroHueco(nuevoNumeroHueco);
                System.out.println("Cita modificada con éxito:");
                mostrarDatosCita(cita);
            } else {
                System.out.println("El nuevo hueco seleccionado está ocupado. Por favor, elige otro.");
            }
        } else if (nuevaFranjaHoraria.equalsIgnoreCase("Tarde")) {
            if (disponibilidadTarde[numeroHueco][0]) {
                // Liberar el hueco anterior
                liberarHueco(cita.getFranjaHoraria(), cita.getNumeroHueco());
                // Reservar el nuevo hueco
                disponibilidadTarde[numeroHueco][0] = false;
                disponibilidadTarde[numeroHueco][1] = false;
                // Actualizar la información de la cita
                cita.setFranjaHoraria("Tarde");
                cita.setNumeroHueco(nuevoNumeroHueco);
                System.out.println("Cita modificada con éxito:");
                mostrarDatosCita(cita);
            } else {
                System.out.println("El nuevo hueco seleccionado está ocupado. Por favor, elige otro.");
            }
        } else {
            System.out.println("Franja horaria no válida. Debe ser 'Mañana' o 'Tarde'.");
        }
    }

    private void liberarHueco(String franjaHoraria, int numeroHueco) {
        int index = numeroHueco - 1;
        if (franjaHoraria.equalsIgnoreCase("Mañana")) {
            disponibilidadManana[index][0] = true;
            disponibilidadManana[index][1] = true;
        } else if (franjaHoraria.equalsIgnoreCase("Tarde")) {
            disponibilidadTarde[index][0] = true;
            disponibilidadTarde[index][1] = true;
        }
    }

    public void mostrarDatosCita(Cita cita) {
        System.out.println("DNI del paciente: " + cita.getDniPaciente());
        System.out.println("Tipo de cita: " + cita.getTipoCita());
        System.out.println("Franja horaria: " + cita.getFranjaHoraria());
        System.out.println("Número de hueco: " + cita.getNumeroHueco());
        System.out.println("--------");
    }
}

