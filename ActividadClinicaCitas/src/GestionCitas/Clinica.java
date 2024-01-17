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

    public void solicitarCita(String dni, int tipo,int franja, int hueco ) {
        if (citas[franja][tipo][hueco] == null) {
        	int hora = (franja == 0) ? 9:16;
        	int minutos = hueco % 2 == 0 ? 0 :30;     	
        	citas[franja][tipo][hueco] = new Cita (dni,franja,tipo, hora + hueco / 2 , minutos);
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
            	
            	int hora = (nuevaFranja == 0) ? 9:16;
            	int minutos = nuevoHueco % 2 == 0 ? 0 : 30; 
            	
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
        
        int inicioHora = (franja == 0)? 9:16;
        int finHora = (franja == 0) ? 14:21;

        for (int i = 0; i < NUM_HUECOS_POR_FRANJA; i++) {
            if (citas[franja][tipo][i] == null) {
                int hora = inicioHora + i /2 ;
                int minutos = (i % 2 == 0) ? 0: 30;
                String horaInicio = String.format("%02d:%02d", hora, minutos);
                String horaFin = String.format("%02d:%02d", hora, minutos);
            	
            	
            	System.out.println((i + 1) + ".  " + "(" + horaInicio + " - " + horaFin + ")") ;
            }
        }
    }
}
