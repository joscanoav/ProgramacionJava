package V01;
public class Clinica {
    private static final int NUM_CONSULTAS = 10;
    private static final int NUM_CITAS_POR_CONSULTA = 5;
    private static final int NUM_HUECOS_POR_FRANJA = 10;

    private Cita[] citas;
    private Consulta[] consultas;

    public Clinica() {
        citas = new Cita[2 * 2 * NUM_HUECOS_POR_FRANJA];
        consultas = new Consulta[NUM_CONSULTAS];

        // Inicialización de consultas con médicos
        for (int i = 0; i < NUM_CONSULTAS; i++) {
            Medico medico = new Medico("Médico " + (i + 1));
            consultas[i] = new Consulta(i + 1, medico);
        }
    }

    public void solicitarCita(String dni, int tipo, int franja, int hueco) {
        if (contarCitasPorTipo(tipo) < NUM_CITAS_POR_CONSULTA) {
            int index = franja * 2 * NUM_HUECOS_POR_FRANJA + tipo * NUM_HUECOS_POR_FRANJA + hueco;
            int horaInicio = (franja == 0) ? 9 : 16;
            int minutosInicio = hueco * 30;

            Cita nuevaCita = new Cita(dni, consultas[franja].getNumero(), tipo, horaInicio + minutosInicio / 60, minutosInicio % 60);
            citas[index] = nuevaCita;

            System.out.println("Cita reservada con éxito:");
            System.out.println(nuevaCita);
            System.out.println("Médico Asociado: " + consultas[franja].getMedico().getNombre());
        } else {
            System.out.println("Ha alcanzado el límite de citas para este tipo. No se puede reservar más.");
        }
    }

    public void modificarCita(String dni, int tipo, int franja, int hueco, int nuevaFranja, int nuevoHueco) {
        int indexActual = franja * 2 * NUM_HUECOS_POR_FRANJA + tipo * NUM_HUECOS_POR_FRANJA + hueco;

        if (citas[indexActual] != null) {
            // Eliminar cita existente
            System.out.println("Cita encontrada. Modificando cita...");
            System.out.println("Cita actual:");
            System.out.println(citas[indexActual]);

            // Eliminar cita existente
            citas[indexActual] = null;

            // Solicitar nueva cita
            System.out.println("Ingrese los nuevos detalles de la cita:");
            solicitarCita(dni, tipo, nuevaFranja, nuevoHueco);
        } else {
            System.out.println("No hay una cita existente en ese horario.");
        }
    }

    private int contarCitasPorTipo(int tipo) {
        int contador = 0;

        for (int i = 0; i < 2 * NUM_HUECOS_POR_FRANJA; i++) {
            if (citas[i] != null && citas[i].getTipo() == tipo) {
                contador++;
            }
        }

        return contador;
    }

    public void mostrarHuecosDisponibles(int franja, int tipo) {
        System.out.println("Huecos disponibles:");

        int inicioHora = (franja == 0) ? 9 : 16;

        for (int i = 0; i < NUM_HUECOS_POR_FRANJA; i++) {
            int index = franja * 2 * NUM_HUECOS_POR_FRANJA + tipo * NUM_HUECOS_POR_FRANJA + i;

            if (citas[index] == null) {
                int horaInicio = inicioHora + i / 2;
                int minutosInicio = (i % 2 == 0) ? 0 : 30;
                int horaFin = horaInicio;
                int minutosFin = minutosInicio + 30;

                if (minutosFin == 60) {
                    horaFin += 1;
                    minutosFin = 0;
                }

                System.out.println((i + 1) + ". " + String.format("%02d:%02d - %02d:%02d", horaInicio, minutosInicio, horaFin, minutosFin));
            }
        }
    }


}


