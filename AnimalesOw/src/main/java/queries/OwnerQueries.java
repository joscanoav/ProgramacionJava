package queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class OwnerQueries {
    private Connection connection;

    public OwnerQueries(Connection connection) {
        this.connection = connection;
    }

    public void agregarAnimal(Scanner scanner) {
        System.out.println("\nAgregar nuevo animal:");
        System.out.print("Ingresa el ID del animal: ");
        int id = scanner.nextInt();
        System.out.print("Ingresa el nombre del animal: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa el especie del animal: ");
        String species = scanner.nextLine();
        
        System.out.print("Ingresa el breed del animal: ");
        String breed = scanner.nextLine();
        
        System.out.print("Ingresa el id_owner del animal: ");
        int id_owner = scanner.nextInt();
        
        String query = "INSERT INTO animal (id, name, species ,breed, id_owner ) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, species);
            ps.setString(4, breed);
            ps.setInt(5, id_owner);
            ps.executeUpdate();
            System.out.println("Cliente agregado con éxito.");
        } catch (SQLException e) {
            System.out.println("Error al agregar el cliente: " + e.getMessage());
        }
    }
    
}

