package queries;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.*;

public class ClienteQueries {
    private Connection connection;
    private List<ProductoSeleccionado> carritoCompra;

    public ClienteQueries(Connection connection) {
        this.connection = connection;
        this.carritoCompra = new ArrayList<>();
    }

    public void viewCatalog(Scanner scanner) {
        System.out.println("\nOpciones de catálogo:");
        System.out.println("1. Ver todos los productos");
        System.out.println("2. Ordenar productos por precio ascendente");
        System.out.println("3. Ordenar productos por precio descendente");
        System.out.println("4. Ordenar productos alfabéticamente por nombre");
        System.out.println("5. Filtrar productos por nombre");
        System.out.print("Elige una opción: ");
        
        int option = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String query = "";
        switch (option) {
            case 1:
                query = "SELECT * FROM producto";
                break;
            case 2:
                query = "SELECT * FROM producto ORDER BY precio ASC";
                break;
            case 3:
                query = "SELECT * FROM producto ORDER BY precio DESC";
                break;
            case 4:
                query = "SELECT * FROM producto ORDER BY nombre ASC";
                break;
            case 5:
                System.out.print("Ingresa el nombre del producto para filtrar: ");
                String filtro = scanner.nextLine();
                query = "SELECT * FROM producto WHERE nombre LIKE '%" + filtro + "%'";
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            
            System.out.println("\nCatálogo de productos:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                double precio = resultSet.getDouble("precio");
                System.out.printf("ID: %d - Nombre: %s - Precio: %.2f\n", id, nombre, precio);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar los productos: " + e.getMessage());
        }
    }

    public void selectProducts(Scanner scanner) {
        System.out.println("\nSelección de productos para agregar a la compra:");
        System.out.print("Ingresa el ID del producto que deseas agregar: ");
        int idProducto = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Ingresa la cantidad que deseas agregar: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        ProductoSeleccionado productoSeleccionado = new ProductoSeleccionado(idProducto, cantidad);
        carritoCompra.add(productoSeleccionado);

        System.out.println("Producto agregado a la compra.");
    }

    public void completePurchase(Scanner scanner) {
        if (carritoCompra.isEmpty()) {
            System.out.println("El carrito de compra está vacío.");
            return;
        }

        System.out.println("\nFinalizar compra:");
        System.out.print("Ingresa el ID del cliente: ");
        int idCliente = scanner.nextInt();
        scanner.nextLine();  // Consume newline*/

        // Generar una nueva compra y obtener el ID generado
        try (PreparedStatement ps = connection.prepareStatement(
                "INSERT INTO compra (concepto, id_cliente) VALUES (?, ?)", 
                Statement.RETURN_GENERATED_KEYS)) {
            
            System.out.print("Ingresa el concepto de la compra: ");
            String concepto = scanner.nextLine();
            ps.setString(1, concepto);
            ps.setInt(2, idCliente);
            ps.executeUpdate();

            // Obtener el ID de la compra recién generada
            ResultSet rs = ps.getGeneratedKeys();
            int idCompra;
            if (rs.next()) {
                idCompra = rs.getInt(1);
            } else {
                System.out.println("Error al obtener el ID de la compra.");
                return;
            }

            // Insertar productos seleccionados en la tabla `compra_producto`
            for (ProductoSeleccionado producto : carritoCompra) {
                PreparedStatement psInsert = connection.prepareStatement(
                    "INSERT INTO compra_producto (id_compra, id_producto, unidades) " +
                    "VALUES (?, ?, ?)"
                );
                psInsert.setInt(1, idCompra);
                psInsert.setInt(2, producto.getIdProducto());
                psInsert.setInt(3, producto.getCantidad());
                psInsert.executeUpdate();
            }

            // Limpiar el carrito de compra después de realizar la compra
            carritoCompra.clear();

            System.out.println("Compra realizada con éxito. Generando ticket...");

            // Generar el ticket de compra en un archivo de texto
            generarTicket(idCompra);
            
        } catch (SQLException e) {
            System.out.println("Error al realizar la compra: " + e.getMessage());
        }
    }

    private void generarTicket(int idCompra) {
        String archivoTicket = "ticket_compra_" + idCompra + ".txt";

        try (PreparedStatement ps = connection.prepareStatement(
                "SELECT p.nombre, cp.unidades, p.precio " +
                "FROM compra_producto cp " +
                "JOIN producto p ON cp.id_producto = p.id " +
                "WHERE cp.id_compra = ?"
            );
            PrintWriter writer = new PrintWriter(archivoTicket)) {
            
            ps.setInt(1, idCompra);
            ResultSet rs = ps.executeQuery();

            double total = 0.0;

            writer.println("Ticket de compra:");
            writer.println("Compra ID: " + idCompra);
            writer.println("-------------------------------------------------");

            while (rs.next()) {
                String nombreProducto = rs.getString("nombre");
                int unidades = rs.getInt("unidades");
                double precioProducto = rs.getDouble("precio");

                double totalProducto = unidades * precioProducto;
                total += totalProducto;

                writer.printf("%s x%d - %.2f cada uno - Total: %.2f\n",
                        nombreProducto, unidades, precioProducto, totalProducto);
            }

            writer.println("-------------------------------------------------");
            writer.printf("Total de la compra: %.2f\n", total);

            System.out.println("Ticket generado en el archivo: " + archivoTicket);
        } catch (SQLException | FileNotFoundException e) {
            System.out.println("Error al generar el ticket: " + e.getMessage());
        }
    }

    private static class ProductoSeleccionado {
        private final int idProducto;
        private final int cantidad;

        public ProductoSeleccionado(int idProducto, int cantidad) {
            this.idProducto = idProducto;
            this.cantidad = cantidad;
        }

        public int getIdProducto() {
            return idProducto;
        }

        public int getCantidad() {
            return cantidad;
        }
    }
}
