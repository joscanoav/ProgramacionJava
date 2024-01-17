package ClinicaCitas;

import java.util.Scanner;

public class MainCitasClinica {

	public static void main(String[] args) {
        Clinica clinica = new Clinica();

        // Ejemplo de c�mo utilizar la aplicaci�n
        Cita cita1 = new Cita("123456789", "Revisi�n", "Ma�ana", 1);
        clinica.reservarCita(cita1);

        Cita cita2 = new Cita("987654321", "Tratamiento", "Tarde", 5);
        clinica.reservarCita(cita2);

        clinica.mostrarDatosCita(cita1);
        clinica.mostrarDatosCita(cita2);
    }
}
