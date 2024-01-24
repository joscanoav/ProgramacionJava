package GestionCitasClinica;

public class Clinica {
	// Se crean estos atributos para que no se puedan modificar
    private static final int NUM_CONSULTAS = 10;
    private static final int NUM_CITAS_POR_CONSULTA = 5;
    private static final int NUM_HUECOS_POR_FRANJA = 10;

    private Cita[][][] citas;  // [consulta][tipo][hueco]
    private Consulta[] consultas;

    // Se genera los constructores y atributos de citas y consultas
    public Clinica() {
        citas = new Cita[NUM_CONSULTAS][2][NUM_HUECOS_POR_FRANJA];
        consultas = new Consulta[NUM_CONSULTAS];

        // Inicialización de consultas con médicos
        for (int i = 0; i < NUM_CONSULTAS; i++) {
            Medico medico = new Medico("Médico " + (i + 1));
            consultas[i] = new Consulta(i + 1, medico);
        }
    }

    public void solicitarCita(String dni, int tipo, int franja, int hueco) {
        if (citas[franja][tipo][hueco] == null) {
            int hora = (franja == 0) ? 9 : 16;
            int minutos = hueco % 2 == 0 ? 0 : 30;

            if (contarCitasPorTipo(tipo) < NUM_CITAS_POR_CONSULTA) {
                citas[franja][tipo][hueco] = new Cita(dni, consultas[franja].getNumero(), tipo, hora + hueco / 2, minutos);
                System.out.println("Cita reservada con éxito:");
                System.out.println("DNI: " + citas[franja][tipo][hueco].getDni());
                System.out.println("Consulta Número: " + citas[franja][tipo][hueco].getConsultaNumero());
                System.out.println("Tipo de cita: " + (citas[franja][tipo][hueco].getTipo() == 0 ? "Revisión" : "Tratamiento"));
                System.out.println("Médico Asociado: " + consultas[franja].getMedico().getNombre());
                System.out.println("Hora: " + String.format("%02d:%02d - %02d:%02d",
                        citas[franja][tipo][hueco].getHora(),
                        citas[franja][tipo][hueco].getMinutos(),
                        (citas[franja][tipo][hueco].getHora() + (citas[franja][tipo][hueco].getMinutos() + 30) / 60) % 24,
                        (citas[franja][tipo][hueco].getMinutos() + 30) % 60));

            } else {
                System.out.println("Ha alcanzado el límite de citas para este tipo. No se puede reservar más.");
            }
        } else {
            System.out.println("El hueco seleccionado no está disponible. Intente nuevamente.");
        }
    }

    private int contarCitasPorTipo(int tipo) {
        int contador = 0;

        for (int i = 0; i < NUM_CONSULTAS; i++) {
            for (int j = 0; j < NUM_HUECOS_POR_FRANJA; j++) {
                if (citas[0][tipo][j] != null && citas[0][tipo][j].getDni() != null && citas[0][tipo][j].getConsultaNumero() == i + 1) {
                    contador++;
                }
                if (citas[1][tipo][j] != null && citas[1][tipo][j].getDni() != null && citas[1][tipo][j].getConsultaNumero() == i + 1) {
                    contador++;
                }
            }
        }

        return contador;
    }


    public void modificarCita(String dni, int tipoActual, int franjaActual, int huecoActual,
                               int nuevaFranja, int nuevoHueco) {
        if (citas[franjaActual][tipoActual][huecoActual] != null) {
            if (citas[nuevaFranja][tipoActual][nuevoHueco] == null) {


                citas[nuevaFranja][tipoActual][nuevoHueco] = citas[franjaActual][tipoActual][huecoActual];
                citas[franjaActual][tipoActual][huecoActual] = null;

                System.out.println("Cita modificada con éxito:");
                System.out.println(citas[nuevaFranja][tipoActual][nuevoHueco]);
                System.out.println("Nuevo Medico Asociado: " + consultas[nuevaFranja].getMedico().getNombre());
            } else {
                System.out.println("El hueco seleccionado para la nueva franja horaria no está disponible. Intente nuevamente.");
            }
        } else {
            System.out.println("El hueco actual no contiene una cita. No se puede modificar.");
        }
    }

    public void mostrarHuecosDisponibles(int franja, int tipo) {
        System.out.println("Huecos disponibles:");

        int inicioHora = (franja == 0) ? 9 : 16;

        for (int i = 0; i < NUM_HUECOS_POR_FRANJA; i++) {
            if (citas[franja][tipo][i] == null) {
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