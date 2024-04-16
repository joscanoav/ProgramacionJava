package getionFarmaciaV3;

import java.util.ArrayList;
import java.util.List;

public class Farmacia {
    private String nombre;
    private Direccion direccion;
    //una lista privada dentro de la clase Farmacia para almacenar objetos de tipo Producto
    private List<Producto> productos;

    public Farmacia(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    /*El método agregarProducto toma un objeto Producto como parámetro y lo agrega a la lista de productos de la farmacia.*/
    /*Producto producto1 = new Producto("Paracetamol", 5.00, 10);
	  Producto producto2 = new Producto("Jarabe para la tos", 10.00, 5);
	  farmacia.agregarProducto(producto1);
      farmacia.agregarProducto(producto2);*/
    
    public void mostrarTicket(List<Producto> productos, double total) {
        System.out.println("----- Ticket de Compra -----");
        /*Este bucle for each recorre la lista de productos de la farmacia y, en cada iteración, imprime en la consola la información del producto actual (nombre, precio y unidades).*/
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " - " + producto.getPrecio() + " " + producto.getUnidades());
        }
        System.out.println("Total: " + total);
        System.out.println("------------------------------");
    }
}