package gestionFarmacia;
import java.util.ArrayList;
import java.util.List;

public class Farmacia {
    // Atributos de la clase Farmacia
    private String nombreEmpresa; 
    private Direccion direccion; 
    /*Se elige un ArrayList en vez de un arreglo estándar para el inventario en Farmacia por su flexibilidad en tamaño
     * y eficiencia en la manipulación de elementos, además de su compatibilidad con la interfaz List. Esto proporciona
     *  una solución más versátil y eficiente para gestionar el inventario de la farmacia.*/
    private List<Producto> inventario; 

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
        // Recorre la lista de inventario  se utiliza un bucle for-each para recorrer el inventario en la clase Farmacia 
    	// debido a su simplicidad, legibilidad, seguridad y capacidad para evitar errores de índice. Esto ayuda a hacer 
    	// el código más fácil de entender y mantener.
        for (Producto producto : inventario) {
            // Verifica si el ID del producto coincide con el ID buscado
            if (producto.getId() == id) {
                return producto; // Devuelve el producto si se encuentra
            }
        }
        return null; // Devuelve null si el producto no se encuentra
    }

    // Método para generar un ticket de compra con los productos seleccionados y su costo total
    //El método generarTicket devuelve un valor double para representar el costo total 
    public double generarTicket(List<Producto> productosSeleccionados) {
        double total = 0; // Inicializa la variable para almacenar el costo total
        System.out.println("Ticket de compra:"); // Imprime el encabezado del ticket
        // Recorre la lista de productos seleccionados
        for (Producto producto : productosSeleccionados) {
            // Imprime el nombre y precio del producto
            System.out.println(producto.getNombre() + " - €" + producto.getPrecio());
            total += producto.getPrecio(); // Suma el precio del producto al costo total
        }
        // Imprime el costo total del ticket
        System.out.println("Total: $" + total);
        return total; // Devuelve el costo total del ticket
    }
    
}
