package gestionEstudiantes;
/*Un sistema de gesti�n de estudiantes permite agregar, eliminar, y buscar estudiantes por su identificaci�n
 *  (ID). Cada estudiante tiene un ID �nico, nombre, apellido, fecha de nacimiento y una lista de calificaciones
 *   en varias asignaturas. Adem�s, debes proporcionar una funci�n que guarde toda la informaci�n de los estudiantes en un archivo de texto en una carpeta dada. El archivo de texto se llamar� estudiantes.txt y el formato del contenido ser� como el de este ejemplo*/
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        SistemaGestionEstudiantes sistema = new SistemaGestionEstudiantes();

        Estudiante juan = new Estudiante("12345", "Juan", "P�rez", "1998-07-15");
        juan.agregarCalificacion("Matem�ticas", 85);
        juan.agregarCalificacion("Ingl�s", 90);
        juan.agregarCalificacion("Historia", 78);

        Estudiante maria = new Estudiante("67890", "Mar�a", "L�pez", "2000-11-25");
        maria.agregarCalificacion("Matem�ticas", 88);
        maria.agregarCalificacion("Ingl�s", 92);
        maria.agregarCalificacion("Historia", 80);

        sistema.agregarEstudiante(juan);
        sistema.agregarEstudiante(maria);

        try {
            sistema.guardarInformacion("C:\\DAN\\DAM\\ProgramacionJava\\SimulacroUnidad3Eva2");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }

        System.out.println("Promedio general de calificaciones: " + sistema.calcularPromedioGeneral());
    }
}
