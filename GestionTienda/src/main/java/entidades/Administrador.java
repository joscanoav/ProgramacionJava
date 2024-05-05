package entidades;

import java.sql.Connection;
import java.util.Scanner;

import queries.AdministradorQueries;

public class Administrador {
    private Connection connection;
    private Scanner scanner;
    private AdministradorQueries adminQueries;

    public Administrador(Connection connection) {
        this.connection = connection;
        this.scanner = new Scanner(System.in);
        this.adminQueries = new AdministradorQueries(connection);
    }

    public void start() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenú Administrador:");
            System.out.println("1. Dar de alta un nuevo cliente");
            System.out.println("2. Dar de alta un nuevo producto");
            System.out.println("3. Modificar los datos de un cliente");
            System.out.println("4. Modificar los datos de un producto");
            System.out.println("5. Eliminar un cliente por su ID");
            System.out.println("6. Eliminar un producto por su ID");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    adminQueries.addNewClient(scanner);
                    break;
                case 2:
                    adminQueries.addNewProduct(scanner);
                    break;
                case 3:
                    adminQueries.modifyClient(scanner);
                    break;
                case 4:
                    adminQueries.modifyProduct(scanner);
                    break;
                case 5:
                    adminQueries.deleteClient(scanner);
                    break;
                case 6:
                    adminQueries.deleteProduct(scanner);
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, inténtalo de nuevo.");
            }
        }
    }
}
