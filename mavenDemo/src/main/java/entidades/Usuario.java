package entidades;

public class Usuario {
    private int id;
    private String nombre;
    private int idEquipo;
    private int categoria;

    public Usuario(int id, String nombre, int idEquipo, int categoria) {
        this.id = id;
        this.nombre = nombre;
        this.idEquipo = idEquipo;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public int getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre='" + nombre + '\'' + ", idEquipo=" + idEquipo + ", categoria=" + categoria + '}';
    }
}
