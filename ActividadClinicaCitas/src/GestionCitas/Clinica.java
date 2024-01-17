package GestionCitas;

import java.util.Scanner;

public class Clinica {
    private static final int NUM_CONSULTAS = 10;
    private static final int NUM_CITAS_POR_CONSULTA = 5;
    private static final int NUM_HUECOS_POR_FRANJA = 10;

    private Cita[][][] citas;  // [consulta][tipo][hueco]

    public Clinica() {
        citas = new Cita[NUM_CONSULTAS][2][NUM_HUECOS_POR_FRANJA];
    }

    public void solicitarCita(String dni, int tipo, int franja, int hueco) {
        if (citas[franja][tipo][hueco] == null) {
            citas[franja][tipo][hueco] = new Cita(dni, franja, tipo, hueco);
            System.out.println("Cita reservada con éxito:");
            System.out.println(citas[franja][tipo][hueco]);
        } else {
            System.out.println("El hueco seleccionado no está disponible. Intente nuevamente.");
        }
    }

    public void modificarCita(String dni, int tipoActual, int franjaActual, int huecoActual,
                               int nuevaFranja, int nuevoHueco) {
        if (citas[franjaActual][tipoActual][huecoActual] != null) {
            if (citas[nuevaFranja][tipoActual][nuevoHueco] == null) {
                citas[nuevaFranja][tipoActual][nuevoHueco] = citas[franjaActual][tipoActual][huecoActual];
                citas[franjaActual][tipoActual][huecoActual] = null;
                System.out.println("Cita modificada con éxito:");
                System.out.println(citas[nuevaFranja][tipoActual][nuevoHueco]);
            } else {
                System.out.println("El hueco seleccionado para la nueva franja horaria no está disponible. Intente nuevamente.");
            }
        } else {
            System.out.println("El hueco actual no contiene una cita. No se puede modificar.");
        }
    }

    public void mostrarHuecosDisponibles(int franja, int tipo) {
        System.out.println("Huecos disponibles:");

        for (int i = 0; i < NUM_HUECOS_POR_FRANJA; i++) {
            if (citas[franja][tipo][i] == null) {
                System.out.println((i + 1) + ". Hueco " + (i + 1));
            }
        }
    }
}
