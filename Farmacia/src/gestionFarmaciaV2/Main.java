package gestionFarmaciaV2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de prueba
        Direccion direccionFarmacia = new Direccion("Ciudad", "Calle Julian Jaramillo", "123", "1", "A");
        Farmacia farmacia = new Farmacia("Farmacia IFP Inovacion", direccionFarmacia);

        Producto producto1 = new Producto(1, "Paracetamol", 10.50, 100, "cápsulas", LocalDate.of(2025, 12, 31),
                "Tableta", "Cuerpo", "Tomar con agua", "1 comprimido cada 6 horas", "Consultar al médico si persisten los síntomas");
        ProductoTopico producto2 = new ProductoTopico(2, "Crema hidratante", 15.75, 50, "g", LocalDate.of(2024, 8, 31),
                12, "Crema", "Piel", "Aplicar en la piel seca", "Según necesidad", "Evitar contacto con los ojos");
        ProductoOral producto3 = new ProductoOral(3, "Ibuprofeno", 8.20, 80, "cápsulas", LocalDate.of(2025, 10, 31),
                "Tableta", "Cuerpo", "Tomar con agua", "1 cápsula cada 8 horas", "No superar la dosis máxima diaria", "Con comida");

        farmacia.agregarProducto(producto1);
        farmacia.agregarProducto(producto2);
        farmacia.agregarProducto(producto3);

        // Simular selección de productos por el usuario
        Scanner scanner = new Scanner(System.in);
        List<Producto> productosSeleccionados = new ArrayList<>();
        String respuesta;
        do {
            System.out.println("Ingrese el ID del producto que desea agregar al carrito:");
            int idProducto = scanner.nextInt();
            Producto productoSeleccionado = farmacia.buscarProducto(idProducto);
            if (productoSeleccionado != null) {
                productosSeleccionados.add(productoSeleccionado);
                System.out.println("Producto agregado al carrito.");
            } else {
                System.out.println("Producto no encontrado.");
            }
            System.out.println("¿Desea agregar otro producto al carrito? (Sí/No)");
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("Sí"));

        // Generar ticket de compra
        //double total = farmacia.generarTicket(productosSeleccionados);
        System.out.println("¡Gracias por su compra!");
    }
}
