package biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private int anyoPublicacion;

    public Libro(String titulo, String autor, int anyoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anyoPublicacion = anyoPublicacion;
    }

    @Override
    public String toString() {
        return "Título: " + titulo +
                "\nAutor: " + autor +
                "\nAño de Publicación: " + anyoPublicacion + "\n";
    }
}
