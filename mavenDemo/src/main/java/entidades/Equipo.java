package entidades;

public class Equipo {
    private int id;
    private String nombre;

    public Equipo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Equipo{" + "id=" + id + ", nombre='" + nombre + '\'' + '}';
    }
}
