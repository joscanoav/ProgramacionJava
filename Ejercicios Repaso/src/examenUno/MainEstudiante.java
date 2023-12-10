package examenUno;

public class MainEstudiante {

	public static void main(String[] args) {
	// Crear un estudiante usando el constructor
	Estudiante estudiante1 = new Estudiante("Juan",20);
	//Mostrar informacion del estudiante
	estudiante1.mostrarInformacion();
	//Ingresar calificacion del estudiante
	estudiante1.ingresarCalificacion();
	estudiante1.mostrarInformacion();
	estudiante1.aprobar();
	
	Estudiante estudiante2= new Estudiante("Maria",22);
	estudiante2.ingresarCalificacion();
	estudiante2.mostrarInformacion();
	estudiante2.aprobar();
	
	
	}

}
