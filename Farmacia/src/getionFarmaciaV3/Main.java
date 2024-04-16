package getionFarmaciaV3;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de la farmacia
        Direccion direccion = new Direccion("123", "2", "A", "Ciudad", "Calle Principal");
        Farmacia farmacia = new Farmacia("Mi Farmacia", direccion);

        // Agregar algunos productos
        ProductoTopico productoTopico = new ProductoTopico(1, "Crema", 10.5, 2, "oz", LocalDate.of(2024, 4, 16),
                "PAO123", "Loción", List.of("Cara", "Cuerpo"));
        ProductoOral productoOral = new ProductoOral(2, "Pastillas", 5, 20, "unidades", LocalDate.of(2024, 4, 16),
                3.5, true);
        ProductoTopico productoTopico2 = new ProductoTopico(3, "Pomada", 8.25, 1, "oz", LocalDate.of(2024, 4, 16),
                "PAO456", "Pomada", List.of("Piel"));
        ProductoOral productoOral2 = new ProductoOral(4, "Jarabe", 7.99, 15, "ml", LocalDate.of(2024, 4, 16),
                4.0, false);

        farmacia.agregarProducto(productoTopico);
        farmacia.agregarProducto(productoOral);
        farmacia.agregarProducto(productoTopico2);
        farmacia.agregarProducto(productoOral2);

        // Simulación de la interacción del usuario con la farmacia
        List<Producto> carrito = new ArrayList<>();
        boolean continuarComprando = true;
        Scanner scanner = new Scanner(System.in);
        while (continuarComprando) {
            // Mostrar lista de productos disponibles
            System.out.println("Productos disponibles:");
            System.out.println("1. " + productoTopico.getNombre() + " - $" + productoTopico.getPrecio());
            System.out.println("2. " + productoOral.getNombre() + " - $" + productoOral.getPrecio());
            System.out.println("3. " + productoTopico2.getNombre() + " - $" + productoTopico2.getPrecio());
            System.out.println("4. " + productoOral2.getNombre() + " - $" + productoOral2.getPrecio());
            System.out.println("Seleccione un producto (o ingrese 0 para terminar la compra):");

            // Leer la opción del usuario
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    carrito.add(productoTopico);
                    break;
                case 2:
                    carrito.add(productoOral);
                    break;
                case 3:
                    carrito.add(productoTopico2);
                    break;
                case 4:
                    carrito.add(productoOral2);
                    break;
                case 0:
                    continuarComprando = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione un número de producto válido.");
            }

            if (opcion != 0) {
                // Preguntar si el usuario desea agregar más productos
                System.out.println("¿Desea agregar algo más? (Sí/No):");
                String respuesta = scanner.next();
                if (!respuesta.equalsIgnoreCase("si")) {
                    continuarComprando = false;
                }
            }
        }

        // Generar ticket de compra
        double total = calcularTotal(carrito);
        farmacia.mostrarTicket(carrito, total);

        // Mostrar mensaje de agradecimiento por la compra
        System.out.println("Gracias por su compra. ¡Vuelva pronto!");

        // Cerrar el scanner
        scanner.close();
    }

    private static double calcularTotal(List<Producto> productos) {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }
}