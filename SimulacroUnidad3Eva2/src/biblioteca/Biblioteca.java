package biblioteca;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void imprimirBiblioteca(String rutaCarpeta) throws IOException {
        String archivo = rutaCarpeta + "/biblioteca.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Libro libro : libros) {
                writer.write(libro.toString());
                writer.write("\n");
            }
            writer.write("Total de Libros en la Colección: " + libros.size());
        }
    }
}
