package gestionEstudiantes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SistemaGestionEstudiantes {
    private List<Estudiante> estudiantes;

    public SistemaGestionEstudiantes() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void eliminarEstudiantePorID(String id) {
        estudiantes.removeIf(estudiante -> estudiante.getId().equals(id));
    }

    public Estudiante buscarEstudiantePorID(String id) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getId().equals(id)) {
                return estudiante;
            }
        }
        return null;
    }

    public void guardarInformacion(String rutaCarpeta) throws IOException {
        String archivo = rutaCarpeta + "/estudiantes.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Estudiante estudiante : estudiantes) {
                writer.write(estudiante.toString());
                writer.write("\n");
            }
        }
    }

    public double calcularPromedioGeneral() {
        double sumaPromedios = 0;
        int totalEstudiantes = estudiantes.size();

        for (Estudiante estudiante : estudiantes) {
            sumaPromedios += estudiante.calcularPromedio();
        }

        return totalEstudiantes > 0 ? sumaPromedios / totalEstudiantes : 0.0;
    }
}

