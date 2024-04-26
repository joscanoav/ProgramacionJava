package gestionEstudiantes;

import java.util.HashMap;
import java.util.Map;

public class Estudiante {
    private String id;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private Map<String, Integer> calificaciones;

    public Estudiante(String id, String nombre, String apellido, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.calificaciones = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public void agregarCalificacion(String asignatura, int calificacion) {
        calificaciones.put(asignatura, calificacion);
    }

    public Map<String, Integer> getCalificaciones() {
        return calificaciones;
    }

    public double calcularPromedio() {
        int totalCalificaciones = 0;
        int sumaCalificaciones = 0;
        for (int calificacion : calificaciones.values()) {
            sumaCalificaciones += calificacion;
            totalCalificaciones++;
        }
        return totalCalificaciones > 0 ? (double) sumaCalificaciones / totalCalificaciones : 0.0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id).append("\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Apellido: ").append(apellido).append("\n");
        sb.append("Fecha de Nacimiento: ").append(fechaNacimiento).append("\n");
        sb.append("Calificaciones:\n");
        for (Map.Entry<String, Integer> entry : calificaciones.entrySet()) {
            sb.append("- ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}

