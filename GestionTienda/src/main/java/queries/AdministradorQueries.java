package queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AdministradorQueries {
    private Connection connection;

    public AdministradorQueries(Connection connection) {
        this.connection = connection;
    }

    public void agregarCliente(Scanner scanner) {
        System.out.println("\nAgregar nuevo cliente:");
        System.out.print("Ingresa el ID del cliente: ");
        // Se agrega al cliente por ID y nombre
        int id = scanner.nextInt();
        System.out.print("Ingresa el nombre del cliente: ");
        String nombre = scanner.nextLine();

        String query = "INSERT INTO cliente (id, nombre) VALUES (?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.setString(2, nombre);
            // Este método ejecuta la consulta SQL
            ps.executeUpdate();
            System.out.println("Cliente agregado con éxito.");
        } catch (SQLException e) {
            System.out.println("Error al agregar el cliente: " + e.getMessage());
        }
    }

    public void agregarProducto(Scanner scanner) {
        System.out.println("\nAgregar nuevo producto:");
        System.out.print("Ingresa el ID del producto: ");
        int id = scanner.nextInt();
        System.out.print("Ingresa el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa el precio del producto: ");
        double precio = scanner.nextDouble();
        String query = "INSERT INTO producto (id, nombre, precio) VALUES (?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setDouble(3, precio);
            //Ejecuta el SQL 
            ps.executeUpdate();
            System.out.println("Producto agregado con éxito.");
        } catch (SQLException e) {
            System.out.println("Error al agregar el producto: " + e.getMessage());
        }
    }

    public void modificarCliente(Scanner scanner) {
        System.out.println("\nModificar datos de un cliente:");
        System.out.print("Ingresa el ID del cliente: ");
        int id = scanner.nextInt();
        System.out.print("Ingresa el nuevo nombre del cliente: ");
        String nombre = scanner.nextLine();
        String query = "UPDATE cliente SET nombre = ? WHERE id = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, nombre);
            ps.setInt(2, id);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Cliente modificado con éxito.");
            } else {
                System.out.println("No se encontró un cliente con el ID proporcionado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al modificar el cliente: " + e.getMessage());
        }
    }

    public void modificarProducto(Scanner scanner) {
        System.out.println("\nModificar datos de un producto:");
        System.out.print("Ingresa el ID del producto: ");
        int id = scanner.nextInt();
        System.out.print("Ingresa el nuevo nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa el nuevo precio del producto: ");
        double precio = scanner.nextDouble();
        String query = "UPDATE producto SET nombre = ?, precio = ? WHERE id = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, nombre);
            ps.setDouble(2, precio);
            ps.setInt(3, id);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Producto modificado con éxito.");
            } else {
                System.out.println("No se encontró un producto con el ID proporcionado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al modificar el producto: " + e.getMessage());
        }
    }

    public void borrarCliente(Scanner scanner) {
        System.out.println("\nEliminar un cliente por su ID:");
        System.out.print("Ingresa el ID del cliente: ");
        int id = scanner.nextInt();
        String query = "DELETE FROM cliente WHERE id = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();
            //Si filasAfectadas es mayor que cero, significa que al menos una fila (cliente) 
            //fue eliminada de la base de datos.
            if (filasAfectadas > 0) {
                System.out.println("Cliente eliminado con éxito.");
            } else {
                System.out.println("No se encontró un cliente con el ID proporcionado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar el cliente: " + e.getMessage());
        }
    }

    public void borrarProducto(Scanner scanner) {
        System.out.println("\nEliminar un producto por su ID:");
        System.out.print("Ingresa el ID del producto: ");
        int id = scanner.nextInt();
        String query = "DELETE FROM producto WHERE id = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();
            //Si filasAfectadas es mayor que cero, significa que al menos una fila (producto) 
            //fue eliminada de la base de datos.
            if (filasAfectadas > 0) {
                System.out.println("Producto eliminado con éxito.");
            } else {
                System.out.println("No se encontró un producto con el ID proporcionado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar el producto: " + e.getMessage());
        }
    }
}
