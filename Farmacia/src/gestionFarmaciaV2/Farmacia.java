package gestionFarmaciaV2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Farmacia {
    private String nombreEmpresa;
    private Direccion direccion;
    private List<Producto> inventario;

    public Farmacia(String nombreEmpresa, Direccion direccion) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.inventario = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    public Producto buscarProducto(int id) {
        for (Producto producto : inventario) {
            if (producto.getId() == id) {
                return producto;
            }
        }
        return null;
    }

    public double generarTicket() {
        double total = 0;
        Scanner scanner = new Scanner(System.in);
        List<Producto> productosSeleccionados = new ArrayList<>();
        String respuesta;

        // Imprimir el nombre de la farmacia
        System.out.println("Farmacia: " + nombreEmpresa);

        do {
            System.out.println("¿Desea agregar otro producto al carrito? (Sí/No)");
            respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("Sí")) {
                System.out.println("Ingrese el ID del producto que desea agregar al carrito:");
                int idProducto = scanner.nextInt();
                Producto productoSeleccionado = buscarProducto(idProducto);
                if (productoSeleccionado != null) {
                    productosSeleccionados.add(productoSeleccionado);
                    total += productoSeleccionado.getPrecio(); // Sumar el precio del producto al total
                    System.out.println("Producto agregado al carrito.");
                } else {
                    System.out.println("Producto no encontrado.");
                }
            }
        } while (respuesta.equalsIgnoreCase("Sí"));

        System.out.println("Dirección de la farmacia: " + direccion.getLocalidad() + ", " + direccion.getVia() + ", " + direccion.getNumero());
        System.out.println("Ticket de compra:");
        for (Producto producto : productosSeleccionados) {
            System.out.println(producto.getNombre() + " - €" + producto.getPrecio());
        }
        System.out.println("Total: €" + total);
        return total;
    }
}