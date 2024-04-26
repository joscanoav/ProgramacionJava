package inventario;

public class Producto {
    private String nombre;
    private int cantidadDisponible;
    private double precioPorUnidad;

    public Producto(String nombre, int cantidadDisponible, double precioPorUnidad) {
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
        this.precioPorUnidad = precioPorUnidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public double getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public double obtenerValorTotal() {
        return cantidadDisponible * precioPorUnidad;
    }

    @Override
    public String toString() {
        return "Nombre del Producto: " + nombre +
                "\nCantidad Disponible: " + cantidadDisponible +
                "\nPrecio por Unidad: $" + String.format("%.2f", precioPorUnidad) + "\n";
    }
}

