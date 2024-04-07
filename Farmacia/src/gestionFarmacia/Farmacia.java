package gestionFarmacia;
import java.util.ArrayList;
import java.util.List;

public class Farmacia {
    // Atributos de la clase Farmacia
    private String nombreEmpresa; // Nombre de la empresa de la farmacia
    private Direccion direccion; // Dirección de la farmacia
    private List<Producto> inventario; // Lista que almacena el inventario de productos de la farmacia

    // Constructor de la clase Farmacia
    public Farmacia(String nombreEmpresa, Direccion direccion) {
        // Inicialización de los atributos de la clase
        this.nombreEmpresa = nombreEmpresa; // Asigna el nombre de la empresa
        this.direccion = direccion; // Asigna la dirección
        this.inventario = new ArrayList<>(); // Inicializa la lista de inventario como un ArrayList
    }

    // Método para agregar un producto al inventario
    public void agregarProducto(Producto producto) {
        inventario.add(producto); // Agrega el producto a la lista de inventario
    }

    // Método para buscar un producto en el inventario por su ID
    public Producto buscarProducto(int id) {
        // Recorre la lista de inventario
        for (Producto producto : inventario) {
            // Verifica si el ID del producto coincide con el ID buscado
            if (producto.getId() == id) {
                return producto; // Devuelve el producto si se encuentra
            }
        }
        return null; // Devuelve null si el producto no se encuentra
    }

    // Método para generar un ticket de compra con los productos seleccionados y su costo total
    public double generarTicket(List<Producto> productosSeleccionados) {
        double total = 0; // Inicializa la variable para almacenar el costo total
        System.out.println("Ticket de compra:"); // Imprime el encabezado del ticket
        // Recorre la lista de productos seleccionados
        for (Producto producto : productosSeleccionados) {
            // Imprime el nombre y precio del producto
            System.out.println(producto.getNombre() + " - $" + producto.getPrecio());
            total += producto.getPrecio(); // Suma el precio del producto al costo total
        }
        // Imprime el costo total del ticket
        System.out.println("Total: $" + total);
        return total; // Devuelve el costo total del ticket
    }
}