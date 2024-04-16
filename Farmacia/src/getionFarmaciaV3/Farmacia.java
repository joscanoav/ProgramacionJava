package getionFarmaciaV3;

import java.util.ArrayList;
import java.util.List;

public class Farmacia {
    private String nombre;
    private Direccion direccion;
    private List<Producto> productos;

    public Farmacia(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarTicket(List<Producto> productos, double total) {
        System.out.println("----- Ticket de Compra -----");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " - " + producto.getPrecio() + " " + producto.getUnidades());
        }
        System.out.println("Total: " + total);
        System.out.println("------------------------------");
    }
}