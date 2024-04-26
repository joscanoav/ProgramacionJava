package biblioteca;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro cienAnosDeSoledad = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro donQuijote = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605);

        biblioteca.agregarLibro(cienAnosDeSoledad);
        biblioteca.agregarLibro(donQuijote);

        try {
            biblioteca.imprimirBiblioteca("C:\\DAN\\DAM\\ProgramacionJava\\SimulacroUnidad3Eva2");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
