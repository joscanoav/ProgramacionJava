package Objetos;

import java.util.ArrayList;
import java.util.List;

public class Hospital{
	String nombre;
	int numPlantas;
	int numMedicos;
	List<String> registroCitas;


public Hospital(String nombre, int numPlantas, int numMedicos ) {
	this.nombre = nombre;
	this.numPlantas = numPlantas;
	this.numMedicos = numMedicos;
	this.registroCitas = new ArrayList<>();
}

public void reservarCitas(String nombrePersona, String fecha, String hora) {
	String cita = nombrePersona + " el " + fecha + " a las " + hora;
	registroCitas.add(cita);
}

public void mostrarRegistroCitas() {
	System.out.println("Registro de citas del Hospital:");
	for (String cita: registroCitas) {
		System.out.println(cita);
	}
}

}
