package gestionEstudiantes;
/*Un sistema de gestión de estudiantes permite agregar, eliminar, y buscar estudiantes por su identificación
 *  (ID). Cada estudiante tiene un ID único, nombre, apellido, fecha de nacimiento y una lista de calificaciones
 *   en varias asignaturas. Además, debes proporcionar una función que guarde toda la información de los estudiantes en un archivo de texto en una carpeta dada. El archivo de texto se llamará estudiantes.txt y el formato del contenido será como el de este ejemplo*/
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        SistemaGestionEstudiantes sistema = new SistemaGestionEstudiantes();

        Estudiante juan = new Estudiante("12345", "Juan", "Pérez", "1998-07-15");
        juan.agregarCalificacion("Matemáticas", 85);
        juan.agregarCalificacion("Inglés", 90);
        juan.agregarCalificacion("Historia", 78);

        Estudiante maria = new Estudiante("67890", "María", "López", "2000-11-25");
        maria.agregarCalificacion("Matemáticas", 88);
        maria.agregarCalificacion("Inglés", 92);
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
